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
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.ExcludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.ExplicitPath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.IncludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiPathProtType;

/**
 * Abstraction of an entity which represents the functionality of pathConstraintsList.
 */
public interface PathConstraintsList {

    /**
     * Identify the leaf of PathConstraintsList.
     */
    public enum LeafIdentifier {
        /**
         * Represents localId.
         */
        LOCALID(1),
        /**
         * Represents pathProtType.
         */
        PATHPROTTYPE(2),
        /**
         * Represents pathCost.
         */
        PATHCOST(3),
        /**
         * Represents pathLatency.
         */
        PATHLATENCY(4);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute localId.
     *
     * @return localId value of localId
     */
    String localId();

    /**
     * Returns the attribute pathProtType.
     *
     * @return pathProtType value of pathProtType
     */
    TapiPathProtType pathProtType();

    /**
     * Returns the attribute pathCost.
     *
     * @return pathCost value of pathCost
     */
    Integer pathCost();

    /**
     * Returns the attribute pathLatency.
     *
     * @return pathLatency value of pathLatency
     */
    Integer pathLatency();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangPathConstraintsListOpType.
     *
     * @return yangPathConstraintsListOpType value of yangPathConstraintsListOpType
     */
    OnosYangOpType yangPathConstraintsListOpType();

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
     * Returns the attribute includePath.
     *
     * @return includePath list of includePath
     */
    List<IncludePath> includePath();

    /**
     * Returns the attribute excludePath.
     *
     * @return excludePath list of excludePath
     */
    List<ExcludePath> excludePath();

    /**
     * Returns the attribute explicitPath.
     *
     * @return explicitPath list of explicitPath
     */
    List<ExplicitPath> explicitPath();


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
     * Builder for pathConstraintsList.
     */
    interface PathConstraintsListBuilder {
        /**
         * Adds to the list of includePath.
         *
         * @return builder object of includePath
         */
        PathConstraintsListBuilder addToIncludePath(IncludePath addTo);

        /**
         * Adds to the list of excludePath.
         *
         * @return builder object of excludePath
         */
        PathConstraintsListBuilder addToExcludePath(ExcludePath addTo);

        /**
         * Adds to the list of explicitPath.
         *
         * @return builder object of explicitPath
         */
        PathConstraintsListBuilder addToExplicitPath(ExplicitPath addTo);

        /**
         * Returns the attribute localId.
         *
         * @return localId value of localId
         */
        String localId();

        /**
         * Returns the attribute pathProtType.
         *
         * @return pathProtType value of pathProtType
         */
        TapiPathProtType pathProtType();

        /**
         * Returns the attribute pathCost.
         *
         * @return pathCost value of pathCost
         */
        Integer pathCost();

        /**
         * Returns the attribute pathLatency.
         *
         * @return pathLatency value of pathLatency
         */
        Integer pathLatency();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangPathConstraintsListOpType.
         *
         * @return yangPathConstraintsListOpType value of yangPathConstraintsListOpType
         */
        OnosYangOpType yangPathConstraintsListOpType();

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
         * Returns the attribute includePath.
         *
         * @return includePath list of includePath
         */
        List<IncludePath> includePath();

        /**
         * Returns the attribute excludePath.
         *
         * @return excludePath list of excludePath
         */
        List<ExcludePath> excludePath();

        /**
         * Returns the attribute explicitPath.
         *
         * @return explicitPath list of explicitPath
         */
        List<ExplicitPath> explicitPath();

        /**
         * Returns the builder object of localId.
         *
         * @param localId value of localId
         * @return localId
         */
        PathConstraintsListBuilder localId(String localId);

        /**
         * Returns the builder object of pathProtType.
         *
         * @param pathProtType value of pathProtType
         * @return pathProtType
         */
        PathConstraintsListBuilder pathProtType(TapiPathProtType pathProtType);

        /**
         * Returns the builder object of pathCost.
         *
         * @param pathCost value of pathCost
         * @return pathCost
         */
        PathConstraintsListBuilder pathCost(Integer pathCost);

        /**
         * Returns the builder object of pathLatency.
         *
         * @param pathLatency value of pathLatency
         * @return pathLatency
         */
        PathConstraintsListBuilder pathLatency(Integer pathLatency);

        /**
         * Returns the builder object of yangPathConstraintsListOpType.
         *
         * @param yangPathConstraintsListOpType value of yangPathConstraintsListOpType
         * @return yangPathConstraintsListOpType
         */
        PathConstraintsListBuilder yangPathConstraintsListOpType(OnosYangOpType yangPathConstraintsListOpType);

        /**
         * Returns the builder object of includePath.
         *
         * @param includePath list of includePath
         * @return includePath
         */
        PathConstraintsListBuilder includePath(List<IncludePath> includePath);

        /**
         * Returns the builder object of excludePath.
         *
         * @param excludePath list of excludePath
         * @return excludePath
         */
        PathConstraintsListBuilder excludePath(List<ExcludePath> excludePath);

        /**
         * Returns the builder object of explicitPath.
         *
         * @param explicitPath list of explicitPath
         * @return explicitPath
         */
        PathConstraintsListBuilder explicitPath(List<ExplicitPath> explicitPath);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        PathConstraintsListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        PathConstraintsListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of pathConstraintsList.
         *
         * @return pathConstraintsList
         */
        PathConstraintsList build();
    }
}
