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

package intellij.haskell.action

import com.intellij.openapi.actionSystem.{AnActionEvent, CommonDataKeys}
import com.intellij.openapi.editor.{Editor, SelectionModel}
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiUtilBase

object ActionUtil {

  def findActionContext(actionEvent: AnActionEvent): Option[ActionContext] = {
    val context = actionEvent.getDataContext
    for {
      editor <- Option(CommonDataKeys.EDITOR.getData(context))
      project <- Option(CommonDataKeys.PROJECT.getData(context))
      psiFile <- Option(PsiUtilBase.getPsiFileInEditor(editor, project))
      selectionModel = Option(editor.getSelectionModel).find(sm => Option(sm.getSelectedText).isDefined)
    } yield ActionContext(psiFile, editor, project, selectionModel)
  }
}

sealed case class ActionContext(psiFile: PsiFile, editor: Editor, project: Project, selectionModel: Option[SelectionModel])
