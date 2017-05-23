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
            .tapimoduleinterfacestapitopologyapi.getnodedetails;

import com.google.common.base.MoreObjects;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodedetails.getnodedetailsoutput.Node;

/**
 * Represents the implementation of getNodeDetailsOutput.
 */
public class DefaultGetNodeDetailsOutput implements GetNodeDetailsOutput {
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected Node node;

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public Node node() {
        return node;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangAugmentedInfoMap, node);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetNodeDetailsOutput) {
            DefaultGetNodeDetailsOutput other = (DefaultGetNodeDetailsOutput) obj;
            return
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(node, other.node);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("node", node)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getNodeDetailsOutput.
     *
     * @param builderObject value of builder object of getNodeDetailsOutput
     */
    protected DefaultGetNodeDetailsOutput(GetNodeDetailsOutputBuilder builderObject) {
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        node = builderObject.node();
    }

    /**
     * Creates an instance of defaultGetNodeDetailsOutput.
     */
    protected DefaultGetNodeDetailsOutput() {
    }

    /**
     * Returns the attribute getNodeDetailsOutputBuilder.
     *
     * @return getNodeDetailsOutputBuilder
     */
    public static GetNodeDetailsOutputBuilder builder() {
        return new GetNodeDetailsOutputBuilder();
    }

    /**
     * Represents the builder implementation of getNodeDetailsOutput.
     */
    public static class GetNodeDetailsOutputBuilder implements GetNodeDetailsOutput.GetNodeDetailsOutputBuilder {
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected Node node;


        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public Node node() {
            return node;
        }

        @Override
        public GetNodeDetailsOutputBuilder node(Node node) {
            this.node = node;
            return this;
        }

        @Override
        public GetNodeDetailsOutputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetNodeDetailsOutput build() {
            return new DefaultGetNodeDetailsOutput(this);
        }

        /**
         * Creates an instance of getNodeDetailsOutputBuilder.
         */
        public GetNodeDetailsOutputBuilder() {
        }

    }
}
