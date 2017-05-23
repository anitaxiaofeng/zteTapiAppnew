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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.Integer;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .PayLoadType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiAdaptationType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSignalType;

/**
 * Represents the implementation of oduNepPac.
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
public class DefaultOduNepPac implements OduNepPac {
    protected Integer oducapacity;
    protected TapiAdaptationType adaptationTypeList;
    protected String tsDetail;
    protected List<PayLoadType> payLoadTypeList;
    protected List<TapiSignalType> switchCapabilityList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangOduNepPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public Integer oducapacity() {
        return oducapacity;
    }

    @Override
    public TapiAdaptationType adaptationTypeList() {
        return adaptationTypeList;
    }

    @Override
    public String tsDetail() {
        return tsDetail;
    }

    @Override
    public List<PayLoadType> payLoadTypeList() {
        return payLoadTypeList;
    }

    @Override
    public List<TapiSignalType> switchCapabilityList() {
        return switchCapabilityList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangOduNepPacOpType() {
        return yangOduNepPacOpType;
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
         return Objects.hash(oducapacity, adaptationTypeList, tsDetail, payLoadTypeList, switchCapabilityList,
                    valueLeafFlags, yangOduNepPacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultOduNepPac) {
            DefaultOduNepPac other = (DefaultOduNepPac) obj;
            return
                Objects.equals(oducapacity, other.oducapacity) &&
                Objects.equals(adaptationTypeList, other.adaptationTypeList) &&
                Objects.equals(tsDetail, other.tsDetail) &&
                Objects.equals(payLoadTypeList, other.payLoadTypeList) &&
                Objects.equals(switchCapabilityList, other.switchCapabilityList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangOduNepPacOpType,
                 other.yangOduNepPacOpType) &&
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
            .add("oducapacity", oducapacity)
            .add("adaptationTypeList", adaptationTypeList)
            .add("tsDetail", tsDetail)
            .add("payLoadTypeList", payLoadTypeList)
            .add("switchCapabilityList", switchCapabilityList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangOduNepPacOpType", yangOduNepPacOpType)
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
     * Creates an instance of oduNepPac.
     *
     * @param builderObject value of builder object of oduNepPac
     */
    protected DefaultOduNepPac(OduNepPacBuilder builderObject) {
        oducapacity = builderObject.oducapacity();
        adaptationTypeList = builderObject.adaptationTypeList();
        tsDetail = builderObject.tsDetail();
        payLoadTypeList = builderObject.payLoadTypeList();
        switchCapabilityList = builderObject.switchCapabilityList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangOduNepPacOpType = builderObject.yangOduNepPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed OduNepPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultOduNepPac processSubtreeFiltering(OduNepPac appInstance, boolean isSelectAllSchemaChild) {
        OduNepPacBuilder subTreeFilteringResultBuilder = new OduNepPacBuilder();
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
        return (DefaultOduNepPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(OduNepPac appInstance, OduNepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.ODUCAPACITY.getLeafIndex())) {
            if (appInstance.oducapacity() == null || !(oducapacity().equals(appInstance.oducapacity()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ODUCAPACITY)) {
                    subTreeFilteringResultBuilder.oducapacity(oducapacity());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.oducapacity(appInstance.oducapacity());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ODUCAPACITY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.oducapacity(appInstance.oducapacity());
        }

        if (valueLeafFlags.get(LeafIdentifier.ADAPTATIONTYPELIST.getLeafIndex())) {
             if (appInstance.adaptationTypeList() == null
                        || !(adaptationTypeList()
            .equals(appInstance.adaptationTypeList()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ADAPTATIONTYPELIST)) {
                    subTreeFilteringResultBuilder.adaptationTypeList(adaptationTypeList());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.adaptationTypeList(appInstance.adaptationTypeList());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ADAPTATIONTYPELIST.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.adaptationTypeList(appInstance.adaptationTypeList());
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

        return true;
    }

    private boolean processLeafListSubTreeFiltering(OduNepPac appInstance, OduNepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.payLoadTypeList() != null) {
                for (PayLoadType payLoadTypeList : appInstance.payLoadTypeList()) {
                    subTreeFilteringResultBuilder.addToPayLoadTypeList(payLoadTypeList);
                }
            } else {
                if (isSubTreeFiltered && payLoadTypeList() != null) {
                    subTreeFilteringResultBuilder.payLoadTypeList(payLoadTypeList);
                }
            }
        } else if (payLoadTypeList() != null) {
            if (!payLoadTypeList().isEmpty()) {
                if (appInstance.payLoadTypeList() == null || appInstance.payLoadTypeList().isEmpty()) {
                    return false;
                }
                for (PayLoadType payLoadTypeList : payLoadTypeList()) {
                    boolean flag = false;
                    for (PayLoadType payLoadTypeList2 : appInstance.payLoadTypeList()) {
                        if (payLoadTypeList.equals(payLoadTypeList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToPayLoadTypeList(payLoadTypeList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.payLoadTypeList() != null && !appInstance.payLoadTypeList().isEmpty()) {
                for (PayLoadType payLoadTypeList : appInstance.payLoadTypeList()) {
                        subTreeFilteringResultBuilder.addToPayLoadTypeList(payLoadTypeList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.switchCapabilityList() != null) {
                for (TapiSignalType switchCapabilityList : appInstance.switchCapabilityList()) {
                    subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList);
                }
            } else {
                if (isSubTreeFiltered && switchCapabilityList() != null) {
                    subTreeFilteringResultBuilder.switchCapabilityList(switchCapabilityList);
                }
            }
        } else if (switchCapabilityList() != null) {
            if (!switchCapabilityList().isEmpty()) {
                if (appInstance.switchCapabilityList() == null || appInstance.switchCapabilityList().isEmpty()) {
                    return false;
                }
                for (TapiSignalType switchCapabilityList : switchCapabilityList()) {
                    boolean flag = false;
                    for (TapiSignalType switchCapabilityList2 : appInstance.switchCapabilityList()) {
                        if (switchCapabilityList.equals(switchCapabilityList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.switchCapabilityList() != null && !appInstance.switchCapabilityList().isEmpty()) {
                for (TapiSignalType switchCapabilityList : appInstance.switchCapabilityList()) {
                        subTreeFilteringResultBuilder.addToSwitchCapabilityList(switchCapabilityList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(OduNepPac appInstance, OduNepPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultOduNepPac.
     */
    protected DefaultOduNepPac() {
    }

    /**
     * Returns the attribute oduNepPacBuilder.
     *
     * @return oduNepPacBuilder
     */
    public static OduNepPacBuilder builder() {
        return new OduNepPacBuilder();
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
     * Represents the builder implementation of oduNepPac.
     */
    public static class OduNepPacBuilder implements OduNepPac.OduNepPacBuilder {
        protected Integer oducapacity;
        protected TapiAdaptationType adaptationTypeList;
        protected String tsDetail;
        protected List<PayLoadType> payLoadTypeList;
        protected List<TapiSignalType> switchCapabilityList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangOduNepPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public Integer oducapacity() {
            return oducapacity;
        }

        @Override
        public TapiAdaptationType adaptationTypeList() {
            return adaptationTypeList;
        }

        @Override
        public String tsDetail() {
            return tsDetail;
        }

        @Override
        public List<PayLoadType> payLoadTypeList() {
            return payLoadTypeList;
        }

        @Override
        public List<TapiSignalType> switchCapabilityList() {
            return switchCapabilityList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangOduNepPacOpType() {
            return yangOduNepPacOpType;
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
        public OduNepPacBuilder oducapacity(Integer oducapacity) {
            valueLeafFlags.set(LeafIdentifier.ODUCAPACITY.getLeafIndex());
            this.oducapacity = oducapacity;
            return this;
        }

        @Override
        public OduNepPacBuilder adaptationTypeList(TapiAdaptationType adaptationTypeList) {
            valueLeafFlags.set(LeafIdentifier.ADAPTATIONTYPELIST.getLeafIndex());
            this.adaptationTypeList = adaptationTypeList;
            return this;
        }

        @Override
        public OduNepPacBuilder tsDetail(String tsDetail) {
            valueLeafFlags.set(LeafIdentifier.TSDETAIL.getLeafIndex());
            this.tsDetail = tsDetail;
            return this;
        }

        @Override
        public OduNepPacBuilder payLoadTypeList(List<PayLoadType> payLoadTypeList) {
            this.payLoadTypeList = payLoadTypeList;
            return this;
        }

        @Override
        public OduNepPacBuilder switchCapabilityList(List<TapiSignalType> switchCapabilityList) {
            this.switchCapabilityList = switchCapabilityList;
            return this;
        }

        @Override
        public OduNepPacBuilder yangOduNepPacOpType(OnosYangOpType yangOduNepPacOpType) {
            this.yangOduNepPacOpType = yangOduNepPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public OduNepPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public OduNepPacBuilder addToPayLoadTypeList(PayLoadType addTo) {
            if (payLoadTypeList == null) {
                payLoadTypeList = new ArrayList<>();
            }
            payLoadTypeList.add(addTo);
            return this;
        }


        @Override
        public OduNepPacBuilder addToSwitchCapabilityList(TapiSignalType addTo) {
            if (switchCapabilityList == null) {
                switchCapabilityList = new ArrayList<>();
            }
            switchCapabilityList.add(addTo);
            return this;
        }


        @Override
        public OduNepPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public OduNepPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public OduNepPac build() {
            return new DefaultOduNepPac(this);
        }

        /**
         * Builds object of oduNepPac.
         *
         * @return oduNepPac
         */
        public OduNepPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultOduNepPac(this);
        }
        /**
         * Creates an instance of oduNepPacBuilder.
         */
        public OduNepPacBuilder() {
        }

    }
}
