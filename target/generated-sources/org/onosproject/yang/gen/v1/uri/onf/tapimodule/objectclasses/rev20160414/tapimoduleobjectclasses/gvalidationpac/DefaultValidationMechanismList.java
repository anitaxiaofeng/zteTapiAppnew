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
            .gvalidationpac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Represents the implementation of validationMechanismList.
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
public class DefaultValidationMechanismList implements ValidationMechanismList {
    protected String validationMechanism;
    protected String layerProtocolAdjacencyValidated;
    protected String validationRobustness;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangValidationMechanismListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String validationMechanism() {
        return validationMechanism;
    }

    @Override
    public String layerProtocolAdjacencyValidated() {
        return layerProtocolAdjacencyValidated;
    }

    @Override
    public String validationRobustness() {
        return validationRobustness;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangValidationMechanismListOpType() {
        return yangValidationMechanismListOpType;
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
        return Objects.hash(validationMechanism, layerProtocolAdjacencyValidated, validationRobustness,
                    valueLeafFlags, yangValidationMechanismListOpType, isSubTreeFiltered, selectLeafFlags,
                    yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultValidationMechanismList) {
            DefaultValidationMechanismList other = (DefaultValidationMechanismList) obj;
            return
                Objects.equals(validationMechanism, other.validationMechanism) &&
                Objects.equals(layerProtocolAdjacencyValidated, other.layerProtocolAdjacencyValidated) &&
                Objects.equals(validationRobustness, other.validationRobustness) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangValidationMechanismListOpType,
                 other.yangValidationMechanismListOpType) &&
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
            .add("validationMechanism", validationMechanism)
            .add("layerProtocolAdjacencyValidated", layerProtocolAdjacencyValidated)
            .add("validationRobustness", validationRobustness)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangValidationMechanismListOpType", yangValidationMechanismListOpType)
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
     * Creates an instance of validationMechanismList.
     *
     * @param builderObject value of builder object of validationMechanismList
     */
    protected DefaultValidationMechanismList(ValidationMechanismListBuilder builderObject) {
        validationMechanism = builderObject.validationMechanism();
        layerProtocolAdjacencyValidated = builderObject.layerProtocolAdjacencyValidated();
        validationRobustness = builderObject.validationRobustness();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangValidationMechanismListOpType = builderObject.yangValidationMechanismListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed ValidationMechanismList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultValidationMechanismList processSubtreeFiltering(ValidationMechanismList appInstance, boolean
                isSelectAllSchemaChild) {
        ValidationMechanismListBuilder subTreeFilteringResultBuilder = new ValidationMechanismListBuilder();
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
        return (DefaultValidationMechanismList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(ValidationMechanismList appInstance, ValidationMechanismListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.VALIDATIONMECHANISM.getLeafIndex())) {
             if (appInstance.validationMechanism() == null
                        || !(validationMechanism()
            .equals(appInstance.validationMechanism()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VALIDATIONMECHANISM)) {
                    subTreeFilteringResultBuilder.validationMechanism(validationMechanism());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.validationMechanism(appInstance.validationMechanism());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.VALIDATIONMECHANISM
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.validationMechanism(appInstance.validationMechanism());
        }

        if (valueLeafFlags.get(LeafIdentifier.LAYERPROTOCOLADJACENCYVALIDATED.getLeafIndex())) {
            if (appInstance.layerProtocolAdjacencyValidated() == null
                        ||
                        !(layerProtocolAdjacencyValidated()
            .equals(appInstance.layerProtocolAdjacencyValidated()))) {
                if (isSubTreeFiltered
                            &&
                            !appInstance
            .isLeafValueSet(LeafIdentifier.LAYERPROTOCOLADJACENCYVALIDATED)) {
                    subTreeFilteringResultBuilder.layerProtocolAdjacencyValidated(layerProtocolAdjacencyValidated());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.layerProtocolAdjacencyValidated(appInstance
            .layerProtocolAdjacencyValidated());
            }
         } else
                    if
                    (selectLeafFlags.get(LeafIdentifier
            .LAYERPROTOCOLADJACENCYVALIDATED
            .getLeafIndex())
                    || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.layerProtocolAdjacencyValidated(appInstance
            .layerProtocolAdjacencyValidated());
        }

        if (valueLeafFlags.get(LeafIdentifier.VALIDATIONROBUSTNESS.getLeafIndex())) {
             if (appInstance.validationRobustness() == null
                        || !(validationRobustness()
            .equals(appInstance.validationRobustness()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.VALIDATIONROBUSTNESS)) {
                    subTreeFilteringResultBuilder.validationRobustness(validationRobustness());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.validationRobustness(appInstance.validationRobustness());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.VALIDATIONROBUSTNESS
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.validationRobustness(appInstance.validationRobustness());
        }

        return true;
    }

     private boolean processChildNodesSubTreeFiltering(ValidationMechanismList appInstance,
                ValidationMechanismListBuilder subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode,
                boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultValidationMechanismList.
     */
    protected DefaultValidationMechanismList() {
    }

    /**
     * Returns the attribute validationMechanismListBuilder.
     *
     * @return validationMechanismListBuilder
     */
    public static ValidationMechanismListBuilder builder() {
        return new ValidationMechanismListBuilder();
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
     * Represents the builder implementation of validationMechanismList.
     */
    public static class ValidationMechanismListBuilder implements
                ValidationMechanismList.ValidationMechanismListBuilder {
        protected String validationMechanism;
        protected String layerProtocolAdjacencyValidated;
        protected String validationRobustness;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangValidationMechanismListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String validationMechanism() {
            return validationMechanism;
        }

        @Override
        public String layerProtocolAdjacencyValidated() {
            return layerProtocolAdjacencyValidated;
        }

        @Override
        public String validationRobustness() {
            return validationRobustness;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangValidationMechanismListOpType() {
            return yangValidationMechanismListOpType;
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
        public ValidationMechanismListBuilder validationMechanism(String validationMechanism) {
            valueLeafFlags.set(LeafIdentifier.VALIDATIONMECHANISM.getLeafIndex());
            this.validationMechanism = validationMechanism;
            return this;
        }

        @Override
        public ValidationMechanismListBuilder layerProtocolAdjacencyValidated(String
                    layerProtocolAdjacencyValidated) {
            valueLeafFlags.set(LeafIdentifier.LAYERPROTOCOLADJACENCYVALIDATED.getLeafIndex());
            this.layerProtocolAdjacencyValidated = layerProtocolAdjacencyValidated;
            return this;
        }

        @Override
        public ValidationMechanismListBuilder validationRobustness(String validationRobustness) {
            valueLeafFlags.set(LeafIdentifier.VALIDATIONROBUSTNESS.getLeafIndex());
            this.validationRobustness = validationRobustness;
            return this;
        }

        @Override
        public ValidationMechanismListBuilder yangValidationMechanismListOpType(OnosYangOpType
                    yangValidationMechanismListOpType) {
            this.yangValidationMechanismListOpType = yangValidationMechanismListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public ValidationMechanismListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public ValidationMechanismListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public ValidationMechanismListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public ValidationMechanismList build() {
            return new DefaultValidationMechanismList(this);
        }

        /**
         * Builds object of validationMechanismList.
         *
         * @return validationMechanismList
         */
        public ValidationMechanismList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultValidationMechanismList(this);
        }
        /**
         * Creates an instance of validationMechanismListBuilder.
         */
        public ValidationMechanismListBuilder() {
        }

    }
}
