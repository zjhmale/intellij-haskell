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

package intellij.haskell.util

import com.intellij.openapi.project.Project
import intellij.haskell.external.ExternalProcess
import intellij.haskell.module.HaskellModuleType
import intellij.haskell.settings.HaskellSettingsState

object HaskellProjectUtil {

  def isHaskellProject(project: Project): Boolean = {
    HaskellModuleType.findModules(project).nonEmpty
  }

  def cleanBuild(project: Project) {
    HaskellSettingsState.getStackInfo(project).map(si => ExternalProcess.getProcessOutput(project.getBasePath, si.path, Seq("clean")))
  }
}
