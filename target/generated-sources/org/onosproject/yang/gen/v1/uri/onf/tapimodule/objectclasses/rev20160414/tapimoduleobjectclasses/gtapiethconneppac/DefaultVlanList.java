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
            .gtapiethconneppac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiVlanPriority;

/**
 * Represents the implementation of vlanList.
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
public class DefaultVlanList implements VlanList {
    protected Integer vlanId;
    protected TapiVlanPriority vlanPriority;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangVlanListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public Integer vlanId() {
        return vlanId;
    }

    @Override
    public TapiVlanPriority vlanPriority() {
        return vlanPriority;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangVlanListOpType() {
        return yangVlanListOpType;
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
    public int hashCode() {
         return Objects.hash(vlanId, vlanPriority, valueLeafFlags, yangVlanListOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultVlanList) {
            DefaultVlanList other = (DefaultVlanList) obj;
            return
                Objects.equals(vlanId, other.vlanId) &&
                Objects.equals(vlanPriority, other.vlanPriority) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangVlanListOpType,
                 other.yangVlanListOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("vlanId", vlanId)
            .add("vlanPriority", vlanPriority)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangVlanListOpType", yangVlanListOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of vlanList.
     *
     * @param builderObject value of builder object of vlanList
     */
    protected DefaultVlanList(VlanListBuilder builderObject) {
        vlanId = builderObject.vlanId();
        vlanPriority = builderObject.vlanPriority();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangVlanListOpType = builderObject.yangVlanListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed VlanList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultVlanList processSubtreeFiltering(VlanList appInstance, boolean isSelectAllSchemaChild) {
        VlanListBuilder subTreeFilteringResultBuilder = new VlanListBuilder();
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
        return (DefaultVlanList) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(VlanList appInstance, VlanListBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.VLANID.getLeafIndex())) {
            if (appInstance.vlanId() == null || !(vlanId().equals(appInstance.vlanId()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VLANID)) {
                    subTreeFilteringResultBuilder.vlanId(vlanId());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.vlanId(appInstance.vlanId());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.VLANID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.vlanId(appInstance.vlanId());
        }

        if (valueLeafFlags.get(LeafIdentifier.VLANPRIORITY.getLeafIndex())) {
            if (appInstance.vlanPriority() == null || !(vlanPriority().equals(appInstance.vlanPriority()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VLANPRIORITY)) {
                    subTreeFilteringResultBuilder.vlanPriority(vlanPriority());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.vlanPriority(appInstance.vlanPriority());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.VLANPRIORITY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.vlanPriority(appInstance.vlanPriority());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(VlanList appInstance, VlanListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultVlanList.
     */
    protected DefaultVlanList() {
    }

    /**
     * Returns the attribute vlanListBuilder.
     *
     * @return vlanListBuilder
     */
    public static VlanListBuilder builder() {
        return new VlanListBuilder();
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
     * Represents the builder implementation of vlanList.
     */
    public static class VlanListBuilder implements VlanList.VlanListBuilder {
        protected Integer vlanId;
        protected TapiVlanPriority vlanPriority;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangVlanListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public Integer vlanId() {
            return vlanId;
        }

        @Override
        public TapiVlanPriority vlanPriority() {
            return vlanPriority;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangVlanListOpType() {
            return yangVlanListOpType;
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
        public VlanListBuilder vlanId(Integer vlanId) {
            valueLeafFlags.set(LeafIdentifier.VLANID.getLeafIndex());
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public VlanListBuilder vlanPriority(TapiVlanPriority vlanPriority) {
            valueLeafFlags.set(LeafIdentifier.VLANPRIORITY.getLeafIndex());
            this.vlanPriority = vlanPriority;
            return this;
        }

        @Override
        public VlanListBuilder yangVlanListOpType(OnosYangOpType yangVlanListOpType) {
            this.yangVlanListOpType = yangVlanListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public VlanListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public VlanListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public VlanListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public VlanList build() {
            return new DefaultVlanList(this);
        }

        /**
         * Builds object of vlanList.
         *
         * @return vlanList
         */
        public VlanList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultVlanList(this);
        }
        /**
         * Creates an instance of vlanListBuilder.
         */
        public VlanListBuilder() {
        }

    }
}
