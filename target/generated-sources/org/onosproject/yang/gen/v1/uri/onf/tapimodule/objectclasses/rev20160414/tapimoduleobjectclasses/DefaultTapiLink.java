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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultLinkPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultRiskParameterPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultTransferCapacityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultTransferCostPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultTransferIntegrityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultTransferTimingPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .DefaultValidationPac;
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
 * Represents the implementation of tapiLink.
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
public class DefaultTapiLink implements TapiLink {
    protected TapiLinkDirection linkDirection;
    protected UniversalId uuid;
    protected List<Object> nodeRefList;
    protected List<TapiLayerProtocolName> layerProtocolNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiLinkOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
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
    public OnosYangOpType yangTapiLinkOpType() {
        return yangTapiLinkOpType;
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
                    yangTapiLinkOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, linkPortList,
                    riskParameterPac, transferCostPac, transferTimingPac, transferCapacityPac, transferIntegrityPac,
                    validationPac, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiLink) {
            DefaultTapiLink other = (DefaultTapiLink) obj;
            return
                Objects.equals(linkDirection, other.linkDirection) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(nodeRefList, other.nodeRefList) &&
                Objects.equals(layerProtocolNameList, other.layerProtocolNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiLinkOpType,
                 other.yangTapiLinkOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
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
            .add("yangTapiLinkOpType", yangTapiLinkOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
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
     * Creates an instance of tapiLink.
     *
     * @param builderObject value of builder object of tapiLink
     */
    protected DefaultTapiLink(TapiLinkBuilder builderObject) {
        linkDirection = builderObject.linkDirection();
        uuid = builderObject.uuid();
        nodeRefList = builderObject.nodeRefList();
        layerProtocolNameList = builderObject.layerProtocolNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiLinkOpType = builderObject.yangTapiLinkOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
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
     * Checks if the passed TapiLink maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiLink processSubtreeFiltering(TapiLink appInstance, boolean isSelectAllSchemaChild) {
        TapiLinkBuilder subTreeFilteringResultBuilder = new TapiLinkBuilder();
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
        return (DefaultTapiLink) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(TapiLink appInstance, TapiLinkBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.LINKDIRECTION.getLeafIndex())) {
            if (appInstance.linkDirection() == null || !(linkDirection().equals(appInstance.linkDirection()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LINKDIRECTION)) {
                    subTreeFilteringResultBuilder.linkDirection(linkDirection());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.linkDirection(appInstance.linkDirection());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LINKDIRECTION.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.linkDirection(appInstance.linkDirection());
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

    private boolean processLeafListSubTreeFiltering(TapiLink appInstance, TapiLinkBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.nodeRefList() != null) {
                for (Object nodeRefList : appInstance.nodeRefList()) {
                    subTreeFilteringResultBuilder.addToNodeRefList(nodeRefList);
                }
            } else {
                if (isSubTreeFiltered && nodeRefList() != null) {
                    subTreeFilteringResultBuilder.nodeRefList(nodeRefList);
                }
            }
        } else if (nodeRefList() != null) {
            if (!nodeRefList().isEmpty()) {
                if (appInstance.nodeRefList() == null || appInstance.nodeRefList().isEmpty()) {
                    return false;
                }
                for (Object nodeRefList : nodeRefList()) {
                    boolean flag = false;
                    for (Object nodeRefList2 : appInstance.nodeRefList()) {
                        if (nodeRefList.equals(nodeRefList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToNodeRefList(nodeRefList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.nodeRefList() != null && !appInstance.nodeRefList().isEmpty()) {
                for (Object nodeRefList : appInstance.nodeRefList()) {
                        subTreeFilteringResultBuilder.addToNodeRefList(nodeRefList);
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

    private boolean processChildNodesSubTreeFiltering(TapiLink appInstance, TapiLinkBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.linkPortList() != null) {
                for (LinkPortList linkPortList : appInstance.linkPortList()) {
                    LinkPortList result;
                    result = ((DefaultLinkPortList) DefaultLinkPortList.builder()
                            .buildForFilter()).processSubtreeFiltering(linkPortList, true);
                    subTreeFilteringResultBuilder.addToLinkPortList(result);
                }
            } else {
                if (isSubTreeFiltered && linkPortList() != null) {
                    subTreeFilteringResultBuilder.linkPortList(linkPortList);
                }
            }
        } else if (linkPortList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!linkPortList().isEmpty()) {
                if (appInstance.linkPortList() != null && !appInstance.linkPortList().isEmpty()) {
                for (LinkPortList linkPortList : linkPortList()) {
                    for (LinkPortList linkPortList2 : appInstance.linkPortList()) {
                            LinkPortList result = ((DefaultLinkPortList) linkPortList)
                            .processSubtreeFiltering(linkPortList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLinkPortList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && linkPortList() != null) {
                    subTreeFilteringResultBuilder.linkPortList(linkPortList);
                }
            }
            } else {
                if (appInstance.linkPortList() != null && !appInstance.linkPortList().isEmpty()) {
                for (LinkPortList linkPortList : appInstance.linkPortList()) {
                        subTreeFilteringResultBuilder.addToLinkPortList(linkPortList);
                    }
                }
            }
        }

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
     * Creates an instance of defaultTapiLink.
     */
    protected DefaultTapiLink() {
    }

    /**
     * Returns the attribute tapiLinkBuilder.
     *
     * @return tapiLinkBuilder
     */
    public static TapiLinkBuilder builder() {
        return new TapiLinkBuilder();
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
     * Represents the builder implementation of tapiLink.
     */
    public static class TapiLinkBuilder implements TapiLink.TapiLinkBuilder {
        protected TapiLinkDirection linkDirection;
        protected UniversalId uuid;
        protected List<Object> nodeRefList;
        protected List<TapiLayerProtocolName> layerProtocolNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiLinkOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
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
        public OnosYangOpType yangTapiLinkOpType() {
            return yangTapiLinkOpType;
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
        public TapiLinkBuilder linkDirection(TapiLinkDirection linkDirection) {
            valueLeafFlags.set(LeafIdentifier.LINKDIRECTION.getLeafIndex());
            this.linkDirection = linkDirection;
            return this;
        }

        @Override
        public TapiLinkBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiLinkBuilder nodeRefList(List<Object> nodeRefList) {
            this.nodeRefList = nodeRefList;
            return this;
        }

        @Override
        public TapiLinkBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList) {
            this.layerProtocolNameList = layerProtocolNameList;
            return this;
        }

        @Override
        public TapiLinkBuilder yangTapiLinkOpType(OnosYangOpType yangTapiLinkOpType) {
            this.yangTapiLinkOpType = yangTapiLinkOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiLinkBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiLinkBuilder linkPortList(List<LinkPortList> linkPortList) {
            this.linkPortList = linkPortList;
            return this;
        }

        @Override
        public TapiLinkBuilder riskParameterPac(RiskParameterPac riskParameterPac) {
            this.riskParameterPac = riskParameterPac;
            return this;
        }

        @Override
        public TapiLinkBuilder transferCostPac(TransferCostPac transferCostPac) {
            this.transferCostPac = transferCostPac;
            return this;
        }

        @Override
        public TapiLinkBuilder transferTimingPac(TransferTimingPac transferTimingPac) {
            this.transferTimingPac = transferTimingPac;
            return this;
        }

        @Override
        public TapiLinkBuilder transferCapacityPac(TransferCapacityPac transferCapacityPac) {
            this.transferCapacityPac = transferCapacityPac;
            return this;
        }

        @Override
        public TapiLinkBuilder transferIntegrityPac(TransferIntegrityPac transferIntegrityPac) {
            this.transferIntegrityPac = transferIntegrityPac;
            return this;
        }

        @Override
        public TapiLinkBuilder validationPac(ValidationPac validationPac) {
            this.validationPac = validationPac;
            return this;
        }

        @Override
        public TapiLinkBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiLinkBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiLinkBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiLinkBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiLinkBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiLinkBuilder addToNodeRefList(Object addTo) {
            if (nodeRefList == null) {
                nodeRefList = new ArrayList<>();
            }
            nodeRefList.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo) {
            if (layerProtocolNameList == null) {
                layerProtocolNameList = new ArrayList<>();
            }
            layerProtocolNameList.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToLinkPortList(LinkPortList addTo) {
            if (linkPortList == null) {
                linkPortList = new ArrayList<>();
            }
            linkPortList.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiLinkBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiLinkBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiLink build() {
            return new DefaultTapiLink(this);
        }

        /**
         * Builds object of tapiLink.
         *
         * @return tapiLink
         */
        public TapiLink buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiLink(this);
        }
        /**
         * Creates an instance of tapiLinkBuilder.
         */
        public TapiLinkBuilder() {
        }

    }
}
