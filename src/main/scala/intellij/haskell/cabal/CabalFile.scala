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

package intellij.haskell.cabal

import javax.swing._

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.{FileType, FileTypeConsumer, FileTypeFactory, LanguageFileType}
import com.intellij.psi.FileViewProvider
import intellij.haskell.HaskellIcons
import org.jetbrains.annotations.NotNull

class CabalFile(viewProvider: FileViewProvider) extends PsiFileBase(viewProvider, CabalLanguage.Instance) {

  @NotNull
  def getFileType: FileType = {
    CabalFileType.INSTANCE
  }

  override def toString: String = {
    "Cabal file"
  }

  override def getIcon(flags: Int): Icon = {
    super.getIcon(flags)
  }
}

object CabalFileType {
  final val INSTANCE = new CabalFileType
}

class CabalFileType extends LanguageFileType(CabalLanguage.Instance) {

  def getName: String = {
    "Cabal file"
  }

  def getDescription: String = {
    "Cabal file (Haskell package description)"
  }

  def getDefaultExtension: String = {
    "cabal"
  }

  def getIcon: Icon = {
    HaskellIcons.CabalLogo
  }
}

class CabalFileTypeFactory extends FileTypeFactory {
  def createFileTypes(consumer: FileTypeConsumer) {
    consumer.consume(CabalFileType.INSTANCE, CabalFileType.INSTANCE.getDefaultExtension)
  }
}