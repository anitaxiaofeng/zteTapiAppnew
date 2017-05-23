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
            .gtapiconnection;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiMultiDomainType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiMultiLayerType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiProType;

/**
 * Represents the implementation of protectionType.
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
public class DefaultProtectionType implements ProtectionType {
    protected TapiProType proType;
    protected TapiMultiDomainType multiDomainType;
    protected TapiMultiLayerType multiLayerType;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangProtectionTypeOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public TapiProType proType() {
        return proType;
    }

    @Override
    public TapiMultiDomainType multiDomainType() {
        return multiDomainType;
    }

    @Override
    public TapiMultiLayerType multiLayerType() {
        return multiLayerType;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangProtectionTypeOpType() {
        return yangProtectionTypeOpType;
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
         return Objects.hash(proType, multiDomainType, multiLayerType, valueLeafFlags, yangProtectionTypeOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultProtectionType) {
            DefaultProtectionType other = (DefaultProtectionType) obj;
            return
                Objects.equals(proType, other.proType) &&
                Objects.equals(multiDomainType, other.multiDomainType) &&
                Objects.equals(multiLayerType, other.multiLayerType) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangProtectionTypeOpType,
                 other.yangProtectionTypeOpType) &&
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
            .add("proType", proType)
            .add("multiDomainType", multiDomainType)
            .add("multiLayerType", multiLayerType)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangProtectionTypeOpType", yangProtectionTypeOpType)
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
     * Creates an instance of protectionType.
     *
     * @param builderObject value of builder object of protectionType
     */
    protected DefaultProtectionType(ProtectionTypeBuilder builderObject) {
        proType = builderObject.proType();
        multiDomainType = builderObject.multiDomainType();
        multiLayerType = builderObject.multiLayerType();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangProtectionTypeOpType = builderObject.yangProtectionTypeOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed ProtectionType maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultProtectionType processSubtreeFiltering(ProtectionType appInstance, boolean
                isSelectAllSchemaChild) {
        ProtectionTypeBuilder subTreeFilteringResultBuilder = new ProtectionTypeBuilder();
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
        return (DefaultProtectionType) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(ProtectionType appInstance, ProtectionTypeBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.PROTYPE.getLeafIndex())) {
            if (appInstance.proType() == null || !(proType().equals(appInstance.proType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PROTYPE)) {
                    subTreeFilteringResultBuilder.proType(proType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.proType(appInstance.proType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PROTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.proType(appInstance.proType());
        }

        if (valueLeafFlags.get(LeafIdentifier.MULTIDOMAINTYPE.getLeafIndex())) {
             if (appInstance.multiDomainType() == null
                        || !(multiDomainType()
            .equals(appInstance.multiDomainType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.MULTIDOMAINTYPE)) {
                    subTreeFilteringResultBuilder.multiDomainType(multiDomainType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.multiDomainType(appInstance.multiDomainType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.MULTIDOMAINTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.multiDomainType(appInstance.multiDomainType());
        }

        if (valueLeafFlags.get(LeafIdentifier.MULTILAYERTYPE.getLeafIndex())) {
            if (appInstance.multiLayerType() == null || !(multiLayerType().equals(appInstance.multiLayerType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.MULTILAYERTYPE)) {
                    subTreeFilteringResultBuilder.multiLayerType(multiLayerType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.multiLayerType(appInstance.multiLayerType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.MULTILAYERTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.multiLayerType(appInstance.multiLayerType());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(ProtectionType appInstance, ProtectionTypeBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultProtectionType.
     */
    protected DefaultProtectionType() {
    }

    /**
     * Returns the attribute protectionTypeBuilder.
     *
     * @return protectionTypeBuilder
     */
    public static ProtectionTypeBuilder builder() {
        return new ProtectionTypeBuilder();
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
     * Represents the builder implementation of protectionType.
     */
    public static class ProtectionTypeBuilder implements ProtectionType.ProtectionTypeBuilder {
        protected TapiProType proType;
        protected TapiMultiDomainType multiDomainType;
        protected TapiMultiLayerType multiLayerType;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangProtectionTypeOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public TapiProType proType() {
            return proType;
        }

        @Override
        public TapiMultiDomainType multiDomainType() {
            return multiDomainType;
        }

        @Override
        public TapiMultiLayerType multiLayerType() {
            return multiLayerType;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangProtectionTypeOpType() {
            return yangProtectionTypeOpType;
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
        public ProtectionTypeBuilder proType(TapiProType proType) {
            valueLeafFlags.set(LeafIdentifier.PROTYPE.getLeafIndex());
            this.proType = proType;
            return this;
        }

        @Override
        public ProtectionTypeBuilder multiDomainType(TapiMultiDomainType multiDomainType) {
            valueLeafFlags.set(LeafIdentifier.MULTIDOMAINTYPE.getLeafIndex());
            this.multiDomainType = multiDomainType;
            return this;
        }

        @Override
        public ProtectionTypeBuilder multiLayerType(TapiMultiLayerType multiLayerType) {
            valueLeafFlags.set(LeafIdentifier.MULTILAYERTYPE.getLeafIndex());
            this.multiLayerType = multiLayerType;
            return this;
        }

        @Override
        public ProtectionTypeBuilder yangProtectionTypeOpType(OnosYangOpType yangProtectionTypeOpType) {
            this.yangProtectionTypeOpType = yangProtectionTypeOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public ProtectionTypeBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public ProtectionTypeBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public ProtectionTypeBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public ProtectionType build() {
            return new DefaultProtectionType(this);
        }

        /**
         * Builds object of protectionType.
         *
         * @return protectionType
         */
        public ProtectionType buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultProtectionType(this);
        }
        /**
         * Creates an instance of protectionTypeBuilder.
         */
        public ProtectionTypeBuilder() {
        }

    }
}
