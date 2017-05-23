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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnectionport;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultExtension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultLabel;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultLocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultStatePac;
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
            .gtapiconnectionendpoint.DefaultLpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnectionendpoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Represents the implementation of connectionEndPoint.
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
public class DefaultConnectionEndPoint implements ConnectionEndPoint {
    protected TapiTerminationDirection terminationDirection;
    protected Object serverNodeEpref;
    protected UniversalId uuid;
    protected List<Object> clientNodeEprefList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangConnectionEndPointOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
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
    public Object serverNodeEpref() {
        return serverNodeEpref;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<Object> clientNodeEprefList() {
        return clientNodeEprefList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangConnectionEndPointOpType() {
        return yangConnectionEndPointOpType;
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
         return Objects.hash(terminationDirection, serverNodeEpref, uuid, clientNodeEprefList, valueLeafFlags,
                    yangConnectionEndPointOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, lpList,
                    localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultConnectionEndPoint) {
            DefaultConnectionEndPoint other = (DefaultConnectionEndPoint) obj;
            return
                Objects.equals(terminationDirection, other.terminationDirection) &&
                Objects.equals(serverNodeEpref, other.serverNodeEpref) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(clientNodeEprefList, other.clientNodeEprefList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangConnectionEndPointOpType,
                 other.yangConnectionEndPointOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
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
            .add("serverNodeEpref", serverNodeEpref)
            .add("uuid", uuid)
            .add("clientNodeEprefList", clientNodeEprefList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangConnectionEndPointOpType", yangConnectionEndPointOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
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
     * Creates an instance of connectionEndPoint.
     *
     * @param builderObject value of builder object of connectionEndPoint
     */
    protected DefaultConnectionEndPoint(ConnectionEndPointBuilder builderObject) {
        terminationDirection = builderObject.terminationDirection();
        serverNodeEpref = builderObject.serverNodeEpref();
        uuid = builderObject.uuid();
        clientNodeEprefList = builderObject.clientNodeEprefList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangConnectionEndPointOpType = builderObject.yangConnectionEndPointOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        lpList = builderObject.lpList();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed ConnectionEndPoint maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultConnectionEndPoint processSubtreeFiltering(ConnectionEndPoint appInstance, boolean
                isSelectAllSchemaChild) {
        ConnectionEndPointBuilder subTreeFilteringResultBuilder = new ConnectionEndPointBuilder();
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
        return (DefaultConnectionEndPoint) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(ConnectionEndPoint appInstance, ConnectionEndPointBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.TERMINATIONDIRECTION.getLeafIndex())) {
             if (appInstance.terminationDirection() == null
                        || !(terminationDirection()
            .equals(appInstance.terminationDirection()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.TERMINATIONDIRECTION)) {
                    subTreeFilteringResultBuilder.terminationDirection(terminationDirection());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.terminationDirection(appInstance.terminationDirection());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.TERMINATIONDIRECTION
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.terminationDirection(appInstance.terminationDirection());
        }

        if (valueLeafFlags.get(LeafIdentifier.SERVERNODEEPREF.getLeafIndex())) {
             if (appInstance.serverNodeEpref() == null
                        || !(serverNodeEpref()
            .equals(appInstance.serverNodeEpref()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SERVERNODEEPREF)) {
                    subTreeFilteringResultBuilder.serverNodeEpref(serverNodeEpref());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serverNodeEpref(appInstance.serverNodeEpref());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SERVERNODEEPREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serverNodeEpref(appInstance.serverNodeEpref());
        }

        if (valueLeafFlags.get(LeafIdentifier.UUID.getLeafIndex())) {
            if (appInstance.uuid() == null || !(uuid().equals(appInstance.uuid()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.UUID)) {
                    subTreeFilteringResultBuilder.uuid(uuid());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.uuid(appInstance.uuid());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.UUID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.uuid(appInstance.uuid());
        }

        return true;
    }

    private boolean processLeafListSubTreeFiltering(ConnectionEndPoint appInstance, ConnectionEndPointBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.clientNodeEprefList() != null) {
                for (Object clientNodeEprefList : appInstance.clientNodeEprefList()) {
                    subTreeFilteringResultBuilder.addToClientNodeEprefList(clientNodeEprefList);
                }
            } else {
                if (isSubTreeFiltered && clientNodeEprefList() != null) {
                    subTreeFilteringResultBuilder.clientNodeEprefList(clientNodeEprefList);
                }
            }
        } else if (clientNodeEprefList() != null) {
            if (!clientNodeEprefList().isEmpty()) {
                if (appInstance.clientNodeEprefList() == null || appInstance.clientNodeEprefList().isEmpty()) {
                    return false;
                }
                for (Object clientNodeEprefList : clientNodeEprefList()) {
                    boolean flag = false;
                    for (Object clientNodeEprefList2 : appInstance.clientNodeEprefList()) {
                        if (clientNodeEprefList.equals(clientNodeEprefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToClientNodeEprefList(clientNodeEprefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.clientNodeEprefList() != null && !appInstance.clientNodeEprefList().isEmpty()) {
                for (Object clientNodeEprefList : appInstance.clientNodeEprefList()) {
                        subTreeFilteringResultBuilder.addToClientNodeEprefList(clientNodeEprefList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(ConnectionEndPoint appInstance, ConnectionEndPointBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.lpList() != null) {
                for (LpList lpList : appInstance.lpList()) {
                    LpList result;
                    result = ((DefaultLpList) DefaultLpList.builder()
                            .buildForFilter()).processSubtreeFiltering(lpList, true);
                    subTreeFilteringResultBuilder.addToLpList(result);
                }
            } else {
                if (isSubTreeFiltered && lpList() != null) {
                    subTreeFilteringResultBuilder.lpList(lpList);
                }
            }
        } else if (lpList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!lpList().isEmpty()) {
                if (appInstance.lpList() != null && !appInstance.lpList().isEmpty()) {
                for (LpList lpList : lpList()) {
                    for (LpList lpList2 : appInstance.lpList()) {
                            LpList result = ((DefaultLpList) lpList)
                            .processSubtreeFiltering(lpList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLpList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && lpList() != null) {
                    subTreeFilteringResultBuilder.lpList(lpList);
                }
            }
            } else {
                if (appInstance.lpList() != null && !appInstance.lpList().isEmpty()) {
                for (LpList lpList : appInstance.lpList()) {
                        subTreeFilteringResultBuilder.addToLpList(lpList);
                    }
                }
            }
        }

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
     * Creates an instance of defaultConnectionEndPoint.
     */
    protected DefaultConnectionEndPoint() {
    }

    /**
     * Returns the attribute connectionEndPointBuilder.
     *
     * @return connectionEndPointBuilder
     */
    public static ConnectionEndPointBuilder builder() {
        return new ConnectionEndPointBuilder();
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
     * Represents the builder implementation of connectionEndPoint.
     */
    public static class ConnectionEndPointBuilder implements ConnectionEndPoint.ConnectionEndPointBuilder {
        protected TapiTerminationDirection terminationDirection;
        protected Object serverNodeEpref;
        protected UniversalId uuid;
        protected List<Object> clientNodeEprefList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangConnectionEndPointOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
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
        public Object serverNodeEpref() {
            return serverNodeEpref;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<Object> clientNodeEprefList() {
            return clientNodeEprefList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangConnectionEndPointOpType() {
            return yangConnectionEndPointOpType;
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
        public ConnectionEndPointBuilder terminationDirection(TapiTerminationDirection terminationDirection) {
            valueLeafFlags.set(LeafIdentifier.TERMINATIONDIRECTION.getLeafIndex());
            this.terminationDirection = terminationDirection;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder serverNodeEpref(Object serverNodeEpref) {
            valueLeafFlags.set(LeafIdentifier.SERVERNODEEPREF.getLeafIndex());
            this.serverNodeEpref = serverNodeEpref;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder clientNodeEprefList(List<Object> clientNodeEprefList) {
            this.clientNodeEprefList = clientNodeEprefList;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder yangConnectionEndPointOpType(OnosYangOpType yangConnectionEndPointOpType) {
            this.yangConnectionEndPointOpType = yangConnectionEndPointOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public ConnectionEndPointBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder lpList(List<LpList> lpList) {
            this.lpList = lpList;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public ConnectionEndPointBuilder addToClientNodeEprefList(Object addTo) {
            if (clientNodeEprefList == null) {
                clientNodeEprefList = new ArrayList<>();
            }
            clientNodeEprefList.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder addToLpList(LpList addTo) {
            if (lpList == null) {
                lpList = new ArrayList<>();
            }
            lpList.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public ConnectionEndPointBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public ConnectionEndPointBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public ConnectionEndPoint build() {
            return new DefaultConnectionEndPoint(this);
        }

        /**
         * Builds object of connectionEndPoint.
         *
         * @return connectionEndPoint
         */
        public ConnectionEndPoint buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultConnectionEndPoint(this);
        }
        /**
         * Creates an instance of connectionEndPointBuilder.
         */
        public ConnectionEndPointBuilder() {
        }

    }
}
