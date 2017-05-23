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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Represents the implementation of name.
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
public class DefaultName implements Name {
    protected String valueName;
    protected String value;
    protected String localClassRef;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangNameOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String valueName() {
        return valueName;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String localClassRef() {
        return localClassRef;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangNameOpType() {
        return yangNameOpType;
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
         return Objects.hash(valueName, value, localClassRef, valueLeafFlags, yangNameOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultName) {
            DefaultName other = (DefaultName) obj;
            return
                Objects.equals(valueName, other.valueName) &&
                Objects.equals(value, other.value) &&
                Objects.equals(localClassRef, other.localClassRef) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangNameOpType,
                 other.yangNameOpType) &&
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
            .add("valueName", valueName)
            .add("value", value)
            .add("localClassRef", localClassRef)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangNameOpType", yangNameOpType)
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
     * Creates an instance of name.
     *
     * @param builderObject value of builder object of name
     */
    protected DefaultName(NameBuilder builderObject) {
        valueName = builderObject.valueName();
        value = builderObject.value();
        localClassRef = builderObject.localClassRef();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangNameOpType = builderObject.yangNameOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed Name maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultName processSubtreeFiltering(Name appInstance, boolean isSelectAllSchemaChild) {
        NameBuilder subTreeFilteringResultBuilder = new NameBuilder();
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
        return (DefaultName) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(Name appInstance, NameBuilder subTreeFilteringResultBuilder, BitSet
                isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.VALUENAME.getLeafIndex())) {
            if (appInstance.valueName() == null || !(valueName().equals(appInstance.valueName()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VALUENAME)) {
                    subTreeFilteringResultBuilder.valueName(valueName());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.valueName(appInstance.valueName());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.VALUENAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.valueName(appInstance.valueName());
        }

        if (valueLeafFlags.get(LeafIdentifier.VALUE.getLeafIndex())) {
            if (appInstance.value() == null || !(value().equals(appInstance.value()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VALUE)) {
                    subTreeFilteringResultBuilder.value(value());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.value(appInstance.value());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.VALUE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.value(appInstance.value());
        }

        if (valueLeafFlags.get(LeafIdentifier.LOCALCLASSREF.getLeafIndex())) {
            if (appInstance.localClassRef() == null || !(localClassRef().equals(appInstance.localClassRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LOCALCLASSREF)) {
                    subTreeFilteringResultBuilder.localClassRef(localClassRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.localClassRef(appInstance.localClassRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LOCALCLASSREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.localClassRef(appInstance.localClassRef());
        }

        return true;
    }

     private boolean processChildNodesSubTreeFiltering(Name appInstance, NameBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultName.
     */
    protected DefaultName() {
    }

    /**
     * Returns the attribute nameBuilder.
     *
     * @return nameBuilder
     */
    public static NameBuilder builder() {
        return new NameBuilder();
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
     * Represents the builder implementation of name.
     */
    public static class NameBuilder implements Name.NameBuilder {
        protected String valueName;
        protected String value;
        protected String localClassRef;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangNameOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String valueName() {
            return valueName;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public String localClassRef() {
            return localClassRef;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangNameOpType() {
            return yangNameOpType;
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
        public NameBuilder valueName(String valueName) {
            valueLeafFlags.set(LeafIdentifier.VALUENAME.getLeafIndex());
            this.valueName = valueName;
            return this;
        }

        @Override
        public NameBuilder value(String value) {
            valueLeafFlags.set(LeafIdentifier.VALUE.getLeafIndex());
            this.value = value;
            return this;
        }

        @Override
        public NameBuilder localClassRef(String localClassRef) {
            valueLeafFlags.set(LeafIdentifier.LOCALCLASSREF.getLeafIndex());
            this.localClassRef = localClassRef;
            return this;
        }

        @Override
        public NameBuilder yangNameOpType(OnosYangOpType yangNameOpType) {
            this.yangNameOpType = yangNameOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public NameBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public NameBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public NameBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public Name build() {
            return new DefaultName(this);
        }

        /**
         * Builds object of name.
         *
         * @return name
         */
        public Name buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultName(this);
        }
        /**
         * Creates an instance of nameBuilder.
         */
        public NameBuilder() {
        }

    }
}
