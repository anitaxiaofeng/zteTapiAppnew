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
            .gtransfercapacitypac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .gtapicapacity.CapacityCharacteristicList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .gtapicapacity.DefaultCapacityCharacteristicList;

/**
 * Represents the implementation of totalPotentialCapacity.
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
public class DefaultTotalPotentialCapacity implements TotalPotentialCapacity {
    protected OnosYangOpType yangTotalPotentialCapacityOpType;
    protected boolean isSubTreeFiltered;
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected CapacityCharacteristicList capacityCharacteristicList;

    @Override
    public OnosYangOpType yangTotalPotentialCapacityOpType() {
        return yangTotalPotentialCapacityOpType;
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
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public CapacityCharacteristicList capacityCharacteristicList() {
        return capacityCharacteristicList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangTotalPotentialCapacityOpType, isSubTreeFiltered, yangAugmentedInfoMap,
                    capacityCharacteristicList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTotalPotentialCapacity) {
            DefaultTotalPotentialCapacity other = (DefaultTotalPotentialCapacity) obj;
            return
                Objects
                .equals(yangTotalPotentialCapacityOpType,
                 other.yangTotalPotentialCapacityOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(capacityCharacteristicList, other.capacityCharacteristicList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangTotalPotentialCapacityOpType", yangTotalPotentialCapacityOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("capacityCharacteristicList", capacityCharacteristicList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of totalPotentialCapacity.
     *
     * @param builderObject value of builder object of totalPotentialCapacity
     */
    protected DefaultTotalPotentialCapacity(TotalPotentialCapacityBuilder builderObject) {
        yangTotalPotentialCapacityOpType = builderObject.yangTotalPotentialCapacityOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        capacityCharacteristicList = builderObject.capacityCharacteristicList();
    }

    /**
     * Checks if the passed TotalPotentialCapacity maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTotalPotentialCapacity processSubtreeFiltering(TotalPotentialCapacity appInstance, boolean
                isSelectAllSchemaChild) {
        TotalPotentialCapacityBuilder subTreeFilteringResultBuilder = new TotalPotentialCapacityBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
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
        return (DefaultTotalPotentialCapacity) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processChildNodesSubTreeFiltering(TotalPotentialCapacity appInstance,
                TotalPotentialCapacityBuilder subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode,
                boolean isSelectAllSchemaChild) {
        if (capacityCharacteristicList() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.capacityCharacteristicList() != null) {
                CapacityCharacteristicList result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultCapacityCharacteristicList) DefaultCapacityCharacteristicList.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance
            .capacityCharacteristicList(), true);
                } else {
                    result = ((DefaultCapacityCharacteristicList) capacityCharacteristicList)
                            .processSubtreeFiltering(appInstance.capacityCharacteristicList(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.capacityCharacteristicList(result);
                }
            } else {
                if (isSubTreeFiltered && capacityCharacteristicList() != null) {
                    subTreeFilteringResultBuilder.capacityCharacteristicList(capacityCharacteristicList);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTotalPotentialCapacity.
     */
    protected DefaultTotalPotentialCapacity() {
    }

    /**
     * Returns the attribute totalPotentialCapacityBuilder.
     *
     * @return totalPotentialCapacityBuilder
     */
    public static TotalPotentialCapacityBuilder builder() {
        return new TotalPotentialCapacityBuilder();
    }

    /**
     * Represents the builder implementation of totalPotentialCapacity.
     */
    public static class TotalPotentialCapacityBuilder implements
                TotalPotentialCapacity.TotalPotentialCapacityBuilder {
        protected OnosYangOpType yangTotalPotentialCapacityOpType;
        protected boolean isSubTreeFiltered;
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected CapacityCharacteristicList capacityCharacteristicList;


        @Override
        public OnosYangOpType yangTotalPotentialCapacityOpType() {
            return yangTotalPotentialCapacityOpType;
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
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public CapacityCharacteristicList capacityCharacteristicList() {
            return capacityCharacteristicList;
        }

        @Override
        public TotalPotentialCapacityBuilder yangTotalPotentialCapacityOpType(OnosYangOpType
                    yangTotalPotentialCapacityOpType) {
            this.yangTotalPotentialCapacityOpType = yangTotalPotentialCapacityOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TotalPotentialCapacityBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TotalPotentialCapacityBuilder capacityCharacteristicList(CapacityCharacteristicList
                    capacityCharacteristicList) {
            this.capacityCharacteristicList = capacityCharacteristicList;
            return this;
        }

        @Override
        public TotalPotentialCapacityBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TotalPotentialCapacity build() {
            return new DefaultTotalPotentialCapacity(this);
        }

        /**
         * Builds object of totalPotentialCapacity.
         *
         * @return totalPotentialCapacity
         */
        public TotalPotentialCapacity buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTotalPotentialCapacity(this);
        }
        /**
         * Creates an instance of totalPotentialCapacityBuilder.
         */
        public TotalPotentialCapacityBuilder() {
        }

    }
}
