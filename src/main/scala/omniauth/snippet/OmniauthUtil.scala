/*
 * Copyright 2010-2011 Matthew Henderson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package omniauth.snippet

import _root_.omniauth.lib.{OmniauthLib}
import xml.NodeSeq
import net.liftweb.common.{Failure, Empty, Full}

class OmniauthUtil {
  def info(xhtml: NodeSeq) = {
    OmniauthLib.currentAuthMap match {
      case Full(omni) => omni.map { s => <p>{s}</p> } toSeq
      case Empty => NodeSeq.Empty
      case Failure(_,_,_) => NodeSeq.Empty
    }  
  }
}