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
            .gtapinodeedgepoint.DefaultLpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapinodeedgepoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Represents the implementation of tapiNodeEdgePoint.
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
public class DefaultTapiNodeEdgePoint implements TapiNodeEdgePoint {
    protected TapiTerminationDirection terminationDirection;
    protected Object serverConnEpref;
    protected UniversalId uuid;
    protected List<Object> serviceEprefList;
    protected List<Object> clientConnEprefList;
    protected List<String> physicalPortReference;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiNodeEdgePointOpType;
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
    public OnosYangOpType yangTapiNodeEdgePointOpType() {
        return yangTapiNodeEdgePointOpType;
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
         return Objects.hash(terminationDirection, serverConnEpref, uuid, serviceEprefList, clientConnEprefList,
                    physicalPortReference, valueLeafFlags, yangTapiNodeEdgePointOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap, lpList, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiNodeEdgePoint) {
            DefaultTapiNodeEdgePoint other = (DefaultTapiNodeEdgePoint) obj;
            return
                Objects.equals(terminationDirection, other.terminationDirection) &&
                Objects.equals(serverConnEpref, other.serverConnEpref) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(serviceEprefList, other.serviceEprefList) &&
                Objects.equals(clientConnEprefList, other.clientConnEprefList) &&
                Objects.equals(physicalPortReference, other.physicalPortReference) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiNodeEdgePointOpType,
                 other.yangTapiNodeEdgePointOpType) &&
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
            .add("serverConnEpref", serverConnEpref)
            .add("uuid", uuid)
            .add("serviceEprefList", serviceEprefList)
            .add("clientConnEprefList", clientConnEprefList)
            .add("physicalPortReference", physicalPortReference)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiNodeEdgePointOpType", yangTapiNodeEdgePointOpType)
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
     * Creates an instance of tapiNodeEdgePoint.
     *
     * @param builderObject value of builder object of tapiNodeEdgePoint
     */
    protected DefaultTapiNodeEdgePoint(TapiNodeEdgePointBuilder builderObject) {
        terminationDirection = builderObject.terminationDirection();
        serverConnEpref = builderObject.serverConnEpref();
        uuid = builderObject.uuid();
        serviceEprefList = builderObject.serviceEprefList();
        clientConnEprefList = builderObject.clientConnEprefList();
        physicalPortReference = builderObject.physicalPortReference();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiNodeEdgePointOpType = builderObject.yangTapiNodeEdgePointOpType();
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
     * Checks if the passed TapiNodeEdgePoint maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiNodeEdgePoint processSubtreeFiltering(TapiNodeEdgePoint appInstance, boolean
                isSelectAllSchemaChild) {
        TapiNodeEdgePointBuilder subTreeFilteringResultBuilder = new TapiNodeEdgePointBuilder();
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
        return (DefaultTapiNodeEdgePoint) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TapiNodeEdgePoint appInstance, TapiNodeEdgePointBuilder
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

        if (valueLeafFlags.get(LeafIdentifier.SERVERCONNEPREF.getLeafIndex())) {
             if (appInstance.serverConnEpref() == null
                        || !(serverConnEpref()
            .equals(appInstance.serverConnEpref()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SERVERCONNEPREF)) {
                    subTreeFilteringResultBuilder.serverConnEpref(serverConnEpref());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serverConnEpref(appInstance.serverConnEpref());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SERVERCONNEPREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serverConnEpref(appInstance.serverConnEpref());
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

    private boolean processLeafListSubTreeFiltering(TapiNodeEdgePoint appInstance, TapiNodeEdgePointBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.serviceEprefList() != null) {
                for (Object serviceEprefList : appInstance.serviceEprefList()) {
                    subTreeFilteringResultBuilder.addToServiceEprefList(serviceEprefList);
                }
            } else {
                if (isSubTreeFiltered && serviceEprefList() != null) {
                    subTreeFilteringResultBuilder.serviceEprefList(serviceEprefList);
                }
            }
        } else if (serviceEprefList() != null) {
            if (!serviceEprefList().isEmpty()) {
                if (appInstance.serviceEprefList() == null || appInstance.serviceEprefList().isEmpty()) {
                    return false;
                }
                for (Object serviceEprefList : serviceEprefList()) {
                    boolean flag = false;
                    for (Object serviceEprefList2 : appInstance.serviceEprefList()) {
                        if (serviceEprefList.equals(serviceEprefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToServiceEprefList(serviceEprefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.serviceEprefList() != null && !appInstance.serviceEprefList().isEmpty()) {
                for (Object serviceEprefList : appInstance.serviceEprefList()) {
                        subTreeFilteringResultBuilder.addToServiceEprefList(serviceEprefList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.clientConnEprefList() != null) {
                for (Object clientConnEprefList : appInstance.clientConnEprefList()) {
                    subTreeFilteringResultBuilder.addToClientConnEprefList(clientConnEprefList);
                }
            } else {
                if (isSubTreeFiltered && clientConnEprefList() != null) {
                    subTreeFilteringResultBuilder.clientConnEprefList(clientConnEprefList);
                }
            }
        } else if (clientConnEprefList() != null) {
            if (!clientConnEprefList().isEmpty()) {
                if (appInstance.clientConnEprefList() == null || appInstance.clientConnEprefList().isEmpty()) {
                    return false;
                }
                for (Object clientConnEprefList : clientConnEprefList()) {
                    boolean flag = false;
                    for (Object clientConnEprefList2 : appInstance.clientConnEprefList()) {
                        if (clientConnEprefList.equals(clientConnEprefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToClientConnEprefList(clientConnEprefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.clientConnEprefList() != null && !appInstance.clientConnEprefList().isEmpty()) {
                for (Object clientConnEprefList : appInstance.clientConnEprefList()) {
                        subTreeFilteringResultBuilder.addToClientConnEprefList(clientConnEprefList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.physicalPortReference() != null) {
                for (String physicalPortReference : appInstance.physicalPortReference()) {
                    subTreeFilteringResultBuilder.addToPhysicalPortReference(physicalPortReference);
                }
            } else {
                if (isSubTreeFiltered && physicalPortReference() != null) {
                    subTreeFilteringResultBuilder.physicalPortReference(physicalPortReference);
                }
            }
        } else if (physicalPortReference() != null) {
            if (!physicalPortReference().isEmpty()) {
                if (appInstance.physicalPortReference() == null || appInstance.physicalPortReference().isEmpty()) {
                    return false;
                }
                for (String physicalPortReference : physicalPortReference()) {
                    boolean flag = false;
                    for (String physicalPortReference2 : appInstance.physicalPortReference()) {
                        if (physicalPortReference.equals(physicalPortReference2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToPhysicalPortReference(physicalPortReference2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.physicalPortReference() != null && !appInstance.physicalPortReference().isEmpty()) {
                for (String physicalPortReference : appInstance.physicalPortReference()) {
                        subTreeFilteringResultBuilder.addToPhysicalPortReference(physicalPortReference);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiNodeEdgePoint appInstance, TapiNodeEdgePointBuilder
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
     * Creates an instance of defaultTapiNodeEdgePoint.
     */
    protected DefaultTapiNodeEdgePoint() {
    }

    /**
     * Returns the attribute tapiNodeEdgePointBuilder.
     *
     * @return tapiNodeEdgePointBuilder
     */
    public static TapiNodeEdgePointBuilder builder() {
        return new TapiNodeEdgePointBuilder();
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
     * Represents the builder implementation of tapiNodeEdgePoint.
     */
    public static class TapiNodeEdgePointBuilder implements TapiNodeEdgePoint.TapiNodeEdgePointBuilder {
        protected TapiTerminationDirection terminationDirection;
        protected Object serverConnEpref;
        protected UniversalId uuid;
        protected List<Object> serviceEprefList;
        protected List<Object> clientConnEprefList;
        protected List<String> physicalPortReference;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiNodeEdgePointOpType;
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
        public OnosYangOpType yangTapiNodeEdgePointOpType() {
            return yangTapiNodeEdgePointOpType;
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
        public TapiNodeEdgePointBuilder terminationDirection(TapiTerminationDirection terminationDirection) {
            valueLeafFlags.set(LeafIdentifier.TERMINATIONDIRECTION.getLeafIndex());
            this.terminationDirection = terminationDirection;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder serverConnEpref(Object serverConnEpref) {
            valueLeafFlags.set(LeafIdentifier.SERVERCONNEPREF.getLeafIndex());
            this.serverConnEpref = serverConnEpref;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder serviceEprefList(List<Object> serviceEprefList) {
            this.serviceEprefList = serviceEprefList;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder clientConnEprefList(List<Object> clientConnEprefList) {
            this.clientConnEprefList = clientConnEprefList;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder physicalPortReference(List<String> physicalPortReference) {
            this.physicalPortReference = physicalPortReference;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder yangTapiNodeEdgePointOpType(OnosYangOpType yangTapiNodeEdgePointOpType) {
            this.yangTapiNodeEdgePointOpType = yangTapiNodeEdgePointOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiNodeEdgePointBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder lpList(List<LpList> lpList) {
            this.lpList = lpList;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder addToServiceEprefList(Object addTo) {
            if (serviceEprefList == null) {
                serviceEprefList = new ArrayList<>();
            }
            serviceEprefList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToClientConnEprefList(Object addTo) {
            if (clientConnEprefList == null) {
                clientConnEprefList = new ArrayList<>();
            }
            clientConnEprefList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToPhysicalPortReference(String addTo) {
            if (physicalPortReference == null) {
                physicalPortReference = new ArrayList<>();
            }
            physicalPortReference.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToLpList(LpList addTo) {
            if (lpList == null) {
                lpList = new ArrayList<>();
            }
            lpList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiNodeEdgePointBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiNodeEdgePointBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiNodeEdgePoint build() {
            return new DefaultTapiNodeEdgePoint(this);
        }

        /**
         * Builds object of tapiNodeEdgePoint.
         *
         * @return tapiNodeEdgePoint
         */
        public TapiNodeEdgePoint buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiNodeEdgePoint(this);
        }
        /**
         * Creates an instance of tapiNodeEdgePointBuilder.
         */
        public TapiNodeEdgePointBuilder() {
        }

    }
}
