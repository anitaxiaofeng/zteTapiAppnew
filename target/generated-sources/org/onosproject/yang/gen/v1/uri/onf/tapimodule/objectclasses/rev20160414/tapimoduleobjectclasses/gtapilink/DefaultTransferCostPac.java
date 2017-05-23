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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercostpac.CostCharacteristicList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercostpac.DefaultCostCharacteristicList;

/**
 * Represents the implementation of transferCostPac.
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
public class DefaultTransferCostPac implements TransferCostPac {
    protected OnosYangOpType yangTransferCostPacOpType;
    protected boolean isSubTreeFiltered;
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<CostCharacteristicList> costCharacteristicList;

    @Override
    public OnosYangOpType yangTransferCostPacOpType() {
        return yangTransferCostPacOpType;
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
    public List<CostCharacteristicList> costCharacteristicList() {
        return costCharacteristicList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangTransferCostPacOpType, isSubTreeFiltered, yangAugmentedInfoMap,
                    costCharacteristicList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTransferCostPac) {
            DefaultTransferCostPac other = (DefaultTransferCostPac) obj;
            return
                Objects
                .equals(yangTransferCostPacOpType,
                 other.yangTransferCostPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(costCharacteristicList, other.costCharacteristicList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangTransferCostPacOpType", yangTransferCostPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("costCharacteristicList", costCharacteristicList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of transferCostPac.
     *
     * @param builderObject value of builder object of transferCostPac
     */
    protected DefaultTransferCostPac(TransferCostPacBuilder builderObject) {
        yangTransferCostPacOpType = builderObject.yangTransferCostPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        costCharacteristicList = builderObject.costCharacteristicList();
    }

    /**
     * Checks if the passed TransferCostPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTransferCostPac processSubtreeFiltering(TransferCostPac appInstance, boolean
                isSelectAllSchemaChild) {
        TransferCostPacBuilder subTreeFilteringResultBuilder = new TransferCostPacBuilder();
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
        return (DefaultTransferCostPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processChildNodesSubTreeFiltering(TransferCostPac appInstance, TransferCostPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.costCharacteristicList() != null) {
                for (CostCharacteristicList costCharacteristicList : appInstance.costCharacteristicList()) {
                    CostCharacteristicList result;
                    result = ((DefaultCostCharacteristicList) DefaultCostCharacteristicList.builder()
                            .buildForFilter()).processSubtreeFiltering(costCharacteristicList, true);
                    subTreeFilteringResultBuilder.addToCostCharacteristicList(result);
                }
            } else {
                if (isSubTreeFiltered && costCharacteristicList() != null) {
                    subTreeFilteringResultBuilder.costCharacteristicList(costCharacteristicList);
                }
            }
        } else if (costCharacteristicList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!costCharacteristicList().isEmpty()) {
                if (appInstance.costCharacteristicList() != null &&
                            !appInstance.costCharacteristicList().isEmpty()) {
                for (CostCharacteristicList costCharacteristicList : costCharacteristicList()) {
                    for (CostCharacteristicList costCharacteristicList2 : appInstance.costCharacteristicList()) {
                            CostCharacteristicList result = ((DefaultCostCharacteristicList) costCharacteristicList)
                            .processSubtreeFiltering(costCharacteristicList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToCostCharacteristicList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && costCharacteristicList() != null) {
                    subTreeFilteringResultBuilder.costCharacteristicList(costCharacteristicList);
                }
            }
            } else {
                if (appInstance.costCharacteristicList() != null &&
                            !appInstance.costCharacteristicList().isEmpty()) {
                for (CostCharacteristicList costCharacteristicList : appInstance.costCharacteristicList()) {
                        subTreeFilteringResultBuilder.addToCostCharacteristicList(costCharacteristicList);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTransferCostPac.
     */
    protected DefaultTransferCostPac() {
    }

    /**
     * Returns the attribute transferCostPacBuilder.
     *
     * @return transferCostPacBuilder
     */
    public static TransferCostPacBuilder builder() {
        return new TransferCostPacBuilder();
    }

    /**
     * Represents the builder implementation of transferCostPac.
     */
    public static class TransferCostPacBuilder implements TransferCostPac.TransferCostPacBuilder {
        protected OnosYangOpType yangTransferCostPacOpType;
        protected boolean isSubTreeFiltered;
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<CostCharacteristicList> costCharacteristicList;


        @Override
        public OnosYangOpType yangTransferCostPacOpType() {
            return yangTransferCostPacOpType;
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
        public List<CostCharacteristicList> costCharacteristicList() {
            return costCharacteristicList;
        }

        @Override
        public TransferCostPacBuilder yangTransferCostPacOpType(OnosYangOpType yangTransferCostPacOpType) {
            this.yangTransferCostPacOpType = yangTransferCostPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TransferCostPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TransferCostPacBuilder costCharacteristicList(List<CostCharacteristicList> costCharacteristicList) {
            this.costCharacteristicList = costCharacteristicList;
            return this;
        }

        @Override
        public TransferCostPacBuilder addToCostCharacteristicList(CostCharacteristicList addTo) {
            if (costCharacteristicList == null) {
                costCharacteristicList = new ArrayList<>();
            }
            costCharacteristicList.add(addTo);
            return this;
        }


        @Override
        public TransferCostPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TransferCostPac build() {
            return new DefaultTransferCostPac(this);
        }

        /**
         * Builds object of transferCostPac.
         *
         * @return transferCostPac
         */
        public TransferCostPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTransferCostPac(this);
        }
        /**
         * Creates an instance of transferCostPacBuilder.
         */
        public TransferCostPacBuilder() {
        }

    }
}
