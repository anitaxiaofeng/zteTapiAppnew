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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .gtapicapacity;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.TapiModuleTypeDefinitions
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Abstraction of an entity which represents the functionality of capacityCharacteristicList.
 */
public interface CapacityCharacteristicList {

    /**
     * Identify the leaf of CapacityCharacteristicList.
     */
    public enum LeafIdentifier {
        /**
         * Represents layerProtocolName.
         */
        LAYERPROTOCOLNAME(1),
        /**
         * Represents capacityValue.
         */
        CAPACITYVALUE(2);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute layerProtocolName.
     *
     * @return layerProtocolName value of layerProtocolName
     */
    TapiLayerProtocolName layerProtocolName();

    /**
     * Returns the attribute capacityValue.
     *
     * @return capacityValue value of capacityValue
     */
    Integer capacityValue();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangCapacityCharacteristicListOpType.
     *
     * @return yangCapacityCharacteristicListOpType value of yangCapacityCharacteristicListOpType
     */
    OnosYangOpType yangCapacityCharacteristicListOpType();

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
     * Builder for capacityCharacteristicList.
     */
    interface CapacityCharacteristicListBuilder {
        /**
         * Returns the attribute layerProtocolName.
         *
         * @return layerProtocolName value of layerProtocolName
         */
        TapiLayerProtocolName layerProtocolName();

        /**
         * Returns the attribute capacityValue.
         *
         * @return capacityValue value of capacityValue
         */
        Integer capacityValue();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangCapacityCharacteristicListOpType.
         *
         * @return yangCapacityCharacteristicListOpType value of yangCapacityCharacteristicListOpType
         */
        OnosYangOpType yangCapacityCharacteristicListOpType();

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
         * Returns the builder object of layerProtocolName.
         *
         * @param layerProtocolName value of layerProtocolName
         * @return layerProtocolName
         */
        CapacityCharacteristicListBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName);

        /**
         * Returns the builder object of capacityValue.
         *
         * @param capacityValue value of capacityValue
         * @return capacityValue
         */
        CapacityCharacteristicListBuilder capacityValue(Integer capacityValue);

        /**
         * Returns the builder object of yangCapacityCharacteristicListOpType.
         *
         * @param yangCapacityCharacteristicListOpType value of yangCapacityCharacteristicListOpType
         * @return yangCapacityCharacteristicListOpType
         */
        CapacityCharacteristicListBuilder yangCapacityCharacteristicListOpType(OnosYangOpType
                    yangCapacityCharacteristicListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        CapacityCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        CapacityCharacteristicListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of capacityCharacteristicList.
         *
         * @return capacityCharacteristicList
         */
        CapacityCharacteristicList build();
    }
}
