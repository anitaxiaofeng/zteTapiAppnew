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
            .gtransfertimingpac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Represents the implementation of queuingLatencyList.
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
public class DefaultQueuingLatencyList implements QueuingLatencyList {
    protected String trafficProperty;
    protected String latencyForTrafficWithProperty;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangQueuingLatencyListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String trafficProperty() {
        return trafficProperty;
    }

    @Override
    public String latencyForTrafficWithProperty() {
        return latencyForTrafficWithProperty;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangQueuingLatencyListOpType() {
        return yangQueuingLatencyListOpType;
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
         return Objects.hash(trafficProperty, latencyForTrafficWithProperty, valueLeafFlags,
                    yangQueuingLatencyListOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultQueuingLatencyList) {
            DefaultQueuingLatencyList other = (DefaultQueuingLatencyList) obj;
            return
                Objects.equals(trafficProperty, other.trafficProperty) &&
                Objects.equals(latencyForTrafficWithProperty, other.latencyForTrafficWithProperty) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangQueuingLatencyListOpType,
                 other.yangQueuingLatencyListOpType) &&
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
            .add("trafficProperty", trafficProperty)
            .add("latencyForTrafficWithProperty", latencyForTrafficWithProperty)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangQueuingLatencyListOpType", yangQueuingLatencyListOpType)
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
     * Creates an instance of queuingLatencyList.
     *
     * @param builderObject value of builder object of queuingLatencyList
     */
    protected DefaultQueuingLatencyList(QueuingLatencyListBuilder builderObject) {
        trafficProperty = builderObject.trafficProperty();
        latencyForTrafficWithProperty = builderObject.latencyForTrafficWithProperty();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangQueuingLatencyListOpType = builderObject.yangQueuingLatencyListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed QueuingLatencyList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultQueuingLatencyList processSubtreeFiltering(QueuingLatencyList appInstance, boolean
                isSelectAllSchemaChild) {
        QueuingLatencyListBuilder subTreeFilteringResultBuilder = new QueuingLatencyListBuilder();
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
        return (DefaultQueuingLatencyList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(QueuingLatencyList appInstance, QueuingLatencyListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.TRAFFICPROPERTY.getLeafIndex())) {
             if (appInstance.trafficProperty() == null
                        || !(trafficProperty()
            .equals(appInstance.trafficProperty()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.TRAFFICPROPERTY)) {
                    subTreeFilteringResultBuilder.trafficProperty(trafficProperty());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.trafficProperty(appInstance.trafficProperty());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.TRAFFICPROPERTY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.trafficProperty(appInstance.trafficProperty());
        }

        if (valueLeafFlags.get(LeafIdentifier.LATENCYFORTRAFFICWITHPROPERTY.getLeafIndex())) {
            if (appInstance.latencyForTrafficWithProperty() == null
                        ||
                        !(latencyForTrafficWithProperty()
            .equals(appInstance.latencyForTrafficWithProperty()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LATENCYFORTRAFFICWITHPROPERTY)) {
                    subTreeFilteringResultBuilder.latencyForTrafficWithProperty(latencyForTrafficWithProperty());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.latencyForTrafficWithProperty(appInstance
            .latencyForTrafficWithProperty());
            }
         } else if
                    (selectLeafFlags.get(LeafIdentifier
            .LATENCYFORTRAFFICWITHPROPERTY.getLeafIndex())
                    || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.latencyForTrafficWithProperty(appInstance.latencyForTrafficWithProperty());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(QueuingLatencyList appInstance, QueuingLatencyListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultQueuingLatencyList.
     */
    protected DefaultQueuingLatencyList() {
    }

    /**
     * Returns the attribute queuingLatencyListBuilder.
     *
     * @return queuingLatencyListBuilder
     */
    public static QueuingLatencyListBuilder builder() {
        return new QueuingLatencyListBuilder();
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
     * Represents the builder implementation of queuingLatencyList.
     */
    public static class QueuingLatencyListBuilder implements QueuingLatencyList.QueuingLatencyListBuilder {
        protected String trafficProperty;
        protected String latencyForTrafficWithProperty;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangQueuingLatencyListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String trafficProperty() {
            return trafficProperty;
        }

        @Override
        public String latencyForTrafficWithProperty() {
            return latencyForTrafficWithProperty;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangQueuingLatencyListOpType() {
            return yangQueuingLatencyListOpType;
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
        public QueuingLatencyListBuilder trafficProperty(String trafficProperty) {
            valueLeafFlags.set(LeafIdentifier.TRAFFICPROPERTY.getLeafIndex());
            this.trafficProperty = trafficProperty;
            return this;
        }

        @Override
        public QueuingLatencyListBuilder latencyForTrafficWithProperty(String latencyForTrafficWithProperty) {
            valueLeafFlags.set(LeafIdentifier.LATENCYFORTRAFFICWITHPROPERTY.getLeafIndex());
            this.latencyForTrafficWithProperty = latencyForTrafficWithProperty;
            return this;
        }

        @Override
        public QueuingLatencyListBuilder yangQueuingLatencyListOpType(OnosYangOpType yangQueuingLatencyListOpType) {
            this.yangQueuingLatencyListOpType = yangQueuingLatencyListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public QueuingLatencyListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public QueuingLatencyListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public QueuingLatencyListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public QueuingLatencyList build() {
            return new DefaultQueuingLatencyList(this);
        }

        /**
         * Builds object of queuingLatencyList.
         *
         * @return queuingLatencyList
         */
        public QueuingLatencyList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultQueuingLatencyList(this);
        }
        /**
         * Creates an instance of queuingLatencyListBuilder.
         */
        public QueuingLatencyListBuilder() {
        }

    }
}
