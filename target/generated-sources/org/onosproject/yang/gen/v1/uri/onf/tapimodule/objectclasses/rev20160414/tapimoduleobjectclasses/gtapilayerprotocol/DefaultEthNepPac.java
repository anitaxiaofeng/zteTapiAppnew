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
            .gtapiethnodeeppac.DefaultVlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiethnodeeppac.VlanList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSwitchCapability;

/**
 * Represents the implementation of ethNepPac.
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
public class DefaultEthNepPac implements EthNepPac {
    protected Integer totalPotentialEthcapacity;
    protected Integer availableEthcapacity;
    protected List<TapiSwitchCapability> switchCapabilityList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangEthNepPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<VlanList> vlanList;

    @Override
    public Integer totalPotentialEthcapacity() {
        return totalPotentialEthcapacity;
    }

    @Override
    public Integer availableEthcapacity() {
        return availableEthcapacity;
    }

    @Override
    public List<TapiSwitchCapability> switchCapabilityList() {
        return switchCapabilityList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangEthNepPacOpType() {
        return yangEthNepPacOpType;
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
    public int hashCode() {
         return Objects.hash(totalPotentialEthcapacity, availableEthcapacity, switchCapabilityList, valueLeafFlags,
                    yangEthNepPacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, vlanList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultEthNepPac) {
            DefaultEthNepPac other = (DefaultEthNepPac) obj;
            return
                Objects.equals(totalPotentialEthcapacity, other.totalPotentialEthcapacity) &&
                Objects.equals(availableEthcapacity, other.availableEthcapacity) &&
                Objects.equals(switchCapabilityList, other.switchCapabilityList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangEthNepPacOpType,
                 other.yangEthNepPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(vlanList, other.vlanList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("totalPotentialEthcapacity", totalPotentialEthcapacity)
            .add("availableEthcapacity", availableEthcapacity)
            .add("switchCapabilityList", switchCapabilityList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangEthNepPacOpType", yangEthNepPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("vlanList", vlanList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of ethNepPac.
     *
     * @param builderObject value of builder object of ethNepPac
     */
    protected DefaultEthNepPac(EthNepPacBuilder builderObject) {
        totalPotentialEthcapacity = builderObject.totalPotentialEthcapacity();
        availableEthcapacity = builderObject.availableEthcapacity();
        switchCapabilityList = builderObject.switchCapabilityList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangEthNepPacOpType = builderObject.yangEthNepPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        vlanList = builderObject.vlanList();
    }

    /**
     * Checks if the passed EthNepPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultEthNepPac processSubtreeFiltering(EthNepPac appInstance, boolean isSelectAllSchemaChild) {
        EthNepPacBuilder subTreeFilteringResultBuilder = new EthNepPacBuilder();
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
        return (DefaultEthNepPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(EthNepPac appInstance, EthNepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.TOTALPOTENTIALETHCAPACITY.getLeafIndex())) {
            if (appInstance.totalPotentialEthcapacity() == null
                        ||
                        !(totalPotentialEthcapacity()
            .equals(appInstance.totalPotentialEthcapacity()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.TOTALPOTENTIALETHCAPACITY)) {
                    subTreeFilteringResultBuilder.totalPotentialEthcapacity(totalPotentialEthcapacity());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.totalPotentialEthcapacity(appInstance.totalPotentialEthcapacity());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .TOTALPOTENTIALETHCAPACITY.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.totalPotentialEthcapacity(appInstance.totalPotentialEthcapacity());
        }

        if (valueLeafFlags.get(LeafIdentifier.AVAILABLEETHCAPACITY.getLeafIndex())) {
             if (appInstance.availableEthcapacity() == null
                        || !(availableEthcapacity()
            .equals(appInstance.availableEthcapacity()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.AVAILABLEETHCAPACITY)) {
                    subTreeFilteringResultBuilder.availableEthcapacity(availableEthcapacity());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.availableEthcapacity(appInstance.availableEthcapacity());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.AVAILABLEETHCAPACITY
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.availableEthcapacity(appInstance.availableEthcapacity());
        }

        return true;
    }

    private boolean processLeafListSubTreeFiltering(EthNepPac appInstance, EthNepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.switchCapabilityList() != null) {
                for (TapiSwitchCapability switchCapabilityList : appInstance.switchCapabilityList()) {
                    subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList);
                }
            } else {
                if (isSubTreeFiltered && switchCapabilityList() != null) {
                    subTreeFilteringResultBuilder.switchCapabilityList(switchCapabilityList);
                }
            }
        } else if (switchCapabilityList() != null) {
            if (!switchCapabilityList().isEmpty()) {
                if (appInstance.switchCapabilityList() == null || appInstance.switchCapabilityList().isEmpty()) {
                    return false;
                }
                for (TapiSwitchCapability switchCapabilityList : switchCapabilityList()) {
                    boolean flag = false;
                    for (TapiSwitchCapability switchCapabilityList2 : appInstance.switchCapabilityList()) {
                        if (switchCapabilityList.equals(switchCapabilityList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.switchCapabilityList() != null && !appInstance.switchCapabilityList().isEmpty()) {
                for (TapiSwitchCapability switchCapabilityList : appInstance.switchCapabilityList()) {
                        subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(EthNepPac appInstance, EthNepPacBuilder
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

        return true;
    }


    /**
     * Creates an instance of defaultEthNepPac.
     */
    protected DefaultEthNepPac() {
    }

    /**
     * Returns the attribute ethNepPacBuilder.
     *
     * @return ethNepPacBuilder
     */
    public static EthNepPacBuilder builder() {
        return new EthNepPacBuilder();
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
     * Represents the builder implementation of ethNepPac.
     */
    public static class EthNepPacBuilder implements EthNepPac.EthNepPacBuilder {
        protected Integer totalPotentialEthcapacity;
        protected Integer availableEthcapacity;
        protected List<TapiSwitchCapability> switchCapabilityList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangEthNepPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<VlanList> vlanList;



        @Override
        public Integer totalPotentialEthcapacity() {
            return totalPotentialEthcapacity;
        }

        @Override
        public Integer availableEthcapacity() {
            return availableEthcapacity;
        }

        @Override
        public List<TapiSwitchCapability> switchCapabilityList() {
            return switchCapabilityList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangEthNepPacOpType() {
            return yangEthNepPacOpType;
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
        public EthNepPacBuilder totalPotentialEthcapacity(Integer totalPotentialEthcapacity) {
            valueLeafFlags.set(LeafIdentifier.TOTALPOTENTIALETHCAPACITY.getLeafIndex());
            this.totalPotentialEthcapacity = totalPotentialEthcapacity;
            return this;
        }

        @Override
        public EthNepPacBuilder availableEthcapacity(Integer availableEthcapacity) {
            valueLeafFlags.set(LeafIdentifier.AVAILABLEETHCAPACITY.getLeafIndex());
            this.availableEthcapacity = availableEthcapacity;
            return this;
        }

        @Override
        public EthNepPacBuilder switchCapabilityList(List<TapiSwitchCapability> switchCapabilityList) {
            this.switchCapabilityList = switchCapabilityList;
            return this;
        }

        @Override
        public EthNepPacBuilder yangEthNepPacOpType(OnosYangOpType yangEthNepPacOpType) {
            this.yangEthNepPacOpType = yangEthNepPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public EthNepPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public EthNepPacBuilder vlanList(List<VlanList> vlanList) {
            this.vlanList = vlanList;
            return this;
        }

        @Override
        public EthNepPacBuilder addToSwitchCapabilityList(TapiSwitchCapability addTo) {
            if (switchCapabilityList == null) {
                switchCapabilityList = new ArrayList<>();
            }
            switchCapabilityList.add(addTo);
            return this;
        }


        @Override
        public EthNepPacBuilder addToVlanList(VlanList addTo) {
            if (vlanList == null) {
                vlanList = new ArrayList<>();
            }
            vlanList.add(addTo);
            return this;
        }


        @Override
        public EthNepPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public EthNepPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public EthNepPac build() {
            return new DefaultEthNepPac(this);
        }

        /**
         * Builds object of ethNepPac.
         *
         * @return ethNepPac
         */
        public EthNepPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultEthNepPac(this);
        }
        /**
         * Creates an instance of ethNepPacBuilder.
         */
        public EthNepPacBuilder() {
        }

    }
}
