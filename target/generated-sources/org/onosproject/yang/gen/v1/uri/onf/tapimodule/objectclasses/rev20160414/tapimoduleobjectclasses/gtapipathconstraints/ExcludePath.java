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
            .gtapipathconstraints;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of excludePath.
 */
public interface ExcludePath {

    /**
     * Identify the leaf of ExcludePath.
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
     * Returns the attribute yangExcludePathOpType.
     *
     * @return yangExcludePathOpType value of yangExcludePathOpType
     */
    OnosYangOpType yangExcludePathOpType();

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
     * Builder for excludePath.
     */
    interface ExcludePathBuilder {
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
         * Returns the attribute yangExcludePathOpType.
         *
         * @return yangExcludePathOpType value of yangExcludePathOpType
         */
        OnosYangOpType yangExcludePathOpType();

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
        ExcludePathBuilder nodeRef(Object nodeRef);

        /**
         * Returns the builder object of linkPortRef.
         *
         * @param linkPortRef value of linkPortRef
         * @return linkPortRef
         */
        ExcludePathBuilder linkPortRef(Object linkPortRef);

        /**
         * Returns the builder object of linkRef.
         *
         * @param linkRef value of linkRef
         * @return linkRef
         */
        ExcludePathBuilder linkRef(Object linkRef);

        /**
         * Returns the builder object of yangExcludePathOpType.
         *
         * @param yangExcludePathOpType value of yangExcludePathOpType
         * @return yangExcludePathOpType
         */
        ExcludePathBuilder yangExcludePathOpType(OnosYangOpType yangExcludePathOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ExcludePathBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ExcludePathBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of excludePath.
         *
         * @return excludePath
         */
        ExcludePath build();
    }
}
