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
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointlist.getnodeedgepointlistoutput;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapinodeedgepoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Represents the implementation of nodeEdgePointList.
 */
public class DefaultNodeEdgePointList implements NodeEdgePointList {
    protected TapiTerminationDirection terminationDirection;
    protected Object serverConnEpref;
    protected UniversalId uuid;
    protected List<Object> serviceEprefList;
    protected List<Object> clientConnEprefList;
    protected List<String> physicalPortReference;
    protected BitSet valueLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<LpList> lpList;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiTerminationDirection terminationDirection() {
        return terminationDirection;
    }

    @Override
    public Object serverConnEpref() {
        return serverConnEpref;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<Object> serviceEprefList() {
        return serviceEprefList;
    }

    @Override
    public List<Object> clientConnEprefList() {
        return clientConnEprefList;
    }

    @Override
    public List<String> physicalPortReference() {
        return physicalPortReference;
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
    public List<LpList> lpList() {
        return lpList;
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
         return Objects.hash(terminationDirection, serverConnEpref, uuid, serviceEprefList, clientConnEprefList,
                    physicalPortReference, valueLeafFlags, yangAugmentedInfoMap, lpList, localIdList, name, label,
                    extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultNodeEdgePointList) {
            DefaultNodeEdgePointList other = (DefaultNodeEdgePointList) obj;
            return
                Objects.equals(terminationDirection, other.terminationDirection) &&
                Objects.equals(serverConnEpref, other.serverConnEpref) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(serviceEprefList, other.serviceEprefList) &&
                Objects.equals(clientConnEprefList, other.clientConnEprefList) &&
                Objects.equals(physicalPortReference, other.physicalPortReference) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(lpList, other.lpList) &&
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
            .add("terminationDirection", terminationDirection)
            .add("serverConnEpref", serverConnEpref)
            .add("uuid", uuid)
            .add("serviceEprefList", serviceEprefList)
            .add("clientConnEprefList", clientConnEprefList)
            .add("physicalPortReference", physicalPortReference)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("lpList", lpList)
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
     * Creates an instance of nodeEdgePointList.
     *
     * @param builderObject value of builder object of nodeEdgePointList
     */
    protected DefaultNodeEdgePointList(NodeEdgePointListBuilder builderObject) {
        terminationDirection = builderObject.terminationDirection();
        serverConnEpref = builderObject.serverConnEpref();
        uuid = builderObject.uuid();
        serviceEprefList = builderObject.serviceEprefList();
        clientConnEprefList = builderObject.clientConnEprefList();
        physicalPortReference = builderObject.physicalPortReference();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        lpList = builderObject.lpList();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Creates an instance of defaultNodeEdgePointList.
     */
    protected DefaultNodeEdgePointList() {
    }

    /**
     * Returns the attribute nodeEdgePointListBuilder.
     *
     * @return nodeEdgePointListBuilder
     */
    public static NodeEdgePointListBuilder builder() {
        return new NodeEdgePointListBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of nodeEdgePointList.
     */
    public static class NodeEdgePointListBuilder implements NodeEdgePointList.NodeEdgePointListBuilder {
        protected TapiTerminationDirection terminationDirection;
        protected Object serverConnEpref;
        protected UniversalId uuid;
        protected List<Object> serviceEprefList;
        protected List<Object> clientConnEprefList;
        protected List<String> physicalPortReference;
        protected BitSet valueLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<LpList> lpList;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;


        @Override
        public TapiTerminationDirection terminationDirection() {
            return terminationDirection;
        }

        @Override
        public Object serverConnEpref() {
            return serverConnEpref;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<Object> serviceEprefList() {
            return serviceEprefList;
        }

        @Override
        public List<Object> clientConnEprefList() {
            return clientConnEprefList;
        }

        @Override
        public List<String> physicalPortReference() {
            return physicalPortReference;
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
        public List<LpList> lpList() {
            return lpList;
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
        public NodeEdgePointListBuilder terminationDirection(TapiTerminationDirection terminationDirection) {
            valueLeafFlags.set(LeafIdentifier.TERMINATIONDIRECTION.getLeafIndex());
            this.terminationDirection = terminationDirection;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder serverConnEpref(Object serverConnEpref) {
            valueLeafFlags.set(LeafIdentifier.SERVERCONNEPREF.getLeafIndex());
            this.serverConnEpref = serverConnEpref;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder serviceEprefList(List<Object> serviceEprefList) {
            this.serviceEprefList = serviceEprefList;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder clientConnEprefList(List<Object> clientConnEprefList) {
            this.clientConnEprefList = clientConnEprefList;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder physicalPortReference(List<String> physicalPortReference) {
            this.physicalPortReference = physicalPortReference;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder lpList(List<LpList> lpList) {
            this.lpList = lpList;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public NodeEdgePointListBuilder addToServiceEprefList(Object addTo) {
            if (serviceEprefList == null) {
                serviceEprefList = new ArrayList<>();
            }
            serviceEprefList.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToClientConnEprefList(Object addTo) {
            if (clientConnEprefList == null) {
                clientConnEprefList = new ArrayList<>();
            }
            clientConnEprefList.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToPhysicalPortReference(String addTo) {
            if (physicalPortReference == null) {
                physicalPortReference = new ArrayList<>();
            }
            physicalPortReference.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToLpList(LpList addTo) {
            if (lpList == null) {
                lpList = new ArrayList<>();
            }
            lpList.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public NodeEdgePointListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public NodeEdgePointList build() {
            return new DefaultNodeEdgePointList(this);
        }

        /**
         * Creates an instance of nodeEdgePointListBuilder.
         */
        public NodeEdgePointListBuilder() {
        }

    }
}
