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
            .tapimoduleinterfacestapitopologyapi.getlinkdetails;

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.getlinkdetailsinput.LinkName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.getlinkdetailsinput.TopologyName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of getLinkDetailsInput.
 */
public class DefaultGetLinkDetailsInput implements GetLinkDetailsInput {
    protected UniversalId topologyId;
    protected UniversalId linkId;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected TopologyName topologyName;
    protected LinkName linkName;

    @Override
    public UniversalId topologyId() {
        return topologyId;
    }

    @Override
    public UniversalId linkId() {
        return linkId;
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
    public LinkName linkName() {
        return linkName;
    }

    @Override
    public int hashCode() {
         return Objects.hash(topologyId, linkId, layerProtocolNameList, valueLeafFlags, yangAugmentedInfoMap,
                    topologyName, linkName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetLinkDetailsInput) {
            DefaultGetLinkDetailsInput other = (DefaultGetLinkDetailsInput) obj;
            return
                Objects.equals(topologyId, other.topologyId) &&
                Objects.equals(linkId, other.linkId) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(topologyName, other.topologyName) &&
                Objects.equals(linkName, other.linkName);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("topologyId", topologyId)
            .add("linkId", linkId)
            .add("layerProtocolNameList", layerProtocolNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("topologyName", topologyName)
            .add("linkName", linkName)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getLinkDetailsInput.
     *
     * @param builderObject value of builder object of getLinkDetailsInput
     */
    protected DefaultGetLinkDetailsInput(GetLinkDetailsInputBuilder builderObject) {
        topologyId = builderObject.topologyId();
        linkId = builderObject.linkId();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        topologyName = builderObject.topologyName();
        linkName = builderObject.linkName();
    }

    /**
     * Creates an instance of defaultGetLinkDetailsInput.
     */
    protected DefaultGetLinkDetailsInput() {
    }

    /**
     * Returns the attribute getLinkDetailsInputBuilder.
     *
     * @return getLinkDetailsInputBuilder
     */
    public static GetLinkDetailsInputBuilder builder() {
        return new GetLinkDetailsInputBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of getLinkDetailsInput.
     */
    public static class GetLinkDetailsInputBuilder implements GetLinkDetailsInput.GetLinkDetailsInputBuilder {
        protected UniversalId topologyId;
        protected UniversalId linkId;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected TopologyName topologyName;
        protected LinkName linkName;


        @Override
        public UniversalId topologyId() {
            return topologyId;
        }

        @Override
        public UniversalId linkId() {
            return linkId;
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
        public LinkName linkName() {
            return linkName;
        }

        @Override
        public GetLinkDetailsInputBuilder topologyId(UniversalId topologyId) {
            valueLeafFlags.set(LeafIdentifier.TOPOLOGYID.getLeafIndex());
            this.topologyId = topologyId;
            return this;
        }

        @Override
        public GetLinkDetailsInputBuilder linkId(UniversalId linkId) {
            valueLeafFlags.set(LeafIdentifier.LINKID.getLeafIndex());
            this.linkId = linkId;
            return this;
        }

        @Override
        public GetLinkDetailsInputBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public GetLinkDetailsInputBuilder topologyName(TopologyName topologyName) {
            this.topologyName = topologyName;
            return this;
        }

        @Override
        public GetLinkDetailsInputBuilder linkName(LinkName linkName) {
            this.linkName = linkName;
            return this;
        }

        @Override
        public GetLinkDetailsInputBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public GetLinkDetailsInputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetLinkDetailsInput build() {
            return new DefaultGetLinkDetailsInput(this);
        }

        /**
         * Creates an instance of getLinkDetailsInputBuilder.
         */
        public GetLinkDetailsInputBuilder() {
        }

    }
}
