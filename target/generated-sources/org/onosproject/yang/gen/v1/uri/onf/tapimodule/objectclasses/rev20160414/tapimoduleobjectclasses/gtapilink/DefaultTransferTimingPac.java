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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfertimingpac.DefaultQueuingLatencyList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtransfertimingpac.QueuingLatencyList;

/**
 * Represents the implementation of transferTimingPac.
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
public class DefaultTransferTimingPac implements TransferTimingPac {
    protected String fixedLatencyCharacteristic;
    protected String jitterCharacteristic;
    protected String wanderCharacteristic;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTransferTimingPacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<QueuingLatencyList> queuingLatencyList;

    @Override
    public String fixedLatencyCharacteristic() {
        return fixedLatencyCharacteristic;
    }

    @Override
    public String jitterCharacteristic() {
        return jitterCharacteristic;
    }

    @Override
    public String wanderCharacteristic() {
        return wanderCharacteristic;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTransferTimingPacOpType() {
        return yangTransferTimingPacOpType;
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
    public List<QueuingLatencyList> queuingLatencyList() {
        return queuingLatencyList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedLatencyCharacteristic, jitterCharacteristic, wanderCharacteristic, valueLeafFlags,
                    yangTransferTimingPacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap,
                    queuingLatencyList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTransferTimingPac) {
            DefaultTransferTimingPac other = (DefaultTransferTimingPac) obj;
            return
                Objects.equals(fixedLatencyCharacteristic, other.fixedLatencyCharacteristic) &&
                Objects.equals(jitterCharacteristic, other.jitterCharacteristic) &&
                Objects.equals(wanderCharacteristic, other.wanderCharacteristic) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTransferTimingPacOpType,
                 other.yangTransferTimingPacOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(queuingLatencyList, other.queuingLatencyList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("fixedLatencyCharacteristic", fixedLatencyCharacteristic)
            .add("jitterCharacteristic", jitterCharacteristic)
            .add("wanderCharacteristic", wanderCharacteristic)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTransferTimingPacOpType", yangTransferTimingPacOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("queuingLatencyList", queuingLatencyList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of transferTimingPac.
     *
     * @param builderObject value of builder object of transferTimingPac
     */
    protected DefaultTransferTimingPac(TransferTimingPacBuilder builderObject) {
        fixedLatencyCharacteristic = builderObject.fixedLatencyCharacteristic();
        jitterCharacteristic = builderObject.jitterCharacteristic();
        wanderCharacteristic = builderObject.wanderCharacteristic();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTransferTimingPacOpType = builderObject.yangTransferTimingPacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        queuingLatencyList = builderObject.queuingLatencyList();
    }

    /**
     * Checks if the passed TransferTimingPac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTransferTimingPac processSubtreeFiltering(TransferTimingPac appInstance, boolean
                isSelectAllSchemaChild) {
        TransferTimingPacBuilder subTreeFilteringResultBuilder = new TransferTimingPacBuilder();
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
        return (DefaultTransferTimingPac) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TransferTimingPac appInstance, TransferTimingPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.FIXEDLATENCYCHARACTERISTIC.getLeafIndex())) {
            if (appInstance.fixedLatencyCharacteristic() == null
                        ||
                        !(fixedLatencyCharacteristic()
            .equals(appInstance.fixedLatencyCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.FIXEDLATENCYCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.fixedLatencyCharacteristic(fixedLatencyCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.fixedLatencyCharacteristic(appInstance.fixedLatencyCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .FIXEDLATENCYCHARACTERISTIC.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.fixedLatencyCharacteristic(appInstance.fixedLatencyCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.JITTERCHARACTERISTIC.getLeafIndex())) {
             if (appInstance.jitterCharacteristic() == null
                        || !(jitterCharacteristic()
            .equals(appInstance.jitterCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.JITTERCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.jitterCharacteristic(jitterCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.jitterCharacteristic(appInstance.jitterCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.JITTERCHARACTERISTIC
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.jitterCharacteristic(appInstance.jitterCharacteristic());
        }

        if (valueLeafFlags.get(LeafIdentifier.WANDERCHARACTERISTIC.getLeafIndex())) {
             if (appInstance.wanderCharacteristic() == null
                        || !(wanderCharacteristic()
            .equals(appInstance.wanderCharacteristic()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.WANDERCHARACTERISTIC)) {
                    subTreeFilteringResultBuilder.wanderCharacteristic(wanderCharacteristic());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.wanderCharacteristic(appInstance.wanderCharacteristic());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.WANDERCHARACTERISTIC
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.wanderCharacteristic(appInstance.wanderCharacteristic());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TransferTimingPac appInstance, TransferTimingPacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.queuingLatencyList() != null) {
                for (QueuingLatencyList queuingLatencyList : appInstance.queuingLatencyList()) {
                    QueuingLatencyList result;
                    result = ((DefaultQueuingLatencyList) DefaultQueuingLatencyList.builder()
                            .buildForFilter()).processSubtreeFiltering(queuingLatencyList, true);
                    subTreeFilteringResultBuilder.addToQueuingLatencyList(result);
                }
            } else {
                if (isSubTreeFiltered && queuingLatencyList() != null) {
                    subTreeFilteringResultBuilder.queuingLatencyList(queuingLatencyList);
                }
            }
        } else if (queuingLatencyList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!queuingLatencyList().isEmpty()) {
                if (appInstance.queuingLatencyList() != null && !appInstance.queuingLatencyList().isEmpty()) {
                for (QueuingLatencyList queuingLatencyList : queuingLatencyList()) {
                    for (QueuingLatencyList queuingLatencyList2 : appInstance.queuingLatencyList()) {
                            QueuingLatencyList result = ((DefaultQueuingLatencyList) queuingLatencyList)
                            .processSubtreeFiltering(queuingLatencyList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToQueuingLatencyList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && queuingLatencyList() != null) {
                    subTreeFilteringResultBuilder.queuingLatencyList(queuingLatencyList);
                }
            }
            } else {
                if (appInstance.queuingLatencyList() != null && !appInstance.queuingLatencyList().isEmpty()) {
                for (QueuingLatencyList queuingLatencyList : appInstance.queuingLatencyList()) {
                        subTreeFilteringResultBuilder.addToQueuingLatencyList(queuingLatencyList);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTransferTimingPac.
     */
    protected DefaultTransferTimingPac() {
    }

    /**
     * Returns the attribute transferTimingPacBuilder.
     *
     * @return transferTimingPacBuilder
     */
    public static TransferTimingPacBuilder builder() {
        return new TransferTimingPacBuilder();
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
     * Represents the builder implementation of transferTimingPac.
     */
    public static class TransferTimingPacBuilder implements TransferTimingPac.TransferTimingPacBuilder {
        protected String fixedLatencyCharacteristic;
        protected String jitterCharacteristic;
        protected String wanderCharacteristic;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTransferTimingPacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<QueuingLatencyList> queuingLatencyList;



        @Override
        public String fixedLatencyCharacteristic() {
            return fixedLatencyCharacteristic;
        }

        @Override
        public String jitterCharacteristic() {
            return jitterCharacteristic;
        }

        @Override
        public String wanderCharacteristic() {
            return wanderCharacteristic;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTransferTimingPacOpType() {
            return yangTransferTimingPacOpType;
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
        public List<QueuingLatencyList> queuingLatencyList() {
            return queuingLatencyList;
        }

        @Override
        public TransferTimingPacBuilder fixedLatencyCharacteristic(String fixedLatencyCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.FIXEDLATENCYCHARACTERISTIC.getLeafIndex());
            this.fixedLatencyCharacteristic = fixedLatencyCharacteristic;
            return this;
        }

        @Override
        public TransferTimingPacBuilder jitterCharacteristic(String jitterCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.JITTERCHARACTERISTIC.getLeafIndex());
            this.jitterCharacteristic = jitterCharacteristic;
            return this;
        }

        @Override
        public TransferTimingPacBuilder wanderCharacteristic(String wanderCharacteristic) {
            valueLeafFlags.set(LeafIdentifier.WANDERCHARACTERISTIC.getLeafIndex());
            this.wanderCharacteristic = wanderCharacteristic;
            return this;
        }

        @Override
        public TransferTimingPacBuilder yangTransferTimingPacOpType(OnosYangOpType yangTransferTimingPacOpType) {
            this.yangTransferTimingPacOpType = yangTransferTimingPacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TransferTimingPacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TransferTimingPacBuilder queuingLatencyList(List<QueuingLatencyList> queuingLatencyList) {
            this.queuingLatencyList = queuingLatencyList;
            return this;
        }

        @Override
        public TransferTimingPacBuilder addToQueuingLatencyList(QueuingLatencyList addTo) {
            if (queuingLatencyList == null) {
                queuingLatencyList = new ArrayList<>();
            }
            queuingLatencyList.add(addTo);
            return this;
        }


        @Override
        public TransferTimingPacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TransferTimingPacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TransferTimingPac build() {
            return new DefaultTransferTimingPac(this);
        }

        /**
         * Builds object of transferTimingPac.
         *
         * @return transferTimingPac
         */
        public TransferTimingPac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTransferTimingPac(this);
        }
        /**
         * Creates an instance of transferTimingPacBuilder.
         */
        public TransferTimingPacBuilder() {
        }

    }
}
