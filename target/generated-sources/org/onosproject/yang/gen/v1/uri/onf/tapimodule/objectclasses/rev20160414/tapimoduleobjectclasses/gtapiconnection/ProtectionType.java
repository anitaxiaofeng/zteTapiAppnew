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
            .gtapiconnection;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiMultiDomainType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiMultiLayerType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiProType;

/**
 * Abstraction of an entity which represents the functionality of protectionType.
 */
public interface ProtectionType {

    /**
     * Identify the leaf of ProtectionType.
     */
    public enum LeafIdentifier {
        /**
         * Represents proType.
         */
        PROTYPE(1),
        /**
         * Represents multiDomainType.
         */
        MULTIDOMAINTYPE(2),
        /**
         * Represents multiLayerType.
         */
        MULTILAYERTYPE(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute proType.
     *
     * @return proType value of proType
     */
    TapiProType proType();

    /**
     * Returns the attribute multiDomainType.
     *
     * @return multiDomainType value of multiDomainType
     */
    TapiMultiDomainType multiDomainType();

    /**
     * Returns the attribute multiLayerType.
     *
     * @return multiLayerType value of multiLayerType
     */
    TapiMultiLayerType multiLayerType();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangProtectionTypeOpType.
     *
     * @return yangProtectionTypeOpType value of yangProtectionTypeOpType
     */
    OnosYangOpType yangProtectionTypeOpType();

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
     * Builder for protectionType.
     */
    interface ProtectionTypeBuilder {
        /**
         * Returns the attribute proType.
         *
         * @return proType value of proType
         */
        TapiProType proType();

        /**
         * Returns the attribute multiDomainType.
         *
         * @return multiDomainType value of multiDomainType
         */
        TapiMultiDomainType multiDomainType();

        /**
         * Returns the attribute multiLayerType.
         *
         * @return multiLayerType value of multiLayerType
         */
        TapiMultiLayerType multiLayerType();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangProtectionTypeOpType.
         *
         * @return yangProtectionTypeOpType value of yangProtectionTypeOpType
         */
        OnosYangOpType yangProtectionTypeOpType();

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
         * Returns the builder object of proType.
         *
         * @param proType value of proType
         * @return proType
         */
        ProtectionTypeBuilder proType(TapiProType proType);

        /**
         * Returns the builder object of multiDomainType.
         *
         * @param multiDomainType value of multiDomainType
         * @return multiDomainType
         */
        ProtectionTypeBuilder multiDomainType(TapiMultiDomainType multiDomainType);

        /**
         * Returns the builder object of multiLayerType.
         *
         * @param multiLayerType value of multiLayerType
         * @return multiLayerType
         */
        ProtectionTypeBuilder multiLayerType(TapiMultiLayerType multiLayerType);

        /**
         * Returns the builder object of yangProtectionTypeOpType.
         *
         * @param yangProtectionTypeOpType value of yangProtectionTypeOpType
         * @return yangProtectionTypeOpType
         */
        ProtectionTypeBuilder yangProtectionTypeOpType(OnosYangOpType yangProtectionTypeOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ProtectionTypeBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ProtectionTypeBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of protectionType.
         *
         * @return protectionType
         */
        ProtectionType build();
    }
}
