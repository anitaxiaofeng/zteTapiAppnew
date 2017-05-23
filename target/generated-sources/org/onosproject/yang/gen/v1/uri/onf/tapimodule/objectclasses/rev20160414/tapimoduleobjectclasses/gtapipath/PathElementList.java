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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapipath;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of pathElementList.
 */
public interface PathElementList {

    /**
     * Identify the leaf of PathElementList.
     */
    public enum LeafIdentifier {
        /**
         * Represents nodeRef.
         */
        NODEREF(1),
        /**
         * Represents linkPortRef.
         */
        LINKPORTREF(2),
        /**
         * Represents linkRef.
         */
        LINKREF(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute nodeRef.
     *
     * @return nodeRef value of nodeRef
     */
    Object nodeRef();

    /**
     * Returns the attribute linkPortRef.
     *
     * @return linkPortRef value of linkPortRef
     */
    Object linkPortRef();

    /**
     * Returns the attribute linkRef.
     *
     * @return linkRef value of linkRef
     */
    Object linkRef();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangPathElementListOpType.
     *
     * @return yangPathElementListOpType value of yangPathElementListOpType
     */
    OnosYangOpType yangPathElementListOpType();

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
     * Builder for pathElementList.
     */
    interface PathElementListBuilder {
        /**
         * Returns the attribute nodeRef.
         *
         * @return nodeRef value of nodeRef
         */
        Object nodeRef();

        /**
         * Returns the attribute linkPortRef.
         *
         * @return linkPortRef value of linkPortRef
         */
        Object linkPortRef();

        /**
         * Returns the attribute linkRef.
         *
         * @return linkRef value of linkRef
         */
        Object linkRef();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangPathElementListOpType.
         *
         * @return yangPathElementListOpType value of yangPathElementListOpType
         */
        OnosYangOpType yangPathElementListOpType();

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
         * Returns the builder object of nodeRef.
         *
         * @param nodeRef value of nodeRef
         * @return nodeRef
         */
        PathElementListBuilder nodeRef(Object nodeRef);

        /**
         * Returns the builder object of linkPortRef.
         *
         * @param linkPortRef value of linkPortRef
         * @return linkPortRef
         */
        PathElementListBuilder linkPortRef(Object linkPortRef);

        /**
         * Returns the builder object of linkRef.
         *
         * @param linkRef value of linkRef
         * @return linkRef
         */
        PathElementListBuilder linkRef(Object linkRef);

        /**
         * Returns the builder object of yangPathElementListOpType.
         *
         * @param yangPathElementListOpType value of yangPathElementListOpType
         * @return yangPathElementListOpType
         */
        PathElementListBuilder yangPathElementListOpType(OnosYangOpType yangPathElementListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        PathElementListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        PathElementListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of pathElementList.
         *
         * @return pathElementList
         */
        PathElementList build();
    }
}
