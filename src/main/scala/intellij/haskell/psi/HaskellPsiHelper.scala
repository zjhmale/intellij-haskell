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

package intellij.haskell.psi

import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.{PsiElement, PsiFile}
import intellij.haskell.psi.HaskellTypes.HS_TOP_DECLARATION

import scala.collection.JavaConversions._

object HaskellPsiHelper {

  def findImportDeclarations(psiFile: PsiFile): Iterable[HaskellImportDeclaration] = {
    PsiTreeUtil.findChildrenOfType(psiFile, classOf[HaskellImportDeclaration])
  }


  def findHaskellNamedElement(psiElement: PsiElement): Option[HaskellNamedElement] = {
    psiElement.getParent match {
      case hne: HaskellNamedElement => Some(hne)
      case _ => None
    }
  }

  def findTopDeclarations(psiElement: PsiElement): Iterable[HaskellDeclarationElement] = {
    PsiTreeUtil.findChildrenOfType(psiElement, classOf[HaskellDeclarationElement]).filter(_.getParent.getNode.getElementType == HS_TOP_DECLARATION)
  }
}
