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
            .gtapinotification;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of stateChangeList.
 */
public interface StateChangeList {

    /**
     * Identify the leaf of StateChangeList.
     */
    public enum LeafIdentifier {
        /**
         * Represents stateName.
         */
        STATENAME(1),
        /**
         * Represents newStateValue.
         */
        NEWSTATEVALUE(2),
        /**
         * Represents oldStateValue.
         */
        OLDSTATEVALUE(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute stateName.
     *
     * @return stateName value of stateName
     */
    String stateName();

    /**
     * Returns the attribute newStateValue.
     *
     * @return newStateValue value of newStateValue
     */
    String newStateValue();

    /**
     * Returns the attribute oldStateValue.
     *
     * @return oldStateValue value of oldStateValue
     */
    String oldStateValue();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangStateChangeListOpType.
     *
     * @return yangStateChangeListOpType value of yangStateChangeListOpType
     */
    OnosYangOpType yangStateChangeListOpType();

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
     * Builder for stateChangeList.
     */
    interface StateChangeListBuilder {
        /**
         * Returns the attribute stateName.
         *
         * @return stateName value of stateName
         */
        String stateName();

        /**
         * Returns the attribute newStateValue.
         *
         * @return newStateValue value of newStateValue
         */
        String newStateValue();

        /**
         * Returns the attribute oldStateValue.
         *
         * @return oldStateValue value of oldStateValue
         */
        String oldStateValue();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangStateChangeListOpType.
         *
         * @return yangStateChangeListOpType value of yangStateChangeListOpType
         */
        OnosYangOpType yangStateChangeListOpType();

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
         * Returns the builder object of stateName.
         *
         * @param stateName value of stateName
         * @return stateName
         */
        StateChangeListBuilder stateName(String stateName);

        /**
         * Returns the builder object of newStateValue.
         *
         * @param newStateValue value of newStateValue
         * @return newStateValue
         */
        StateChangeListBuilder newStateValue(String newStateValue);

        /**
         * Returns the builder object of oldStateValue.
         *
         * @param oldStateValue value of oldStateValue
         * @return oldStateValue
         */
        StateChangeListBuilder oldStateValue(String oldStateValue);

        /**
         * Returns the builder object of yangStateChangeListOpType.
         *
         * @param yangStateChangeListOpType value of yangStateChangeListOpType
         * @return yangStateChangeListOpType
         */
        StateChangeListBuilder yangStateChangeListOpType(OnosYangOpType yangStateChangeListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        StateChangeListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        StateChangeListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of stateChangeList.
         *
         * @return stateChangeList
         */
        StateChangeList build();
    }
}
