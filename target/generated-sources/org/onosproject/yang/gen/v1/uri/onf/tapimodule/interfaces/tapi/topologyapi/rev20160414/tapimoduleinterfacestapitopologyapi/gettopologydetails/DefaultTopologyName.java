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
            .tapimoduleinterfacestapitopologyapi.gettopologydetails.gettopologydetailsinput;

import com.google.common.base.MoreObjects;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the implementation of topologyName.
 */
public class DefaultTopologyName implements TopologyName {
    protected String valueName;
    protected String value;
    protected String localClassRef;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String valueName() {
        return valueName;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String localClassRef() {
        return localClassRef;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueName, value, localClassRef, valueLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTopologyName) {
            DefaultTopologyName other = (DefaultTopologyName) obj;
            return
                Objects.equals(valueName, other.valueName) &&
                Objects.equals(value, other.value) &&
                Objects.equals(localClassRef, other.localClassRef) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("valueName", valueName)
            .add("value", value)
            .add("localClassRef", localClassRef)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of topologyName.
     *
     * @param builderObject value of builder object of topologyName
     */
    protected DefaultTopologyName(TopologyNameBuilder builderObject) {
        valueName = builderObject.valueName();
        value = builderObject.value();
        localClassRef = builderObject.localClassRef();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Creates an instance of defaultTopologyName.
     */
    protected DefaultTopologyName() {
    }

    /**
     * Returns the attribute topologyNameBuilder.
     *
     * @return topologyNameBuilder
     */
    public static TopologyNameBuilder builder() {
        return new TopologyNameBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of topologyName.
     */
    public static class TopologyNameBuilder implements TopologyName.TopologyNameBuilder {
        protected String valueName;
        protected String value;
        protected String localClassRef;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();


        @Override
        public String valueName() {
            return valueName;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public String localClassRef() {
            return localClassRef;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public TopologyNameBuilder valueName(String valueName) {
            valueLeafFlags.set(LeafIdentifier.VALUENAME.getLeafIndex());
            this.valueName = valueName;
            return this;
        }

        @Override
        public TopologyNameBuilder value(String value) {
            valueLeafFlags.set(LeafIdentifier.VALUE.getLeafIndex());
            this.value = value;
            return this;
        }

        @Override
        public TopologyNameBuilder localClassRef(String localClassRef) {
            valueLeafFlags.set(LeafIdentifier.LOCALCLASSREF.getLeafIndex());
            this.localClassRef = localClassRef;
            return this;
        }

        @Override
        public TopologyNameBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TopologyName build() {
            return new DefaultTopologyName(this);
        }

        /**
         * Creates an instance of topologyNameBuilder.
         */
        public TopologyNameBuilder() {
        }

    }
}
