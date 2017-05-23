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
            .griskparameterpac;

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of riskCharacteristicList.
 */
public interface RiskCharacteristicList {

    /**
     * Identify the leaf of RiskCharacteristicList.
     */
    public enum LeafIdentifier {
        /**
         * Represents riskCharacteristicName.
         */
        RISKCHARACTERISTICNAME(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute riskCharacteristicName.
     *
     * @return riskCharacteristicName value of riskCharacteristicName
     */
    String riskCharacteristicName();

    /**
     * Returns the attribute riskIdentifierList.
     *
     * @return riskIdentifierList list of riskIdentifierList
     */
    List<String> riskIdentifierList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangRiskCharacteristicListOpType.
     *
     * @return yangRiskCharacteristicListOpType value of yangRiskCharacteristicListOpType
     */
    OnosYangOpType yangRiskCharacteristicListOpType();

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
     * Builder for riskCharacteristicList.
     */
    interface RiskCharacteristicListBuilder {
        /**
         * Adds to the list of riskIdentifierList.
         *
         * @return builder object of riskIdentifierList
         */
        RiskCharacteristicListBuilder addToRiskIdentifierList(String addTo);

        /**
         * Returns the attribute riskCharacteristicName.
         *
         * @return riskCharacteristicName value of riskCharacteristicName
         */
        String riskCharacteristicName();

        /**
         * Returns the attribute riskIdentifierList.
         *
         * @return riskIdentifierList list of riskIdentifierList
         */
        List<String> riskIdentifierList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangRiskCharacteristicListOpType.
         *
         * @return yangRiskCharacteristicListOpType value of yangRiskCharacteristicListOpType
         */
        OnosYangOpType yangRiskCharacteristicListOpType();

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
         * Returns the builder object of riskCharacteristicName.
         *
         * @param riskCharacteristicName value of riskCharacteristicName
         * @return riskCharacteristicName
         */
        RiskCharacteristicListBuilder riskCharacteristicName(String riskCharacteristicName);

        /**
         * Returns the builder object of riskIdentifierList.
         *
         * @param riskIdentifierList list of riskIdentifierList
         * @return riskIdentifierList
         */
        RiskCharacteristicListBuilder riskIdentifierList(List<String> riskIdentifierList);

        /**
         * Returns the builder object of yangRiskCharacteristicListOpType.
         *
         * @param yangRiskCharacteristicListOpType value of yangRiskCharacteristicListOpType
         * @return yangRiskCharacteristicListOpType
         */
        RiskCharacteristicListBuilder yangRiskCharacteristicListOpType(OnosYangOpType
                    yangRiskCharacteristicListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        RiskCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        RiskCharacteristicListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of riskCharacteristicList.
         *
         * @return riskCharacteristicList
         */
        RiskCharacteristicList build();
    }
}
