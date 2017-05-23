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
            .griskparameterpac;

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

/**
 * Represents the implementation of riskCharacteristicList.
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
public class DefaultRiskCharacteristicList implements RiskCharacteristicList {
    protected String riskCharacteristicName;
    protected List<String> riskIdentifierList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangRiskCharacteristicListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String riskCharacteristicName() {
        return riskCharacteristicName;
    }

    @Override
    public List<String> riskIdentifierList() {
        return riskIdentifierList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangRiskCharacteristicListOpType() {
        return yangRiskCharacteristicListOpType;
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
         return Objects.hash(riskCharacteristicName, riskIdentifierList, valueLeafFlags,
                    yangRiskCharacteristicListOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRiskCharacteristicList) {
            DefaultRiskCharacteristicList other = (DefaultRiskCharacteristicList) obj;
            return
                Objects.equals(riskCharacteristicName, other.riskCharacteristicName) &&
                Objects.equals(riskIdentifierList, other.riskIdentifierList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangRiskCharacteristicListOpType,
                 other.yangRiskCharacteristicListOpType) &&
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
            .add("riskCharacteristicName", riskCharacteristicName)
            .add("riskIdentifierList", riskIdentifierList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangRiskCharacteristicListOpType", yangRiskCharacteristicListOpType)
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
     * Creates an instance of riskCharacteristicList.
     *
     * @param builderObject value of builder object of riskCharacteristicList
     */
    protected DefaultRiskCharacteristicList(RiskCharacteristicListBuilder builderObject) {
        riskCharacteristicName = builderObject.riskCharacteristicName();
        riskIdentifierList = builderObject.riskIdentifierList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangRiskCharacteristicListOpType = builderObject.yangRiskCharacteristicListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed RiskCharacteristicList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultRiskCharacteristicList processSubtreeFiltering(RiskCharacteristicList appInstance, boolean
                isSelectAllSchemaChild) {
        RiskCharacteristicListBuilder subTreeFilteringResultBuilder = new RiskCharacteristicListBuilder();
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
        return (DefaultRiskCharacteristicList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(RiskCharacteristicList appInstance, RiskCharacteristicListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.RISKCHARACTERISTICNAME.getLeafIndex())) {
             if (appInstance.riskCharacteristicName() == null
                        || !(riskCharacteristicName()
            .equals(appInstance.riskCharacteristicName()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.RISKCHARACTERISTICNAME)) {
                    subTreeFilteringResultBuilder.riskCharacteristicName(riskCharacteristicName());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.riskCharacteristicName(appInstance.riskCharacteristicName());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.RISKCHARACTERISTICNAME
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.riskCharacteristicName(appInstance.riskCharacteristicName());
        }

        return true;
    }

    private boolean processLeafListSubTreeFiltering(RiskCharacteristicList appInstance, RiskCharacteristicListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.riskIdentifierList() != null) {
                for (String riskIdentifierList : appInstance.riskIdentifierList()) {
                    subTreeFilteringResultBuilder.addToRiskIdentifierList(riskIdentifierList);
                }
            } else {
                if (isSubTreeFiltered && riskIdentifierList() != null) {
                    subTreeFilteringResultBuilder.riskIdentifierList(riskIdentifierList);
                }
            }
        } else if (riskIdentifierList() != null) {
            if (!riskIdentifierList().isEmpty()) {
                if (appInstance.riskIdentifierList() == null || appInstance.riskIdentifierList().isEmpty()) {
                    return false;
                }
                for (String riskIdentifierList : riskIdentifierList()) {
                    boolean flag = false;
                    for (String riskIdentifierList2 : appInstance.riskIdentifierList()) {
                        if (riskIdentifierList.equals(riskIdentifierList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToRiskIdentifierList(riskIdentifierList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.riskIdentifierList() != null && !appInstance.riskIdentifierList().isEmpty()) {
                for (String riskIdentifierList : appInstance.riskIdentifierList()) {
                        subTreeFilteringResultBuilder.addToRiskIdentifierList(riskIdentifierList);
                    }
                }
            }
        }

        return true;
    }

     private boolean processChildNodesSubTreeFiltering(RiskCharacteristicList appInstance,
                RiskCharacteristicListBuilder subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode,
                boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultRiskCharacteristicList.
     */
    protected DefaultRiskCharacteristicList() {
    }

    /**
     * Returns the attribute riskCharacteristicListBuilder.
     *
     * @return riskCharacteristicListBuilder
     */
    public static RiskCharacteristicListBuilder builder() {
        return new RiskCharacteristicListBuilder();
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
     * Represents the builder implementation of riskCharacteristicList.
     */
    public static class RiskCharacteristicListBuilder implements
                RiskCharacteristicList.RiskCharacteristicListBuilder {
        protected String riskCharacteristicName;
        protected List<String> riskIdentifierList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangRiskCharacteristicListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String riskCharacteristicName() {
            return riskCharacteristicName;
        }

        @Override
        public List<String> riskIdentifierList() {
            return riskIdentifierList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangRiskCharacteristicListOpType() {
            return yangRiskCharacteristicListOpType;
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
        public RiskCharacteristicListBuilder riskCharacteristicName(String riskCharacteristicName) {
            valueLeafFlags.set(LeafIdentifier.RISKCHARACTERISTICNAME.getLeafIndex());
            this.riskCharacteristicName = riskCharacteristicName;
            return this;
        }

        @Override
        public RiskCharacteristicListBuilder riskIdentifierList(List<String> riskIdentifierList) {
            this.riskIdentifierList = riskIdentifierList;
            return this;
        }

        @Override
        public RiskCharacteristicListBuilder yangRiskCharacteristicListOpType(OnosYangOpType
                    yangRiskCharacteristicListOpType) {
            this.yangRiskCharacteristicListOpType = yangRiskCharacteristicListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public RiskCharacteristicListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public RiskCharacteristicListBuilder addToRiskIdentifierList(String addTo) {
            if (riskIdentifierList == null) {
                riskIdentifierList = new ArrayList<>();
            }
            riskIdentifierList.add(addTo);
            return this;
        }


        @Override
        public RiskCharacteristicListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public RiskCharacteristicListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public RiskCharacteristicList build() {
            return new DefaultRiskCharacteristicList(this);
        }

        /**
         * Builds object of riskCharacteristicList.
         *
         * @return riskCharacteristicList
         */
        public RiskCharacteristicList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultRiskCharacteristicList(this);
        }
        /**
         * Creates an instance of riskCharacteristicListBuilder.
         */
        public RiskCharacteristicListBuilder() {
        }

    }
}
