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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass;

import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Abstraction of an entity which represents the functionality of localIdList.
 */
public interface LocalIdList {

    /**
     * Identify the leaf of LocalIdList.
     */
    public enum LeafIdentifier {
        /**
         * Represents valueName.
         */
        VALUENAME(1),
        /**
         * Represents value.
         */
        VALUE(2),
        /**
         * Represents localClassRef.
         */
        LOCALCLASSREF(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute valueName.
     *
     * @return valueName value of valueName
     */
    String valueName();

    /**
     * Returns the attribute value.
     *
     * @return value value of value
     */
    String value();

    /**
     * Returns the attribute localClassRef.
     *
     * @return localClassRef value of localClassRef
     */
    String localClassRef();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangLocalIdListOpType.
     *
     * @return yangLocalIdListOpType value of yangLocalIdListOpType
     */
    OnosYangOpType yangLocalIdListOpType();

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
     * Builder for localIdList.
     */
    interface LocalIdListBuilder {
        /**
         * Returns the attribute valueName.
         *
         * @return valueName value of valueName
         */
        String valueName();

        /**
         * Returns the attribute value.
         *
         * @return value value of value
         */
        String value();

        /**
         * Returns the attribute localClassRef.
         *
         * @return localClassRef value of localClassRef
         */
        String localClassRef();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangLocalIdListOpType.
         *
         * @return yangLocalIdListOpType value of yangLocalIdListOpType
         */
        OnosYangOpType yangLocalIdListOpType();

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
         * Returns the builder object of valueName.
         *
         * @param valueName value of valueName
         * @return valueName
         */
        LocalIdListBuilder valueName(String valueName);

        /**
         * Returns the builder object of value.
         *
         * @param value value of value
         * @return value
         */
        LocalIdListBuilder value(String value);

        /**
         * Returns the builder object of localClassRef.
         *
         * @param localClassRef value of localClassRef
         * @return localClassRef
         */
        LocalIdListBuilder localClassRef(String localClassRef);

        /**
         * Returns the builder object of yangLocalIdListOpType.
         *
         * @param yangLocalIdListOpType value of yangLocalIdListOpType
         * @return yangLocalIdListOpType
         */
        LocalIdListBuilder yangLocalIdListOpType(OnosYangOpType yangLocalIdListOpType);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        LocalIdListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        LocalIdListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of localIdList.
         *
         * @return localIdList
         */
        LocalIdList build();
    }
}
