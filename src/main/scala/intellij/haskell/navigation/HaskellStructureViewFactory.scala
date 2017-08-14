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

package intellij.haskell.navigation

import javax.swing.Icon

import com.intellij.ide.structureView._
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.Editor
import com.intellij.pom.Navigatable
import com.intellij.psi.{PsiElement, PsiFile}
import intellij.haskell.psi.{HaskellDeclarationElement, HaskellPsiUtil}
import intellij.haskell.{HaskellFile, HaskellIcons}

class HaskellStructureViewFactory extends PsiStructureViewFactory {
  def getStructureViewBuilder(psiFile: PsiFile): StructureViewBuilder = {
    new TreeBasedStructureViewBuilder {
      override def createStructureViewModel(editor: Editor): StructureViewModel = {
        new HaskellStructureViewModel(psiFile)
      }
    }
  }
}

private class HaskellStructureViewModel(psiFile: PsiFile) extends StructureViewModelBase(psiFile, new HaskellStructureViewTreeElement(psiFile, "")) with StructureViewModel.ElementInfoProvider {

  def isAlwaysShowsPlus(structureViewTreeElement: StructureViewTreeElement): Boolean = {
    false
  }

  def isAlwaysLeaf(structureViewTreeElement: StructureViewTreeElement): Boolean = {
    structureViewTreeElement.isInstanceOf[HaskellFile]
  }
}

private class HaskellStructureViewTreeElement(val element: PsiElement, val typeSignature: String) extends StructureViewTreeElement with ItemPresentation {

  def getValue: AnyRef = {
    element
  }

  def navigate(requestFocus: Boolean) {
    element.asInstanceOf[Navigatable].navigate(requestFocus)
  }

  def canNavigate: Boolean = {
    element.asInstanceOf[Navigatable].canNavigate
  }

  def canNavigateToSource: Boolean = {
    element.asInstanceOf[Navigatable].canNavigateToSource
  }

  def getPresentation: ItemPresentation = {
    this
  }


  def getChildren: Array[TreeElement] = {
    (element match {
      case hf: HaskellFile => HaskellPsiUtil.findHaskellDeclarationElements(hf)
      case _ => Seq()
    }).map(declarationElement => new HaskellStructureViewTreeElement(declarationElement, declarationElement.getText)).toArray
  }

  override def getPresentableText: String = {
    element match {
      case hde: HaskellDeclarationElement => hde.getPresentation.getPresentableText
      case pf: PsiFile => pf.getName
      case _ => null
    }
  }

  override def getIcon(unused: Boolean): Icon = {
    element match {
      case hde: HaskellDeclarationElement => hde.getPresentation.getIcon(unused)
      case pf: PsiFile => HaskellIcons.Module
      case _ => null
    }
  }

  override def getLocationString: String = null
}
