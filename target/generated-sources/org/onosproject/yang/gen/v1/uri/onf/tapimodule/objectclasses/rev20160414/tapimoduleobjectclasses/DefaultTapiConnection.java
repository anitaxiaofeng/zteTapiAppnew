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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses;

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
            .gtapiconnection.ConnectionPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.DefaultConnectionPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.DefaultProtectionType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.DefaultRouteList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.DefaultRoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.ProtectionType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.RouteList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.RoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiServiceType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSignalType;

/**
 * Represents the implementation of tapiConnection.
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
public class DefaultTapiConnection implements TapiConnection {
    protected TapiServiceType serviceType;
    protected TapiConnectionType connectionType;
    protected TapiConnectionDirection connectionDirection;
    protected Integer capacity;
    protected TapiLayerProtocolName layerProtocolName;
    protected Object parentNodeRef;
    protected UniversalId uuid;
    protected List<TapiSignalType> connectionSignalType;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiConnectionOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<ConnectionPortList> connectionPortList;
    protected List<RouteList> routeList;
    protected ProtectionType protectionType;
    protected RoutingConstraints routingConstraints;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiServiceType serviceType() {
        return serviceType;
    }

    @Override
    public TapiConnectionType connectionType() {
        return connectionType;
    }

    @Override
    public TapiConnectionDirection connectionDirection() {
        return connectionDirection;
    }

    @Override
    public Integer capacity() {
        return capacity;
    }

    @Override
    public TapiLayerProtocolName layerProtocolName() {
        return layerProtocolName;
    }

    @Override
    public Object parentNodeRef() {
        return parentNodeRef;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<TapiSignalType> connectionSignalType() {
        return connectionSignalType;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTapiConnectionOpType() {
        return yangTapiConnectionOpType;
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
    public List<ConnectionPortList> connectionPortList() {
        return connectionPortList;
    }

    @Override
    public List<RouteList> routeList() {
        return routeList;
    }

    @Override
    public ProtectionType protectionType() {
        return protectionType;
    }

    @Override
    public RoutingConstraints routingConstraints() {
        return routingConstraints;
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
         return Objects.hash(serviceType, connectionType, connectionDirection, capacity, layerProtocolName,
                    parentNodeRef, uuid, connectionSignalType, valueLeafFlags, yangTapiConnectionOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, connectionPortList, routeList,
                    protectionType, routingConstraints, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiConnection) {
            DefaultTapiConnection other = (DefaultTapiConnection) obj;
            return
                Objects.equals(serviceType, other.serviceType) &&
                Objects.equals(connectionType, other.connectionType) &&
                Objects.equals(connectionDirection, other.connectionDirection) &&
                Objects.equals(capacity, other.capacity) &&
                Objects.equals(layerProtocolName, other.layerProtocolName) &&
                Objects.equals(parentNodeRef, other.parentNodeRef) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(connectionSignalType, other.connectionSignalType) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiConnectionOpType,
                 other.yangTapiConnectionOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(connectionPortList, other.connectionPortList) &&
                Objects.equals(routeList, other.routeList) &&
                Objects.equals(protectionType, other.protectionType) &&
                Objects.equals(routingConstraints, other.routingConstraints) &&
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
            .add("serviceType", serviceType)
            .add("connectionType", connectionType)
            .add("connectionDirection", connectionDirection)
            .add("capacity", capacity)
            .add("layerProtocolName", layerProtocolName)
            .add("parentNodeRef", parentNodeRef)
            .add("uuid", uuid)
            .add("connectionSignalType", connectionSignalType)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiConnectionOpType", yangTapiConnectionOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("connectionPortList", connectionPortList)
            .add("routeList", routeList)
            .add("protectionType", protectionType)
            .add("routingConstraints", routingConstraints)
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
     * Creates an instance of tapiConnection.
     *
     * @param builderObject value of builder object of tapiConnection
     */
    protected DefaultTapiConnection(TapiConnectionBuilder builderObject) {
        serviceType = builderObject.serviceType();
        connectionType = builderObject.connectionType();
        connectionDirection = builderObject.connectionDirection();
        capacity = builderObject.capacity();
        layerProtocolName = builderObject.layerProtocolName();
        parentNodeRef = builderObject.parentNodeRef();
        uuid = builderObject.uuid();
        connectionSignalType = builderObject.connectionSignalType();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiConnectionOpType = builderObject.yangTapiConnectionOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        connectionPortList = builderObject.connectionPortList();
        routeList = builderObject.routeList();
        protectionType = builderObject.protectionType();
        routingConstraints = builderObject.routingConstraints();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed TapiConnection maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiConnection processSubtreeFiltering(TapiConnection appInstance, boolean
                isSelectAllSchemaChild) {
        TapiConnectionBuilder subTreeFilteringResultBuilder = new TapiConnectionBuilder();
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
        return (DefaultTapiConnection) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TapiConnection appInstance, TapiConnectionBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.SERVICETYPE.getLeafIndex())) {
            if (appInstance.serviceType() == null || !(serviceType().equals(appInstance.serviceType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SERVICETYPE)) {
                    subTreeFilteringResultBuilder.serviceType(serviceType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serviceType(appInstance.serviceType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SERVICETYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serviceType(appInstance.serviceType());
        }

        if (valueLeafFlags.get(LeafIdentifier.CONNECTIONTYPE.getLeafIndex())) {
            if (appInstance.connectionType() == null || !(connectionType().equals(appInstance.connectionType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CONNECTIONTYPE)) {
                    subTreeFilteringResultBuilder.connectionType(connectionType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.connectionType(appInstance.connectionType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.CONNECTIONTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.connectionType(appInstance.connectionType());
        }

        if (valueLeafFlags.get(LeafIdentifier.CONNECTIONDIRECTION.getLeafIndex())) {
             if (appInstance.connectionDirection() == null
                        || !(connectionDirection()
            .equals(appInstance.connectionDirection()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CONNECTIONDIRECTION)) {
                    subTreeFilteringResultBuilder.connectionDirection(connectionDirection());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.connectionDirection(appInstance.connectionDirection());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.CONNECTIONDIRECTION
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.connectionDirection(appInstance.connectionDirection());
        }

        if (valueLeafFlags.get(LeafIdentifier.CAPACITY.getLeafIndex())) {
            if (appInstance.capacity() == null || !(capacity().equals(appInstance.capacity()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CAPACITY)) {
                    subTreeFilteringResultBuilder.capacity(capacity());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.capacity(appInstance.capacity());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.CAPACITY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.capacity(appInstance.capacity());
        }

        if (valueLeafFlags.get(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex())) {
             if (appInstance.layerProtocolName() == null
                        || !(layerProtocolName()
            .equals(appInstance.layerProtocolName()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LAYERPROTOCOLNAME)) {
                    subTreeFilteringResultBuilder.layerProtocolName(layerProtocolName());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.layerProtocolName(appInstance.layerProtocolName());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.layerProtocolName(appInstance.layerProtocolName());
        }

        if (valueLeafFlags.get(LeafIdentifier.PARENTNODEREF.getLeafIndex())) {
            if (appInstance.parentNodeRef() == null || !(parentNodeRef().equals(appInstance.parentNodeRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PARENTNODEREF)) {
                    subTreeFilteringResultBuilder.parentNodeRef(parentNodeRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.parentNodeRef(appInstance.parentNodeRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PARENTNODEREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.parentNodeRef(appInstance.parentNodeRef());
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

    private boolean processLeafListSubTreeFiltering(TapiConnection appInstance, TapiConnectionBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.connectionSignalType() != null) {
                for (TapiSignalType connectionSignalType : appInstance.connectionSignalType()) {
                    subTreeFilteringResultBuilder.addToConnectionSignalType(connectionSignalType);
                }
            } else {
                if (isSubTreeFiltered && connectionSignalType() != null) {
                    subTreeFilteringResultBuilder.connectionSignalType(connectionSignalType);
                }
            }
        } else if (connectionSignalType() != null) {
            if (!connectionSignalType().isEmpty()) {
                if (appInstance.connectionSignalType() == null || appInstance.connectionSignalType().isEmpty()) {
                    return false;
                }
                for (TapiSignalType connectionSignalType : connectionSignalType()) {
                    boolean flag = false;
                    for (TapiSignalType connectionSignalType2 : appInstance.connectionSignalType()) {
                        if (connectionSignalType.equals(connectionSignalType2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToConnectionSignalType(connectionSignalType2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.connectionSignalType() != null && !appInstance.connectionSignalType().isEmpty()) {
                for (TapiSignalType connectionSignalType : appInstance.connectionSignalType()) {
                        subTreeFilteringResultBuilder.addToConnectionSignalType(connectionSignalType);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiConnection appInstance, TapiConnectionBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.connectionPortList() != null) {
                for (ConnectionPortList connectionPortList : appInstance.connectionPortList()) {
                    ConnectionPortList result;
                    result = ((DefaultConnectionPortList) DefaultConnectionPortList.builder()
                            .buildForFilter()).processSubtreeFiltering(connectionPortList, true);
                    subTreeFilteringResultBuilder.addToConnectionPortList(result);
                }
            } else {
                if (isSubTreeFiltered && connectionPortList() != null) {
                    subTreeFilteringResultBuilder.connectionPortList(connectionPortList);
                }
            }
        } else if (connectionPortList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!connectionPortList().isEmpty()) {
                if (appInstance.connectionPortList() != null && !appInstance.connectionPortList().isEmpty()) {
                for (ConnectionPortList connectionPortList : connectionPortList()) {
                    for (ConnectionPortList connectionPortList2 : appInstance.connectionPortList()) {
                            ConnectionPortList result = ((DefaultConnectionPortList) connectionPortList)
                            .processSubtreeFiltering(connectionPortList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToConnectionPortList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && connectionPortList() != null) {
                    subTreeFilteringResultBuilder.connectionPortList(connectionPortList);
                }
            }
            } else {
                if (appInstance.connectionPortList() != null && !appInstance.connectionPortList().isEmpty()) {
                for (ConnectionPortList connectionPortList : appInstance.connectionPortList()) {
                        subTreeFilteringResultBuilder.addToConnectionPortList(connectionPortList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.routeList() != null) {
                for (RouteList routeList : appInstance.routeList()) {
                    RouteList result;
                    result = ((DefaultRouteList) DefaultRouteList.builder()
                            .buildForFilter()).processSubtreeFiltering(routeList, true);
                    subTreeFilteringResultBuilder.addToRouteList(result);
                }
            } else {
                if (isSubTreeFiltered && routeList() != null) {
                    subTreeFilteringResultBuilder.routeList(routeList);
                }
            }
        } else if (routeList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!routeList().isEmpty()) {
                if (appInstance.routeList() != null && !appInstance.routeList().isEmpty()) {
                for (RouteList routeList : routeList()) {
                    for (RouteList routeList2 : appInstance.routeList()) {
                            RouteList result = ((DefaultRouteList) routeList)
                            .processSubtreeFiltering(routeList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToRouteList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && routeList() != null) {
                    subTreeFilteringResultBuilder.routeList(routeList);
                }
            }
            } else {
                if (appInstance.routeList() != null && !appInstance.routeList().isEmpty()) {
                for (RouteList routeList : appInstance.routeList()) {
                        subTreeFilteringResultBuilder.addToRouteList(routeList);
                    }
                }
            }
        }

        if (protectionType() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.protectionType() != null) {
                ProtectionType result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultProtectionType) DefaultProtectionType.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.protectionType(), true);
                } else {
                    result = ((DefaultProtectionType) protectionType)
                            .processSubtreeFiltering(appInstance.protectionType(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.protectionType(result);
                }
            } else {
                if (isSubTreeFiltered && protectionType() != null) {
                    subTreeFilteringResultBuilder.protectionType(protectionType);
                }
            }
        }

        if (routingConstraints() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.routingConstraints() != null) {
                RoutingConstraints result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultRoutingConstraints) DefaultRoutingConstraints.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.routingConstraints(), true);
                } else {
                    result = ((DefaultRoutingConstraints) routingConstraints)
                            .processSubtreeFiltering(appInstance.routingConstraints(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.routingConstraints(result);
                }
            } else {
                if (isSubTreeFiltered && routingConstraints() != null) {
                    subTreeFilteringResultBuilder.routingConstraints(routingConstraints);
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
     * Creates an instance of defaultTapiConnection.
     */
    protected DefaultTapiConnection() {
    }

    /**
     * Returns the attribute tapiConnectionBuilder.
     *
     * @return tapiConnectionBuilder
     */
    public static TapiConnectionBuilder builder() {
        return new TapiConnectionBuilder();
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
     * Represents the builder implementation of tapiConnection.
     */
    public static class TapiConnectionBuilder implements TapiConnection.TapiConnectionBuilder {
        protected TapiServiceType serviceType;
        protected TapiConnectionType connectionType;
        protected TapiConnectionDirection connectionDirection;
        protected Integer capacity;
        protected TapiLayerProtocolName layerProtocolName;
        protected Object parentNodeRef;
        protected UniversalId uuid;
        protected List<TapiSignalType> connectionSignalType;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiConnectionOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<ConnectionPortList> connectionPortList;
        protected List<RouteList> routeList;
        protected ProtectionType protectionType;
        protected RoutingConstraints routingConstraints;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;



        @Override
        public TapiServiceType serviceType() {
            return serviceType;
        }

        @Override
        public TapiConnectionType connectionType() {
            return connectionType;
        }

        @Override
        public TapiConnectionDirection connectionDirection() {
            return connectionDirection;
        }

        @Override
        public Integer capacity() {
            return capacity;
        }

        @Override
        public TapiLayerProtocolName layerProtocolName() {
            return layerProtocolName;
        }

        @Override
        public Object parentNodeRef() {
            return parentNodeRef;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<TapiSignalType> connectionSignalType() {
            return connectionSignalType;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTapiConnectionOpType() {
            return yangTapiConnectionOpType;
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
        public List<ConnectionPortList> connectionPortList() {
            return connectionPortList;
        }

        @Override
        public List<RouteList> routeList() {
            return routeList;
        }

        @Override
        public ProtectionType protectionType() {
            return protectionType;
        }

        @Override
        public RoutingConstraints routingConstraints() {
            return routingConstraints;
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
        public TapiConnectionBuilder serviceType(TapiServiceType serviceType) {
            valueLeafFlags.set(LeafIdentifier.SERVICETYPE.getLeafIndex());
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public TapiConnectionBuilder connectionType(TapiConnectionType connectionType) {
            valueLeafFlags.set(LeafIdentifier.CONNECTIONTYPE.getLeafIndex());
            this.connectionType = connectionType;
            return this;
        }

        @Override
        public TapiConnectionBuilder connectionDirection(TapiConnectionDirection connectionDirection) {
            valueLeafFlags.set(LeafIdentifier.CONNECTIONDIRECTION.getLeafIndex());
            this.connectionDirection = connectionDirection;
            return this;
        }

        @Override
        public TapiConnectionBuilder capacity(Integer capacity) {
            valueLeafFlags.set(LeafIdentifier.CAPACITY.getLeafIndex());
            this.capacity = capacity;
            return this;
        }

        @Override
        public TapiConnectionBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName) {
            valueLeafFlags.set(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex());
            this.layerProtocolName = layerProtocolName;
            return this;
        }

        @Override
        public TapiConnectionBuilder parentNodeRef(Object parentNodeRef) {
            valueLeafFlags.set(LeafIdentifier.PARENTNODEREF.getLeafIndex());
            this.parentNodeRef = parentNodeRef;
            return this;
        }

        @Override
        public TapiConnectionBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiConnectionBuilder connectionSignalType(List<TapiSignalType> connectionSignalType) {
            this.connectionSignalType = connectionSignalType;
            return this;
        }

        @Override
        public TapiConnectionBuilder yangTapiConnectionOpType(OnosYangOpType yangTapiConnectionOpType) {
            this.yangTapiConnectionOpType = yangTapiConnectionOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiConnectionBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiConnectionBuilder connectionPortList(List<ConnectionPortList> connectionPortList) {
            this.connectionPortList = connectionPortList;
            return this;
        }

        @Override
        public TapiConnectionBuilder routeList(List<RouteList> routeList) {
            this.routeList = routeList;
            return this;
        }

        @Override
        public TapiConnectionBuilder protectionType(ProtectionType protectionType) {
            this.protectionType = protectionType;
            return this;
        }

        @Override
        public TapiConnectionBuilder routingConstraints(RoutingConstraints routingConstraints) {
            this.routingConstraints = routingConstraints;
            return this;
        }

        @Override
        public TapiConnectionBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiConnectionBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiConnectionBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiConnectionBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiConnectionBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiConnectionBuilder addToConnectionSignalType(TapiSignalType addTo) {
            if (connectionSignalType == null) {
                connectionSignalType = new ArrayList<>();
            }
            connectionSignalType.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToConnectionPortList(ConnectionPortList addTo) {
            if (connectionPortList == null) {
                connectionPortList = new ArrayList<>();
            }
            connectionPortList.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToRouteList(RouteList addTo) {
            if (routeList == null) {
                routeList = new ArrayList<>();
            }
            routeList.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiConnectionBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiConnectionBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiConnection build() {
            return new DefaultTapiConnection(this);
        }

        /**
         * Builds object of tapiConnection.
         *
         * @return tapiConnection
         */
        public TapiConnection buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiConnection(this);
        }
        /**
         * Creates an instance of tapiConnectionBuilder.
         */
        public TapiConnectionBuilder() {
        }

    }
}
