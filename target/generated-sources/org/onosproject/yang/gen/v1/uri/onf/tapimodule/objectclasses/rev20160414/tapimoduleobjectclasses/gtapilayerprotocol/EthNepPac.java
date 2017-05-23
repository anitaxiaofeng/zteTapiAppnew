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
            .gtapilayerprotocol;

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethnodeeppac.VlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSwitchCapability;

/**
 * Abstraction of an entity which represents the functionality of ethNepPac.
 */
public interface EthNepPac {

    /**
     * Identify the leaf of EthNepPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents totalPotentialEthcapacity.
         */
        TOTALPOTENTIALETHCAPACITY(1),
        /**
         * Represents availableEthcapacity.
         */
        AVAILABLEETHCAPACITY(2);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute totalPotentialEthcapacity.
     *
     * @return totalPotentialEthcapacity value of totalPotentialEthcapacity
     */
    Integer totalPotentialEthcapacity();

    /**
     * Returns the attribute availableEthcapacity.
     *
     * @return availableEthcapacity value of availableEthcapacity
     */
    Integer availableEthcapacity();

    /**
     * Returns the attribute switchCapabilityList.
     *
     * @return switchCapabilityList list of switchCapabilityList
     */
    List<TapiSwitchCapability> switchCapabilityList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangEthNepPacOpType.
     *
     * @return yangEthNepPacOpType value of yangEthNepPacOpType
     */
    OnosYangOpType yangEthNepPacOpType();

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
     * Returns the attribute vlanList.
     *
     * @return vlanList list of vlanList
     */
    List<VlanList> vlanList();


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
     * Builder for ethNepPac.
     */
    interface EthNepPacBuilder {
        /**
         * Adds to the list of switchCapabilityList.
         *
         * @return builder object of switchCapabilityList
         */
        EthNepPacBuilder addToSwitchCapabilityList(TapiSwitchCapability addTo);

        /**
         * Adds to the list of vlanList.
         *
         * @return builder object of vlanList
         */
        EthNepPacBuilder addToVlanList(VlanList addTo);

        /**
         * Returns the attribute totalPotentialEthcapacity.
         *
         * @return totalPotentialEthcapacity value of totalPotentialEthcapacity
         */
        Integer totalPotentialEthcapacity();

        /**
         * Returns the attribute availableEthcapacity.
         *
         * @return availableEthcapacity value of availableEthcapacity
         */
        Integer availableEthcapacity();

        /**
         * Returns the attribute switchCapabilityList.
         *
         * @return switchCapabilityList list of switchCapabilityList
         */
        List<TapiSwitchCapability> switchCapabilityList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangEthNepPacOpType.
         *
         * @return yangEthNepPacOpType value of yangEthNepPacOpType
         */
        OnosYangOpType yangEthNepPacOpType();

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
         * Returns the attribute vlanList.
         *
         * @return vlanList list of vlanList
         */
        List<VlanList> vlanList();

        /**
         * Returns the builder object of totalPotentialEthcapacity.
         *
         * @param totalPotentialEthcapacity value of totalPotentialEthcapacity
         * @return totalPotentialEthcapacity
         */
        EthNepPacBuilder totalPotentialEthcapacity(Integer totalPotentialEthcapacity);

        /**
         * Returns the builder object of availableEthcapacity.
         *
         * @param availableEthcapacity value of availableEthcapacity
         * @return availableEthcapacity
         */
        EthNepPacBuilder availableEthcapacity(Integer availableEthcapacity);

        /**
         * Returns the builder object of switchCapabilityList.
         *
         * @param switchCapabilityList list of switchCapabilityList
         * @return switchCapabilityList
         */
        EthNepPacBuilder switchCapabilityList(List<TapiSwitchCapability> switchCapabilityList);

        /**
         * Returns the builder object of yangEthNepPacOpType.
         *
         * @param yangEthNepPacOpType value of yangEthNepPacOpType
         * @return yangEthNepPacOpType
         */
        EthNepPacBuilder yangEthNepPacOpType(OnosYangOpType yangEthNepPacOpType);

        /**
         * Returns the builder object of vlanList.
         *
         * @param vlanList list of vlanList
         * @return vlanList
         */
        EthNepPacBuilder vlanList(List<VlanList> vlanList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        EthNepPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        EthNepPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of ethNepPac.
         *
         * @return ethNepPac
         */
        EthNepPac build();
    }
}
