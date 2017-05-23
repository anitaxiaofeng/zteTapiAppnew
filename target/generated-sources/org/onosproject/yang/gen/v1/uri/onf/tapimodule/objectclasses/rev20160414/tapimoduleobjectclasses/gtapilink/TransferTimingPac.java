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

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfertimingpac.QueuingLatencyList;

/**
 * Abstraction of an entity which represents the functionality of transferTimingPac.
 */
public interface TransferTimingPac {

    /**
     * Identify the leaf of TransferTimingPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents fixedLatencyCharacteristic.
         */
        FIXEDLATENCYCHARACTERISTIC(1),
        /**
         * Represents jitterCharacteristic.
         */
        JITTERCHARACTERISTIC(2),
        /**
         * Represents wanderCharacteristic.
         */
        WANDERCHARACTERISTIC(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute fixedLatencyCharacteristic.
     *
     * @return fixedLatencyCharacteristic value of fixedLatencyCharacteristic
     */
    String fixedLatencyCharacteristic();

    /**
     * Returns the attribute jitterCharacteristic.
     *
     * @return jitterCharacteristic value of jitterCharacteristic
     */
    String jitterCharacteristic();

    /**
     * Returns the attribute wanderCharacteristic.
     *
     * @return wanderCharacteristic value of wanderCharacteristic
     */
    String wanderCharacteristic();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTransferTimingPacOpType.
     *
     * @return yangTransferTimingPacOpType value of yangTransferTimingPacOpType
     */
    OnosYangOpType yangTransferTimingPacOpType();

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
     * Returns the attribute queuingLatencyList.
     *
     * @return queuingLatencyList list of queuingLatencyList
     */
    List<QueuingLatencyList> queuingLatencyList();


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
     * Builder for transferTimingPac.
     */
    interface TransferTimingPacBuilder {
        /**
         * Adds to the list of queuingLatencyList.
         *
         * @return builder object of queuingLatencyList
         */
        TransferTimingPacBuilder addToQueuingLatencyList(QueuingLatencyList addTo);

        /**
         * Returns the attribute fixedLatencyCharacteristic.
         *
         * @return fixedLatencyCharacteristic value of fixedLatencyCharacteristic
         */
        String fixedLatencyCharacteristic();

        /**
         * Returns the attribute jitterCharacteristic.
         *
         * @return jitterCharacteristic value of jitterCharacteristic
         */
        String jitterCharacteristic();

        /**
         * Returns the attribute wanderCharacteristic.
         *
         * @return wanderCharacteristic value of wanderCharacteristic
         */
        String wanderCharacteristic();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTransferTimingPacOpType.
         *
         * @return yangTransferTimingPacOpType value of yangTransferTimingPacOpType
         */
        OnosYangOpType yangTransferTimingPacOpType();

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
         * Returns the attribute queuingLatencyList.
         *
         * @return queuingLatencyList list of queuingLatencyList
         */
        List<QueuingLatencyList> queuingLatencyList();

        /**
         * Returns the builder object of fixedLatencyCharacteristic.
         *
         * @param fixedLatencyCharacteristic value of fixedLatencyCharacteristic
         * @return fixedLatencyCharacteristic
         */
        TransferTimingPacBuilder fixedLatencyCharacteristic(String fixedLatencyCharacteristic);

        /**
         * Returns the builder object of jitterCharacteristic.
         *
         * @param jitterCharacteristic value of jitterCharacteristic
         * @return jitterCharacteristic
         */
        TransferTimingPacBuilder jitterCharacteristic(String jitterCharacteristic);

        /**
         * Returns the builder object of wanderCharacteristic.
         *
         * @param wanderCharacteristic value of wanderCharacteristic
         * @return wanderCharacteristic
         */
        TransferTimingPacBuilder wanderCharacteristic(String wanderCharacteristic);

        /**
         * Returns the builder object of yangTransferTimingPacOpType.
         *
         * @param yangTransferTimingPacOpType value of yangTransferTimingPacOpType
         * @return yangTransferTimingPacOpType
         */
        TransferTimingPacBuilder yangTransferTimingPacOpType(OnosYangOpType yangTransferTimingPacOpType);

        /**
         * Returns the builder object of queuingLatencyList.
         *
         * @param queuingLatencyList list of queuingLatencyList
         * @return queuingLatencyList
         */
        TransferTimingPacBuilder queuingLatencyList(List<QueuingLatencyList> queuingLatencyList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TransferTimingPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TransferTimingPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of transferTimingPac.
         *
         * @return transferTimingPac
         */
        TransferTimingPac build();
    }
}
