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
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails;

import com.google.common.base.MoreObjects;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails.getnodeedgepointdetailsoutput
            .NodeEdgePoint;

/**
 * Represents the implementation of getNodeEdgePointDetailsOutput.
 */
public class DefaultGetNodeEdgePointDetailsOutput implements GetNodeEdgePointDetailsOutput {
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected NodeEdgePoint nodeEdgePoint;

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public NodeEdgePoint nodeEdgePoint() {
        return nodeEdgePoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangAugmentedInfoMap, nodeEdgePoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetNodeEdgePointDetailsOutput) {
            DefaultGetNodeEdgePointDetailsOutput other = (DefaultGetNodeEdgePointDetailsOutput) obj;
            return
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(nodeEdgePoint, other.nodeEdgePoint);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("nodeEdgePoint", nodeEdgePoint)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getNodeEdgePointDetailsOutput.
     *
     * @param builderObject value of builder object of getNodeEdgePointDetailsOutput
     */
    protected DefaultGetNodeEdgePointDetailsOutput(GetNodeEdgePointDetailsOutputBuilder builderObject) {
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        nodeEdgePoint = builderObject.nodeEdgePoint();
    }

    /**
     * Creates an instance of defaultGetNodeEdgePointDetailsOutput.
     */
    protected DefaultGetNodeEdgePointDetailsOutput() {
    }

    /**
     * Returns the attribute getNodeEdgePointDetailsOutputBuilder.
     *
     * @return getNodeEdgePointDetailsOutputBuilder
     */
    public static GetNodeEdgePointDetailsOutputBuilder builder() {
        return new GetNodeEdgePointDetailsOutputBuilder();
    }

    /**
     * Represents the builder implementation of getNodeEdgePointDetailsOutput.
     */
    public static class GetNodeEdgePointDetailsOutputBuilder implements
                GetNodeEdgePointDetailsOutput.GetNodeEdgePointDetailsOutputBuilder {
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected NodeEdgePoint nodeEdgePoint;


        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public NodeEdgePoint nodeEdgePoint() {
            return nodeEdgePoint;
        }

        @Override
        public GetNodeEdgePointDetailsOutputBuilder nodeEdgePoint(NodeEdgePoint nodeEdgePoint) {
            this.nodeEdgePoint = nodeEdgePoint;
            return this;
        }

        @Override
        public GetNodeEdgePointDetailsOutputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetNodeEdgePointDetailsOutput build() {
            return new DefaultGetNodeEdgePointDetailsOutput(this);
        }

        /**
         * Creates an instance of getNodeEdgePointDetailsOutputBuilder.
         */
        public GetNodeEdgePointDetailsOutputBuilder() {
        }

    }
}
