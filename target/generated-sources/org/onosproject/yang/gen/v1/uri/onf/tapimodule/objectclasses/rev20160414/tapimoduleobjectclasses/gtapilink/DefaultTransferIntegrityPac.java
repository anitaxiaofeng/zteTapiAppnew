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

/**
 * Represents the implementation of transferIntegrityPac.
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
public class DefaultTransferIntegrityPac implements TransferIntegrityPac {
    protected String errorCharacteristic;
    protected String lossCharacteristic;
    protected String repeatDeliveryCharacteristic;
    protected String deliveryOrderCharacteristic;
    protected String unavailableTimeCharacteristic;
    protected String serverIntegrityProcessCharacteristic;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTransferIntegrityPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String errorCharacteristic() {
        return errorCharacteristic;
    }

    @Override
    public String lossCharacteristic() {
        return lossCharacteristic;
    }

    @Override
    public String repeatDeliveryCharacteristic() {
        return repeatDeliveryCharacteristic;
    }

    @Override
    public String deliveryOrderCharacteristic() {
        return deliveryOrderCharacteristic;
    }

    @Override
    public String unavailableTimeCharacteristic() {
        return unavailableTimeCharacteristic;
    }

    @Override
    public String serverIntegrityProcessCharacteristic() {
        return serverIntegrityProcessCharacteristic;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTransferIntegrityPacOpType() {
        return yangTransferIntegrityPacOpType;
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
         return Objects.hash(errorCharacteristic, lossCharacteristic, repeatDeliveryCharacteristic,
                    deliveryOrderCharacteristic, unavailableTimeCharacteristic,
                    serverIntegrityProcessCharacteristic, valueLeafFlags, yangTransferIntegrityPacOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTransferIntegrityPac) {
            DefaultTransferIntegrityPac other = (DefaultTransferIntegrityPac) obj;
            return
                Objects.equals(errorCharacteristic, other.errorCharacteristic) &&
                Objects.equals(lossCharacteristic, other.lossCharacteristic) &&
                Objects.equals(repeatDeliveryCharacteristic, other.repeatDeliveryCharacteristic) &&
                Objects.equals(deliveryOrderCharacteristic, other.deliveryOrderCharacteristic) &&
                Objects.equals(unavailableTimeCharacteristic, other.unavailableTimeCharacteristic) &&
                Objects.equals(serverIntegrityProcessCharacteristic, other.serverIntegrityProcessCharacteristic) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTransferIntegrityPacOpType,
                 other.yangTransferIntegrityPacOpType) &&
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
            .add("errorCharacteristic", errorCharacteristic)
            .add("lossCharacteristic", lossCharacteristic)
            .add("repeatDeliveryCharacteristic", repeatDeliveryCharacteristic)
            .add("deliveryOrderCharacteristic", deliveryOrderCharacteristic)
            .add("unavailableTimeCharacteristic", unavailableTimeCharacteristic)
            .add("serverIntegrityProcessCharacteristic", serverIntegrityProcessCharacteristic)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTransferIntegrityPacOpType", yangTransferIntegrityPacOpType)
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
     * Creates an instance of transferIntegrityPac.
     *
     * @param builderObject value of builder object of transferIntegrityPac
     */
    protected DefaultTransferIntegrityPac(TransferIntegrityPacBuilder builderObject) {
        errorCharacteristic = builderObject.errorCharacteristic();
        lossCharacteristic = builderObject.lossCharacteristic();
        repeatDeliveryCharacteristic = builderObject.repeatDeliveryCharacteristic();
        deliveryOrderCharacteristic = builderObject.deliveryOrderCharacteristic();
        unavailableTimeCharacteristic = builderObject.unavailableTimeCharacteristic();
        serverIntegrityProcessCharacteristic = builderObject.serverIntegrityProcessCharacteristic();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTransferIntegrityPacOpType = builderObject.yangTransferIntegrityPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed TransferIntegrityPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTransferIntegrityPac processSubtreeFiltering(TransferIntegrityPac appInstance, boolean
                isSelectAllSchemaChild) {
        TransferIntegrityPacBuilder subTreeFilteringResultBuilder = new TransferIntegrityPacBuilder();
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
        return (DefaultTransferIntegrityPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TransferIntegrityPac appInstance, TransferIntegrityPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.ERRORCHARACTERISTIC.getLeafIndex())) {
             if (appInstance.errorCharacteristic() == null
                        || !(errorCharacteristic()
            .equals(appInstance.errorCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ERRORCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.errorCharacteristic(errorCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.errorCharacteristic(appInstance.errorCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.ERRORCHARACTERISTIC
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.errorCharacteristic(appInstance.errorCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.LOSSCHARACTERISTIC.getLeafIndex())) {
             if (appInstance.lossCharacteristic() == null
                        || !(lossCharacteristic()
            .equals(appInstance.lossCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LOSSCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.lossCharacteristic(lossCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.lossCharacteristic(appInstance.lossCharacteristic());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LOSSCHARACTERISTIC.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.lossCharacteristic(appInstance.lossCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.REPEATDELIVERYCHARACTERISTIC.getLeafIndex())) {
            if (appInstance.repeatDeliveryCharacteristic() == null
                        ||
                        !(repeatDeliveryCharacteristic()
            .equals(appInstance.repeatDeliveryCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.REPEATDELIVERYCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.repeatDeliveryCharacteristic(repeatDeliveryCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.repeatDeliveryCharacteristic(appInstance
            .repeatDeliveryCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .REPEATDELIVERYCHARACTERISTIC.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.repeatDeliveryCharacteristic(appInstance.repeatDeliveryCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.DELIVERYORDERCHARACTERISTIC.getLeafIndex())) {
            if (appInstance.deliveryOrderCharacteristic() == null
                        ||
                        !(deliveryOrderCharacteristic()
            .equals(appInstance.deliveryOrderCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.DELIVERYORDERCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.deliveryOrderCharacteristic(deliveryOrderCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.deliveryOrderCharacteristic(appInstance.deliveryOrderCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .DELIVERYORDERCHARACTERISTIC.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.deliveryOrderCharacteristic(appInstance.deliveryOrderCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.UNAVAILABLETIMECHARACTERISTIC.getLeafIndex())) {
            if (appInstance.unavailableTimeCharacteristic() == null
                        ||
                        !(unavailableTimeCharacteristic()
            .equals(appInstance.unavailableTimeCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.UNAVAILABLETIMECHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.unavailableTimeCharacteristic(unavailableTimeCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.unavailableTimeCharacteristic(appInstance
            .unavailableTimeCharacteristic());
            }
         } else if
                    (selectLeafFlags.get(LeafIdentifier
            .UNAVAILABLETIMECHARACTERISTIC.getLeafIndex())
                    || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.unavailableTimeCharacteristic(appInstance.unavailableTimeCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.SERVERINTEGRITYPROCESSCHARACTERISTIC.getLeafIndex())) {
            if (appInstance.serverIntegrityProcessCharacteristic() == null
                        ||
                        !(serverIntegrityProcessCharacteristic()
            .equals(appInstance.serverIntegrityProcessCharacteristic()))) {
                if (isSubTreeFiltered
                            &&
                            !appInstance
            .isLeafValueSet(LeafIdentifier.SERVERINTEGRITYPROCESSCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder
            .serverIntegrityProcessCharacteristic(serverIntegrityProcessCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.serverIntegrityProcessCharacteristic(appInstance
            .serverIntegrityProcessCharacteristic());
            }
         } else
                    if
                    (selectLeafFlags.get(LeafIdentifier
            .SERVERINTEGRITYPROCESSCHARACTERISTIC
            .getLeafIndex())
                    || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.serverIntegrityProcessCharacteristic(appInstance
            .serverIntegrityProcessCharacteristic());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TransferIntegrityPac appInstance, TransferIntegrityPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultTransferIntegrityPac.
     */
    protected DefaultTransferIntegrityPac() {
    }

    /**
     * Returns the attribute transferIntegrityPacBuilder.
     *
     * @return transferIntegrityPacBuilder
     */
    public static TransferIntegrityPacBuilder builder() {
        return new TransferIntegrityPacBuilder();
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
     * Represents the builder implementation of transferIntegrityPac.
     */
    public static class TransferIntegrityPacBuilder implements TransferIntegrityPac.TransferIntegrityPacBuilder {
        protected String errorCharacteristic;
        protected String lossCharacteristic;
        protected String repeatDeliveryCharacteristic;
        protected String deliveryOrderCharacteristic;
        protected String unavailableTimeCharacteristic;
        protected String serverIntegrityProcessCharacteristic;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTransferIntegrityPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String errorCharacteristic() {
            return errorCharacteristic;
        }

        @Override
        public String lossCharacteristic() {
            return lossCharacteristic;
        }

        @Override
        public String repeatDeliveryCharacteristic() {
            return repeatDeliveryCharacteristic;
        }

        @Override
        public String deliveryOrderCharacteristic() {
            return deliveryOrderCharacteristic;
        }

        @Override
        public String unavailableTimeCharacteristic() {
            return unavailableTimeCharacteristic;
        }

        @Override
        public String serverIntegrityProcessCharacteristic() {
            return serverIntegrityProcessCharacteristic;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTransferIntegrityPacOpType() {
            return yangTransferIntegrityPacOpType;
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
        public TransferIntegrityPacBuilder errorCharacteristic(String errorCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.ERRORCHARACTERISTIC.getLeafIndex());
            this.errorCharacteristic = errorCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder lossCharacteristic(String lossCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.LOSSCHARACTERISTIC.getLeafIndex());
            this.lossCharacteristic = lossCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.REPEATDELIVERYCHARACTERISTIC.getLeafIndex());
            this.repeatDeliveryCharacteristic = repeatDeliveryCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder deliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.DELIVERYORDERCHARACTERISTIC.getLeafIndex());
            this.deliveryOrderCharacteristic = deliveryOrderCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder unavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.UNAVAILABLETIMECHARACTERISTIC.getLeafIndex());
            this.unavailableTimeCharacteristic = unavailableTimeCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder serverIntegrityProcessCharacteristic(String
                    serverIntegrityProcessCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.SERVERINTEGRITYPROCESSCHARACTERISTIC.getLeafIndex());
            this.serverIntegrityProcessCharacteristic = serverIntegrityProcessCharacteristic;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder yangTransferIntegrityPacOpType(OnosYangOpType
                    yangTransferIntegrityPacOpType) {
            this.yangTransferIntegrityPacOpType = yangTransferIntegrityPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TransferIntegrityPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TransferIntegrityPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TransferIntegrityPac build() {
            return new DefaultTransferIntegrityPac(this);
        }

        /**
         * Builds object of transferIntegrityPac.
         *
         * @return transferIntegrityPac
         */
        public TransferIntegrityPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTransferIntegrityPac(this);
        }
        /**
         * Creates an instance of transferIntegrityPacBuilder.
         */
        public TransferIntegrityPacBuilder() {
        }

    }
}
