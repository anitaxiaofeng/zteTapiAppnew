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
            .tapimoduleinterfacestapitopologyapi.getlinklist.getlinklistoutput;

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Extension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Label;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .LocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Name;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .StatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .LinkPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .RiskParameterPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferCapacityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferCostPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferIntegrityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferTimingPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .ValidationPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLinkDirection;

/**
 * Represents the implementation of linkList.
 */
public class DefaultLinkList implements LinkList {
    protected TapiLinkDirection linkDirection;
    protected UniversalId uuid;
    protected List<Object> nodeRefList;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<LinkPortList> linkPortList;
    protected RiskParameterPac riskParameterPac;
    protected TransferCostPac transferCostPac;
    protected TransferTimingPac transferTimingPac;
    protected TransferCapacityPac transferCapacityPac;
    protected TransferIntegrityPac transferIntegrityPac;
    protected ValidationPac validationPac;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiLinkDirection linkDirection() {
        return linkDirection;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<Object> nodeRefList() {
        return nodeRefList;
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
    public List<LinkPortList> linkPortList() {
        return linkPortList;
    }

    @Override
    public RiskParameterPac riskParameterPac() {
        return riskParameterPac;
    }

    @Override
    public TransferCostPac transferCostPac() {
        return transferCostPac;
    }

    @Override
    public TransferTimingPac transferTimingPac() {
        return transferTimingPac;
    }

    @Override
    public TransferCapacityPac transferCapacityPac() {
        return transferCapacityPac;
    }

    @Override
    public TransferIntegrityPac transferIntegrityPac() {
        return transferIntegrityPac;
    }

    @Override
    public ValidationPac validationPac() {
        return validationPac;
    }

    @Override
    public List<LocalIdList> localIdList() {
        return localIdList;
    }

    @Override
    public List<Name> name() {
        return name;
    }

    @Override
    public List<Label> label() {
        return label;
    }

    @Override
    public List<Extension> extension() {
        return extension;
    }

    @Override
    public StatePac statePac() {
        return statePac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkDirection, uuid, nodeRefList, layerProtocolNameList, valueLeafFlags,
                    yangAugmentedInfoMap, linkPortList, riskParameterPac, transferCostPac, transferTimingPac,
                    transferCapacityPac, transferIntegrityPac, validationPac, localIdList, name, label, extension,
                    statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultLinkList) {
            DefaultLinkList other = (DefaultLinkList) obj;
            return
                Objects.equals(linkDirection, other.linkDirection) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(nodeRefList, other.nodeRefList) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(linkPortList, other.linkPortList) &&
                Objects.equals(riskParameterPac, other.riskParameterPac) &&
                Objects.equals(transferCostPac, other.transferCostPac) &&
                Objects.equals(transferTimingPac, other.transferTimingPac) &&
                Objects.equals(transferCapacityPac, other.transferCapacityPac) &&
                Objects.equals(transferIntegrityPac, other.transferIntegrityPac) &&
                Objects.equals(validationPac, other.validationPac) &&
                Objects.equals(localIdList, other.localIdList) &&
                Objects.equals(name, other.name) &&
                Objects.equals(label, other.label) &&
                Objects.equals(extension, other.extension) &&
                Objects.equals(statePac, other.statePac);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("linkDirection", linkDirection)
            .add("uuid", uuid)
            .add("nodeRefList", nodeRefList)
            .add("layerProtocolNameList", layerProtocolNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("linkPortList", linkPortList)
            .add("riskParameterPac", riskParameterPac)
            .add("transferCostPac", transferCostPac)
            .add("transferTimingPac", transferTimingPac)
            .add("transferCapacityPac", transferCapacityPac)
            .add("transferIntegrityPac", transferIntegrityPac)
            .add("validationPac", validationPac)
            .add("localIdList", localIdList)
            .add("name", name)
            .add("label", label)
            .add("extension", extension)
            .add("statePac", statePac)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of linkList.
     *
     * @param builderObject value of builder object of linkList
     */
    protected DefaultLinkList(LinkListBuilder builderObject) {
        linkDirection = builderObject.linkDirection();
        uuid = builderObject.uuid();
        nodeRefList = builderObject.nodeRefList();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        linkPortList = builderObject.linkPortList();
        riskParameterPac = builderObject.riskParameterPac();
        transferCostPac = builderObject.transferCostPac();
        transferTimingPac = builderObject.transferTimingPac();
        transferCapacityPac = builderObject.transferCapacityPac();
        transferIntegrityPac = builderObject.transferIntegrityPac();
        validationPac = builderObject.validationPac();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Creates an instance of defaultLinkList.
     */
    protected DefaultLinkList() {
    }

    /**
     * Returns the attribute linkListBuilder.
     *
     * @return linkListBuilder
     */
    public static LinkListBuilder builder() {
        return new LinkListBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of linkList.
     */
    public static class LinkListBuilder implements LinkList.LinkListBuilder {
        protected TapiLinkDirection linkDirection;
        protected UniversalId uuid;
        protected List<Object> nodeRefList;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<LinkPortList> linkPortList;
        protected RiskParameterPac riskParameterPac;
        protected TransferCostPac transferCostPac;
        protected TransferTimingPac transferTimingPac;
        protected TransferCapacityPac transferCapacityPac;
        protected TransferIntegrityPac transferIntegrityPac;
        protected ValidationPac validationPac;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;


        @Override
        public TapiLinkDirection linkDirection() {
            return linkDirection;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<Object> nodeRefList() {
            return nodeRefList;
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
        public List<LinkPortList> linkPortList() {
            return linkPortList;
        }

        @Override
        public RiskParameterPac riskParameterPac() {
            return riskParameterPac;
        }

        @Override
        public TransferCostPac transferCostPac() {
            return transferCostPac;
        }

        @Override
        public TransferTimingPac transferTimingPac() {
            return transferTimingPac;
        }

        @Override
        public TransferCapacityPac transferCapacityPac() {
            return transferCapacityPac;
        }

        @Override
        public TransferIntegrityPac transferIntegrityPac() {
            return transferIntegrityPac;
        }

        @Override
        public ValidationPac validationPac() {
            return validationPac;
        }

        @Override
        public List<LocalIdList> localIdList() {
            return localIdList;
        }

        @Override
        public List<Name> name() {
            return name;
        }

        @Override
        public List<Label> label() {
            return label;
        }

        @Override
        public List<Extension> extension() {
            return extension;
        }

        @Override
        public StatePac statePac() {
            return statePac;
        }

        @Override
        public LinkListBuilder linkDirection(TapiLinkDirection linkDirection) {
            valueLeafFlags.set(LeafIdentifier.LINKDIRECTION.getLeafIndex());
            this.linkDirection = linkDirection;
            return this;
        }

        @Override
        public LinkListBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public LinkListBuilder nodeRefList(List<Object> nodeRefList) {
            this.nodeRefList = nodeRefList;
            return this;
        }

        @Override
        public LinkListBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public LinkListBuilder linkPortList(List<LinkPortList> linkPortList) {
            this.linkPortList = linkPortList;
            return this;
        }

        @Override
        public LinkListBuilder riskParameterPac(RiskParameterPac riskParameterPac) {
            this.riskParameterPac = riskParameterPac;
            return this;
        }

        @Override
        public LinkListBuilder transferCostPac(TransferCostPac transferCostPac) {
            this.transferCostPac = transferCostPac;
            return this;
        }

        @Override
        public LinkListBuilder transferTimingPac(TransferTimingPac transferTimingPac) {
            this.transferTimingPac = transferTimingPac;
            return this;
        }

        @Override
        public LinkListBuilder transferCapacityPac(TransferCapacityPac transferCapacityPac) {
            this.transferCapacityPac = transferCapacityPac;
            return this;
        }

        @Override
        public LinkListBuilder transferIntegrityPac(TransferIntegrityPac transferIntegrityPac) {
            this.transferIntegrityPac = transferIntegrityPac;
            return this;
        }

        @Override
        public LinkListBuilder validationPac(ValidationPac validationPac) {
            this.validationPac = validationPac;
            return this;
        }

        @Override
        public LinkListBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public LinkListBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public LinkListBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public LinkListBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public LinkListBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public LinkListBuilder addToNodeRefList(Object addTo) {
            if (nodeRefList == null) {
                nodeRefList = new ArrayList<>();
            }
            nodeRefList.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToLinkPortList(LinkPortList addTo) {
            if (linkPortList == null) {
                linkPortList = new ArrayList<>();
            }
            linkPortList.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public LinkListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public LinkList build() {
            return new DefaultLinkList(this);
        }

        /**
         * Creates an instance of linkListBuilder.
         */
        public LinkListBuilder() {
        }

    }
}
