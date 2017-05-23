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
            .griskparameterpac.DefaultRiskCharacteristicList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .griskparameterpac.RiskCharacteristicList;

/**
 * Represents the implementation of riskParameterPac.
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
public class DefaultRiskParameterPac implements RiskParameterPac {
    protected OnosYangOpType yangRiskParameterPacOpType;
    protected boolean isSubTreeFiltered;
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<RiskCharacteristicList> riskCharacteristicList;

    @Override
    public OnosYangOpType yangRiskParameterPacOpType() {
        return yangRiskParameterPacOpType;
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
    public List<RiskCharacteristicList> riskCharacteristicList() {
        return riskCharacteristicList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangRiskParameterPacOpType, isSubTreeFiltered, yangAugmentedInfoMap,
                    riskCharacteristicList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRiskParameterPac) {
            DefaultRiskParameterPac other = (DefaultRiskParameterPac) obj;
            return
                Objects
                .equals(yangRiskParameterPacOpType,
                 other.yangRiskParameterPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(riskCharacteristicList, other.riskCharacteristicList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangRiskParameterPacOpType", yangRiskParameterPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("riskCharacteristicList", riskCharacteristicList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of riskParameterPac.
     *
     * @param builderObject value of builder object of riskParameterPac
     */
    protected DefaultRiskParameterPac(RiskParameterPacBuilder builderObject) {
        yangRiskParameterPacOpType = builderObject.yangRiskParameterPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        riskCharacteristicList = builderObject.riskCharacteristicList();
    }

    /**
     * Checks if the passed RiskParameterPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultRiskParameterPac processSubtreeFiltering(RiskParameterPac appInstance, boolean
                isSelectAllSchemaChild) {
        RiskParameterPacBuilder subTreeFilteringResultBuilder = new RiskParameterPacBuilder();
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
        return (DefaultRiskParameterPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processChildNodesSubTreeFiltering(RiskParameterPac appInstance, RiskParameterPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.riskCharacteristicList() != null) {
                for (RiskCharacteristicList riskCharacteristicList : appInstance.riskCharacteristicList()) {
                    RiskCharacteristicList result;
                    result = ((DefaultRiskCharacteristicList) DefaultRiskCharacteristicList.builder()
                            .buildForFilter()).processSubtreeFiltering(riskCharacteristicList, true);
                    subTreeFilteringResultBuilder.addToRiskCharacteristicList(result);
                }
            } else {
                if (isSubTreeFiltered && riskCharacteristicList() != null) {
                    subTreeFilteringResultBuilder.riskCharacteristicList(riskCharacteristicList);
                }
            }
        } else if (riskCharacteristicList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!riskCharacteristicList().isEmpty()) {
                if (appInstance.riskCharacteristicList() != null &&
                            !appInstance.riskCharacteristicList().isEmpty()) {
                for (RiskCharacteristicList riskCharacteristicList : riskCharacteristicList()) {
                    for (RiskCharacteristicList riskCharacteristicList2 : appInstance.riskCharacteristicList()) {
                            RiskCharacteristicList result = ((DefaultRiskCharacteristicList) riskCharacteristicList)
                            .processSubtreeFiltering(riskCharacteristicList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToRiskCharacteristicList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && riskCharacteristicList() != null) {
                    subTreeFilteringResultBuilder.riskCharacteristicList(riskCharacteristicList);
                }
            }
            } else {
                if (appInstance.riskCharacteristicList() != null &&
                            !appInstance.riskCharacteristicList().isEmpty()) {
                for (RiskCharacteristicList riskCharacteristicList : appInstance.riskCharacteristicList()) {
                        subTreeFilteringResultBuilder.addToRiskCharacteristicList(riskCharacteristicList);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultRiskParameterPac.
     */
    protected DefaultRiskParameterPac() {
    }

    /**
     * Returns the attribute riskParameterPacBuilder.
     *
     * @return riskParameterPacBuilder
     */
    public static RiskParameterPacBuilder builder() {
        return new RiskParameterPacBuilder();
    }

    /**
     * Represents the builder implementation of riskParameterPac.
     */
    public static class RiskParameterPacBuilder implements RiskParameterPac.RiskParameterPacBuilder {
        protected OnosYangOpType yangRiskParameterPacOpType;
        protected boolean isSubTreeFiltered;
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<RiskCharacteristicList> riskCharacteristicList;


        @Override
        public OnosYangOpType yangRiskParameterPacOpType() {
            return yangRiskParameterPacOpType;
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
        public List<RiskCharacteristicList> riskCharacteristicList() {
            return riskCharacteristicList;
        }

        @Override
        public RiskParameterPacBuilder yangRiskParameterPacOpType(OnosYangOpType yangRiskParameterPacOpType) {
            this.yangRiskParameterPacOpType = yangRiskParameterPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public RiskParameterPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public RiskParameterPacBuilder riskCharacteristicList(List<RiskCharacteristicList> riskCharacteristicList) {
            this.riskCharacteristicList = riskCharacteristicList;
            return this;
        }

        @Override
        public RiskParameterPacBuilder addToRiskCharacteristicList(RiskCharacteristicList addTo) {
            if (riskCharacteristicList == null) {
                riskCharacteristicList = new ArrayList<>();
            }
            riskCharacteristicList.add(addTo);
            return this;
        }


        @Override
        public RiskParameterPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public RiskParameterPac build() {
            return new DefaultRiskParameterPac(this);
        }

        /**
         * Builds object of riskParameterPac.
         *
         * @return riskParameterPac
         */
        public RiskParameterPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultRiskParameterPac(this);
        }
        /**
         * Creates an instance of riskParameterPacBuilder.
         */
        public RiskParameterPacBuilder() {
        }

    }
}
