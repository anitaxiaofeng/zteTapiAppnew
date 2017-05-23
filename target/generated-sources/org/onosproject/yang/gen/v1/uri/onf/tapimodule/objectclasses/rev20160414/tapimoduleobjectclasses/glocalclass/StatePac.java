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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .AdministrativeControl;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .AdministrativeState;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .LifecycleState;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .OperationalState;

/**
 * Abstraction of an entity which represents the functionality of statePac.
 */
public interface StatePac {

    /**
     * Identify the leaf of StatePac.
     */
    public enum LeafIdentifier {
        /**
         * Represents operationalState.
         */
        OPERATIONALSTATE(1),
        /**
         * Represents administrativeControl.
         */
        ADMINISTRATIVECONTROL(2),
        /**
         * Represents adminsatratveState.
         */
        ADMINSATRATVESTATE(3),
        /**
         * Represents lifecycleState.
         */
        LIFECYCLESTATE(4);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute operationalState.
     *
     * @return operationalState value of operationalState
     */
    OperationalState operationalState();

    /**
     * Returns the attribute administrativeControl.
     *
     * @return administrativeControl value of administrativeControl
     */
    AdministrativeControl administrativeControl();

    /**
     * Returns the attribute adminsatratveState.
     *
     * @return adminsatratveState value of adminsatratveState
     */
    AdministrativeState adminsatratveState();

    /**
     * Returns the attribute lifecycleState.
     *
     * @return lifecycleState value of lifecycleState
     */
    LifecycleState lifecycleState();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangStatePacOpType.
     *
     * @return yangStatePacOpType value of yangStatePacOpType
     */
    OnosYangOpType yangStatePacOpType();

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
     * Builder for statePac.
     */
    interface StatePacBuilder {
        /**
         * Returns the attribute operationalState.
         *
         * @return operationalState value of operationalState
         */
        OperationalState operationalState();

        /**
         * Returns the attribute administrativeControl.
         *
         * @return administrativeControl value of administrativeControl
         */
        AdministrativeControl administrativeControl();

        /**
         * Returns the attribute adminsatratveState.
         *
         * @return adminsatratveState value of adminsatratveState
         */
        AdministrativeState adminsatratveState();

        /**
         * Returns the attribute lifecycleState.
         *
         * @return lifecycleState value of lifecycleState
         */
        LifecycleState lifecycleState();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangStatePacOpType.
         *
         * @return yangStatePacOpType value of yangStatePacOpType
         */
        OnosYangOpType yangStatePacOpType();

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
         * Returns the builder object of operationalState.
         *
         * @param operationalState value of operationalState
         * @return operationalState
         */
        StatePacBuilder operationalState(OperationalState operationalState);

        /**
         * Returns the builder object of administrativeControl.
         *
         * @param administrativeControl value of administrativeControl
         * @return administrativeControl
         */
        StatePacBuilder administrativeControl(AdministrativeControl administrativeControl);

        /**
         * Returns the builder object of adminsatratveState.
         *
         * @param adminsatratveState value of adminsatratveState
         * @return adminsatratveState
         */
        StatePacBuilder adminsatratveState(AdministrativeState adminsatratveState);

        /**
         * Returns the builder object of lifecycleState.
         *
         * @param lifecycleState value of lifecycleState
         * @return lifecycleState
         */
        StatePacBuilder lifecycleState(LifecycleState lifecycleState);

        /**
         * Returns the builder object of yangStatePacOpType.
         *
         * @param yangStatePacOpType value of yangStatePacOpType
         * @return yangStatePacOpType
         */
        StatePacBuilder yangStatePacOpType(OnosYangOpType yangStatePacOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        StatePacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        StatePacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of statePac.
         *
         * @return statePac
         */
        StatePac build();
    }
}
