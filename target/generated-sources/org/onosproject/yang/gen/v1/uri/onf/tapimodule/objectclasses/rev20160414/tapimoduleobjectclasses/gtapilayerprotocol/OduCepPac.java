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
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .PayLoadType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAdaptationType;

/**
 * Abstraction of an entity which represents the functionality of oduCepPac.
 */
public interface OduCepPac {

    /**
     * Identify the leaf of OduCepPac.
     */
    public enum LeafIdentifier {
        /**
         * Represents payLoadType.
         */
        PAYLOADTYPE(1),
        /**
         * Represents adaptationType.
         */
        ADAPTATIONTYPE(2),
        /**
         * Represents tsDetail.
         */
        TSDETAIL(3),
        /**
         * Represents currentNumberOfTributarySlots.
         */
        CURRENTNUMBEROFTRIBUTARYSLOTS(4);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute payLoadType.
     *
     * @return payLoadType value of payLoadType
     */
    PayLoadType payLoadType();

    /**
     * Returns the attribute adaptationType.
     *
     * @return adaptationType value of adaptationType
     */
    TapiAdaptationType adaptationType();

    /**
     * Returns the attribute tsDetail.
     *
     * @return tsDetail value of tsDetail
     */
    String tsDetail();

    /**
     * Returns the attribute currentNumberOfTributarySlots.
     *
     * @return currentNumberOfTributarySlots value of currentNumberOfTributarySlots
     */
    Integer currentNumberOfTributarySlots();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangOduCepPacOpType.
     *
     * @return yangOduCepPacOpType value of yangOduCepPacOpType
     */
    OnosYangOpType yangOduCepPacOpType();

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
     * Builder for oduCepPac.
     */
    interface OduCepPacBuilder {
        /**
         * Returns the attribute payLoadType.
         *
         * @return payLoadType value of payLoadType
         */
        PayLoadType payLoadType();

        /**
         * Returns the attribute adaptationType.
         *
         * @return adaptationType value of adaptationType
         */
        TapiAdaptationType adaptationType();

        /**
         * Returns the attribute tsDetail.
         *
         * @return tsDetail value of tsDetail
         */
        String tsDetail();

        /**
         * Returns the attribute currentNumberOfTributarySlots.
         *
         * @return currentNumberOfTributarySlots value of currentNumberOfTributarySlots
         */
        Integer currentNumberOfTributarySlots();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangOduCepPacOpType.
         *
         * @return yangOduCepPacOpType value of yangOduCepPacOpType
         */
        OnosYangOpType yangOduCepPacOpType();

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
         * Returns the builder object of payLoadType.
         *
         * @param payLoadType value of payLoadType
         * @return payLoadType
         */
        OduCepPacBuilder payLoadType(PayLoadType payLoadType);

        /**
         * Returns the builder object of adaptationType.
         *
         * @param adaptationType value of adaptationType
         * @return adaptationType
         */
        OduCepPacBuilder adaptationType(TapiAdaptationType adaptationType);

        /**
         * Returns the builder object of tsDetail.
         *
         * @param tsDetail value of tsDetail
         * @return tsDetail
         */
        OduCepPacBuilder tsDetail(String tsDetail);

        /**
         * Returns the builder object of currentNumberOfTributarySlots.
         *
         * @param currentNumberOfTributarySlots value of currentNumberOfTributarySlots
         * @return currentNumberOfTributarySlots
         */
        OduCepPacBuilder currentNumberOfTributarySlots(Integer currentNumberOfTributarySlots);

        /**
         * Returns the builder object of yangOduCepPacOpType.
         *
         * @param yangOduCepPacOpType value of yangOduCepPacOpType
         * @return yangOduCepPacOpType
         */
        OduCepPacBuilder yangOduCepPacOpType(OnosYangOpType yangOduCepPacOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        OduCepPacBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        OduCepPacBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of oduCepPac.
         *
         * @return oduCepPac
         */
        OduCepPac build();
    }
}
