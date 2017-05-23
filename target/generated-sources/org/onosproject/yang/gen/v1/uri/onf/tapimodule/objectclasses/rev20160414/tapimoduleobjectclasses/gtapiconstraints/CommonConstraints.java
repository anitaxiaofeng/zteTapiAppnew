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
            .gtapiconstraints;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiDiversityPolicy;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiRouteObjectiveFunction;

/**
 * Abstraction of an entity which represents the functionality of commonConstraints.
 */
public interface CommonConstraints {

    /**
     * Identify the leaf of CommonConstraints.
     */
    public enum LeafIdentifier {
        /**
         * Represents routeObjectiveFunction.
         */
        ROUTEOBJECTIVEFUNCTION(1),
        /**
         * Represents latency.
         */
        LATENCY(2),
        /**
         * Represents cost.
         */
        COST(3),
        /**
         * Represents diversityPolicy.
         */
        DIVERSITYPOLICY(4),
        /**
         * Represents coRoutingList.
         */
        COROUTINGLIST(5),
        /**
         * Represents disjointRoutingList.
         */
        DISJOINTROUTINGLIST(6);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute routeObjectiveFunction.
     *
     * @return routeObjectiveFunction value of routeObjectiveFunction
     */
    TapiRouteObjectiveFunction routeObjectiveFunction();

    /**
     * Returns the attribute latency.
     *
     * @return latency value of latency
     */
    Integer latency();

    /**
     * Returns the attribute cost.
     *
     * @return cost value of cost
     */
    Integer cost();

    /**
     * Returns the attribute diversityPolicy.
     *
     * @return diversityPolicy value of diversityPolicy
     */
    TapiDiversityPolicy diversityPolicy();

    /**
     * Returns the attribute coRoutingList.
     *
     * @return coRoutingList value of coRoutingList
     */
    Object coRoutingList();

    /**
     * Returns the attribute disjointRoutingList.
     *
     * @return disjointRoutingList value of disjointRoutingList
     */
    Object disjointRoutingList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangCommonConstraintsOpType.
     *
     * @return yangCommonConstraintsOpType value of yangCommonConstraintsOpType
     */
    OnosYangOpType yangCommonConstraintsOpType();

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
     * Builder for commonConstraints.
     */
    interface CommonConstraintsBuilder {
        /**
         * Returns the attribute routeObjectiveFunction.
         *
         * @return routeObjectiveFunction value of routeObjectiveFunction
         */
        TapiRouteObjectiveFunction routeObjectiveFunction();

        /**
         * Returns the attribute latency.
         *
         * @return latency value of latency
         */
        Integer latency();

        /**
         * Returns the attribute cost.
         *
         * @return cost value of cost
         */
        Integer cost();

        /**
         * Returns the attribute diversityPolicy.
         *
         * @return diversityPolicy value of diversityPolicy
         */
        TapiDiversityPolicy diversityPolicy();

        /**
         * Returns the attribute coRoutingList.
         *
         * @return coRoutingList value of coRoutingList
         */
        Object coRoutingList();

        /**
         * Returns the attribute disjointRoutingList.
         *
         * @return disjointRoutingList value of disjointRoutingList
         */
        Object disjointRoutingList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangCommonConstraintsOpType.
         *
         * @return yangCommonConstraintsOpType value of yangCommonConstraintsOpType
         */
        OnosYangOpType yangCommonConstraintsOpType();

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
         * Returns the builder object of routeObjectiveFunction.
         *
         * @param routeObjectiveFunction value of routeObjectiveFunction
         * @return routeObjectiveFunction
         */
        CommonConstraintsBuilder routeObjectiveFunction(TapiRouteObjectiveFunction routeObjectiveFunction);

        /**
         * Returns the builder object of latency.
         *
         * @param latency value of latency
         * @return latency
         */
        CommonConstraintsBuilder latency(Integer latency);

        /**
         * Returns the builder object of cost.
         *
         * @param cost value of cost
         * @return cost
         */
        CommonConstraintsBuilder cost(Integer cost);

        /**
         * Returns the builder object of diversityPolicy.
         *
         * @param diversityPolicy value of diversityPolicy
         * @return diversityPolicy
         */
        CommonConstraintsBuilder diversityPolicy(TapiDiversityPolicy diversityPolicy);

        /**
         * Returns the builder object of coRoutingList.
         *
         * @param coRoutingList value of coRoutingList
         * @return coRoutingList
         */
        CommonConstraintsBuilder coRoutingList(Object coRoutingList);

        /**
         * Returns the builder object of disjointRoutingList.
         *
         * @param disjointRoutingList value of disjointRoutingList
         * @return disjointRoutingList
         */
        CommonConstraintsBuilder disjointRoutingList(Object disjointRoutingList);

        /**
         * Returns the builder object of yangCommonConstraintsOpType.
         *
         * @param yangCommonConstraintsOpType value of yangCommonConstraintsOpType
         * @return yangCommonConstraintsOpType
         */
        CommonConstraintsBuilder yangCommonConstraintsOpType(OnosYangOpType yangCommonConstraintsOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        CommonConstraintsBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        CommonConstraintsBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of commonConstraints.
         *
         * @return commonConstraints
         */
        CommonConstraints build();
    }
}
