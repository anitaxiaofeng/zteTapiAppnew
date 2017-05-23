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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodedetails.getnodedetailsinput.NodeName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodedetails.getnodedetailsinput.TopologyName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of getNodeDetailsInput.
 */
public class DefaultGetNodeDetailsInput implements GetNodeDetailsInput {
    protected UniversalId topologyId;
    protected UniversalId nodeId;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected TopologyName topologyName;
    protected NodeName nodeName;

    @Override
    public UniversalId topologyId() {
        return topologyId;
    }

    @Override
    public UniversalId nodeId() {
        return nodeId;
    }

    @Override
    public List<TapiLayerProtocolName> layerProtocolNameList() {
        return layerProtocolNameList;
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
    public TopologyName topologyName() {
        return topologyName;
    }

    @Override
    public NodeName nodeName() {
        return nodeName;
    }

    @Override
    public int hashCode() {
         return Objects.hash(topologyId, nodeId, layerProtocolNameList, valueLeafFlags, yangAugmentedInfoMap,
                    topologyName, nodeName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetNodeDetailsInput) {
            DefaultGetNodeDetailsInput other = (DefaultGetNodeDetailsInput) obj;
            return
                Objects.equals(topologyId, other.topologyId) &&
                Objects.equals(nodeId, other.nodeId) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(topologyName, other.topologyName) &&
                Objects.equals(nodeName, other.nodeName);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("topologyId", topologyId)
            .add("nodeId", nodeId)
            .add("layerProtocolNameList", layerProtocolNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("topologyName", topologyName)
            .add("nodeName", nodeName)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getNodeDetailsInput.
     *
     * @param builderObject value of builder object of getNodeDetailsInput
     */
    protected DefaultGetNodeDetailsInput(GetNodeDetailsInputBuilder builderObject) {
        topologyId = builderObject.topologyId();
        nodeId = builderObject.nodeId();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        topologyName = builderObject.topologyName();
        nodeName = builderObject.nodeName();
    }

    /**
     * Creates an instance of defaultGetNodeDetailsInput.
     */
    protected DefaultGetNodeDetailsInput() {
    }

    /**
     * Returns the attribute getNodeDetailsInputBuilder.
     *
     * @return getNodeDetailsInputBuilder
     */
    public static GetNodeDetailsInputBuilder builder() {
        return new GetNodeDetailsInputBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of getNodeDetailsInput.
     */
    public static class GetNodeDetailsInputBuilder implements GetNodeDetailsInput.GetNodeDetailsInputBuilder {
        protected UniversalId topologyId;
        protected UniversalId nodeId;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected TopologyName topologyName;
        protected NodeName nodeName;


        @Override
        public UniversalId topologyId() {
            return topologyId;
        }

        @Override
        public UniversalId nodeId() {
            return nodeId;
        }

        @Override
        public List<TapiLayerProtocolName> layerProtocolNameList() {
            return layerProtocolNameList;
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
        public TopologyName topologyName() {
            return topologyName;
        }

        @Override
        public NodeName nodeName() {
            return nodeName;
        }

        @Override
        public GetNodeDetailsInputBuilder topologyId(UniversalId topologyId) {
            valueLeafFlags.set(LeafIdentifier.TOPOLOGYID.getLeafIndex());
            this.topologyId = topologyId;
            return this;
        }

        @Override
        public GetNodeDetailsInputBuilder nodeId(UniversalId nodeId) {
            valueLeafFlags.set(LeafIdentifier.NODEID.getLeafIndex());
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public GetNodeDetailsInputBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public GetNodeDetailsInputBuilder topologyName(TopologyName topologyName) {
            this.topologyName = topologyName;
            return this;
        }

        @Override
        public GetNodeDetailsInputBuilder nodeName(NodeName nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        @Override
        public GetNodeDetailsInputBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public GetNodeDetailsInputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetNodeDetailsInput build() {
            return new DefaultGetNodeDetailsInput(this);
        }

        /**
         * Creates an instance of getNodeDetailsInputBuilder.
         */
        public GetNodeDetailsInputBuilder() {
        }

    }
}
