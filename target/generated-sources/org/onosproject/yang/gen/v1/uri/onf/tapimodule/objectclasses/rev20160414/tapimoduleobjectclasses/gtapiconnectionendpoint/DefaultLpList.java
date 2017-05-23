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
            .gtapiconnectionendpoint;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.DefaultEthCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.DefaultEthNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.DefaultOduCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.DefaultOduNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.EthCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.EthNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.OduCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.OduNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of lpList.
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
public class DefaultLpList implements LpList {
    protected TapiLayerProtocolName layerProtocolName;
    protected String configuredClientCapacity;
    protected String localId;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangLpListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected OduNepPac oduNepPac;
    protected OduCepPac oduCepPac;
    protected EthNepPac ethNepPac;
    protected EthCepPac ethCepPac;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiLayerProtocolName layerProtocolName() {
        return layerProtocolName;
    }

    @Override
    public String configuredClientCapacity() {
        return configuredClientCapacity;
    }

    @Override
    public String localId() {
        return localId;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangLpListOpType() {
        return yangLpListOpType;
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
    public OduNepPac oduNepPac() {
        return oduNepPac;
    }

    @Override
    public OduCepPac oduCepPac() {
        return oduCepPac;
    }

    @Override
    public EthNepPac ethNepPac() {
        return ethNepPac;
    }

    @Override
    public EthCepPac ethCepPac() {
        return ethCepPac;
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
         return Objects.hash(layerProtocolName, configuredClientCapacity, localId, valueLeafFlags, yangLpListOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, oduNepPac, oduCepPac, ethNepPac,
                    ethCepPac, localIdList, name, label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultLpList) {
            DefaultLpList other = (DefaultLpList) obj;
            return
                Objects.equals(layerProtocolName, other.layerProtocolName) &&
                Objects.equals(configuredClientCapacity, other.configuredClientCapacity) &&
                Objects.equals(localId, other.localId) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangLpListOpType,
                 other.yangLpListOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(oduNepPac, other.oduNepPac) &&
                Objects.equals(oduCepPac, other.oduCepPac) &&
                Objects.equals(ethNepPac, other.ethNepPac) &&
                Objects.equals(ethCepPac, other.ethCepPac) &&
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
            .add("layerProtocolName", layerProtocolName)
            .add("configuredClientCapacity", configuredClientCapacity)
            .add("localId", localId)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangLpListOpType", yangLpListOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("oduNepPac", oduNepPac)
            .add("oduCepPac", oduCepPac)
            .add("ethNepPac", ethNepPac)
            .add("ethCepPac", ethCepPac)
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
     * Creates an instance of lpList.
     *
     * @param builderObject value of builder object of lpList
     */
    protected DefaultLpList(LpListBuilder builderObject) {
        layerProtocolName = builderObject.layerProtocolName();
        configuredClientCapacity = builderObject.configuredClientCapacity();
        localId = builderObject.localId();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangLpListOpType = builderObject.yangLpListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        oduNepPac = builderObject.oduNepPac();
        oduCepPac = builderObject.oduCepPac();
        ethNepPac = builderObject.ethNepPac();
        ethCepPac = builderObject.ethCepPac();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed LpList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultLpList processSubtreeFiltering(LpList appInstance, boolean isSelectAllSchemaChild) {
        LpListBuilder subTreeFilteringResultBuilder = new LpListBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder, isAnySelectOrContainmentNode,
                    isSelectAllSchemaChild)) {
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
        return (DefaultLpList) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(LpList appInstance, LpListBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
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

        if (valueLeafFlags.get(LeafIdentifier.CONFIGUREDCLIENTCAPACITY.getLeafIndex())) {
            if (appInstance.configuredClientCapacity() == null
                        ||
                        !(configuredClientCapacity()
            .equals(appInstance.configuredClientCapacity()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CONFIGUREDCLIENTCAPACITY)) {
                    subTreeFilteringResultBuilder.configuredClientCapacity(configuredClientCapacity());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.configuredClientCapacity(appInstance.configuredClientCapacity());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .CONFIGUREDCLIENTCAPACITY.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.configuredClientCapacity(appInstance.configuredClientCapacity());
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

    private boolean processChildNodesSubTreeFiltering(LpList appInstance, LpListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (oduNepPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.oduNepPac() != null) {
                OduNepPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultOduNepPac) DefaultOduNepPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.oduNepPac(), true);
                } else {
                    result = ((DefaultOduNepPac) oduNepPac)
                            .processSubtreeFiltering(appInstance.oduNepPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.oduNepPac(result);
                }
            } else {
                if (isSubTreeFiltered && oduNepPac() != null) {
                    subTreeFilteringResultBuilder.oduNepPac(oduNepPac);
                }
            }
        }

        if (oduCepPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.oduCepPac() != null) {
                OduCepPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultOduCepPac) DefaultOduCepPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.oduCepPac(), true);
                } else {
                    result = ((DefaultOduCepPac) oduCepPac)
                            .processSubtreeFiltering(appInstance.oduCepPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.oduCepPac(result);
                }
            } else {
                if (isSubTreeFiltered && oduCepPac() != null) {
                    subTreeFilteringResultBuilder.oduCepPac(oduCepPac);
                }
            }
        }

        if (ethNepPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.ethNepPac() != null) {
                EthNepPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultEthNepPac) DefaultEthNepPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.ethNepPac(), true);
                } else {
                    result = ((DefaultEthNepPac) ethNepPac)
                            .processSubtreeFiltering(appInstance.ethNepPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.ethNepPac(result);
                }
            } else {
                if (isSubTreeFiltered && ethNepPac() != null) {
                    subTreeFilteringResultBuilder.ethNepPac(ethNepPac);
                }
            }
        }

        if (ethCepPac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.ethCepPac() != null) {
                EthCepPac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultEthCepPac) DefaultEthCepPac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.ethCepPac(), true);
                } else {
                    result = ((DefaultEthCepPac) ethCepPac)
                            .processSubtreeFiltering(appInstance.ethCepPac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.ethCepPac(result);
                }
            } else {
                if (isSubTreeFiltered && ethCepPac() != null) {
                    subTreeFilteringResultBuilder.ethCepPac(ethCepPac);
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
     * Creates an instance of defaultLpList.
     */
    protected DefaultLpList() {
    }

    /**
     * Returns the attribute lpListBuilder.
     *
     * @return lpListBuilder
     */
    public static LpListBuilder builder() {
        return new LpListBuilder();
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
     * Represents the builder implementation of lpList.
     */
    public static class LpListBuilder implements LpList.LpListBuilder {
        protected TapiLayerProtocolName layerProtocolName;
        protected String configuredClientCapacity;
        protected String localId;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangLpListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected OduNepPac oduNepPac;
        protected OduCepPac oduCepPac;
        protected EthNepPac ethNepPac;
        protected EthCepPac ethCepPac;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;



        @Override
        public TapiLayerProtocolName layerProtocolName() {
            return layerProtocolName;
        }

        @Override
        public String configuredClientCapacity() {
            return configuredClientCapacity;
        }

        @Override
        public String localId() {
            return localId;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangLpListOpType() {
            return yangLpListOpType;
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
        public OduNepPac oduNepPac() {
            return oduNepPac;
        }

        @Override
        public OduCepPac oduCepPac() {
            return oduCepPac;
        }

        @Override
        public EthNepPac ethNepPac() {
            return ethNepPac;
        }

        @Override
        public EthCepPac ethCepPac() {
            return ethCepPac;
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
        public LpListBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName) {
            valueLeafFlags.set(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex());
            this.layerProtocolName = layerProtocolName;
            return this;
        }

        @Override
        public LpListBuilder configuredClientCapacity(String configuredClientCapacity) {
            valueLeafFlags.set(LeafIdentifier.CONFIGUREDCLIENTCAPACITY.getLeafIndex());
            this.configuredClientCapacity = configuredClientCapacity;
            return this;
        }

        @Override
        public LpListBuilder localId(String localId) {
            valueLeafFlags.set(LeafIdentifier.LOCALID.getLeafIndex());
            this.localId = localId;
            return this;
        }

        @Override
        public LpListBuilder yangLpListOpType(OnosYangOpType yangLpListOpType) {
            this.yangLpListOpType = yangLpListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public LpListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public LpListBuilder oduNepPac(OduNepPac oduNepPac) {
            this.oduNepPac = oduNepPac;
            return this;
        }

        @Override
        public LpListBuilder oduCepPac(OduCepPac oduCepPac) {
            this.oduCepPac = oduCepPac;
            return this;
        }

        @Override
        public LpListBuilder ethNepPac(EthNepPac ethNepPac) {
            this.ethNepPac = ethNepPac;
            return this;
        }

        @Override
        public LpListBuilder ethCepPac(EthCepPac ethCepPac) {
            this.ethCepPac = ethCepPac;
            return this;
        }

        @Override
        public LpListBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public LpListBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public LpListBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public LpListBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public LpListBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public LpListBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public LpListBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public LpListBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public LpListBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public LpListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public LpListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public LpList build() {
            return new DefaultLpList(this);
        }

        /**
         * Builds object of lpList.
         *
         * @return lpList
         */
        public LpList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultLpList(this);
        }
        /**
         * Creates an instance of lpListBuilder.
         */
        public LpListBuilder() {
        }

    }
}
