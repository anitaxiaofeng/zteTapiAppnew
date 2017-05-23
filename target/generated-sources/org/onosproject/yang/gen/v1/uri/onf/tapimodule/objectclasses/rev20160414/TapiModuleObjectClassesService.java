/*
 * Copyright 2017-present Open Networking Laboratory
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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414;

/**
 * Abstraction of an entity which represents the functionality of tapiModuleObjectClassesService.
 */
public interface TapiModuleObjectClassesService {
    /**
     * Returns the attribute tapiModuleObjectClasses.
     *
     * @param tapiModuleObjectClasses value of tapiModuleObjectClasses
     * @return tapiModuleObjectClasses
     */
    TapiModuleObjectClasses getTapiModuleObjectClasses(TapiModuleObjectClassesOpParam tapiModuleObjectClasses);

    /**
     * Sets the value to attribute tapiModuleObjectClasses.
     *
     * @param tapiModuleObjectClasses value of tapiModuleObjectClasses
     */
    void setTapiModuleObjectClasses(TapiModuleObjectClassesOpParam tapiModuleObjectClasses);

}
