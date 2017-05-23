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
            .gtapiethconneppac;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiColourMode;

/**
 * Represents the implementation of trafficConditioning.
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
public class DefaultTrafficConditioning implements TrafficConditioning {
    protected Integer cir;
    protected Integer cbs;
    protected Integer eir;
    protected Integer ebs;
    protected TapiColourMode colourMode;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTrafficConditioningOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public Integer cir() {
        return cir;
    }

    @Override
    public Integer cbs() {
        return cbs;
    }

    @Override
    public Integer eir() {
        return eir;
    }

    @Override
    public Integer ebs() {
        return ebs;
    }

    @Override
    public TapiColourMode colourMode() {
        return colourMode;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTrafficConditioningOpType() {
        return yangTrafficConditioningOpType;
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
         return Objects.hash(cir, cbs, eir, ebs, colourMode, valueLeafFlags, yangTrafficConditioningOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTrafficConditioning) {
            DefaultTrafficConditioning other = (DefaultTrafficConditioning) obj;
            return
                Objects.equals(cir, other.cir) &&
                Objects.equals(cbs, other.cbs) &&
                Objects.equals(eir, other.eir) &&
                Objects.equals(ebs, other.ebs) &&
                Objects.equals(colourMode, other.colourMode) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTrafficConditioningOpType,
                 other.yangTrafficConditioningOpType) &&
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
            .add("cir", cir)
            .add("cbs", cbs)
            .add("eir", eir)
            .add("ebs", ebs)
            .add("colourMode", colourMode)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTrafficConditioningOpType", yangTrafficConditioningOpType)
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
     * Creates an instance of trafficConditioning.
     *
     * @param builderObject value of builder object of trafficConditioning
     */
    protected DefaultTrafficConditioning(TrafficConditioningBuilder builderObject) {
        cir = builderObject.cir();
        cbs = builderObject.cbs();
        eir = builderObject.eir();
        ebs = builderObject.ebs();
        colourMode = builderObject.colourMode();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTrafficConditioningOpType = builderObject.yangTrafficConditioningOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed TrafficConditioning maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTrafficConditioning processSubtreeFiltering(TrafficConditioning appInstance, boolean
                isSelectAllSchemaChild) {
        TrafficConditioningBuilder subTreeFilteringResultBuilder = new TrafficConditioningBuilder();
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
        return (DefaultTrafficConditioning) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TrafficConditioning appInstance, TrafficConditioningBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.CIR.getLeafIndex())) {
            if (appInstance.cir() == null || !(cir().equals(appInstance.cir()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CIR)) {
                    subTreeFilteringResultBuilder.cir(cir());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.cir(appInstance.cir());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.CIR.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.cir(appInstance.cir());
        }

        if (valueLeafFlags.get(LeafIdentifier.CBS.getLeafIndex())) {
            if (appInstance.cbs() == null || !(cbs().equals(appInstance.cbs()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CBS)) {
                    subTreeFilteringResultBuilder.cbs(cbs());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.cbs(appInstance.cbs());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.CBS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.cbs(appInstance.cbs());
        }

        if (valueLeafFlags.get(LeafIdentifier.EIR.getLeafIndex())) {
            if (appInstance.eir() == null || !(eir().equals(appInstance.eir()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.EIR)) {
                    subTreeFilteringResultBuilder.eir(eir());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.eir(appInstance.eir());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.EIR.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.eir(appInstance.eir());
        }

        if (valueLeafFlags.get(LeafIdentifier.EBS.getLeafIndex())) {
            if (appInstance.ebs() == null || !(ebs().equals(appInstance.ebs()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.EBS)) {
                    subTreeFilteringResultBuilder.ebs(ebs());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.ebs(appInstance.ebs());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.EBS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.ebs(appInstance.ebs());
        }

        if (valueLeafFlags.get(LeafIdentifier.COLOURMODE.getLeafIndex())) {
            if (appInstance.colourMode() == null || !(colourMode().equals(appInstance.colourMode()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.COLOURMODE)) {
                    subTreeFilteringResultBuilder.colourMode(colourMode());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.colourMode(appInstance.colourMode());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.COLOURMODE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.colourMode(appInstance.colourMode());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TrafficConditioning appInstance, TrafficConditioningBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultTrafficConditioning.
     */
    protected DefaultTrafficConditioning() {
    }

    /**
     * Returns the attribute trafficConditioningBuilder.
     *
     * @return trafficConditioningBuilder
     */
    public static TrafficConditioningBuilder builder() {
        return new TrafficConditioningBuilder();
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
     * Represents the builder implementation of trafficConditioning.
     */
    public static class TrafficConditioningBuilder implements TrafficConditioning.TrafficConditioningBuilder {
        protected Integer cir;
        protected Integer cbs;
        protected Integer eir;
        protected Integer ebs;
        protected TapiColourMode colourMode;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTrafficConditioningOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public Integer cir() {
            return cir;
        }

        @Override
        public Integer cbs() {
            return cbs;
        }

        @Override
        public Integer eir() {
            return eir;
        }

        @Override
        public Integer ebs() {
            return ebs;
        }

        @Override
        public TapiColourMode colourMode() {
            return colourMode;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTrafficConditioningOpType() {
            return yangTrafficConditioningOpType;
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
        public TrafficConditioningBuilder cir(Integer cir) {
            valueLeafFlags.set(LeafIdentifier.CIR.getLeafIndex());
            this.cir = cir;
            return this;
        }

        @Override
        public TrafficConditioningBuilder cbs(Integer cbs) {
            valueLeafFlags.set(LeafIdentifier.CBS.getLeafIndex());
            this.cbs = cbs;
            return this;
        }

        @Override
        public TrafficConditioningBuilder eir(Integer eir) {
            valueLeafFlags.set(LeafIdentifier.EIR.getLeafIndex());
            this.eir = eir;
            return this;
        }

        @Override
        public TrafficConditioningBuilder ebs(Integer ebs) {
            valueLeafFlags.set(LeafIdentifier.EBS.getLeafIndex());
            this.ebs = ebs;
            return this;
        }

        @Override
        public TrafficConditioningBuilder colourMode(TapiColourMode colourMode) {
            valueLeafFlags.set(LeafIdentifier.COLOURMODE.getLeafIndex());
            this.colourMode = colourMode;
            return this;
        }

        @Override
        public TrafficConditioningBuilder yangTrafficConditioningOpType(OnosYangOpType
                    yangTrafficConditioningOpType) {
            this.yangTrafficConditioningOpType = yangTrafficConditioningOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TrafficConditioningBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TrafficConditioningBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TrafficConditioningBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TrafficConditioning build() {
            return new DefaultTrafficConditioning(this);
        }

        /**
         * Builds object of trafficConditioning.
         *
         * @return trafficConditioning
         */
        public TrafficConditioning buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTrafficConditioning(this);
        }
        /**
         * Creates an instance of trafficConditioningBuilder.
         */
        public TrafficConditioningBuilder() {
        }

    }
}
