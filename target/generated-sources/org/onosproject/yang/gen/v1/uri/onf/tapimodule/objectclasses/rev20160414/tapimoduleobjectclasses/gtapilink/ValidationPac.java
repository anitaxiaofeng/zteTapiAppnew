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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink;

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gvalidationpac.ValidationMechanismList;

/**
 * Abstraction of an entity which represents the functionality of validationPac.
 */
public interface ValidationPac {

    /**
     * Returns the attribute yangValidationPacOpType.
     *
     * @return yangValidationPacOpType value of yangValidationPacOpType
     */
    OnosYangOpType yangValidationPacOpType();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute validationMechanismList.
     *
     * @return validationMechanismList list of validationMechanismList
     */
    List<ValidationMechanismList> validationMechanismList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for validationPac.
     */
    interface ValidationPacBuilder {
        /**
         * Adds to the list of validationMechanismList.
         *
         * @return builder object of validationMechanismList
         */
        ValidationPacBuilder addToValidationMechanismList(ValidationMechanismList addTo);

        /**
         * Returns the attribute yangValidationPacOpType.
         *
         * @return yangValidationPacOpType value of yangValidationPacOpType
         */
        OnosYangOpType yangValidationPacOpType();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute validationMechanismList.
         *
         * @return validationMechanismList list of validationMechanismList
         */
        List<ValidationMechanismList> validationMechanismList();

        /**
         * Returns the builder object of yangValidationPacOpType.
         *
         * @param yangValidationPacOpType value of yangValidationPacOpType
         * @return yangValidationPacOpType
         */
        ValidationPacBuilder yangValidationPacOpType(OnosYangOpType yangValidationPacOpType);

        /**
         * Returns the builder object of validationMechanismList.
         *
         * @param validationMechanismList list of validationMechanismList
         * @return validationMechanismList
         */
        ValidationPacBuilder validationMechanismList(List<ValidationMechanismList> validationMechanismList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ValidationPacBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of validationPac.
         *
         * @return validationPac
         */
        ValidationPac build();
    }
}
