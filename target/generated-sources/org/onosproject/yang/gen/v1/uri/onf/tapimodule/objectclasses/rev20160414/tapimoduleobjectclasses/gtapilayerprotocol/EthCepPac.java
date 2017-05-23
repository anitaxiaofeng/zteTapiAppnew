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
            .gtapiethconneppac.BroadcastFilteringTraffic;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.TrafficConditioning;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.VlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAccessAction;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiBroadcastFilteringMode;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiBroadcastType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiVlanType;

/**
 * Abstraction of an entity which represents the functionality of ethCepPac.
 */
public interface EthCepPac {

    /**
     * Identify the leaf of EthCepPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents vlanType.
         */
        VLANTYPE(1),
        /**
         * Represents accessAction.
         */
        ACCESSACTION(2),
        /**
         * Represents isMacAdressLearningEnabled.
         */
        ISMACADRESSLEARNINGENABLED(3),
        /**
         * Represents macAdressLearningRange.
         */
        MACADRESSLEARNINGRANGE(4),
        /**
         * Represents macAdressAgeingTime.
         */
        MACADRESSAGEINGTIME(5),
        /**
         * Represents broadcastFilteringMode.
         */
        BROADCASTFILTERINGMODE(6);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute vlanType.
     *
     * @return vlanType value of vlanType
     */
    TapiVlanType vlanType();

    /**
     * Returns the attribute accessAction.
     *
     * @return accessAction value of accessAction
     */
    TapiAccessAction accessAction();

    /**
     * Returns the attribute isMacAdressLearningEnabled.
     *
     * @return isMacAdressLearningEnabled value of isMacAdressLearningEnabled
     */
    boolean isMacAdressLearningEnabled();

    /**
     * Returns the attribute macAdressLearningRange.
     *
     * @return macAdressLearningRange value of macAdressLearningRange
     */
    Integer macAdressLearningRange();

    /**
     * Returns the attribute macAdressAgeingTime.
     *
     * @return macAdressAgeingTime value of macAdressAgeingTime
     */
    Integer macAdressAgeingTime();

    /**
     * Returns the attribute broadcastFilteringMode.
     *
     * @return broadcastFilteringMode value of broadcastFilteringMode
     */
    TapiBroadcastFilteringMode broadcastFilteringMode();

    /**
     * Returns the attribute broadcastFilteringTypeList.
     *
     * @return broadcastFilteringTypeList list of broadcastFilteringTypeList
     */
    List<TapiBroadcastType> broadcastFilteringTypeList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangEthCepPacOpType.
     *
     * @return yangEthCepPacOpType value of yangEthCepPacOpType
     */
    OnosYangOpType yangEthCepPacOpType();

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
     * Returns the attribute trafficConditioning.
     *
     * @return trafficConditioning value of trafficConditioning
     */
    TrafficConditioning trafficConditioning();

    /**
     * Returns the attribute broadcastFilteringTraffic.
     *
     * @return broadcastFilteringTraffic value of broadcastFilteringTraffic
     */
    BroadcastFilteringTraffic broadcastFilteringTraffic();


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
     * Builder for ethCepPac.
     */
    interface EthCepPacBuilder {
        /**
         * Adds to the list of broadcastFilteringTypeList.
         *
         * @return builder object of broadcastFilteringTypeList
         */
        EthCepPacBuilder addToBroadcastFilteringTypeList(TapiBroadcastType addTo);

        /**
         * Adds to the list of vlanList.
         *
         * @return builder object of vlanList
         */
        EthCepPacBuilder addToVlanList(VlanList addTo);

        /**
         * Returns the attribute vlanType.
         *
         * @return vlanType value of vlanType
         */
        TapiVlanType vlanType();

        /**
         * Returns the attribute accessAction.
         *
         * @return accessAction value of accessAction
         */
        TapiAccessAction accessAction();

        /**
         * Returns the attribute isMacAdressLearningEnabled.
         *
         * @return isMacAdressLearningEnabled value of isMacAdressLearningEnabled
         */
        boolean isMacAdressLearningEnabled();

        /**
         * Returns the attribute macAdressLearningRange.
         *
         * @return macAdressLearningRange value of macAdressLearningRange
         */
        Integer macAdressLearningRange();

        /**
         * Returns the attribute macAdressAgeingTime.
         *
         * @return macAdressAgeingTime value of macAdressAgeingTime
         */
        Integer macAdressAgeingTime();

        /**
         * Returns the attribute broadcastFilteringMode.
         *
         * @return broadcastFilteringMode value of broadcastFilteringMode
         */
        TapiBroadcastFilteringMode broadcastFilteringMode();

        /**
         * Returns the attribute broadcastFilteringTypeList.
         *
         * @return broadcastFilteringTypeList list of broadcastFilteringTypeList
         */
        List<TapiBroadcastType> broadcastFilteringTypeList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangEthCepPacOpType.
         *
         * @return yangEthCepPacOpType value of yangEthCepPacOpType
         */
        OnosYangOpType yangEthCepPacOpType();

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
         * Returns the attribute trafficConditioning.
         *
         * @return trafficConditioning value of trafficConditioning
         */
        TrafficConditioning trafficConditioning();

        /**
         * Returns the attribute broadcastFilteringTraffic.
         *
         * @return broadcastFilteringTraffic value of broadcastFilteringTraffic
         */
        BroadcastFilteringTraffic broadcastFilteringTraffic();

        /**
         * Returns the builder object of vlanType.
         *
         * @param vlanType value of vlanType
         * @return vlanType
         */
        EthCepPacBuilder vlanType(TapiVlanType vlanType);

        /**
         * Returns the builder object of accessAction.
         *
         * @param accessAction value of accessAction
         * @return accessAction
         */
        EthCepPacBuilder accessAction(TapiAccessAction accessAction);

        /**
         * Returns the builder object of isMacAdressLearningEnabled.
         *
         * @param isMacAdressLearningEnabled value of isMacAdressLearningEnabled
         * @return isMacAdressLearningEnabled
         */
        EthCepPacBuilder isMacAdressLearningEnabled(boolean isMacAdressLearningEnabled);

        /**
         * Returns the builder object of macAdressLearningRange.
         *
         * @param macAdressLearningRange value of macAdressLearningRange
         * @return macAdressLearningRange
         */
        EthCepPacBuilder macAdressLearningRange(Integer macAdressLearningRange);

        /**
         * Returns the builder object of macAdressAgeingTime.
         *
         * @param macAdressAgeingTime value of macAdressAgeingTime
         * @return macAdressAgeingTime
         */
        EthCepPacBuilder macAdressAgeingTime(Integer macAdressAgeingTime);

        /**
         * Returns the builder object of broadcastFilteringMode.
         *
         * @param broadcastFilteringMode value of broadcastFilteringMode
         * @return broadcastFilteringMode
         */
        EthCepPacBuilder broadcastFilteringMode(TapiBroadcastFilteringMode broadcastFilteringMode);

        /**
         * Returns the builder object of broadcastFilteringTypeList.
         *
         * @param broadcastFilteringTypeList list of broadcastFilteringTypeList
         * @return broadcastFilteringTypeList
         */
        EthCepPacBuilder broadcastFilteringTypeList(List<TapiBroadcastType> broadcastFilteringTypeList);

        /**
         * Returns the builder object of yangEthCepPacOpType.
         *
         * @param yangEthCepPacOpType value of yangEthCepPacOpType
         * @return yangEthCepPacOpType
         */
        EthCepPacBuilder yangEthCepPacOpType(OnosYangOpType yangEthCepPacOpType);

        /**
         * Returns the builder object of vlanList.
         *
         * @param vlanList list of vlanList
         * @return vlanList
         */
        EthCepPacBuilder vlanList(List<VlanList> vlanList);

        /**
         * Returns the builder object of trafficConditioning.
         *
         * @param trafficConditioning value of trafficConditioning
         * @return trafficConditioning
         */
        EthCepPacBuilder trafficConditioning(TrafficConditioning trafficConditioning);

        /**
         * Returns the builder object of broadcastFilteringTraffic.
         *
         * @param broadcastFilteringTraffic value of broadcastFilteringTraffic
         * @return broadcastFilteringTraffic
         */
        EthCepPacBuilder broadcastFilteringTraffic(BroadcastFilteringTraffic broadcastFilteringTraffic);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        EthCepPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        EthCepPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of ethCepPac.
         *
         * @return ethCepPac
         */
        EthCepPac build();
    }
}
