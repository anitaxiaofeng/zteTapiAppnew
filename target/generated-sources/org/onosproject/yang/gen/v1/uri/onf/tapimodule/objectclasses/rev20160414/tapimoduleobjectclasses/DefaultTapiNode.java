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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultRiskParameterPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultTransferCapacityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultTransferCostPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultTransferIntegrityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultTransferTimingPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .DefaultValidationPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .RiskParameterPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .TransferCapacityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .TransferCostPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .TransferIntegrityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .TransferTimingPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode
            .ValidationPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of tapiNode.
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
public class DefaultTapiNode implements TapiNode {
    protected Object encapTopologyRef;
    protected UniversalId uuid;
    protected List<Object> nodeEdgePointRefList;
    protected List<Object> serviceRefList;
    protected List<Object> conectionRefList;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiNodeOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
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
    public Object encapTopologyRef() {
        return encapTopologyRef;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<Object> nodeEdgePointRefList() {
        return nodeEdgePointRefList;
    }

    @Override
    public List<Object> serviceRefList() {
        return serviceRefList;
    }

    @Override
    public List<Object> conectionRefList() {
        return conectionRefList;
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
    public OnosYangOpType yangTapiNodeOpType() {
        return yangTapiNodeOpType;
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
         return Objects.hash(encapTopologyRef, uuid, nodeEdgePointRefList, serviceRefList, conectionRefList,
                    layerProtocolNameList, valueLeafFlags, yangTapiNodeOpType, isSubTreeFiltered, selectLeafFlags,
                    yangAugmentedInfoMap, riskParameterPac, transferCostPac, transferTimingPac, transferCapacityPac,
                    transferIntegrityPac, validationPac, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiNode) {
            DefaultTapiNode other = (DefaultTapiNode) obj;
            return
                Objects.equals(encapTopologyRef, other.encapTopologyRef) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(nodeEdgePointRefList, other.nodeEdgePointRefList) &&
                Objects.equals(serviceRefList, other.serviceRefList) &&
                Objects.equals(conectionRefList, other.conectionRefList) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiNodeOpType,
                 other.yangTapiNodeOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
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
            .add("encapTopologyRef", encapTopologyRef)
            .add("uuid", uuid)
            .add("nodeEdgePointRefList", nodeEdgePointRefList)
            .add("serviceRefList", serviceRefList)
            .add("conectionRefList", conectionRefList)
            .add("layerProtocolNameList", layerProtocolNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiNodeOpType", yangTapiNodeOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
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
     * Creates an instance of tapiNode.
     *
     * @param builderObject value of builder object of tapiNode
     */
    protected DefaultTapiNode(TapiNodeBuilder builderObject) {
        encapTopologyRef = builderObject.encapTopologyRef();
        uuid = builderObject.uuid();
        nodeEdgePointRefList = builderObject.nodeEdgePointRefList();
        serviceRefList = builderObject.serviceRefList();
        conectionRefList = builderObject.conectionRefList();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiNodeOpType = builderObject.yangTapiNodeOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
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
     * Checks if the passed TapiNode maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiNode processSubtreeFiltering(TapiNode appInstance, boolean isSelectAllSchemaChild) {
        TapiNodeBuilder subTreeFilteringResultBuilder = new TapiNodeBuilder();
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
        return (DefaultTapiNode) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(TapiNode appInstance, TapiNodeBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.ENCAPTOPOLOGYREF.getLeafIndex())) {
             if (appInstance.encapTopologyRef() == null
                        || !(encapTopologyRef()
            .equals(appInstance.encapTopologyRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ENCAPTOPOLOGYREF)) {
                    subTreeFilteringResultBuilder.encapTopologyRef(encapTopologyRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.encapTopologyRef(appInstance.encapTopologyRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ENCAPTOPOLOGYREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.encapTopologyRef(appInstance.encapTopologyRef());
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

    private boolean processLeafListSubTreeFiltering(TapiNode appInstance, TapiNodeBuilder
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

        if (isSelectAllSchemaChild) {
            if (appInstance.serviceRefList() != null) {
                for (Object serviceRefList : appInstance.serviceRefList()) {
                    subTreeFilteringResultBuilder.addToServiceRefList(serviceRefList);
                }
            } else {
                if (isSubTreeFiltered && serviceRefList() != null) {
                    subTreeFilteringResultBuilder.serviceRefList(serviceRefList);
                }
            }
        } else if (serviceRefList() != null) {
            if (!serviceRefList().isEmpty()) {
                if (appInstance.serviceRefList() == null || appInstance.serviceRefList().isEmpty()) {
                    return false;
                }
                for (Object serviceRefList : serviceRefList()) {
                    boolean flag = false;
                    for (Object serviceRefList2 : appInstance.serviceRefList()) {
                        if (serviceRefList.equals(serviceRefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToServiceRefList(serviceRefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.serviceRefList() != null && !appInstance.serviceRefList().isEmpty()) {
                for (Object serviceRefList : appInstance.serviceRefList()) {
                        subTreeFilteringResultBuilder.addToServiceRefList(serviceRefList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.conectionRefList() != null) {
                for (Object conectionRefList : appInstance.conectionRefList()) {
                    subTreeFilteringResultBuilder.addToConectionRefList(conectionRefList);
                }
            } else {
                if (isSubTreeFiltered && conectionRefList() != null) {
                    subTreeFilteringResultBuilder.conectionRefList(conectionRefList);
                }
            }
        } else if (conectionRefList() != null) {
            if (!conectionRefList().isEmpty()) {
                if (appInstance.conectionRefList() == null || appInstance.conectionRefList().isEmpty()) {
                    return false;
                }
                for (Object conectionRefList : conectionRefList()) {
                    boolean flag = false;
                    for (Object conectionRefList2 : appInstance.conectionRefList()) {
                        if (conectionRefList.equals(conectionRefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToConectionRefList(conectionRefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.conectionRefList() != null && !appInstance.conectionRefList().isEmpty()) {
                for (Object conectionRefList : appInstance.conectionRefList()) {
                        subTreeFilteringResultBuilder.addToConectionRefList(conectionRefList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.layerProtocolNameList() != null) {
                for (TapiLayerProtocolName layerProtocolNameList : appInstance.layerProtocolNameList()) {
                    subTreeFilteringResultBuilder.addToLayerProtocolNameList(layerProtocolNameList);
                }
            } else {
                if (isSubTreeFiltered && layerProtocolNameList() != null) {
                    subTreeFilteringResultBuilder.layerProtocolNameList(layerProtocolNameList);
                }
            }
        } else if (layerProtocolNameList() != null) {
            if (!layerProtocolNameList().isEmpty()) {
                if (appInstance.layerProtocolNameList() == null || appInstance.layerProtocolNameList().isEmpty()) {
                    return false;
                }
                for (TapiLayerProtocolName layerProtocolNameList : layerProtocolNameList()) {
                    boolean flag = false;
                    for (TapiLayerProtocolName layerProtocolNameList2 : appInstance.layerProtocolNameList()) {
                        if (layerProtocolNameList.equals(layerProtocolNameList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToLayerProtocolNameList(layerProtocolNameList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.layerProtocolNameList() != null && !appInstance.layerProtocolNameList().isEmpty()) {
                for (TapiLayerProtocolName layerProtocolNameList : appInstance.layerProtocolNameList()) {
                        subTreeFilteringResultBuilder.addToLayerProtocolNameList(layerProtocolNameList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiNode appInstance, TapiNodeBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (riskParameterPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.riskParameterPac() != null) {
                RiskParameterPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultRiskParameterPac) DefaultRiskParameterPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.riskParameterPac(), true);
                } else {
                    result = ((DefaultRiskParameterPac) riskParameterPac)
                            .processSubtreeFiltering(appInstance.riskParameterPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.riskParameterPac(result);
                }
            } else {
                if (isSubTreeFiltered && riskParameterPac() != null) {
                    subTreeFilteringResultBuilder.riskParameterPac(riskParameterPac);
                }
            }
        }

        if (transferCostPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.transferCostPac() != null) {
                TransferCostPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTransferCostPac) DefaultTransferCostPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.transferCostPac(), true);
                } else {
                    result = ((DefaultTransferCostPac) transferCostPac)
                            .processSubtreeFiltering(appInstance.transferCostPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.transferCostPac(result);
                }
            } else {
                if (isSubTreeFiltered && transferCostPac() != null) {
                    subTreeFilteringResultBuilder.transferCostPac(transferCostPac);
                }
            }
        }

        if (transferTimingPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.transferTimingPac() != null) {
                TransferTimingPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTransferTimingPac) DefaultTransferTimingPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.transferTimingPac(), true);
                } else {
                    result = ((DefaultTransferTimingPac) transferTimingPac)
                            .processSubtreeFiltering(appInstance.transferTimingPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.transferTimingPac(result);
                }
            } else {
                if (isSubTreeFiltered && transferTimingPac() != null) {
                    subTreeFilteringResultBuilder.transferTimingPac(transferTimingPac);
                }
            }
        }

        if (transferCapacityPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.transferCapacityPac() != null) {
                TransferCapacityPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTransferCapacityPac) DefaultTransferCapacityPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.transferCapacityPac(), true);
                } else {
                    result = ((DefaultTransferCapacityPac) transferCapacityPac)
                            .processSubtreeFiltering(appInstance.transferCapacityPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.transferCapacityPac(result);
                }
            } else {
                if (isSubTreeFiltered && transferCapacityPac() != null) {
                    subTreeFilteringResultBuilder.transferCapacityPac(transferCapacityPac);
                }
            }
        }

        if (transferIntegrityPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.transferIntegrityPac() != null) {
                TransferIntegrityPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTransferIntegrityPac) DefaultTransferIntegrityPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.transferIntegrityPac(), true);
                } else {
                    result = ((DefaultTransferIntegrityPac) transferIntegrityPac)
                            .processSubtreeFiltering(appInstance.transferIntegrityPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.transferIntegrityPac(result);
                }
            } else {
                if (isSubTreeFiltered && transferIntegrityPac() != null) {
                    subTreeFilteringResultBuilder.transferIntegrityPac(transferIntegrityPac);
                }
            }
        }

        if (validationPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.validationPac() != null) {
                ValidationPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultValidationPac) DefaultValidationPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.validationPac(), true);
                } else {
                    result = ((DefaultValidationPac) validationPac)
                            .processSubtreeFiltering(appInstance.validationPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.validationPac(result);
                }
            } else {
                if (isSubTreeFiltered && validationPac() != null) {
                    subTreeFilteringResultBuilder.validationPac(validationPac);
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
     * Creates an instance of defaultTapiNode.
     */
    protected DefaultTapiNode() {
    }

    /**
     * Returns the attribute tapiNodeBuilder.
     *
     * @return tapiNodeBuilder
     */
    public static TapiNodeBuilder builder() {
        return new TapiNodeBuilder();
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
     * Represents the builder implementation of tapiNode.
     */
    public static class TapiNodeBuilder implements TapiNode.TapiNodeBuilder {
        protected Object encapTopologyRef;
        protected UniversalId uuid;
        protected List<Object> nodeEdgePointRefList;
        protected List<Object> serviceRefList;
        protected List<Object> conectionRefList;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiNodeOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
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
        public Object encapTopologyRef() {
            return encapTopologyRef;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<Object> nodeEdgePointRefList() {
            return nodeEdgePointRefList;
        }

        @Override
        public List<Object> serviceRefList() {
            return serviceRefList;
        }

        @Override
        public List<Object> conectionRefList() {
            return conectionRefList;
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
        public OnosYangOpType yangTapiNodeOpType() {
            return yangTapiNodeOpType;
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
        public TapiNodeBuilder encapTopologyRef(Object encapTopologyRef) {
            valueLeafFlags.set(LeafIdentifier.ENCAPTOPOLOGYREF.getLeafIndex());
            this.encapTopologyRef = encapTopologyRef;
            return this;
        }

        @Override
        public TapiNodeBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiNodeBuilder nodeEdgePointRefList(List<Object> nodeEdgePointRefList) {
            this.nodeEdgePointRefList = nodeEdgePointRefList;
            return this;
        }

        @Override
        public TapiNodeBuilder serviceRefList(List<Object> serviceRefList) {
            this.serviceRefList = serviceRefList;
            return this;
        }

        @Override
        public TapiNodeBuilder conectionRefList(List<Object> conectionRefList) {
            this.conectionRefList = conectionRefList;
            return this;
        }

        @Override
        public TapiNodeBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public TapiNodeBuilder yangTapiNodeOpType(OnosYangOpType yangTapiNodeOpType) {
            this.yangTapiNodeOpType = yangTapiNodeOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiNodeBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiNodeBuilder riskParameterPac(RiskParameterPac riskParameterPac) {
            this.riskParameterPac = riskParameterPac;
            return this;
        }

        @Override
        public TapiNodeBuilder transferCostPac(TransferCostPac transferCostPac) {
            this.transferCostPac = transferCostPac;
            return this;
        }

        @Override
        public TapiNodeBuilder transferTimingPac(TransferTimingPac transferTimingPac) {
            this.transferTimingPac = transferTimingPac;
            return this;
        }

        @Override
        public TapiNodeBuilder transferCapacityPac(TransferCapacityPac transferCapacityPac) {
            this.transferCapacityPac = transferCapacityPac;
            return this;
        }

        @Override
        public TapiNodeBuilder transferIntegrityPac(TransferIntegrityPac transferIntegrityPac) {
            this.transferIntegrityPac = transferIntegrityPac;
            return this;
        }

        @Override
        public TapiNodeBuilder validationPac(ValidationPac validationPac) {
            this.validationPac = validationPac;
            return this;
        }

        @Override
        public TapiNodeBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiNodeBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiNodeBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiNodeBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiNodeBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiNodeBuilder addToNodeEdgePointRefList(Object addTo) {
            if (nodeEdgePointRefList == null) {
                nodeEdgePointRefList = new ArrayList<>();
            }
            nodeEdgePointRefList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToServiceRefList(Object addTo) {
            if (serviceRefList == null) {
                serviceRefList = new ArrayList<>();
            }
            serviceRefList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToConectionRefList(Object addTo) {
            if (conectionRefList == null) {
                conectionRefList = new ArrayList<>();
            }
            conectionRefList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiNodeBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiNodeBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiNode build() {
            return new DefaultTapiNode(this);
        }

        /**
         * Builds object of tapiNode.
         *
         * @return tapiNode
         */
        public TapiNode buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiNode(this);
        }
        /**
         * Creates an instance of tapiNodeBuilder.
         */
        public TapiNodeBuilder() {
        }

    }
}
