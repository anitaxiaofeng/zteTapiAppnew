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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .DefaultExtension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .DefaultLabel;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .DefaultLocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .DefaultName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .DefaultStatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Extension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Label;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .LocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Name;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .StatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiPortDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.TapiRole;

/**
 * Represents the implementation of linkPortList.
 *
 * <p>
 * valueLeafFlags identify the leafs whose value are explicitly set
 * Applicable in protocol edit and query operation.
 * </p>
 *
 * <p>
 * selectLeafFlags identify the leafs to be selected, in a query operation.
 * </p>
 *
 * <p>
 * Operation type specify the node specific operation in protocols like NETCONF.
 * Applicable in protocol edit operation, not applicable in query operation.
 * </p>
 */
public class DefaultLinkPortList implements LinkPortList {
    protected TapiRole role;
    protected String offNetworkAddress;
    protected TapiPortDirection linkPortDirection;
    protected String localId;
    protected List<Object> nodeEdgePointRefList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangLinkPortListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiRole role() {
        return role;
    }

    @Override
    public String offNetworkAddress() {
        return offNetworkAddress;
    }

    @Override
    public TapiPortDirection linkPortDirection() {
        return linkPortDirection;
    }

    @Override
    public String localId() {
        return localId;
    }

    @Override
    public List<Object> nodeEdgePointRefList() {
        return nodeEdgePointRefList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangLinkPortListOpType() {
        return yangLinkPortListOpType;
    }
    /**
     * Returns the attribute isSubTreeFiltered.
     *
     * @return isSubTreeFiltered value of isSubTreeFiltered
     */
    public boolean isSubTreeFiltered() {
        return isSubTreeFiltered;
    }

    @Override
    public BitSet selectLeafFlags() {
        return selectLeafFlags;
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
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
         return Objects.hash(role, offNetworkAddress, linkPortDirection, localId, nodeEdgePointRefList,
                    valueLeafFlags, yangLinkPortListOpType, isSubTreeFiltered, selectLeafFlags,
                    yangAugmentedInfoMap, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultLinkPortList) {
            DefaultLinkPortList other = (DefaultLinkPortList) obj;
            return
                Objects.equals(role, other.role) &&
                Objects.equals(offNetworkAddress, other.offNetworkAddress) &&
                Objects.equals(linkPortDirection, other.linkPortDirection) &&
                Objects.equals(localId, other.localId) &&
                Objects.equals(nodeEdgePointRefList, other.nodeEdgePointRefList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangLinkPortListOpType,
                 other.yangLinkPortListOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
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
            .add("role", role)
            .add("offNetworkAddress", offNetworkAddress)
            .add("linkPortDirection", linkPortDirection)
            .add("localId", localId)
            .add("nodeEdgePointRefList", nodeEdgePointRefList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangLinkPortListOpType", yangLinkPortListOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
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
     * Creates an instance of linkPortList.
     *
     * @param builderObject value of builder object of linkPortList
     */
    protected DefaultLinkPortList(LinkPortListBuilder builderObject) {
        role = builderObject.role();
        offNetworkAddress = builderObject.offNetworkAddress();
        linkPortDirection = builderObject.linkPortDirection();
        localId = builderObject.localId();
        nodeEdgePointRefList = builderObject.nodeEdgePointRefList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangLinkPortListOpType = builderObject.yangLinkPortListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed LinkPortList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultLinkPortList processSubtreeFiltering(LinkPortList appInstance, boolean isSelectAllSchemaChild) {
        LinkPortListBuilder subTreeFilteringResultBuilder = new LinkPortListBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder, isAnySelectOrContainmentNode,
                    isSelectAllSchemaChild)) {
            return null;
        }
         if (!processLeafListSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
                    isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
         if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
                    isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (yangAugmentedInfoMap.isEmpty()) {
            java.util.Set<Map.Entry<Class<?>, Object>> augment = appInstance.yangAugmentedInfoMap().entrySet();
            if (augment != null && !augment.isEmpty()) {
                java.util.Iterator<Map.Entry<Class<?>, Object>> augItr = augment.iterator();
                while (augItr.hasNext()) {
                    Map.Entry<Class<?>, Object> aug = augItr.next();
                    Class<?> augClass = aug.getKey();
                    String augClassName = augClass.getName();
                    int index = augClassName.lastIndexOf('.');
                    String classPackage = augClassName.substring(0, index) +
                            "." + "Default" + augClass.getSimpleName() + "$"
                            + augClass.getSimpleName() + "Builder";
                    ClassLoader classLoader = augClass.getClassLoader();
                    try {
                        Class<?> builderClass;
                        builderClass = classLoader.loadClass(classPackage);
                        Object builderObj = builderClass.newInstance();
                        java.lang.reflect.Method method = builderClass.getMethod("build");
                        Object defaultObj = method.invoke(builderObj);
                        Class<?> defaultClass = defaultObj.getClass();
                        method = defaultClass.getMethod("processSubtreeFiltering", augClass, boolean.class);
                        Object result = method.invoke(defaultObj, aug.getValue(), true);
                        subTreeFilteringResultBuilder.addYangAugmentedInfo(result, augClass);
                    } catch (ClassNotFoundException | InstantiationException
                            | NoSuchMethodException |
                            InvocationTargetException | IllegalAccessException e) {
                    }
                }
            }
        } else {
            java.util.Set<Map.Entry<Class<?>, Object>> augment = yangAugmentedInfoMap
                    .entrySet();
            java.util.Iterator<Map.Entry<Class<?>, Object>> augItr = augment.iterator();
            while (augItr.hasNext()) {
                Map.Entry<Class<?>, Object> aug = augItr.next();
                Class<?> augClass = aug.getKey();
                Object appInstanceInfo = appInstance.yangAugmentedInfo(augClass);
                if (appInstanceInfo == null) {
                    subTreeFilteringResultBuilder.addYangAugmentedInfo(aug.getValue(), aug.getKey());
                } else {
                    Object processSubtreeFiltering;
                    try {
                        processSubtreeFiltering = aug.getValue().getClass()
                                .getMethod("processSubtreeFiltering", aug.getKey(), boolean.class)
                                .invoke(aug.getValue(), appInstanceInfo, true);
                        if (processSubtreeFiltering != null) {
                            subTreeFilteringResultBuilder
                                    .addYangAugmentedInfo(processSubtreeFiltering, aug.getKey());
                        }
                    } catch (NoSuchMethodException | InvocationTargetException |
                            IllegalAccessException e) {
                    }
                }
            }
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode.get(0)) {
            return processSubtreeFiltering(appInstance, true);
        }
        return (DefaultLinkPortList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(LinkPortList appInstance, LinkPortListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.ROLE.getLeafIndex())) {
            if (appInstance.role() == null || !(role().equals(appInstance.role()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ROLE)) {
                    subTreeFilteringResultBuilder.role(role());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.role(appInstance.role());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ROLE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.role(appInstance.role());
        }

        if (valueLeafFlags.get(LeafIdentifier.OFFNETWORKADDRESS.getLeafIndex())) {
             if (appInstance.offNetworkAddress() == null
                        || !(offNetworkAddress()
            .equals(appInstance.offNetworkAddress()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.OFFNETWORKADDRESS)) {
                    subTreeFilteringResultBuilder.offNetworkAddress(offNetworkAddress());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.offNetworkAddress(appInstance.offNetworkAddress());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.OFFNETWORKADDRESS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.offNetworkAddress(appInstance.offNetworkAddress());
        }

        if (valueLeafFlags.get(LeafIdentifier.LINKPORTDIRECTION.getLeafIndex())) {
             if (appInstance.linkPortDirection() == null
                        || !(linkPortDirection()
            .equals(appInstance.linkPortDirection()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LINKPORTDIRECTION)) {
                    subTreeFilteringResultBuilder.linkPortDirection(linkPortDirection());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.linkPortDirection(appInstance.linkPortDirection());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LINKPORTDIRECTION.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.linkPortDirection(appInstance.linkPortDirection());
        }

        if (valueLeafFlags.get(LeafIdentifier.LOCALID.getLeafIndex())) {
            if (appInstance.localId() == null || !(localId().equals(appInstance.localId()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LOCALID)) {
                    subTreeFilteringResultBuilder.localId(localId());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.localId(appInstance.localId());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LOCALID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.localId(appInstance.localId());
        }

        return true;
    }

    private boolean processLeafListSubTreeFiltering(LinkPortList appInstance, LinkPortListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.nodeEdgePointRefList() != null) {
                for (Object nodeEdgePointRefList : appInstance.nodeEdgePointRefList()) {
                    subTreeFilteringResultBuilder.addToNodeEdgePointRefList(nodeEdgePointRefList);
                }
            } else {
                if (isSubTreeFiltered && nodeEdgePointRefList() != null) {
                    subTreeFilteringResultBuilder.nodeEdgePointRefList(nodeEdgePointRefList);
                }
            }
        } else if (nodeEdgePointRefList() != null) {
            if (!nodeEdgePointRefList().isEmpty()) {
                if (appInstance.nodeEdgePointRefList() == null || appInstance.nodeEdgePointRefList().isEmpty()) {
                    return false;
                }
                for (Object nodeEdgePointRefList : nodeEdgePointRefList()) {
                    boolean flag = false;
                    for (Object nodeEdgePointRefList2 : appInstance.nodeEdgePointRefList()) {
                        if (nodeEdgePointRefList.equals(nodeEdgePointRefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToNodeEdgePointRefList(nodeEdgePointRefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.nodeEdgePointRefList() != null && !appInstance.nodeEdgePointRefList().isEmpty()) {
                for (Object nodeEdgePointRefList : appInstance.nodeEdgePointRefList()) {
                        subTreeFilteringResultBuilder.addToNodeEdgePointRefList(nodeEdgePointRefList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(LinkPortList appInstance, LinkPortListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.localIdList() != null) {
                for (LocalIdList localIdList : appInstance.localIdList()) {
                    LocalIdList result;
                    result = ((DefaultLocalIdList) DefaultLocalIdList.builder()
                            .buildForFilter()).processSubtreeFiltering(localIdList, true);
                    subTreeFilteringResultBuilder.addToLocalIdList(result);
                }
            } else {
                if (isSubTreeFiltered && localIdList() != null) {
                    subTreeFilteringResultBuilder.localIdList(localIdList);
                }
            }
        } else if (localIdList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!localIdList().isEmpty()) {
                if (appInstance.localIdList() != null && !appInstance.localIdList().isEmpty()) {
                for (LocalIdList localIdList : localIdList()) {
                    for (LocalIdList localIdList2 : appInstance.localIdList()) {
                            LocalIdList result = ((DefaultLocalIdList) localIdList)
                            .processSubtreeFiltering(localIdList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLocalIdList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && localIdList() != null) {
                    subTreeFilteringResultBuilder.localIdList(localIdList);
                }
            }
            } else {
                if (appInstance.localIdList() != null && !appInstance.localIdList().isEmpty()) {
                for (LocalIdList localIdList : appInstance.localIdList()) {
                        subTreeFilteringResultBuilder.addToLocalIdList(localIdList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.name() != null) {
                for (Name name : appInstance.name()) {
                    Name result;
                    result = ((DefaultName) DefaultName.builder()
                            .buildForFilter()).processSubtreeFiltering(name, true);
                    subTreeFilteringResultBuilder.addToName(result);
                }
            } else {
                if (isSubTreeFiltered && name() != null) {
                    subTreeFilteringResultBuilder.name(name);
                }
            }
        } else if (name() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!name().isEmpty()) {
                if (appInstance.name() != null && !appInstance.name().isEmpty()) {
                for (Name name : name()) {
                    for (Name name2 : appInstance.name()) {
                            Name result = ((DefaultName) name)
                            .processSubtreeFiltering(name2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToName(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && name() != null) {
                    subTreeFilteringResultBuilder.name(name);
                }
            }
            } else {
                if (appInstance.name() != null && !appInstance.name().isEmpty()) {
                for (Name name : appInstance.name()) {
                        subTreeFilteringResultBuilder.addToName(name);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.label() != null) {
                for (Label label : appInstance.label()) {
                    Label result;
                    result = ((DefaultLabel) DefaultLabel.builder()
                            .buildForFilter()).processSubtreeFiltering(label, true);
                    subTreeFilteringResultBuilder.addToLabel(result);
                }
            } else {
                if (isSubTreeFiltered && label() != null) {
                    subTreeFilteringResultBuilder.label(label);
                }
            }
        } else if (label() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!label().isEmpty()) {
                if (appInstance.label() != null && !appInstance.label().isEmpty()) {
                for (Label label : label()) {
                    for (Label label2 : appInstance.label()) {
                            Label result = ((DefaultLabel) label)
                            .processSubtreeFiltering(label2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLabel(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && label() != null) {
                    subTreeFilteringResultBuilder.label(label);
                }
            }
            } else {
                if (appInstance.label() != null && !appInstance.label().isEmpty()) {
                for (Label label : appInstance.label()) {
                        subTreeFilteringResultBuilder.addToLabel(label);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.extension() != null) {
                for (Extension extension : appInstance.extension()) {
                    Extension result;
                    result = ((DefaultExtension) DefaultExtension.builder()
                            .buildForFilter()).processSubtreeFiltering(extension, true);
                    subTreeFilteringResultBuilder.addToExtension(result);
                }
            } else {
                if (isSubTreeFiltered && extension() != null) {
                    subTreeFilteringResultBuilder.extension(extension);
                }
            }
        } else if (extension() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!extension().isEmpty()) {
                if (appInstance.extension() != null && !appInstance.extension().isEmpty()) {
                for (Extension extension : extension()) {
                    for (Extension extension2 : appInstance.extension()) {
                            Extension result = ((DefaultExtension) extension)
                            .processSubtreeFiltering(extension2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToExtension(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && extension() != null) {
                    subTreeFilteringResultBuilder.extension(extension);
                }
            }
            } else {
                if (appInstance.extension() != null && !appInstance.extension().isEmpty()) {
                for (Extension extension : appInstance.extension()) {
                        subTreeFilteringResultBuilder.addToExtension(extension);
                    }
                }
            }
        }

        if (statePac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.statePac() != null) {
                StatePac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultStatePac) DefaultStatePac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.statePac(), true);
                } else {
                    result = ((DefaultStatePac) statePac)
                            .processSubtreeFiltering(appInstance.statePac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.statePac(result);
                }
            } else {
                if (isSubTreeFiltered && statePac() != null) {
                    subTreeFilteringResultBuilder.statePac(statePac);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultLinkPortList.
     */
    protected DefaultLinkPortList() {
    }

    /**
     * Returns the attribute linkPortListBuilder.
     *
     * @return linkPortListBuilder
     */
    public static LinkPortListBuilder builder() {
        return new LinkPortListBuilder();
    }

    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return valueLeafFlags.get(leaf.getLeafIndex());
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return selectLeafFlags.get(leaf.getLeafIndex());
    }

    /**
     * Represents the builder implementation of linkPortList.
     */
    public static class LinkPortListBuilder implements LinkPortList.LinkPortListBuilder {
        protected TapiRole role;
        protected String offNetworkAddress;
        protected TapiPortDirection linkPortDirection;
        protected String localId;
        protected List<Object> nodeEdgePointRefList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangLinkPortListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;



        @Override
        public TapiRole role() {
            return role;
        }

        @Override
        public String offNetworkAddress() {
            return offNetworkAddress;
        }

        @Override
        public TapiPortDirection linkPortDirection() {
            return linkPortDirection;
        }

        @Override
        public String localId() {
            return localId;
        }

        @Override
        public List<Object> nodeEdgePointRefList() {
            return nodeEdgePointRefList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangLinkPortListOpType() {
            return yangLinkPortListOpType;
        }
        /**
         * Returns the attribute isSubTreeFiltered.
         *
         * @return isSubTreeFiltered value of isSubTreeFiltered
         */
        public boolean isSubTreeFiltered() {
            return isSubTreeFiltered;
        }

        @Override
        public BitSet selectLeafFlags() {
            return selectLeafFlags;
        }

        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
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
        public LinkPortListBuilder role(TapiRole role) {
            valueLeafFlags.set(LeafIdentifier.ROLE.getLeafIndex());
            this.role = role;
            return this;
        }

        @Override
        public LinkPortListBuilder offNetworkAddress(String offNetworkAddress) {
            valueLeafFlags.set(LeafIdentifier.OFFNETWORKADDRESS.getLeafIndex());
            this.offNetworkAddress = offNetworkAddress;
            return this;
        }

        @Override
        public LinkPortListBuilder linkPortDirection(TapiPortDirection linkPortDirection) {
            valueLeafFlags.set(LeafIdentifier.LINKPORTDIRECTION.getLeafIndex());
            this.linkPortDirection = linkPortDirection;
            return this;
        }

        @Override
        public LinkPortListBuilder localId(String localId) {
            valueLeafFlags.set(LeafIdentifier.LOCALID.getLeafIndex());
            this.localId = localId;
            return this;
        }

        @Override
        public LinkPortListBuilder nodeEdgePointRefList(List<Object> nodeEdgePointRefList) {
            this.nodeEdgePointRefList = nodeEdgePointRefList;
            return this;
        }

        @Override
        public LinkPortListBuilder yangLinkPortListOpType(OnosYangOpType yangLinkPortListOpType) {
            this.yangLinkPortListOpType = yangLinkPortListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public LinkPortListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public LinkPortListBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public LinkPortListBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public LinkPortListBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public LinkPortListBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public LinkPortListBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public LinkPortListBuilder addToNodeEdgePointRefList(Object addTo) {
            if (nodeEdgePointRefList == null) {
                nodeEdgePointRefList = new ArrayList<>();
            }
            nodeEdgePointRefList.add(addTo);
            return this;
        }


        @Override
        public LinkPortListBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public LinkPortListBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public LinkPortListBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public LinkPortListBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public LinkPortListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public LinkPortListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public LinkPortList build() {
            return new DefaultLinkPortList(this);
        }

        /**
         * Builds object of linkPortList.
         *
         * @return linkPortList
         */
        public LinkPortList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultLinkPortList(this);
        }
        /**
         * Creates an instance of linkPortListBuilder.
         */
        public LinkPortListBuilder() {
        }

    }
}
