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
            .gvalidationpac;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of validationMechanismList.
 */
public interface ValidationMechanismList {

    /**
     * Identify the leaf of ValidationMechanismList.
     */
    public enum LeafIdentifier {
        /**
         * Represents validationMechanism.
         */
        VALIDATIONMECHANISM(1),
        /**
         * Represents layerProtocolAdjacencyValidated.
         */
        LAYERPROTOCOLADJACENCYVALIDATED(2),
        /**
         * Represents validationRobustness.
         */
        VALIDATIONROBUSTNESS(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute validationMechanism.
     *
     * @return validationMechanism value of validationMechanism
     */
    String validationMechanism();

    /**
     * Returns the attribute layerProtocolAdjacencyValidated.
     *
     * @return layerProtocolAdjacencyValidated value of layerProtocolAdjacencyValidated
     */
    String layerProtocolAdjacencyValidated();

    /**
     * Returns the attribute validationRobustness.
     *
     * @return validationRobustness value of validationRobustness
     */
    String validationRobustness();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangValidationMechanismListOpType.
     *
     * @return yangValidationMechanismListOpType value of yangValidationMechanismListOpType
     */
    OnosYangOpType yangValidationMechanismListOpType();

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
     * Builder for validationMechanismList.
     */
    interface ValidationMechanismListBuilder {
        /**
         * Returns the attribute validationMechanism.
         *
         * @return validationMechanism value of validationMechanism
         */
        String validationMechanism();

        /**
         * Returns the attribute layerProtocolAdjacencyValidated.
         *
         * @return layerProtocolAdjacencyValidated value of layerProtocolAdjacencyValidated
         */
        String layerProtocolAdjacencyValidated();

        /**
         * Returns the attribute validationRobustness.
         *
         * @return validationRobustness value of validationRobustness
         */
        String validationRobustness();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangValidationMechanismListOpType.
         *
         * @return yangValidationMechanismListOpType value of yangValidationMechanismListOpType
         */
        OnosYangOpType yangValidationMechanismListOpType();

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
         * Returns the builder object of validationMechanism.
         *
         * @param validationMechanism value of validationMechanism
         * @return validationMechanism
         */
        ValidationMechanismListBuilder validationMechanism(String validationMechanism);

        /**
         * Returns the builder object of layerProtocolAdjacencyValidated.
         *
         * @param layerProtocolAdjacencyValidated value of layerProtocolAdjacencyValidated
         * @return layerProtocolAdjacencyValidated
         */
        ValidationMechanismListBuilder layerProtocolAdjacencyValidated(String layerProtocolAdjacencyValidated);

        /**
         * Returns the builder object of validationRobustness.
         *
         * @param validationRobustness value of validationRobustness
         * @return validationRobustness
         */
        ValidationMechanismListBuilder validationRobustness(String validationRobustness);

        /**
         * Returns the builder object of yangValidationMechanismListOpType.
         *
         * @param yangValidationMechanismListOpType value of yangValidationMechanismListOpType
         * @return yangValidationMechanismListOpType
         */
        ValidationMechanismListBuilder yangValidationMechanismListOpType(OnosYangOpType
                    yangValidationMechanismListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ValidationMechanismListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ValidationMechanismListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of validationMechanismList.
         *
         * @return validationMechanismList
         */
        ValidationMechanismList build();
    }
}
