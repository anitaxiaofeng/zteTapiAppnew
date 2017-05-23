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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.getlinklistinput;

import java.util.BitSet;
import java.util.Map;

/**
 * Abstraction of an entity which represents the functionality of topologyName.
 */
public interface TopologyName {

    /**
     * Identify the leaf of TopologyName.
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
     * Builder for topologyName.
     */
    interface TopologyNameBuilder {
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
        TopologyNameBuilder valueName(String valueName);

        /**
         * Returns the builder object of value.
         *
         * @param value value of value
         * @return value
         */
        TopologyNameBuilder value(String value);

        /**
         * Returns the builder object of localClassRef.
         *
         * @param localClassRef value of localClassRef
         * @return localClassRef
         */
        TopologyNameBuilder localClassRef(String localClassRef);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TopologyNameBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of topologyName.
         *
         * @return topologyName
         */
        TopologyName build();
    }
}
