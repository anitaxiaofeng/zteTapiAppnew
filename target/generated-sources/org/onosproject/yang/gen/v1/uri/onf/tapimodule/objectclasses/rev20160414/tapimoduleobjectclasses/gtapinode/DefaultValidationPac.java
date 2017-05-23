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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode;

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
            .gvalidationpac.DefaultValidationMechanismList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gvalidationpac.ValidationMechanismList;

/**
 * Represents the implementation of validationPac.
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
public class DefaultValidationPac implements ValidationPac {
    protected OnosYangOpType yangValidationPacOpType;
    protected boolean isSubTreeFiltered;
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<ValidationMechanismList> validationMechanismList;

    @Override
    public OnosYangOpType yangValidationPacOpType() {
        return yangValidationPacOpType;
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
    public List<ValidationMechanismList> validationMechanismList() {
        return validationMechanismList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangValidationPacOpType, isSubTreeFiltered, yangAugmentedInfoMap,
                    validationMechanismList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultValidationPac) {
            DefaultValidationPac other = (DefaultValidationPac) obj;
            return
                Objects
                .equals(yangValidationPacOpType,
                 other.yangValidationPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(validationMechanismList, other.validationMechanismList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangValidationPacOpType", yangValidationPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("validationMechanismList", validationMechanismList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of validationPac.
     *
     * @param builderObject value of builder object of validationPac
     */
    protected DefaultValidationPac(ValidationPacBuilder builderObject) {
        yangValidationPacOpType = builderObject.yangValidationPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        validationMechanismList = builderObject.validationMechanismList();
    }

    /**
     * Checks if the passed ValidationPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultValidationPac processSubtreeFiltering(ValidationPac appInstance, boolean isSelectAllSchemaChild) {
        ValidationPacBuilder subTreeFilteringResultBuilder = new ValidationPacBuilder();
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
        return (DefaultValidationPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processChildNodesSubTreeFiltering(ValidationPac appInstance, ValidationPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.validationMechanismList() != null) {
                for (ValidationMechanismList validationMechanismList : appInstance.validationMechanismList()) {
                    ValidationMechanismList result;
                    result = ((DefaultValidationMechanismList) DefaultValidationMechanismList.builder()
                            .buildForFilter()).processSubtreeFiltering(validationMechanismList, true);
                    subTreeFilteringResultBuilder.addToValidationMechanismList(result);
                }
            } else {
                if (isSubTreeFiltered && validationMechanismList() != null) {
                    subTreeFilteringResultBuilder.validationMechanismList(validationMechanismList);
                }
            }
        } else if (validationMechanismList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!validationMechanismList().isEmpty()) {
                if (appInstance.validationMechanismList() != null &&
                            !appInstance.validationMechanismList().isEmpty()) {
                for (ValidationMechanismList validationMechanismList : validationMechanismList()) {
                    for (ValidationMechanismList validationMechanismList2 : appInstance.validationMechanismList()) {
                            ValidationMechanismList result = ((DefaultValidationMechanismList)
                                        validationMechanismList)
                            .processSubtreeFiltering(validationMechanismList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToValidationMechanismList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && validationMechanismList() != null) {
                    subTreeFilteringResultBuilder.validationMechanismList(validationMechanismList);
                }
            }
            } else {
                if (appInstance.validationMechanismList() != null &&
                            !appInstance.validationMechanismList().isEmpty()) {
                for (ValidationMechanismList validationMechanismList : appInstance.validationMechanismList()) {
                        subTreeFilteringResultBuilder.addToValidationMechanismList(validationMechanismList);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultValidationPac.
     */
    protected DefaultValidationPac() {
    }

    /**
     * Returns the attribute validationPacBuilder.
     *
     * @return validationPacBuilder
     */
    public static ValidationPacBuilder builder() {
        return new ValidationPacBuilder();
    }

    /**
     * Represents the builder implementation of validationPac.
     */
    public static class ValidationPacBuilder implements ValidationPac.ValidationPacBuilder {
        protected OnosYangOpType yangValidationPacOpType;
        protected boolean isSubTreeFiltered;
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<ValidationMechanismList> validationMechanismList;


        @Override
        public OnosYangOpType yangValidationPacOpType() {
            return yangValidationPacOpType;
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
        public List<ValidationMechanismList> validationMechanismList() {
            return validationMechanismList;
        }

        @Override
        public ValidationPacBuilder yangValidationPacOpType(OnosYangOpType yangValidationPacOpType) {
            this.yangValidationPacOpType = yangValidationPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public ValidationPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public ValidationPacBuilder validationMechanismList(List<ValidationMechanismList> validationMechanismList) {
            this.validationMechanismList = validationMechanismList;
            return this;
        }

        @Override
        public ValidationPacBuilder addToValidationMechanismList(ValidationMechanismList addTo) {
            if (validationMechanismList == null) {
                validationMechanismList = new ArrayList<>();
            }
            validationMechanismList.add(addTo);
            return this;
        }


        @Override
        public ValidationPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public ValidationPac build() {
            return new DefaultValidationPac(this);
        }

        /**
         * Builds object of validationPac.
         *
         * @return validationPac
         */
        public ValidationPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultValidationPac(this);
        }
        /**
         * Creates an instance of validationPacBuilder.
         */
        public ValidationPacBuilder() {
        }

    }
}
