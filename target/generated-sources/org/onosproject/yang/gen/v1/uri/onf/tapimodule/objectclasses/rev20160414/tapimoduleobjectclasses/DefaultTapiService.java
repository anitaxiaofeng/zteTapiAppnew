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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .DefaultRoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .DefaultServicePortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .RoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .ServicePortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiServiceType;

/**
 * Represents the implementation of tapiService.
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
public class DefaultTapiService implements TapiService {
    protected TapiServiceType serviceType;
    protected TapiConnectionDirection serviceDirection;
    protected TapiLayerProtocolName layerProtocolName;
    protected Integer capacity;
    protected String serviceLevel;
    protected String startTime;
    protected String endTime;
    protected UniversalId uuid;
    protected List<Object> connectionRefList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiServiceOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<ServicePortList> servicePortList;
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
    public TapiConnectionDirection serviceDirection() {
        return serviceDirection;
    }

    @Override
    public TapiLayerProtocolName layerProtocolName() {
        return layerProtocolName;
    }

    @Override
    public Integer capacity() {
        return capacity;
    }

    @Override
    public String serviceLevel() {
        return serviceLevel;
    }

    @Override
    public String startTime() {
        return startTime;
    }

    @Override
    public String endTime() {
        return endTime;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<Object> connectionRefList() {
        return connectionRefList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTapiServiceOpType() {
        return yangTapiServiceOpType;
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
    public List<ServicePortList> servicePortList() {
        return servicePortList;
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
         return Objects.hash(serviceType, serviceDirection, layerProtocolName, capacity, serviceLevel, startTime,
                    endTime, uuid, connectionRefList, valueLeafFlags, yangTapiServiceOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap, servicePortList, routingConstraints, localIdList, name,
                    label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiService) {
            DefaultTapiService other = (DefaultTapiService) obj;
            return
                Objects.equals(serviceType, other.serviceType) &&
                Objects.equals(serviceDirection, other.serviceDirection) &&
                Objects.equals(layerProtocolName, other.layerProtocolName) &&
                Objects.equals(capacity, other.capacity) &&
                Objects.equals(serviceLevel, other.serviceLevel) &&
                Objects.equals(startTime, other.startTime) &&
                Objects.equals(endTime, other.endTime) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(connectionRefList, other.connectionRefList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiServiceOpType,
                 other.yangTapiServiceOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(servicePortList, other.servicePortList) &&
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
            .add("serviceDirection", serviceDirection)
            .add("layerProtocolName", layerProtocolName)
            .add("capacity", capacity)
            .add("serviceLevel", serviceLevel)
            .add("startTime", startTime)
            .add("endTime", endTime)
            .add("uuid", uuid)
            .add("connectionRefList", connectionRefList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiServiceOpType", yangTapiServiceOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("servicePortList", servicePortList)
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
     * Creates an instance of tapiService.
     *
     * @param builderObject value of builder object of tapiService
     */
    protected DefaultTapiService(TapiServiceBuilder builderObject) {
        serviceType = builderObject.serviceType();
        serviceDirection = builderObject.serviceDirection();
        layerProtocolName = builderObject.layerProtocolName();
        capacity = builderObject.capacity();
        serviceLevel = builderObject.serviceLevel();
        startTime = builderObject.startTime();
        endTime = builderObject.endTime();
        uuid = builderObject.uuid();
        connectionRefList = builderObject.connectionRefList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiServiceOpType = builderObject.yangTapiServiceOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        servicePortList = builderObject.servicePortList();
        routingConstraints = builderObject.routingConstraints();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed TapiService maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiService processSubtreeFiltering(TapiService appInstance, boolean isSelectAllSchemaChild) {
        TapiServiceBuilder subTreeFilteringResultBuilder = new TapiServiceBuilder();
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
        return (DefaultTapiService) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TapiService appInstance, TapiServiceBuilder
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

        if (valueLeafFlags.get(LeafIdentifier.SERVICEDIRECTION.getLeafIndex())) {
             if (appInstance.serviceDirection() == null
                        || !(serviceDirection()
            .equals(appInstance.serviceDirection()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SERVICEDIRECTION)) {
                    subTreeFilteringResultBuilder.serviceDirection(serviceDirection());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serviceDirection(appInstance.serviceDirection());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SERVICEDIRECTION.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serviceDirection(appInstance.serviceDirection());
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

        if (valueLeafFlags.get(LeafIdentifier.SERVICELEVEL.getLeafIndex())) {
            if (appInstance.serviceLevel() == null || !(serviceLevel().equals(appInstance.serviceLevel()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SERVICELEVEL)) {
                    subTreeFilteringResultBuilder.serviceLevel(serviceLevel());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serviceLevel(appInstance.serviceLevel());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SERVICELEVEL.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serviceLevel(appInstance.serviceLevel());
        }

        if (valueLeafFlags.get(LeafIdentifier.STARTTIME.getLeafIndex())) {
            if (appInstance.startTime() == null || !(startTime().equals(appInstance.startTime()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.STARTTIME)) {
                    subTreeFilteringResultBuilder.startTime(startTime());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.startTime(appInstance.startTime());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.STARTTIME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.startTime(appInstance.startTime());
        }

        if (valueLeafFlags.get(LeafIdentifier.ENDTIME.getLeafIndex())) {
            if (appInstance.endTime() == null || !(endTime().equals(appInstance.endTime()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ENDTIME)) {
                    subTreeFilteringResultBuilder.endTime(endTime());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.endTime(appInstance.endTime());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ENDTIME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.endTime(appInstance.endTime());
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

    private boolean processLeafListSubTreeFiltering(TapiService appInstance, TapiServiceBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.connectionRefList() != null) {
                for (Object connectionRefList : appInstance.connectionRefList()) {
                    subTreeFilteringResultBuilder.addToConnectionRefList(connectionRefList);
                }
            } else {
                if (isSubTreeFiltered && connectionRefList() != null) {
                    subTreeFilteringResultBuilder.connectionRefList(connectionRefList);
                }
            }
        } else if (connectionRefList() != null) {
            if (!connectionRefList().isEmpty()) {
                if (appInstance.connectionRefList() == null || appInstance.connectionRefList().isEmpty()) {
                    return false;
                }
                for (Object connectionRefList : connectionRefList()) {
                    boolean flag = false;
                    for (Object connectionRefList2 : appInstance.connectionRefList()) {
                        if (connectionRefList.equals(connectionRefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToConnectionRefList(connectionRefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.connectionRefList() != null && !appInstance.connectionRefList().isEmpty()) {
                for (Object connectionRefList : appInstance.connectionRefList()) {
                        subTreeFilteringResultBuilder.addToConnectionRefList(connectionRefList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiService appInstance, TapiServiceBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.servicePortList() != null) {
                for (ServicePortList servicePortList : appInstance.servicePortList()) {
                    ServicePortList result;
                    result = ((DefaultServicePortList) DefaultServicePortList.builder()
                            .buildForFilter()).processSubtreeFiltering(servicePortList, true);
                    subTreeFilteringResultBuilder.addToServicePortList(result);
                }
            } else {
                if (isSubTreeFiltered && servicePortList() != null) {
                    subTreeFilteringResultBuilder.servicePortList(servicePortList);
                }
            }
        } else if (servicePortList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!servicePortList().isEmpty()) {
                if (appInstance.servicePortList() != null && !appInstance.servicePortList().isEmpty()) {
                for (ServicePortList servicePortList : servicePortList()) {
                    for (ServicePortList servicePortList2 : appInstance.servicePortList()) {
                            ServicePortList result = ((DefaultServicePortList) servicePortList)
                            .processSubtreeFiltering(servicePortList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToServicePortList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && servicePortList() != null) {
                    subTreeFilteringResultBuilder.servicePortList(servicePortList);
                }
            }
            } else {
                if (appInstance.servicePortList() != null && !appInstance.servicePortList().isEmpty()) {
                for (ServicePortList servicePortList : appInstance.servicePortList()) {
                        subTreeFilteringResultBuilder.addToServicePortList(servicePortList);
                    }
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
     * Creates an instance of defaultTapiService.
     */
    protected DefaultTapiService() {
    }

    /**
     * Returns the attribute tapiServiceBuilder.
     *
     * @return tapiServiceBuilder
     */
    public static TapiServiceBuilder builder() {
        return new TapiServiceBuilder();
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
     * Represents the builder implementation of tapiService.
     */
    public static class TapiServiceBuilder implements TapiService.TapiServiceBuilder {
        protected TapiServiceType serviceType;
        protected TapiConnectionDirection serviceDirection;
        protected TapiLayerProtocolName layerProtocolName;
        protected Integer capacity;
        protected String serviceLevel;
        protected String startTime;
        protected String endTime;
        protected UniversalId uuid;
        protected List<Object> connectionRefList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiServiceOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<ServicePortList> servicePortList;
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
        public TapiConnectionDirection serviceDirection() {
            return serviceDirection;
        }

        @Override
        public TapiLayerProtocolName layerProtocolName() {
            return layerProtocolName;
        }

        @Override
        public Integer capacity() {
            return capacity;
        }

        @Override
        public String serviceLevel() {
            return serviceLevel;
        }

        @Override
        public String startTime() {
            return startTime;
        }

        @Override
        public String endTime() {
            return endTime;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<Object> connectionRefList() {
            return connectionRefList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTapiServiceOpType() {
            return yangTapiServiceOpType;
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
        public List<ServicePortList> servicePortList() {
            return servicePortList;
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
        public TapiServiceBuilder serviceType(TapiServiceType serviceType) {
            valueLeafFlags.set(LeafIdentifier.SERVICETYPE.getLeafIndex());
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public TapiServiceBuilder serviceDirection(TapiConnectionDirection serviceDirection) {
            valueLeafFlags.set(LeafIdentifier.SERVICEDIRECTION.getLeafIndex());
            this.serviceDirection = serviceDirection;
            return this;
        }

        @Override
        public TapiServiceBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName) {
            valueLeafFlags.set(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex());
            this.layerProtocolName = layerProtocolName;
            return this;
        }

        @Override
        public TapiServiceBuilder capacity(Integer capacity) {
            valueLeafFlags.set(LeafIdentifier.CAPACITY.getLeafIndex());
            this.capacity = capacity;
            return this;
        }

        @Override
        public TapiServiceBuilder serviceLevel(String serviceLevel) {
            valueLeafFlags.set(LeafIdentifier.SERVICELEVEL.getLeafIndex());
            this.serviceLevel = serviceLevel;
            return this;
        }

        @Override
        public TapiServiceBuilder startTime(String startTime) {
            valueLeafFlags.set(LeafIdentifier.STARTTIME.getLeafIndex());
            this.startTime = startTime;
            return this;
        }

        @Override
        public TapiServiceBuilder endTime(String endTime) {
            valueLeafFlags.set(LeafIdentifier.ENDTIME.getLeafIndex());
            this.endTime = endTime;
            return this;
        }

        @Override
        public TapiServiceBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiServiceBuilder connectionRefList(List<Object> connectionRefList) {
            this.connectionRefList = connectionRefList;
            return this;
        }

        @Override
        public TapiServiceBuilder yangTapiServiceOpType(OnosYangOpType yangTapiServiceOpType) {
            this.yangTapiServiceOpType = yangTapiServiceOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiServiceBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiServiceBuilder servicePortList(List<ServicePortList> servicePortList) {
            this.servicePortList = servicePortList;
            return this;
        }

        @Override
        public TapiServiceBuilder routingConstraints(RoutingConstraints routingConstraints) {
            this.routingConstraints = routingConstraints;
            return this;
        }

        @Override
        public TapiServiceBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiServiceBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiServiceBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiServiceBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiServiceBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiServiceBuilder addToConnectionRefList(Object addTo) {
            if (connectionRefList == null) {
                connectionRefList = new ArrayList<>();
            }
            connectionRefList.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder addToServicePortList(ServicePortList addTo) {
            if (servicePortList == null) {
                servicePortList = new ArrayList<>();
            }
            servicePortList.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiServiceBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiServiceBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiService build() {
            return new DefaultTapiService(this);
        }

        /**
         * Builds object of tapiService.
         *
         * @return tapiService
         */
        public TapiService buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiService(this);
        }
        /**
         * Creates an instance of tapiServiceBuilder.
         */
        public TapiServiceBuilder() {
        }

    }
}
