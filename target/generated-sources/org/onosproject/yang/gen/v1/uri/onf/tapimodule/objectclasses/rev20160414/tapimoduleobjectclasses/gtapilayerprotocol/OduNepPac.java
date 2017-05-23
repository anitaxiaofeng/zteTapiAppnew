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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .PayLoadType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAdaptationType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSignalType;

/**
 * Abstraction of an entity which represents the functionality of oduNepPac.
 */
public interface OduNepPac {

    /**
     * Identify the leaf of OduNepPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents oducapacity.
         */
        ODUCAPACITY(1),
        /**
         * Represents adaptationTypeList.
         */
        ADAPTATIONTYPELIST(2),
        /**
         * Represents tsDetail.
         */
        TSDETAIL(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute oducapacity.
     *
     * @return oducapacity value of oducapacity
     */
    Integer oducapacity();

    /**
     * Returns the attribute adaptationTypeList.
     *
     * @return adaptationTypeList value of adaptationTypeList
     */
    TapiAdaptationType adaptationTypeList();

    /**
     * Returns the attribute tsDetail.
     *
     * @return tsDetail value of tsDetail
     */
    String tsDetail();

    /**
     * Returns the attribute payLoadTypeList.
     *
     * @return payLoadTypeList list of payLoadTypeList
     */
    List<PayLoadType> payLoadTypeList();

    /**
     * Returns the attribute switchCapabilityList.
     *
     * @return switchCapabilityList list of switchCapabilityList
     */
    List<TapiSignalType> switchCapabilityList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangOduNepPacOpType.
     *
     * @return yangOduNepPacOpType value of yangOduNepPacOpType
     */
    OnosYangOpType yangOduNepPacOpType();

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
     * Builder for oduNepPac.
     */
    interface OduNepPacBuilder {
        /**
         * Adds to the list of payLoadTypeList.
         *
         * @return builder object of payLoadTypeList
         */
        OduNepPacBuilder addToPayLoadTypeList(PayLoadType addTo);

        /**
         * Adds to the list of switchCapabilityList.
         *
         * @return builder object of switchCapabilityList
         */
        OduNepPacBuilder addToSwitchCapabilityList(TapiSignalType addTo);

        /**
         * Returns the attribute oducapacity.
         *
         * @return oducapacity value of oducapacity
         */
        Integer oducapacity();

        /**
         * Returns the attribute adaptationTypeList.
         *
         * @return adaptationTypeList value of adaptationTypeList
         */
        TapiAdaptationType adaptationTypeList();

        /**
         * Returns the attribute tsDetail.
         *
         * @return tsDetail value of tsDetail
         */
        String tsDetail();

        /**
         * Returns the attribute payLoadTypeList.
         *
         * @return payLoadTypeList list of payLoadTypeList
         */
        List<PayLoadType> payLoadTypeList();

        /**
         * Returns the attribute switchCapabilityList.
         *
         * @return switchCapabilityList list of switchCapabilityList
         */
        List<TapiSignalType> switchCapabilityList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangOduNepPacOpType.
         *
         * @return yangOduNepPacOpType value of yangOduNepPacOpType
         */
        OnosYangOpType yangOduNepPacOpType();

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
         * Returns the builder object of oducapacity.
         *
         * @param oducapacity value of oducapacity
         * @return oducapacity
         */
        OduNepPacBuilder oducapacity(Integer oducapacity);

        /**
         * Returns the builder object of adaptationTypeList.
         *
         * @param adaptationTypeList value of adaptationTypeList
         * @return adaptationTypeList
         */
        OduNepPacBuilder adaptationTypeList(TapiAdaptationType adaptationTypeList);

        /**
         * Returns the builder object of tsDetail.
         *
         * @param tsDetail value of tsDetail
         * @return tsDetail
         */
        OduNepPacBuilder tsDetail(String tsDetail);

        /**
         * Returns the builder object of payLoadTypeList.
         *
         * @param payLoadTypeList list of payLoadTypeList
         * @return payLoadTypeList
         */
        OduNepPacBuilder payLoadTypeList(List<PayLoadType> payLoadTypeList);

        /**
         * Returns the builder object of switchCapabilityList.
         *
         * @param switchCapabilityList list of switchCapabilityList
         * @return switchCapabilityList
         */
        OduNepPacBuilder switchCapabilityList(List<TapiSignalType> switchCapabilityList);

        /**
         * Returns the builder object of yangOduNepPacOpType.
         *
         * @param yangOduNepPacOpType value of yangOduNepPacOpType
         * @return yangOduNepPacOpType
         */
        OduNepPacBuilder yangOduNepPacOpType(OnosYangOpType yangOduNepPacOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        OduNepPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        OduNepPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of oduNepPac.
         *
         * @return oduNepPac
         */
        OduNepPac build();
    }
}
