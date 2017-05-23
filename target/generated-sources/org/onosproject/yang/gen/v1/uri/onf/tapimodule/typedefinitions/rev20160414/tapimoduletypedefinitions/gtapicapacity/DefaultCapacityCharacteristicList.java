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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .gtapicapacity;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.TapiModuleTypeDefinitions
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Represents the implementation of capacityCharacteristicList.
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
public class DefaultCapacityCharacteristicList implements CapacityCharacteristicList {
    protected TapiLayerProtocolName layerProtocolName;
    protected Integer capacityValue;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangCapacityCharacteristicListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public TapiLayerProtocolName layerProtocolName() {
        return layerProtocolName;
    }

    @Override
    public Integer capacityValue() {
        return capacityValue;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangCapacityCharacteristicListOpType() {
        return yangCapacityCharacteristicListOpType;
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
         return Objects.hash(layerProtocolName, capacityValue, valueLeafFlags, yangCapacityCharacteristicListOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultCapacityCharacteristicList) {
            DefaultCapacityCharacteristicList other = (DefaultCapacityCharacteristicList) obj;
            return
                Objects.equals(layerProtocolName, other.layerProtocolName) &&
                Objects.equals(capacityValue, other.capacityValue) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangCapacityCharacteristicListOpType,
                 other.yangCapacityCharacteristicListOpType) &&
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
            .add("layerProtocolName", layerProtocolName)
            .add("capacityValue", capacityValue)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangCapacityCharacteristicListOpType", yangCapacityCharacteristicListOpType)
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
     * Creates an instance of capacityCharacteristicList.
     *
     * @param builderObject value of builder object of capacityCharacteristicList
     */
    protected DefaultCapacityCharacteristicList(CapacityCharacteristicListBuilder builderObject) {
        layerProtocolName = builderObject.layerProtocolName();
        capacityValue = builderObject.capacityValue();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangCapacityCharacteristicListOpType = builderObject.yangCapacityCharacteristicListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed CapacityCharacteristicList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultCapacityCharacteristicList processSubtreeFiltering(CapacityCharacteristicList appInstance, boolean
                isSelectAllSchemaChild) {
        CapacityCharacteristicListBuilder subTreeFilteringResultBuilder = new CapacityCharacteristicListBuilder();
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
        return (DefaultCapacityCharacteristicList) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(CapacityCharacteristicList appInstance,
                CapacityCharacteristicListBuilder subTreeFilteringResultBuilder, BitSet
                isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
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

        if (valueLeafFlags.get(LeafIdentifier.CAPACITYVALUE.getLeafIndex())) {
            if (appInstance.capacityValue() == null || !(capacityValue().equals(appInstance.capacityValue()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CAPACITYVALUE)) {
                    subTreeFilteringResultBuilder.capacityValue(capacityValue());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.capacityValue(appInstance.capacityValue());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.CAPACITYVALUE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.capacityValue(appInstance.capacityValue());
        }

        return true;
    }

     private boolean processChildNodesSubTreeFiltering(CapacityCharacteristicList appInstance,
                CapacityCharacteristicListBuilder subTreeFilteringResultBuilder, BitSet
                isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultCapacityCharacteristicList.
     */
    protected DefaultCapacityCharacteristicList() {
    }

    /**
     * Returns the attribute capacityCharacteristicListBuilder.
     *
     * @return capacityCharacteristicListBuilder
     */
    public static CapacityCharacteristicListBuilder builder() {
        return new CapacityCharacteristicListBuilder();
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
     * Represents the builder implementation of capacityCharacteristicList.
     */
    public static class CapacityCharacteristicListBuilder implements
                CapacityCharacteristicList.CapacityCharacteristicListBuilder {
        protected TapiLayerProtocolName layerProtocolName;
        protected Integer capacityValue;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangCapacityCharacteristicListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public TapiLayerProtocolName layerProtocolName() {
            return layerProtocolName;
        }

        @Override
        public Integer capacityValue() {
            return capacityValue;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangCapacityCharacteristicListOpType() {
            return yangCapacityCharacteristicListOpType;
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
        public CapacityCharacteristicListBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName) {
            valueLeafFlags.set(LeafIdentifier.LAYERPROTOCOLNAME.getLeafIndex());
            this.layerProtocolName = layerProtocolName;
            return this;
        }

        @Override
        public CapacityCharacteristicListBuilder capacityValue(Integer capacityValue) {
            valueLeafFlags.set(LeafIdentifier.CAPACITYVALUE.getLeafIndex());
            this.capacityValue = capacityValue;
            return this;
        }

        @Override
        public CapacityCharacteristicListBuilder yangCapacityCharacteristicListOpType(OnosYangOpType
                    yangCapacityCharacteristicListOpType) {
            this.yangCapacityCharacteristicListOpType = yangCapacityCharacteristicListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public CapacityCharacteristicListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public CapacityCharacteristicListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public CapacityCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public CapacityCharacteristicList build() {
            return new DefaultCapacityCharacteristicList(this);
        }

        /**
         * Builds object of capacityCharacteristicList.
         *
         * @return capacityCharacteristicList
         */
        public CapacityCharacteristicList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultCapacityCharacteristicList(this);
        }
        /**
         * Creates an instance of capacityCharacteristicListBuilder.
         */
        public CapacityCharacteristicListBuilder() {
        }

    }
}
