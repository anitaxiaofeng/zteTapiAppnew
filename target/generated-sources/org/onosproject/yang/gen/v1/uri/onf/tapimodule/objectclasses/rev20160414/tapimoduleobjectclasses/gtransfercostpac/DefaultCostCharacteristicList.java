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
            .gtransfercostpac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;

/**
 * Represents the implementation of costCharacteristicList.
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
public class DefaultCostCharacteristicList implements CostCharacteristicList {
    protected String costName;
    protected Integer costValue;
    protected String costAlgorithm;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangCostCharacteristicListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String costName() {
        return costName;
    }

    @Override
    public Integer costValue() {
        return costValue;
    }

    @Override
    public String costAlgorithm() {
        return costAlgorithm;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangCostCharacteristicListOpType() {
        return yangCostCharacteristicListOpType;
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
         return Objects.hash(costName, costValue, costAlgorithm, valueLeafFlags, yangCostCharacteristicListOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultCostCharacteristicList) {
            DefaultCostCharacteristicList other = (DefaultCostCharacteristicList) obj;
            return
                Objects.equals(costName, other.costName) &&
                Objects.equals(costValue, other.costValue) &&
                Objects.equals(costAlgorithm, other.costAlgorithm) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangCostCharacteristicListOpType,
                 other.yangCostCharacteristicListOpType) &&
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
            .add("costName", costName)
            .add("costValue", costValue)
            .add("costAlgorithm", costAlgorithm)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangCostCharacteristicListOpType", yangCostCharacteristicListOpType)
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
     * Creates an instance of costCharacteristicList.
     *
     * @param builderObject value of builder object of costCharacteristicList
     */
    protected DefaultCostCharacteristicList(CostCharacteristicListBuilder builderObject) {
        costName = builderObject.costName();
        costValue = builderObject.costValue();
        costAlgorithm = builderObject.costAlgorithm();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangCostCharacteristicListOpType = builderObject.yangCostCharacteristicListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed CostCharacteristicList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultCostCharacteristicList processSubtreeFiltering(CostCharacteristicList appInstance, boolean
                isSelectAllSchemaChild) {
        CostCharacteristicListBuilder subTreeFilteringResultBuilder = new CostCharacteristicListBuilder();
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
        return (DefaultCostCharacteristicList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(CostCharacteristicList appInstance, CostCharacteristicListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.COSTNAME.getLeafIndex())) {
            if (appInstance.costName() == null || !(costName().equals(appInstance.costName()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COSTNAME)) {
                    subTreeFilteringResultBuilder.costName(costName());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.costName(appInstance.costName());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COSTNAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.costName(appInstance.costName());
        }

        if (valueLeafFlags.get(LeafIdentifier.COSTVALUE.getLeafIndex())) {
            if (appInstance.costValue() == null || !(costValue().equals(appInstance.costValue()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COSTVALUE)) {
                    subTreeFilteringResultBuilder.costValue(costValue());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.costValue(appInstance.costValue());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COSTVALUE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.costValue(appInstance.costValue());
        }

        if (valueLeafFlags.get(LeafIdentifier.COSTALGORITHM.getLeafIndex())) {
            if (appInstance.costAlgorithm() == null || !(costAlgorithm().equals(appInstance.costAlgorithm()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COSTALGORITHM)) {
                    subTreeFilteringResultBuilder.costAlgorithm(costAlgorithm());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.costAlgorithm(appInstance.costAlgorithm());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COSTALGORITHM.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.costAlgorithm(appInstance.costAlgorithm());
        }

        return true;
    }

     private boolean processChildNodesSubTreeFiltering(CostCharacteristicList appInstance,
                CostCharacteristicListBuilder subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode,
                boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultCostCharacteristicList.
     */
    protected DefaultCostCharacteristicList() {
    }

    /**
     * Returns the attribute costCharacteristicListBuilder.
     *
     * @return costCharacteristicListBuilder
     */
    public static CostCharacteristicListBuilder builder() {
        return new CostCharacteristicListBuilder();
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
     * Represents the builder implementation of costCharacteristicList.
     */
    public static class CostCharacteristicListBuilder implements
                CostCharacteristicList.CostCharacteristicListBuilder {
        protected String costName;
        protected Integer costValue;
        protected String costAlgorithm;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangCostCharacteristicListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String costName() {
            return costName;
        }

        @Override
        public Integer costValue() {
            return costValue;
        }

        @Override
        public String costAlgorithm() {
            return costAlgorithm;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangCostCharacteristicListOpType() {
            return yangCostCharacteristicListOpType;
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
        public CostCharacteristicListBuilder costName(String costName) {
            valueLeafFlags.set(LeafIdentifier.COSTNAME.getLeafIndex());
            this.costName = costName;
            return this;
        }

        @Override
        public CostCharacteristicListBuilder costValue(Integer costValue) {
            valueLeafFlags.set(LeafIdentifier.COSTVALUE.getLeafIndex());
            this.costValue = costValue;
            return this;
        }

        @Override
        public CostCharacteristicListBuilder costAlgorithm(String costAlgorithm) {
            valueLeafFlags.set(LeafIdentifier.COSTALGORITHM.getLeafIndex());
            this.costAlgorithm = costAlgorithm;
            return this;
        }

        @Override
        public CostCharacteristicListBuilder yangCostCharacteristicListOpType(OnosYangOpType
                    yangCostCharacteristicListOpType) {
            this.yangCostCharacteristicListOpType = yangCostCharacteristicListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public CostCharacteristicListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public CostCharacteristicListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public CostCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public CostCharacteristicList build() {
            return new DefaultCostCharacteristicList(this);
        }

        /**
         * Builds object of costCharacteristicList.
         *
         * @return costCharacteristicList
         */
        public CostCharacteristicList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultCostCharacteristicList(this);
        }
        /**
         * Creates an instance of costCharacteristicListBuilder.
         */
        public CostCharacteristicListBuilder() {
        }

    }
}
