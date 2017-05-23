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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.AvailableCapacity;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.CapacityAssignedToUserView;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.DefaultAvailableCapacity;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.DefaultCapacityAssignedToUserView;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.DefaultTotalPotentialCapacity;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfercapacitypac.TotalPotentialCapacity;

/**
 * Represents the implementation of transferCapacityPac.
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
public class DefaultTransferCapacityPac implements TransferCapacityPac {
    protected String capacityInteractionAlgorithm;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTransferCapacityPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected TotalPotentialCapacity totalPotentialCapacity;
    protected AvailableCapacity availableCapacity;
    protected CapacityAssignedToUserView capacityAssignedToUserView;

    @Override
    public String capacityInteractionAlgorithm() {
        return capacityInteractionAlgorithm;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTransferCapacityPacOpType() {
        return yangTransferCapacityPacOpType;
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
    public TotalPotentialCapacity totalPotentialCapacity() {
        return totalPotentialCapacity;
    }

    @Override
    public AvailableCapacity availableCapacity() {
        return availableCapacity;
    }

    @Override
    public CapacityAssignedToUserView capacityAssignedToUserView() {
        return capacityAssignedToUserView;
    }

    @Override
    public int hashCode() {
         return Objects.hash(capacityInteractionAlgorithm, valueLeafFlags, yangTransferCapacityPacOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, totalPotentialCapacity,
                    availableCapacity, capacityAssignedToUserView);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTransferCapacityPac) {
            DefaultTransferCapacityPac other = (DefaultTransferCapacityPac) obj;
            return
                Objects.equals(capacityInteractionAlgorithm, other.capacityInteractionAlgorithm) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTransferCapacityPacOpType,
                 other.yangTransferCapacityPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(totalPotentialCapacity, other.totalPotentialCapacity) &&
                Objects.equals(availableCapacity, other.availableCapacity) &&
                Objects.equals(capacityAssignedToUserView, other.capacityAssignedToUserView);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("capacityInteractionAlgorithm", capacityInteractionAlgorithm)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTransferCapacityPacOpType", yangTransferCapacityPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("totalPotentialCapacity", totalPotentialCapacity)
            .add("availableCapacity", availableCapacity)
            .add("capacityAssignedToUserView", capacityAssignedToUserView)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of transferCapacityPac.
     *
     * @param builderObject value of builder object of transferCapacityPac
     */
    protected DefaultTransferCapacityPac(TransferCapacityPacBuilder builderObject) {
        capacityInteractionAlgorithm = builderObject.capacityInteractionAlgorithm();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTransferCapacityPacOpType = builderObject.yangTransferCapacityPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        totalPotentialCapacity = builderObject.totalPotentialCapacity();
        availableCapacity = builderObject.availableCapacity();
        capacityAssignedToUserView = builderObject.capacityAssignedToUserView();
    }

    /**
     * Checks if the passed TransferCapacityPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTransferCapacityPac processSubtreeFiltering(TransferCapacityPac appInstance, boolean
                isSelectAllSchemaChild) {
        TransferCapacityPacBuilder subTreeFilteringResultBuilder = new TransferCapacityPacBuilder();
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
        return (DefaultTransferCapacityPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TransferCapacityPac appInstance, TransferCapacityPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.CAPACITYINTERACTIONALGORITHM.getLeafIndex())) {
            if (appInstance.capacityInteractionAlgorithm() == null
                        ||
                        !(capacityInteractionAlgorithm()
            .equals(appInstance.capacityInteractionAlgorithm()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.CAPACITYINTERACTIONALGORITHM)) {
                    subTreeFilteringResultBuilder.capacityInteractionAlgorithm(capacityInteractionAlgorithm());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.capacityInteractionAlgorithm(appInstance
            .capacityInteractionAlgorithm());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .CAPACITYINTERACTIONALGORITHM.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.capacityInteractionAlgorithm(appInstance.capacityInteractionAlgorithm());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TransferCapacityPac appInstance, TransferCapacityPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (totalPotentialCapacity() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.totalPotentialCapacity() != null) {
                TotalPotentialCapacity result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultTotalPotentialCapacity) DefaultTotalPotentialCapacity.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.totalPotentialCapacity(), true);
                } else {
                    result = ((DefaultTotalPotentialCapacity) totalPotentialCapacity)
                            .processSubtreeFiltering(appInstance.totalPotentialCapacity(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.totalPotentialCapacity(result);
                }
            } else {
                if (isSubTreeFiltered && totalPotentialCapacity() != null) {
                    subTreeFilteringResultBuilder.totalPotentialCapacity(totalPotentialCapacity);
                }
            }
        }

        if (availableCapacity() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.availableCapacity() != null) {
                AvailableCapacity result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultAvailableCapacity) DefaultAvailableCapacity.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.availableCapacity(), true);
                } else {
                    result = ((DefaultAvailableCapacity) availableCapacity)
                            .processSubtreeFiltering(appInstance.availableCapacity(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.availableCapacity(result);
                }
            } else {
                if (isSubTreeFiltered && availableCapacity() != null) {
                    subTreeFilteringResultBuilder.availableCapacity(availableCapacity);
                }
            }
        }

        if (capacityAssignedToUserView() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.capacityAssignedToUserView() != null) {
                CapacityAssignedToUserView result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultCapacityAssignedToUserView) DefaultCapacityAssignedToUserView.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance
            .capacityAssignedToUserView(), true);
                } else {
                    result = ((DefaultCapacityAssignedToUserView) capacityAssignedToUserView)
                            .processSubtreeFiltering(appInstance.capacityAssignedToUserView(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.capacityAssignedToUserView(result);
                }
            } else {
                if (isSubTreeFiltered && capacityAssignedToUserView() != null) {
                    subTreeFilteringResultBuilder.capacityAssignedToUserView(capacityAssignedToUserView);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTransferCapacityPac.
     */
    protected DefaultTransferCapacityPac() {
    }

    /**
     * Returns the attribute transferCapacityPacBuilder.
     *
     * @return transferCapacityPacBuilder
     */
    public static TransferCapacityPacBuilder builder() {
        return new TransferCapacityPacBuilder();
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
     * Represents the builder implementation of transferCapacityPac.
     */
    public static class TransferCapacityPacBuilder implements TransferCapacityPac.TransferCapacityPacBuilder {
        protected String capacityInteractionAlgorithm;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTransferCapacityPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected TotalPotentialCapacity totalPotentialCapacity;
        protected AvailableCapacity availableCapacity;
        protected CapacityAssignedToUserView capacityAssignedToUserView;



        @Override
        public String capacityInteractionAlgorithm() {
            return capacityInteractionAlgorithm;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTransferCapacityPacOpType() {
            return yangTransferCapacityPacOpType;
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
        public TotalPotentialCapacity totalPotentialCapacity() {
            return totalPotentialCapacity;
        }

        @Override
        public AvailableCapacity availableCapacity() {
            return availableCapacity;
        }

        @Override
        public CapacityAssignedToUserView capacityAssignedToUserView() {
            return capacityAssignedToUserView;
        }

        @Override
        public TransferCapacityPacBuilder capacityInteractionAlgorithm(String capacityInteractionAlgorithm) {
            valueLeafFlags.set(LeafIdentifier.CAPACITYINTERACTIONALGORITHM.getLeafIndex());
            this.capacityInteractionAlgorithm = capacityInteractionAlgorithm;
            return this;
        }

        @Override
        public TransferCapacityPacBuilder yangTransferCapacityPacOpType(OnosYangOpType
                    yangTransferCapacityPacOpType) {
            this.yangTransferCapacityPacOpType = yangTransferCapacityPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TransferCapacityPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TransferCapacityPacBuilder totalPotentialCapacity(TotalPotentialCapacity totalPotentialCapacity) {
            this.totalPotentialCapacity = totalPotentialCapacity;
            return this;
        }

        @Override
        public TransferCapacityPacBuilder availableCapacity(AvailableCapacity availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }

        @Override
        public TransferCapacityPacBuilder capacityAssignedToUserView(CapacityAssignedToUserView
                    capacityAssignedToUserView) {
            this.capacityAssignedToUserView = capacityAssignedToUserView;
            return this;
        }

        @Override
        public TransferCapacityPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TransferCapacityPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TransferCapacityPac build() {
            return new DefaultTransferCapacityPac(this);
        }

        /**
         * Builds object of transferCapacityPac.
         *
         * @return transferCapacityPac
         */
        public TransferCapacityPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTransferCapacityPac(this);
        }
        /**
         * Creates an instance of transferCapacityPacBuilder.
         */
        public TransferCapacityPacBuilder() {
        }

    }
}
