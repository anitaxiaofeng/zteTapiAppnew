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
            .tapimoduleinterfacestapitopologyapi.getlinklist;

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.getlinklistinput.TopologyName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of getLinkListInput.
 */
public class DefaultGetLinkListInput implements GetLinkListInput {
    protected UniversalId topologyId;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected TopologyName topologyName;

    @Override
    public UniversalId topologyId() {
        return topologyId;
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
    public int hashCode() {
        return Objects.hash(topologyId, layerProtocolNameList, valueLeafFlags, yangAugmentedInfoMap, topologyName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetLinkListInput) {
            DefaultGetLinkListInput other = (DefaultGetLinkListInput) obj;
            return
                Objects.equals(topologyId, other.topologyId) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(topologyName, other.topologyName);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("topologyId", topologyId)
            .add("layerProtocolNameList", layerProtocolNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("topologyName", topologyName)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getLinkListInput.
     *
     * @param builderObject value of builder object of getLinkListInput
     */
    protected DefaultGetLinkListInput(GetLinkListInputBuilder builderObject) {
        topologyId = builderObject.topologyId();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        topologyName = builderObject.topologyName();
    }

    /**
     * Creates an instance of defaultGetLinkListInput.
     */
    protected DefaultGetLinkListInput() {
    }

    /**
     * Returns the attribute getLinkListInputBuilder.
     *
     * @return getLinkListInputBuilder
     */
    public static GetLinkListInputBuilder builder() {
        return new GetLinkListInputBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of getLinkListInput.
     */
    public static class GetLinkListInputBuilder implements GetLinkListInput.GetLinkListInputBuilder {
        protected UniversalId topologyId;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected TopologyName topologyName;


        @Override
        public UniversalId topologyId() {
            return topologyId;
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
        public GetLinkListInputBuilder topologyId(UniversalId topologyId) {
            valueLeafFlags.set(LeafIdentifier.TOPOLOGYID.getLeafIndex());
            this.topologyId = topologyId;
            return this;
        }

        @Override
        public GetLinkListInputBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public GetLinkListInputBuilder topologyName(TopologyName topologyName) {
            this.topologyName = topologyName;
            return this;
        }

        @Override
        public GetLinkListInputBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public GetLinkListInputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetLinkListInput build() {
            return new DefaultGetLinkListInput(this);
        }

        /**
         * Creates an instance of getLinkListInputBuilder.
         */
        public GetLinkListInputBuilder() {
        }

    }
}
