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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac;

import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .gtapicapacity.CapacityCharacteristicList;

/**
 * Abstraction of an entity which represents the functionality of availableCapacity.
 */
public interface AvailableCapacity {

    /**
     * Returns the attribute yangAvailableCapacityOpType.
     *
     * @return yangAvailableCapacityOpType value of yangAvailableCapacityOpType
     */
    OnosYangOpType yangAvailableCapacityOpType();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute capacityCharacteristicList.
     *
     * @return capacityCharacteristicList value of capacityCharacteristicList
     */
    CapacityCharacteristicList capacityCharacteristicList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for availableCapacity.
     */
    interface AvailableCapacityBuilder {
        /**
         * Returns the attribute yangAvailableCapacityOpType.
         *
         * @return yangAvailableCapacityOpType value of yangAvailableCapacityOpType
         */
        OnosYangOpType yangAvailableCapacityOpType();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute capacityCharacteristicList.
         *
         * @return capacityCharacteristicList value of capacityCharacteristicList
         */
        CapacityCharacteristicList capacityCharacteristicList();

        /**
         * Returns the builder object of yangAvailableCapacityOpType.
         *
         * @param yangAvailableCapacityOpType value of yangAvailableCapacityOpType
         * @return yangAvailableCapacityOpType
         */
        AvailableCapacityBuilder yangAvailableCapacityOpType(OnosYangOpType yangAvailableCapacityOpType);

        /**
         * Returns the builder object of capacityCharacteristicList.
         *
         * @param capacityCharacteristicList value of capacityCharacteristicList
         * @return capacityCharacteristicList
         */
        AvailableCapacityBuilder capacityCharacteristicList(CapacityCharacteristicList capacityCharacteristicList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        AvailableCapacityBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of availableCapacity.
         *
         * @return availableCapacity
         */
        AvailableCapacity build();
    }
}
