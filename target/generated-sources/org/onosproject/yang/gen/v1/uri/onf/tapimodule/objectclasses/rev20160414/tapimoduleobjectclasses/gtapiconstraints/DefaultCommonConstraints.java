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
            .gtapiconstraints;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiDiversityPolicy;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiRouteObjectiveFunction;

/**
 * Represents the implementation of commonConstraints.
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
public class DefaultCommonConstraints implements CommonConstraints {
    protected TapiRouteObjectiveFunction routeObjectiveFunction;
    protected Integer latency;
    protected Integer cost;
    protected TapiDiversityPolicy diversityPolicy;
    protected Object coRoutingList;
    protected Object disjointRoutingList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangCommonConstraintsOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public TapiRouteObjectiveFunction routeObjectiveFunction() {
        return routeObjectiveFunction;
    }

    @Override
    public Integer latency() {
        return latency;
    }

    @Override
    public Integer cost() {
        return cost;
    }

    @Override
    public TapiDiversityPolicy diversityPolicy() {
        return diversityPolicy;
    }

    @Override
    public Object coRoutingList() {
        return coRoutingList;
    }

    @Override
    public Object disjointRoutingList() {
        return disjointRoutingList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangCommonConstraintsOpType() {
        return yangCommonConstraintsOpType;
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
         return Objects.hash(routeObjectiveFunction, latency, cost, diversityPolicy, coRoutingList,
                    disjointRoutingList, valueLeafFlags, yangCommonConstraintsOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultCommonConstraints) {
            DefaultCommonConstraints other = (DefaultCommonConstraints) obj;
            return
                Objects.equals(routeObjectiveFunction, other.routeObjectiveFunction) &&
                Objects.equals(latency, other.latency) &&
                Objects.equals(cost, other.cost) &&
                Objects.equals(diversityPolicy, other.diversityPolicy) &&
                Objects.equals(coRoutingList, other.coRoutingList) &&
                Objects.equals(disjointRoutingList, other.disjointRoutingList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangCommonConstraintsOpType,
                 other.yangCommonConstraintsOpType) &&
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
            .add("routeObjectiveFunction", routeObjectiveFunction)
            .add("latency", latency)
            .add("cost", cost)
            .add("diversityPolicy", diversityPolicy)
            .add("coRoutingList", coRoutingList)
            .add("disjointRoutingList", disjointRoutingList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangCommonConstraintsOpType", yangCommonConstraintsOpType)
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
     * Creates an instance of commonConstraints.
     *
     * @param builderObject value of builder object of commonConstraints
     */
    protected DefaultCommonConstraints(CommonConstraintsBuilder builderObject) {
        routeObjectiveFunction = builderObject.routeObjectiveFunction();
        latency = builderObject.latency();
        cost = builderObject.cost();
        diversityPolicy = builderObject.diversityPolicy();
        coRoutingList = builderObject.coRoutingList();
        disjointRoutingList = builderObject.disjointRoutingList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangCommonConstraintsOpType = builderObject.yangCommonConstraintsOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed CommonConstraints maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultCommonConstraints processSubtreeFiltering(CommonConstraints appInstance, boolean
                isSelectAllSchemaChild) {
        CommonConstraintsBuilder subTreeFilteringResultBuilder = new CommonConstraintsBuilder();
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
        return (DefaultCommonConstraints) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(CommonConstraints appInstance, CommonConstraintsBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.ROUTEOBJECTIVEFUNCTION.getLeafIndex())) {
             if (appInstance.routeObjectiveFunction() == null
                        || !(routeObjectiveFunction()
            .equals(appInstance.routeObjectiveFunction()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ROUTEOBJECTIVEFUNCTION)) {
                    subTreeFilteringResultBuilder.routeObjectiveFunction(routeObjectiveFunction());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.routeObjectiveFunction(appInstance.routeObjectiveFunction());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.ROUTEOBJECTIVEFUNCTION
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.routeObjectiveFunction(appInstance.routeObjectiveFunction());
        }

        if (valueLeafFlags.get(LeafIdentifier.LATENCY.getLeafIndex())) {
            if (appInstance.latency() == null || !(latency().equals(appInstance.latency()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LATENCY)) {
                    subTreeFilteringResultBuilder.latency(latency());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.latency(appInstance.latency());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LATENCY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.latency(appInstance.latency());
        }

        if (valueLeafFlags.get(LeafIdentifier.COST.getLeafIndex())) {
            if (appInstance.cost() == null || !(cost().equals(appInstance.cost()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COST)) {
                    subTreeFilteringResultBuilder.cost(cost());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.cost(appInstance.cost());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COST.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.cost(appInstance.cost());
        }

        if (valueLeafFlags.get(LeafIdentifier.DIVERSITYPOLICY.getLeafIndex())) {
             if (appInstance.diversityPolicy() == null
                        || !(diversityPolicy()
            .equals(appInstance.diversityPolicy()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.DIVERSITYPOLICY)) {
                    subTreeFilteringResultBuilder.diversityPolicy(diversityPolicy());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.diversityPolicy(appInstance.diversityPolicy());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.DIVERSITYPOLICY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.diversityPolicy(appInstance.diversityPolicy());
        }

        if (valueLeafFlags.get(LeafIdentifier.COROUTINGLIST.getLeafIndex())) {
            if (appInstance.coRoutingList() == null || !(coRoutingList().equals(appInstance.coRoutingList()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COROUTINGLIST)) {
                    subTreeFilteringResultBuilder.coRoutingList(coRoutingList());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.coRoutingList(appInstance.coRoutingList());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COROUTINGLIST.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.coRoutingList(appInstance.coRoutingList());
        }

        if (valueLeafFlags.get(LeafIdentifier.DISJOINTROUTINGLIST.getLeafIndex())) {
             if (appInstance.disjointRoutingList() == null
                        || !(disjointRoutingList()
            .equals(appInstance.disjointRoutingList()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.DISJOINTROUTINGLIST)) {
                    subTreeFilteringResultBuilder.disjointRoutingList(disjointRoutingList());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.disjointRoutingList(appInstance.disjointRoutingList());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.DISJOINTROUTINGLIST
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.disjointRoutingList(appInstance.disjointRoutingList());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(CommonConstraints appInstance, CommonConstraintsBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultCommonConstraints.
     */
    protected DefaultCommonConstraints() {
    }

    /**
     * Returns the attribute commonConstraintsBuilder.
     *
     * @return commonConstraintsBuilder
     */
    public static CommonConstraintsBuilder builder() {
        return new CommonConstraintsBuilder();
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
     * Represents the builder implementation of commonConstraints.
     */
    public static class CommonConstraintsBuilder implements CommonConstraints.CommonConstraintsBuilder {
        protected TapiRouteObjectiveFunction routeObjectiveFunction;
        protected Integer latency;
        protected Integer cost;
        protected TapiDiversityPolicy diversityPolicy;
        protected Object coRoutingList;
        protected Object disjointRoutingList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangCommonConstraintsOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public TapiRouteObjectiveFunction routeObjectiveFunction() {
            return routeObjectiveFunction;
        }

        @Override
        public Integer latency() {
            return latency;
        }

        @Override
        public Integer cost() {
            return cost;
        }

        @Override
        public TapiDiversityPolicy diversityPolicy() {
            return diversityPolicy;
        }

        @Override
        public Object coRoutingList() {
            return coRoutingList;
        }

        @Override
        public Object disjointRoutingList() {
            return disjointRoutingList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangCommonConstraintsOpType() {
            return yangCommonConstraintsOpType;
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
        public CommonConstraintsBuilder routeObjectiveFunction(TapiRouteObjectiveFunction routeObjectiveFunction) {
            valueLeafFlags.set(LeafIdentifier.ROUTEOBJECTIVEFUNCTION.getLeafIndex());
            this.routeObjectiveFunction = routeObjectiveFunction;
            return this;
        }

        @Override
        public CommonConstraintsBuilder latency(Integer latency) {
            valueLeafFlags.set(LeafIdentifier.LATENCY.getLeafIndex());
            this.latency = latency;
            return this;
        }

        @Override
        public CommonConstraintsBuilder cost(Integer cost) {
            valueLeafFlags.set(LeafIdentifier.COST.getLeafIndex());
            this.cost = cost;
            return this;
        }

        @Override
        public CommonConstraintsBuilder diversityPolicy(TapiDiversityPolicy diversityPolicy) {
            valueLeafFlags.set(LeafIdentifier.DIVERSITYPOLICY.getLeafIndex());
            this.diversityPolicy = diversityPolicy;
            return this;
        }

        @Override
        public CommonConstraintsBuilder coRoutingList(Object coRoutingList) {
            valueLeafFlags.set(LeafIdentifier.COROUTINGLIST.getLeafIndex());
            this.coRoutingList = coRoutingList;
            return this;
        }

        @Override
        public CommonConstraintsBuilder disjointRoutingList(Object disjointRoutingList) {
            valueLeafFlags.set(LeafIdentifier.DISJOINTROUTINGLIST.getLeafIndex());
            this.disjointRoutingList = disjointRoutingList;
            return this;
        }

        @Override
        public CommonConstraintsBuilder yangCommonConstraintsOpType(OnosYangOpType yangCommonConstraintsOpType) {
            this.yangCommonConstraintsOpType = yangCommonConstraintsOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public CommonConstraintsBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public CommonConstraintsBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public CommonConstraintsBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public CommonConstraints build() {
            return new DefaultCommonConstraints(this);
        }

        /**
         * Builds object of commonConstraints.
         *
         * @return commonConstraints
         */
        public CommonConstraints buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultCommonConstraints(this);
        }
        /**
         * Creates an instance of commonConstraintsBuilder.
         */
        public CommonConstraintsBuilder() {
        }

    }
}
