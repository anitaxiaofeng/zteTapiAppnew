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
            .TapiColourMode;

/**
 * Abstraction of an entity which represents the functionality of broadcastFilteringTraffic.
 */
public interface BroadcastFilteringTraffic {

    /**
     * Identify the leaf of BroadcastFilteringTraffic.
     */
    public enum LeafIdentifier {
        /**
         * Represents cir.
         */
        CIR(1),
        /**
         * Represents cbs.
         */
        CBS(2),
        /**
         * Represents eir.
         */
        EIR(3),
        /**
         * Represents ebs.
         */
        EBS(4),
        /**
         * Represents colourMode.
         */
        COLOURMODE(5);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute cir.
     *
     * @return cir value of cir
     */
    Integer cir();

    /**
     * Returns the attribute cbs.
     *
     * @return cbs value of cbs
     */
    Integer cbs();

    /**
     * Returns the attribute eir.
     *
     * @return eir value of eir
     */
    Integer eir();

    /**
     * Returns the attribute ebs.
     *
     * @return ebs value of ebs
     */
    Integer ebs();

    /**
     * Returns the attribute colourMode.
     *
     * @return colourMode value of colourMode
     */
    TapiColourMode colourMode();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangBroadcastFilteringTrafficOpType.
     *
     * @return yangBroadcastFilteringTrafficOpType value of yangBroadcastFilteringTrafficOpType
     */
    OnosYangOpType yangBroadcastFilteringTrafficOpType();

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
     * Builder for broadcastFilteringTraffic.
     */
    interface BroadcastFilteringTrafficBuilder {
        /**
         * Returns the attribute cir.
         *
         * @return cir value of cir
         */
        Integer cir();

        /**
         * Returns the attribute cbs.
         *
         * @return cbs value of cbs
         */
        Integer cbs();

        /**
         * Returns the attribute eir.
         *
         * @return eir value of eir
         */
        Integer eir();

        /**
         * Returns the attribute ebs.
         *
         * @return ebs value of ebs
         */
        Integer ebs();

        /**
         * Returns the attribute colourMode.
         *
         * @return colourMode value of colourMode
         */
        TapiColourMode colourMode();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangBroadcastFilteringTrafficOpType.
         *
         * @return yangBroadcastFilteringTrafficOpType value of yangBroadcastFilteringTrafficOpType
         */
        OnosYangOpType yangBroadcastFilteringTrafficOpType();

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
         * Returns the builder object of cir.
         *
         * @param cir value of cir
         * @return cir
         */
        BroadcastFilteringTrafficBuilder cir(Integer cir);

        /**
         * Returns the builder object of cbs.
         *
         * @param cbs value of cbs
         * @return cbs
         */
        BroadcastFilteringTrafficBuilder cbs(Integer cbs);

        /**
         * Returns the builder object of eir.
         *
         * @param eir value of eir
         * @return eir
         */
        BroadcastFilteringTrafficBuilder eir(Integer eir);

        /**
         * Returns the builder object of ebs.
         *
         * @param ebs value of ebs
         * @return ebs
         */
        BroadcastFilteringTrafficBuilder ebs(Integer ebs);

        /**
         * Returns the builder object of colourMode.
         *
         * @param colourMode value of colourMode
         * @return colourMode
         */
        BroadcastFilteringTrafficBuilder colourMode(TapiColourMode colourMode);

        /**
         * Returns the builder object of yangBroadcastFilteringTrafficOpType.
         *
         * @param yangBroadcastFilteringTrafficOpType value of yangBroadcastFilteringTrafficOpType
         * @return yangBroadcastFilteringTrafficOpType
         */
        BroadcastFilteringTrafficBuilder yangBroadcastFilteringTrafficOpType(OnosYangOpType
                    yangBroadcastFilteringTrafficOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        BroadcastFilteringTrafficBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        BroadcastFilteringTrafficBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of broadcastFilteringTraffic.
         *
         * @return broadcastFilteringTraffic
         */
        BroadcastFilteringTraffic build();
    }
}
