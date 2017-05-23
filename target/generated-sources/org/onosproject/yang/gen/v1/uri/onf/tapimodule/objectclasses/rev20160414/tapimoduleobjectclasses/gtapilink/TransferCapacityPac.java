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
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.AvailableCapacity;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.CapacityAssignedToUserView;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.TotalPotentialCapacity;

/**
 * Abstraction of an entity which represents the functionality of transferCapacityPac.
 */
public interface TransferCapacityPac {

    /**
     * Identify the leaf of TransferCapacityPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents capacityInteractionAlgorithm.
         */
        CAPACITYINTERACTIONALGORITHM(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute capacityInteractionAlgorithm.
     *
     * @return capacityInteractionAlgorithm value of capacityInteractionAlgorithm
     */
    String capacityInteractionAlgorithm();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTransferCapacityPacOpType.
     *
     * @return yangTransferCapacityPacOpType value of yangTransferCapacityPacOpType
     */
    OnosYangOpType yangTransferCapacityPacOpType();

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
     * Returns the attribute totalPotentialCapacity.
     *
     * @return totalPotentialCapacity value of totalPotentialCapacity
     */
    TotalPotentialCapacity totalPotentialCapacity();

    /**
     * Returns the attribute availableCapacity.
     *
     * @return availableCapacity value of availableCapacity
     */
    AvailableCapacity availableCapacity();

    /**
     * Returns the attribute capacityAssignedToUserView.
     *
     * @return capacityAssignedToUserView value of capacityAssignedToUserView
     */
    CapacityAssignedToUserView capacityAssignedToUserView();


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
     * Builder for transferCapacityPac.
     */
    interface TransferCapacityPacBuilder {
        /**
         * Returns the attribute capacityInteractionAlgorithm.
         *
         * @return capacityInteractionAlgorithm value of capacityInteractionAlgorithm
         */
        String capacityInteractionAlgorithm();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTransferCapacityPacOpType.
         *
         * @return yangTransferCapacityPacOpType value of yangTransferCapacityPacOpType
         */
        OnosYangOpType yangTransferCapacityPacOpType();

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
         * Returns the attribute totalPotentialCapacity.
         *
         * @return totalPotentialCapacity value of totalPotentialCapacity
         */
        TotalPotentialCapacity totalPotentialCapacity();

        /**
         * Returns the attribute availableCapacity.
         *
         * @return availableCapacity value of availableCapacity
         */
        AvailableCapacity availableCapacity();

        /**
         * Returns the attribute capacityAssignedToUserView.
         *
         * @return capacityAssignedToUserView value of capacityAssignedToUserView
         */
        CapacityAssignedToUserView capacityAssignedToUserView();

        /**
         * Returns the builder object of capacityInteractionAlgorithm.
         *
         * @param capacityInteractionAlgorithm value of capacityInteractionAlgorithm
         * @return capacityInteractionAlgorithm
         */
        TransferCapacityPacBuilder capacityInteractionAlgorithm(String capacityInteractionAlgorithm);

        /**
         * Returns the builder object of yangTransferCapacityPacOpType.
         *
         * @param yangTransferCapacityPacOpType value of yangTransferCapacityPacOpType
         * @return yangTransferCapacityPacOpType
         */
        TransferCapacityPacBuilder yangTransferCapacityPacOpType(OnosYangOpType yangTransferCapacityPacOpType);

        /**
         * Returns the builder object of totalPotentialCapacity.
         *
         * @param totalPotentialCapacity value of totalPotentialCapacity
         * @return totalPotentialCapacity
         */
        TransferCapacityPacBuilder totalPotentialCapacity(TotalPotentialCapacity totalPotentialCapacity);

        /**
         * Returns the builder object of availableCapacity.
         *
         * @param availableCapacity value of availableCapacity
         * @return availableCapacity
         */
        TransferCapacityPacBuilder availableCapacity(AvailableCapacity availableCapacity);

        /**
         * Returns the builder object of capacityAssignedToUserView.
         *
         * @param capacityAssignedToUserView value of capacityAssignedToUserView
         * @return capacityAssignedToUserView
         */
        TransferCapacityPacBuilder capacityAssignedToUserView(CapacityAssignedToUserView capacityAssignedToUserView);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TransferCapacityPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TransferCapacityPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of transferCapacityPac.
         *
         * @return transferCapacityPac
         */
        TransferCapacityPac build();
    }
}
