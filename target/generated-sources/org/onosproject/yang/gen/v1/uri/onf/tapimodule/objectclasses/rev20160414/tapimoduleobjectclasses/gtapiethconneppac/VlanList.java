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
            .gtapiethconneppac;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiVlanPriority;

/**
 * Abstraction of an entity which represents the functionality of vlanList.
 */
public interface VlanList {

    /**
     * Identify the leaf of VlanList.
     */
    public enum LeafIdentifier {
        /**
         * Represents vlanId.
         */
        VLANID(1),
        /**
         * Represents vlanPriority.
         */
        VLANPRIORITY(2);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute vlanId.
     *
     * @return vlanId value of vlanId
     */
    Integer vlanId();

    /**
     * Returns the attribute vlanPriority.
     *
     * @return vlanPriority value of vlanPriority
     */
    TapiVlanPriority vlanPriority();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangVlanListOpType.
     *
     * @return yangVlanListOpType value of yangVlanListOpType
     */
    OnosYangOpType yangVlanListOpType();

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
     * Builder for vlanList.
     */
    interface VlanListBuilder {
        /**
         * Returns the attribute vlanId.
         *
         * @return vlanId value of vlanId
         */
        Integer vlanId();

        /**
         * Returns the attribute vlanPriority.
         *
         * @return vlanPriority value of vlanPriority
         */
        TapiVlanPriority vlanPriority();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangVlanListOpType.
         *
         * @return yangVlanListOpType value of yangVlanListOpType
         */
        OnosYangOpType yangVlanListOpType();

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
         * Returns the builder object of vlanId.
         *
         * @param vlanId value of vlanId
         * @return vlanId
         */
        VlanListBuilder vlanId(Integer vlanId);

        /**
         * Returns the builder object of vlanPriority.
         *
         * @param vlanPriority value of vlanPriority
         * @return vlanPriority
         */
        VlanListBuilder vlanPriority(TapiVlanPriority vlanPriority);

        /**
         * Returns the builder object of yangVlanListOpType.
         *
         * @param yangVlanListOpType value of yangVlanListOpType
         * @return yangVlanListOpType
         */
        VlanListBuilder yangVlanListOpType(OnosYangOpType yangVlanListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        VlanListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        VlanListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of vlanList.
         *
         * @return vlanList
         */
        VlanList build();
    }
}
