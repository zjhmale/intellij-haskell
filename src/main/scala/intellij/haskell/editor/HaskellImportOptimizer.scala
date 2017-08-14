/*
 * Copyright 2016 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package intellij.haskell.editor

import com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerImpl
import com.intellij.lang.ImportOptimizer
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiFile
import intellij.haskell.HaskellFile
import intellij.haskell.psi.HaskellPsiUtil
import intellij.haskell.util.{HaskellFileUtil, HaskellProjectUtil}

import scala.collection.JavaConverters._
import scala.util.matching.Regex

class HaskellImportOptimizer extends ImportOptimizer {

  override def supports(psiFile: PsiFile): Boolean = psiFile.isInstanceOf[HaskellFile] && !HaskellProjectUtil.isLibraryFile(psiFile).getOrElse(true)

  override def processFile(psiFile: PsiFile): Runnable = {
    () => {
      val warnings = DaemonCodeAnalyzerImpl.getHighlights(HaskellFileUtil.findDocument(psiFile.getVirtualFile).get, HighlightSeverity.WARNING, psiFile.getProject)

      val redundantImports = warnings.asScala.filter(_.getDescription match {
        case HaskellImportOptimizer.WarningRedundantImport(_) => true
        case _ => false
      })

      redundantImports.map(_.getStartOffset).foreach(HaskellImportOptimizer.removeRedundantImport(psiFile, _))
    }
  }
}

object HaskellImportOptimizer {
  final val WarningRedundantImport: Regex = """The (?:qualified )?import of [`|‘]([^'’]+)['|’] is redundant.*""".r

  def removeRedundantImport(psiFile: PsiFile, offset: Int): Unit = {
    val redundantImportDeclaration = Option(psiFile.findElementAt(offset)).flatMap(HaskellPsiUtil.findImportDeclarationParent)
    redundantImportDeclaration.foreach(_.delete)
  }
}
