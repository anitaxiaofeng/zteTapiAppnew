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
            .gtransfercostpac;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;

/**
 * Abstraction of an entity which represents the functionality of costCharacteristicList.
 */
public interface CostCharacteristicList {

    /**
     * Identify the leaf of CostCharacteristicList.
     */
    public enum LeafIdentifier {
        /**
         * Represents costName.
         */
        COSTNAME(1),
        /**
         * Represents costValue.
         */
        COSTVALUE(2),
        /**
         * Represents costAlgorithm.
         */
        COSTALGORITHM(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute costName.
     *
     * @return costName value of costName
     */
    String costName();

    /**
     * Returns the attribute costValue.
     *
     * @return costValue value of costValue
     */
    Integer costValue();

    /**
     * Returns the attribute costAlgorithm.
     *
     * @return costAlgorithm value of costAlgorithm
     */
    String costAlgorithm();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangCostCharacteristicListOpType.
     *
     * @return yangCostCharacteristicListOpType value of yangCostCharacteristicListOpType
     */
    OnosYangOpType yangCostCharacteristicListOpType();

    /**
     * Returns the attribute selectLeafFlags.
     *
     * @return selectLeafFlags value of selectLeafFlags
     */
    BitSet selectLeafFlags();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    boolean isLeafValueSet(LeafIdentifier leaf);

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    boolean isSelectLeaf(LeafIdentifier leaf);

    /**
     * Builder for costCharacteristicList.
     */
    interface CostCharacteristicListBuilder {
        /**
         * Returns the attribute costName.
         *
         * @return costName value of costName
         */
        String costName();

        /**
         * Returns the attribute costValue.
         *
         * @return costValue value of costValue
         */
        Integer costValue();

        /**
         * Returns the attribute costAlgorithm.
         *
         * @return costAlgorithm value of costAlgorithm
         */
        String costAlgorithm();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangCostCharacteristicListOpType.
         *
         * @return yangCostCharacteristicListOpType value of yangCostCharacteristicListOpType
         */
        OnosYangOpType yangCostCharacteristicListOpType();

        /**
         * Returns the attribute selectLeafFlags.
         *
         * @return selectLeafFlags value of selectLeafFlags
         */
        BitSet selectLeafFlags();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the builder object of costName.
         *
         * @param costName value of costName
         * @return costName
         */
        CostCharacteristicListBuilder costName(String costName);

        /**
         * Returns the builder object of costValue.
         *
         * @param costValue value of costValue
         * @return costValue
         */
        CostCharacteristicListBuilder costValue(Integer costValue);

        /**
         * Returns the builder object of costAlgorithm.
         *
         * @param costAlgorithm value of costAlgorithm
         * @return costAlgorithm
         */
        CostCharacteristicListBuilder costAlgorithm(String costAlgorithm);

        /**
         * Returns the builder object of yangCostCharacteristicListOpType.
         *
         * @param yangCostCharacteristicListOpType value of yangCostCharacteristicListOpType
         * @return yangCostCharacteristicListOpType
         */
        CostCharacteristicListBuilder yangCostCharacteristicListOpType(OnosYangOpType
                    yangCostCharacteristicListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        CostCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        CostCharacteristicListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of costCharacteristicList.
         *
         * @return costCharacteristicList
         */
        CostCharacteristicList build();
    }
}
