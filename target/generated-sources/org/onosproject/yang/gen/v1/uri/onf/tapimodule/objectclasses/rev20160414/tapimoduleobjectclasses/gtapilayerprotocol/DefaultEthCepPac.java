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
            .gtapilayerprotocol;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.BroadcastFilteringTraffic;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.DefaultBroadcastFilteringTraffic;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.DefaultTrafficConditioning;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.DefaultVlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.TrafficConditioning;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethconneppac.VlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAccessAction;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiBroadcastFilteringMode;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiBroadcastType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiVlanType;

/**
 * Represents the implementation of ethCepPac.
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
public class DefaultEthCepPac implements EthCepPac {
    protected TapiVlanType vlanType;
    protected TapiAccessAction accessAction;
    protected boolean isMacAdressLearningEnabled;
    protected Integer macAdressLearningRange;
    protected Integer macAdressAgeingTime;
    protected TapiBroadcastFilteringMode broadcastFilteringMode;
    protected List<TapiBroadcastType> broadcastFilteringTypeList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangEthCepPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<VlanList> vlanList;
    protected TrafficConditioning trafficConditioning;
    protected BroadcastFilteringTraffic broadcastFilteringTraffic;

    @Override
    public TapiVlanType vlanType() {
        return vlanType;
    }

    @Override
    public TapiAccessAction accessAction() {
        return accessAction;
    }

    @Override
    public boolean isMacAdressLearningEnabled() {
        return isMacAdressLearningEnabled;
    }

    @Override
    public Integer macAdressLearningRange() {
        return macAdressLearningRange;
    }

    @Override
    public Integer macAdressAgeingTime() {
        return macAdressAgeingTime;
    }

    @Override
    public TapiBroadcastFilteringMode broadcastFilteringMode() {
        return broadcastFilteringMode;
    }

    @Override
    public List<TapiBroadcastType> broadcastFilteringTypeList() {
        return broadcastFilteringTypeList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangEthCepPacOpType() {
        return yangEthCepPacOpType;
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
    public List<VlanList> vlanList() {
        return vlanList;
    }

    @Override
    public TrafficConditioning trafficConditioning() {
        return trafficConditioning;
    }

    @Override
    public BroadcastFilteringTraffic broadcastFilteringTraffic() {
        return broadcastFilteringTraffic;
    }

    @Override
    public int hashCode() {
         return Objects.hash(vlanType, accessAction, isMacAdressLearningEnabled, macAdressLearningRange,
                    macAdressAgeingTime, broadcastFilteringMode, broadcastFilteringTypeList, valueLeafFlags,
                    yangEthCepPacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, vlanList,
                    trafficConditioning, broadcastFilteringTraffic);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultEthCepPac) {
            DefaultEthCepPac other = (DefaultEthCepPac) obj;
            return
                Objects.equals(vlanType, other.vlanType) &&
                Objects.equals(accessAction, other.accessAction) &&
                Objects.equals(isMacAdressLearningEnabled, other.isMacAdressLearningEnabled) &&
                Objects.equals(macAdressLearningRange, other.macAdressLearningRange) &&
                Objects.equals(macAdressAgeingTime, other.macAdressAgeingTime) &&
                Objects.equals(broadcastFilteringMode, other.broadcastFilteringMode) &&
                Objects.equals(broadcastFilteringTypeList, other.broadcastFilteringTypeList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangEthCepPacOpType,
                 other.yangEthCepPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(vlanList, other.vlanList) &&
                Objects.equals(trafficConditioning, other.trafficConditioning) &&
                Objects.equals(broadcastFilteringTraffic, other.broadcastFilteringTraffic);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("vlanType", vlanType)
            .add("accessAction", accessAction)
            .add("isMacAdressLearningEnabled", isMacAdressLearningEnabled)
            .add("macAdressLearningRange", macAdressLearningRange)
            .add("macAdressAgeingTime", macAdressAgeingTime)
            .add("broadcastFilteringMode", broadcastFilteringMode)
            .add("broadcastFilteringTypeList", broadcastFilteringTypeList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangEthCepPacOpType", yangEthCepPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("vlanList", vlanList)
            .add("trafficConditioning", trafficConditioning)
            .add("broadcastFilteringTraffic", broadcastFilteringTraffic)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of ethCepPac.
     *
     * @param builderObject value of builder object of ethCepPac
     */
    protected DefaultEthCepPac(EthCepPacBuilder builderObject) {
        vlanType = builderObject.vlanType();
        accessAction = builderObject.accessAction();
        isMacAdressLearningEnabled = builderObject.isMacAdressLearningEnabled();
        macAdressLearningRange = builderObject.macAdressLearningRange();
        macAdressAgeingTime = builderObject.macAdressAgeingTime();
        broadcastFilteringMode = builderObject.broadcastFilteringMode();
        broadcastFilteringTypeList = builderObject.broadcastFilteringTypeList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangEthCepPacOpType = builderObject.yangEthCepPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        vlanList = builderObject.vlanList();
        trafficConditioning = builderObject.trafficConditioning();
        broadcastFilteringTraffic = builderObject.broadcastFilteringTraffic();
    }

    /**
     * Checks if the passed EthCepPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultEthCepPac processSubtreeFiltering(EthCepPac appInstance, boolean isSelectAllSchemaChild) {
        EthCepPacBuilder subTreeFilteringResultBuilder = new EthCepPacBuilder();
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
        return (DefaultEthCepPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(EthCepPac appInstance, EthCepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.VLANTYPE.getLeafIndex())) {
            if (appInstance.vlanType() == null || !(vlanType().equals(appInstance.vlanType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VLANTYPE)) {
                    subTreeFilteringResultBuilder.vlanType(vlanType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.vlanType(appInstance.vlanType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.VLANTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.vlanType(appInstance.vlanType());
        }

        if (valueLeafFlags.get(LeafIdentifier.ACCESSACTION.getLeafIndex())) {
            if (appInstance.accessAction() == null || !(accessAction().equals(appInstance.accessAction()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ACCESSACTION)) {
                    subTreeFilteringResultBuilder.accessAction(accessAction());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.accessAction(appInstance.accessAction());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ACCESSACTION.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.accessAction(appInstance.accessAction());
        }

        if (valueLeafFlags.get(LeafIdentifier.ISMACADRESSLEARNINGENABLED.getLeafIndex())) {
            if (appInstance.isMacAdressLearningEnabled() != isMacAdressLearningEnabled()) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ISMACADRESSLEARNINGENABLED)) {
                    subTreeFilteringResultBuilder.isMacAdressLearningEnabled(isMacAdressLearningEnabled());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.isMacAdressLearningEnabled(appInstance.isMacAdressLearningEnabled());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .ISMACADRESSLEARNINGENABLED.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.isMacAdressLearningEnabled(appInstance.isMacAdressLearningEnabled());
        }

        if (valueLeafFlags.get(LeafIdentifier.MACADRESSLEARNINGRANGE.getLeafIndex())) {
             if (appInstance.macAdressLearningRange() == null
                        || !(macAdressLearningRange()
            .equals(appInstance.macAdressLearningRange()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.MACADRESSLEARNINGRANGE)) {
                    subTreeFilteringResultBuilder.macAdressLearningRange(macAdressLearningRange());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.macAdressLearningRange(appInstance.macAdressLearningRange());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.MACADRESSLEARNINGRANGE
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.macAdressLearningRange(appInstance.macAdressLearningRange());
        }

        if (valueLeafFlags.get(LeafIdentifier.MACADRESSAGEINGTIME.getLeafIndex())) {
             if (appInstance.macAdressAgeingTime() == null
                        || !(macAdressAgeingTime()
            .equals(appInstance.macAdressAgeingTime()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.MACADRESSAGEINGTIME)) {
                    subTreeFilteringResultBuilder.macAdressAgeingTime(macAdressAgeingTime());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.macAdressAgeingTime(appInstance.macAdressAgeingTime());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.MACADRESSAGEINGTIME
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.macAdressAgeingTime(appInstance.macAdressAgeingTime());
        }

        if (valueLeafFlags.get(LeafIdentifier.BROADCASTFILTERINGMODE.getLeafIndex())) {
             if (appInstance.broadcastFilteringMode() == null
                        || !(broadcastFilteringMode()
            .equals(appInstance.broadcastFilteringMode()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.BROADCASTFILTERINGMODE)) {
                    subTreeFilteringResultBuilder.broadcastFilteringMode(broadcastFilteringMode());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.broadcastFilteringMode(appInstance.broadcastFilteringMode());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.BROADCASTFILTERINGMODE
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.broadcastFilteringMode(appInstance.broadcastFilteringMode());
        }

        return true;
    }

    private boolean processLeafListSubTreeFiltering(EthCepPac appInstance, EthCepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.broadcastFilteringTypeList() != null) {
                for (TapiBroadcastType broadcastFilteringTypeList : appInstance.broadcastFilteringTypeList()) {
                    subTreeFilteringResultBuilder.addToBroadcastFilteringTypeList(broadcastFilteringTypeList);
                }
            } else {
                if (isSubTreeFiltered && broadcastFilteringTypeList() != null) {
                    subTreeFilteringResultBuilder.broadcastFilteringTypeList(broadcastFilteringTypeList);
                }
            }
        } else if (broadcastFilteringTypeList() != null) {
            if (!broadcastFilteringTypeList().isEmpty()) {
                if (appInstance.broadcastFilteringTypeList() == null ||
                            appInstance.broadcastFilteringTypeList().isEmpty()) {
                    return false;
                }
                for (TapiBroadcastType broadcastFilteringTypeList : broadcastFilteringTypeList()) {
                    boolean flag = false;
                    for (TapiBroadcastType broadcastFilteringTypeList2 : appInstance.broadcastFilteringTypeList()) {
                        if (broadcastFilteringTypeList.equals(broadcastFilteringTypeList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder
            .addToBroadcastFilteringTypeList(broadcastFilteringTypeList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.broadcastFilteringTypeList() != null &&
                            !appInstance.broadcastFilteringTypeList().isEmpty()) {
                for (TapiBroadcastType broadcastFilteringTypeList : appInstance.broadcastFilteringTypeList()) {
                        subTreeFilteringResultBuilder.addToBroadcastFilteringTypeList(broadcastFilteringTypeList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(EthCepPac appInstance, EthCepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.vlanList() != null) {
                for (VlanList vlanList : appInstance.vlanList()) {
                    VlanList result;
                    result = ((DefaultVlanList) DefaultVlanList.builder()
                            .buildForFilter()).processSubtreeFiltering(vlanList, true);
                    subTreeFilteringResultBuilder.addToVlanList(result);
                }
            } else {
                if (isSubTreeFiltered && vlanList() != null) {
                    subTreeFilteringResultBuilder.vlanList(vlanList);
                }
            }
        } else if (vlanList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!vlanList().isEmpty()) {
                if (appInstance.vlanList() != null && !appInstance.vlanList().isEmpty()) {
                for (VlanList vlanList : vlanList()) {
                    for (VlanList vlanList2 : appInstance.vlanList()) {
                            VlanList result = ((DefaultVlanList) vlanList)
                            .processSubtreeFiltering(vlanList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToVlanList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && vlanList() != null) {
                    subTreeFilteringResultBuilder.vlanList(vlanList);
                }
            }
            } else {
                if (appInstance.vlanList() != null && !appInstance.vlanList().isEmpty()) {
                for (VlanList vlanList : appInstance.vlanList()) {
                        subTreeFilteringResultBuilder.addToVlanList(vlanList);
                    }
                }
            }
        }

        if (trafficConditioning() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.trafficConditioning() != null) {
                TrafficConditioning result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTrafficConditioning) DefaultTrafficConditioning.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.trafficConditioning(), true);
                } else {
                    result = ((DefaultTrafficConditioning) trafficConditioning)
                            .processSubtreeFiltering(appInstance.trafficConditioning(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.trafficConditioning(result);
                }
            } else {
                if (isSubTreeFiltered && trafficConditioning() != null) {
                    subTreeFilteringResultBuilder.trafficConditioning(trafficConditioning);
                }
            }
        }

        if (broadcastFilteringTraffic() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.broadcastFilteringTraffic() != null) {
                BroadcastFilteringTraffic result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultBroadcastFilteringTraffic) DefaultBroadcastFilteringTraffic.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance
            .broadcastFilteringTraffic(), true);
                } else {
                    result = ((DefaultBroadcastFilteringTraffic) broadcastFilteringTraffic)
                            .processSubtreeFiltering(appInstance.broadcastFilteringTraffic(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.broadcastFilteringTraffic(result);
                }
            } else {
                if (isSubTreeFiltered && broadcastFilteringTraffic() != null) {
                    subTreeFilteringResultBuilder.broadcastFilteringTraffic(broadcastFilteringTraffic);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultEthCepPac.
     */
    protected DefaultEthCepPac() {
    }

    /**
     * Returns the attribute ethCepPacBuilder.
     *
     * @return ethCepPacBuilder
     */
    public static EthCepPacBuilder builder() {
        return new EthCepPacBuilder();
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
     * Represents the builder implementation of ethCepPac.
     */
    public static class EthCepPacBuilder implements EthCepPac.EthCepPacBuilder {
        protected TapiVlanType vlanType;
        protected TapiAccessAction accessAction;
        protected boolean isMacAdressLearningEnabled;
        protected Integer macAdressLearningRange;
        protected Integer macAdressAgeingTime;
        protected TapiBroadcastFilteringMode broadcastFilteringMode;
        protected List<TapiBroadcastType> broadcastFilteringTypeList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangEthCepPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<VlanList> vlanList;
        protected TrafficConditioning trafficConditioning;
        protected BroadcastFilteringTraffic broadcastFilteringTraffic;



        @Override
        public TapiVlanType vlanType() {
            return vlanType;
        }

        @Override
        public TapiAccessAction accessAction() {
            return accessAction;
        }

        @Override
        public boolean isMacAdressLearningEnabled() {
            return isMacAdressLearningEnabled;
        }

        @Override
        public Integer macAdressLearningRange() {
            return macAdressLearningRange;
        }

        @Override
        public Integer macAdressAgeingTime() {
            return macAdressAgeingTime;
        }

        @Override
        public TapiBroadcastFilteringMode broadcastFilteringMode() {
            return broadcastFilteringMode;
        }

        @Override
        public List<TapiBroadcastType> broadcastFilteringTypeList() {
            return broadcastFilteringTypeList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangEthCepPacOpType() {
            return yangEthCepPacOpType;
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
        public List<VlanList> vlanList() {
            return vlanList;
        }

        @Override
        public TrafficConditioning trafficConditioning() {
            return trafficConditioning;
        }

        @Override
        public BroadcastFilteringTraffic broadcastFilteringTraffic() {
            return broadcastFilteringTraffic;
        }

        @Override
        public EthCepPacBuilder vlanType(TapiVlanType vlanType) {
            valueLeafFlags.set(LeafIdentifier.VLANTYPE.getLeafIndex());
            this.vlanType = vlanType;
            return this;
        }

        @Override
        public EthCepPacBuilder accessAction(TapiAccessAction accessAction) {
            valueLeafFlags.set(LeafIdentifier.ACCESSACTION.getLeafIndex());
            this.accessAction = accessAction;
            return this;
        }

        @Override
        public EthCepPacBuilder isMacAdressLearningEnabled(boolean isMacAdressLearningEnabled) {
            valueLeafFlags.set(LeafIdentifier.ISMACADRESSLEARNINGENABLED.getLeafIndex());
            this.isMacAdressLearningEnabled = isMacAdressLearningEnabled;
            return this;
        }

        @Override
        public EthCepPacBuilder macAdressLearningRange(Integer macAdressLearningRange) {
            valueLeafFlags.set(LeafIdentifier.MACADRESSLEARNINGRANGE.getLeafIndex());
            this.macAdressLearningRange = macAdressLearningRange;
            return this;
        }

        @Override
        public EthCepPacBuilder macAdressAgeingTime(Integer macAdressAgeingTime) {
            valueLeafFlags.set(LeafIdentifier.MACADRESSAGEINGTIME.getLeafIndex());
            this.macAdressAgeingTime = macAdressAgeingTime;
            return this;
        }

        @Override
        public EthCepPacBuilder broadcastFilteringMode(TapiBroadcastFilteringMode broadcastFilteringMode) {
            valueLeafFlags.set(LeafIdentifier.BROADCASTFILTERINGMODE.getLeafIndex());
            this.broadcastFilteringMode = broadcastFilteringMode;
            return this;
        }

        @Override
        public EthCepPacBuilder broadcastFilteringTypeList(List<TapiBroadcastType> broadcastFilteringTypeList) {
            this.broadcastFilteringTypeList = broadcastFilteringTypeList;
            return this;
        }

        @Override
        public EthCepPacBuilder yangEthCepPacOpType(OnosYangOpType yangEthCepPacOpType) {
            this.yangEthCepPacOpType = yangEthCepPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public EthCepPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public EthCepPacBuilder vlanList(List<VlanList> vlanList) {
            this.vlanList = vlanList;
            return this;
        }

        @Override
        public EthCepPacBuilder trafficConditioning(TrafficConditioning trafficConditioning) {
            this.trafficConditioning = trafficConditioning;
            return this;
        }

        @Override
        public EthCepPacBuilder broadcastFilteringTraffic(BroadcastFilteringTraffic broadcastFilteringTraffic) {
            this.broadcastFilteringTraffic = broadcastFilteringTraffic;
            return this;
        }

        @Override
        public EthCepPacBuilder addToBroadcastFilteringTypeList(TapiBroadcastType addTo) {
            if (broadcastFilteringTypeList == null) {
                broadcastFilteringTypeList = new ArrayList<>();
            }
            broadcastFilteringTypeList.add(addTo);
            return this;
        }


        @Override
        public EthCepPacBuilder addToVlanList(VlanList addTo) {
            if (vlanList == null) {
                vlanList = new ArrayList<>();
            }
            vlanList.add(addTo);
            return this;
        }


        @Override
        public EthCepPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public EthCepPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public EthCepPac build() {
            return new DefaultEthCepPac(this);
        }

        /**
         * Builds object of ethCepPac.
         *
         * @return ethCepPac
         */
        public EthCepPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultEthCepPac(this);
        }
        /**
         * Creates an instance of ethCepPacBuilder.
         */
        public EthCepPacBuilder() {
        }

    }
}
