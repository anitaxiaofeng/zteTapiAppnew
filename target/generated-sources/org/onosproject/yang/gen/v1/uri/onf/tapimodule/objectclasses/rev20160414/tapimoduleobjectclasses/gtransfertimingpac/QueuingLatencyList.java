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
            .gtransfertimingpac;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of queuingLatencyList.
 */
public interface QueuingLatencyList {

    /**
     * Identify the leaf of QueuingLatencyList.
     */
    public enum LeafIdentifier {
        /**
         * Represents trafficProperty.
         */
        TRAFFICPROPERTY(1),
        /**
         * Represents latencyForTrafficWithProperty.
         */
        LATENCYFORTRAFFICWITHPROPERTY(2);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute trafficProperty.
     *
     * @return trafficProperty value of trafficProperty
     */
    String trafficProperty();

    /**
     * Returns the attribute latencyForTrafficWithProperty.
     *
     * @return latencyForTrafficWithProperty value of latencyForTrafficWithProperty
     */
    String latencyForTrafficWithProperty();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangQueuingLatencyListOpType.
     *
     * @return yangQueuingLatencyListOpType value of yangQueuingLatencyListOpType
     */
    OnosYangOpType yangQueuingLatencyListOpType();

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
     * Builder for queuingLatencyList.
     */
    interface QueuingLatencyListBuilder {
        /**
         * Returns the attribute trafficProperty.
         *
         * @return trafficProperty value of trafficProperty
         */
        String trafficProperty();

        /**
         * Returns the attribute latencyForTrafficWithProperty.
         *
         * @return latencyForTrafficWithProperty value of latencyForTrafficWithProperty
         */
        String latencyForTrafficWithProperty();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangQueuingLatencyListOpType.
         *
         * @return yangQueuingLatencyListOpType value of yangQueuingLatencyListOpType
         */
        OnosYangOpType yangQueuingLatencyListOpType();

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
         * Returns the builder object of trafficProperty.
         *
         * @param trafficProperty value of trafficProperty
         * @return trafficProperty
         */
        QueuingLatencyListBuilder trafficProperty(String trafficProperty);

        /**
         * Returns the builder object of latencyForTrafficWithProperty.
         *
         * @param latencyForTrafficWithProperty value of latencyForTrafficWithProperty
         * @return latencyForTrafficWithProperty
         */
        QueuingLatencyListBuilder latencyForTrafficWithProperty(String latencyForTrafficWithProperty);

        /**
         * Returns the builder object of yangQueuingLatencyListOpType.
         *
         * @param yangQueuingLatencyListOpType value of yangQueuingLatencyListOpType
         * @return yangQueuingLatencyListOpType
         */
        QueuingLatencyListBuilder yangQueuingLatencyListOpType(OnosYangOpType yangQueuingLatencyListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        QueuingLatencyListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        QueuingLatencyListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of queuingLatencyList.
         *
         * @return queuingLatencyList
         */
        QueuingLatencyList build();
    }
}
