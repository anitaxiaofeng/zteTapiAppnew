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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of transferIntegrityPac.
 */
public interface TransferIntegrityPac {

    /**
     * Identify the leaf of TransferIntegrityPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents errorCharacteristic.
         */
        ERRORCHARACTERISTIC(1),
        /**
         * Represents lossCharacteristic.
         */
        LOSSCHARACTERISTIC(2),
        /**
         * Represents repeatDeliveryCharacteristic.
         */
        REPEATDELIVERYCHARACTERISTIC(3),
        /**
         * Represents deliveryOrderCharacteristic.
         */
        DELIVERYORDERCHARACTERISTIC(4),
        /**
         * Represents unavailableTimeCharacteristic.
         */
        UNAVAILABLETIMECHARACTERISTIC(5),
        /**
         * Represents serverIntegrityProcessCharacteristic.
         */
        SERVERINTEGRITYPROCESSCHARACTERISTIC(6);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute errorCharacteristic.
     *
     * @return errorCharacteristic value of errorCharacteristic
     */
    String errorCharacteristic();

    /**
     * Returns the attribute lossCharacteristic.
     *
     * @return lossCharacteristic value of lossCharacteristic
     */
    String lossCharacteristic();

    /**
     * Returns the attribute repeatDeliveryCharacteristic.
     *
     * @return repeatDeliveryCharacteristic value of repeatDeliveryCharacteristic
     */
    String repeatDeliveryCharacteristic();

    /**
     * Returns the attribute deliveryOrderCharacteristic.
     *
     * @return deliveryOrderCharacteristic value of deliveryOrderCharacteristic
     */
    String deliveryOrderCharacteristic();

    /**
     * Returns the attribute unavailableTimeCharacteristic.
     *
     * @return unavailableTimeCharacteristic value of unavailableTimeCharacteristic
     */
    String unavailableTimeCharacteristic();

    /**
     * Returns the attribute serverIntegrityProcessCharacteristic.
     *
     * @return serverIntegrityProcessCharacteristic value of serverIntegrityProcessCharacteristic
     */
    String serverIntegrityProcessCharacteristic();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTransferIntegrityPacOpType.
     *
     * @return yangTransferIntegrityPacOpType value of yangTransferIntegrityPacOpType
     */
    OnosYangOpType yangTransferIntegrityPacOpType();

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
     * Builder for transferIntegrityPac.
     */
    interface TransferIntegrityPacBuilder {
        /**
         * Returns the attribute errorCharacteristic.
         *
         * @return errorCharacteristic value of errorCharacteristic
         */
        String errorCharacteristic();

        /**
         * Returns the attribute lossCharacteristic.
         *
         * @return lossCharacteristic value of lossCharacteristic
         */
        String lossCharacteristic();

        /**
         * Returns the attribute repeatDeliveryCharacteristic.
         *
         * @return repeatDeliveryCharacteristic value of repeatDeliveryCharacteristic
         */
        String repeatDeliveryCharacteristic();

        /**
         * Returns the attribute deliveryOrderCharacteristic.
         *
         * @return deliveryOrderCharacteristic value of deliveryOrderCharacteristic
         */
        String deliveryOrderCharacteristic();

        /**
         * Returns the attribute unavailableTimeCharacteristic.
         *
         * @return unavailableTimeCharacteristic value of unavailableTimeCharacteristic
         */
        String unavailableTimeCharacteristic();

        /**
         * Returns the attribute serverIntegrityProcessCharacteristic.
         *
         * @return serverIntegrityProcessCharacteristic value of serverIntegrityProcessCharacteristic
         */
        String serverIntegrityProcessCharacteristic();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTransferIntegrityPacOpType.
         *
         * @return yangTransferIntegrityPacOpType value of yangTransferIntegrityPacOpType
         */
        OnosYangOpType yangTransferIntegrityPacOpType();

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
         * Returns the builder object of errorCharacteristic.
         *
         * @param errorCharacteristic value of errorCharacteristic
         * @return errorCharacteristic
         */
        TransferIntegrityPacBuilder errorCharacteristic(String errorCharacteristic);

        /**
         * Returns the builder object of lossCharacteristic.
         *
         * @param lossCharacteristic value of lossCharacteristic
         * @return lossCharacteristic
         */
        TransferIntegrityPacBuilder lossCharacteristic(String lossCharacteristic);

        /**
         * Returns the builder object of repeatDeliveryCharacteristic.
         *
         * @param repeatDeliveryCharacteristic value of repeatDeliveryCharacteristic
         * @return repeatDeliveryCharacteristic
         */
        TransferIntegrityPacBuilder repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic);

        /**
         * Returns the builder object of deliveryOrderCharacteristic.
         *
         * @param deliveryOrderCharacteristic value of deliveryOrderCharacteristic
         * @return deliveryOrderCharacteristic
         */
        TransferIntegrityPacBuilder deliveryOrderCharacteristic(String deliveryOrderCharacteristic);

        /**
         * Returns the builder object of unavailableTimeCharacteristic.
         *
         * @param unavailableTimeCharacteristic value of unavailableTimeCharacteristic
         * @return unavailableTimeCharacteristic
         */
        TransferIntegrityPacBuilder unavailableTimeCharacteristic(String unavailableTimeCharacteristic);

        /**
         * Returns the builder object of serverIntegrityProcessCharacteristic.
         *
         * @param serverIntegrityProcessCharacteristic value of serverIntegrityProcessCharacteristic
         * @return serverIntegrityProcessCharacteristic
         */
        TransferIntegrityPacBuilder serverIntegrityProcessCharacteristic(String
                    serverIntegrityProcessCharacteristic);

        /**
         * Returns the builder object of yangTransferIntegrityPacOpType.
         *
         * @param yangTransferIntegrityPacOpType value of yangTransferIntegrityPacOpType
         * @return yangTransferIntegrityPacOpType
         */
        TransferIntegrityPacBuilder yangTransferIntegrityPacOpType(OnosYangOpType yangTransferIntegrityPacOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TransferIntegrityPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TransferIntegrityPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of transferIntegrityPac.
         *
         * @return transferIntegrityPac
         */
        TransferIntegrityPac build();
    }
}
