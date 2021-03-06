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

package intellij.haskell.view

import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent, CommonDataKeys}
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.util.PsiUtilBase
import intellij.haskell.external.GhcModTypeInfo
import intellij.haskell.psi.HaskellPsiHelper
import intellij.haskell.util.HaskellEditorUtil

class ShowTypeAction extends AnAction {

  override def update(actionEvent: AnActionEvent) {
    HaskellEditorUtil.enableAndShowIfInHaskellFile(actionEvent)
  }

  def actionPerformed(actionEvent: AnActionEvent) {
    val context = actionEvent.getDataContext
    for {
      editor <- Option(CommonDataKeys.EDITOR.getData(context))
      psiFile <- Option(PsiUtilBase.getPsiFileInEditor(editor, CommonDataKeys.PROJECT.getData(context)))
      offset = editor.getCaretModel.getOffset
      expression <- Option(psiFile.findElementAt(offset).getText)
    } yield {
      val selectionModel = Option(editor.getSelectionModel)
      selectionModel match {
        case Some(sm) if Option(sm.getSelectedText).isDefined => GhcModTypeInfo.findTypeInfoForSelection(psiFile, sm) match {
          case Some(ti) => HaskellEditorUtil.showHint(editor, ti.typeSignature)
          case None => HaskellEditorUtil.showHint(editor, "Could not determine type for selection")
        }
        case _ => Option(psiFile.findElementAt(offset)).flatMap(e => HaskellPsiHelper.findHaskellNamedElement(e)).foreach { psiElement =>
          GhcModTypeInfo.findTypeInfoFor(psiFile, psiElement) match {
            case Some(ti) => HaskellEditorUtil.showHint(editor, ti.typeSignature)
            case None => HaskellEditorUtil.showHint(editor, s"Could not determine type for ${StringUtil.escapeXml(psiElement.getText)}")
          }
        }
      }
    }
  }

}
