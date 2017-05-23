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
            .gtransfercostpac.CostCharacteristicList;

/**
 * Abstraction of an entity which represents the functionality of transferCostPac.
 */
public interface TransferCostPac {

    /**
     * Returns the attribute yangTransferCostPacOpType.
     *
     * @return yangTransferCostPacOpType value of yangTransferCostPacOpType
     */
    OnosYangOpType yangTransferCostPacOpType();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute costCharacteristicList.
     *
     * @return costCharacteristicList list of costCharacteristicList
     */
    List<CostCharacteristicList> costCharacteristicList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for transferCostPac.
     */
    interface TransferCostPacBuilder {
        /**
         * Adds to the list of costCharacteristicList.
         *
         * @return builder object of costCharacteristicList
         */
        TransferCostPacBuilder addToCostCharacteristicList(CostCharacteristicList addTo);

        /**
         * Returns the attribute yangTransferCostPacOpType.
         *
         * @return yangTransferCostPacOpType value of yangTransferCostPacOpType
         */
        OnosYangOpType yangTransferCostPacOpType();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute costCharacteristicList.
         *
         * @return costCharacteristicList list of costCharacteristicList
         */
        List<CostCharacteristicList> costCharacteristicList();

        /**
         * Returns the builder object of yangTransferCostPacOpType.
         *
         * @param yangTransferCostPacOpType value of yangTransferCostPacOpType
         * @return yangTransferCostPacOpType
         */
        TransferCostPacBuilder yangTransferCostPacOpType(OnosYangOpType yangTransferCostPacOpType);

        /**
         * Returns the builder object of costCharacteristicList.
         *
         * @param costCharacteristicList list of costCharacteristicList
         * @return costCharacteristicList
         */
        TransferCostPacBuilder costCharacteristicList(List<CostCharacteristicList> costCharacteristicList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TransferCostPacBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of transferCostPac.
         *
         * @return transferCostPac
         */
        TransferCostPac build();
    }
}
