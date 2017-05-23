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
            .gtapilayerprotocol;

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
            .PayLoadType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAdaptationType;

/**
 * Represents the implementation of oduCepPac.
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
public class DefaultOduCepPac implements OduCepPac {
    protected PayLoadType payLoadType;
    protected TapiAdaptationType adaptationType;
    protected String tsDetail;
    protected Integer currentNumberOfTributarySlots;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangOduCepPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public PayLoadType payLoadType() {
        return payLoadType;
    }

    @Override
    public TapiAdaptationType adaptationType() {
        return adaptationType;
    }

    @Override
    public String tsDetail() {
        return tsDetail;
    }

    @Override
    public Integer currentNumberOfTributarySlots() {
        return currentNumberOfTributarySlots;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangOduCepPacOpType() {
        return yangOduCepPacOpType;
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
         return Objects.hash(payLoadType, adaptationType, tsDetail, currentNumberOfTributarySlots, valueLeafFlags,
                    yangOduCepPacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultOduCepPac) {
            DefaultOduCepPac other = (DefaultOduCepPac) obj;
            return
                Objects.equals(payLoadType, other.payLoadType) &&
                Objects.equals(adaptationType, other.adaptationType) &&
                Objects.equals(tsDetail, other.tsDetail) &&
                Objects.equals(currentNumberOfTributarySlots, other.currentNumberOfTributarySlots) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangOduCepPacOpType,
                 other.yangOduCepPacOpType) &&
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
            .add("payLoadType", payLoadType)
            .add("adaptationType", adaptationType)
            .add("tsDetail", tsDetail)
            .add("currentNumberOfTributarySlots", currentNumberOfTributarySlots)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangOduCepPacOpType", yangOduCepPacOpType)
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
     * Creates an instance of oduCepPac.
     *
     * @param builderObject value of builder object of oduCepPac
     */
    protected DefaultOduCepPac(OduCepPacBuilder builderObject) {
        payLoadType = builderObject.payLoadType();
        adaptationType = builderObject.adaptationType();
        tsDetail = builderObject.tsDetail();
        currentNumberOfTributarySlots = builderObject.currentNumberOfTributarySlots();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangOduCepPacOpType = builderObject.yangOduCepPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed OduCepPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultOduCepPac processSubtreeFiltering(OduCepPac appInstance, boolean isSelectAllSchemaChild) {
        OduCepPacBuilder subTreeFilteringResultBuilder = new OduCepPacBuilder();
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
        return (DefaultOduCepPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(OduCepPac appInstance, OduCepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.PAYLOADTYPE.getLeafIndex())) {
            if (appInstance.payLoadType() == null || !(payLoadType().equals(appInstance.payLoadType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PAYLOADTYPE)) {
                    subTreeFilteringResultBuilder.payLoadType(payLoadType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.payLoadType(appInstance.payLoadType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PAYLOADTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.payLoadType(appInstance.payLoadType());
        }

        if (valueLeafFlags.get(LeafIdentifier.ADAPTATIONTYPE.getLeafIndex())) {
            if (appInstance.adaptationType() == null || !(adaptationType().equals(appInstance.adaptationType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ADAPTATIONTYPE)) {
                    subTreeFilteringResultBuilder.adaptationType(adaptationType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.adaptationType(appInstance.adaptationType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ADAPTATIONTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.adaptationType(appInstance.adaptationType());
        }

        if (valueLeafFlags.get(LeafIdentifier.TSDETAIL.getLeafIndex())) {
            if (appInstance.tsDetail() == null || !(tsDetail().equals(appInstance.tsDetail()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.TSDETAIL)) {
                    subTreeFilteringResultBuilder.tsDetail(tsDetail());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.tsDetail(appInstance.tsDetail());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.TSDETAIL.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.tsDetail(appInstance.tsDetail());
        }

        if (valueLeafFlags.get(LeafIdentifier.CURRENTNUMBEROFTRIBUTARYSLOTS.getLeafIndex())) {
            if (appInstance.currentNumberOfTributarySlots() == null
                        ||
                        !(currentNumberOfTributarySlots()
            .equals(appInstance.currentNumberOfTributarySlots()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CURRENTNUMBEROFTRIBUTARYSLOTS)) {
                    subTreeFilteringResultBuilder.currentNumberOfTributarySlots(currentNumberOfTributarySlots());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.currentNumberOfTributarySlots(appInstance
            .currentNumberOfTributarySlots());
            }
         } else if
                    (selectLeafFlags.get(LeafIdentifier
            .CURRENTNUMBEROFTRIBUTARYSLOTS.getLeafIndex())
                    || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.currentNumberOfTributarySlots(appInstance.currentNumberOfTributarySlots());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(OduCepPac appInstance, OduCepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultOduCepPac.
     */
    protected DefaultOduCepPac() {
    }

    /**
     * Returns the attribute oduCepPacBuilder.
     *
     * @return oduCepPacBuilder
     */
    public static OduCepPacBuilder builder() {
        return new OduCepPacBuilder();
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
     * Represents the builder implementation of oduCepPac.
     */
    public static class OduCepPacBuilder implements OduCepPac.OduCepPacBuilder {
        protected PayLoadType payLoadType;
        protected TapiAdaptationType adaptationType;
        protected String tsDetail;
        protected Integer currentNumberOfTributarySlots;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangOduCepPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public PayLoadType payLoadType() {
            return payLoadType;
        }

        @Override
        public TapiAdaptationType adaptationType() {
            return adaptationType;
        }

        @Override
        public String tsDetail() {
            return tsDetail;
        }

        @Override
        public Integer currentNumberOfTributarySlots() {
            return currentNumberOfTributarySlots;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangOduCepPacOpType() {
            return yangOduCepPacOpType;
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
        public OduCepPacBuilder payLoadType(PayLoadType payLoadType) {
            valueLeafFlags.set(LeafIdentifier.PAYLOADTYPE.getLeafIndex());
            this.payLoadType = payLoadType;
            return this;
        }

        @Override
        public OduCepPacBuilder adaptationType(TapiAdaptationType adaptationType) {
            valueLeafFlags.set(LeafIdentifier.ADAPTATIONTYPE.getLeafIndex());
            this.adaptationType = adaptationType;
            return this;
        }

        @Override
        public OduCepPacBuilder tsDetail(String tsDetail) {
            valueLeafFlags.set(LeafIdentifier.TSDETAIL.getLeafIndex());
            this.tsDetail = tsDetail;
            return this;
        }

        @Override
        public OduCepPacBuilder currentNumberOfTributarySlots(Integer currentNumberOfTributarySlots) {
            valueLeafFlags.set(LeafIdentifier.CURRENTNUMBEROFTRIBUTARYSLOTS.getLeafIndex());
            this.currentNumberOfTributarySlots = currentNumberOfTributarySlots;
            return this;
        }

        @Override
        public OduCepPacBuilder yangOduCepPacOpType(OnosYangOpType yangOduCepPacOpType) {
            this.yangOduCepPacOpType = yangOduCepPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public OduCepPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public OduCepPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public OduCepPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public OduCepPac build() {
            return new DefaultOduCepPac(this);
        }

        /**
         * Builds object of oduCepPac.
         *
         * @return oduCepPac
         */
        public OduCepPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultOduCepPac(this);
        }
        /**
         * Creates an instance of oduCepPacBuilder.
         */
        public OduCepPacBuilder() {
        }

    }
}
