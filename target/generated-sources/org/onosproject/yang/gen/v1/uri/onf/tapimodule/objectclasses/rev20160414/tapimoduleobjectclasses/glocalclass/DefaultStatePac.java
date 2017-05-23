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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .AdministrativeControl;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .AdministrativeState;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .LifecycleState;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .OperationalState;

/**
 * Represents the implementation of statePac.
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
public class DefaultStatePac implements StatePac {
    protected OperationalState operationalState;
    protected AdministrativeControl administrativeControl;
    protected AdministrativeState adminsatratveState;
    protected LifecycleState lifecycleState;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangStatePacOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public OperationalState operationalState() {
        return operationalState;
    }

    @Override
    public AdministrativeControl administrativeControl() {
        return administrativeControl;
    }

    @Override
    public AdministrativeState adminsatratveState() {
        return adminsatratveState;
    }

    @Override
    public LifecycleState lifecycleState() {
        return lifecycleState;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangStatePacOpType() {
        return yangStatePacOpType;
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
         return Objects.hash(operationalState, administrativeControl, adminsatratveState, lifecycleState,
                    valueLeafFlags, yangStatePacOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultStatePac) {
            DefaultStatePac other = (DefaultStatePac) obj;
            return
                Objects.equals(operationalState, other.operationalState) &&
                Objects.equals(administrativeControl, other.administrativeControl) &&
                Objects.equals(adminsatratveState, other.adminsatratveState) &&
                Objects.equals(lifecycleState, other.lifecycleState) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangStatePacOpType,
                 other.yangStatePacOpType) &&
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
            .add("operationalState", operationalState)
            .add("administrativeControl", administrativeControl)
            .add("adminsatratveState", adminsatratveState)
            .add("lifecycleState", lifecycleState)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangStatePacOpType", yangStatePacOpType)
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
     * Creates an instance of statePac.
     *
     * @param builderObject value of builder object of statePac
     */
    protected DefaultStatePac(StatePacBuilder builderObject) {
        operationalState = builderObject.operationalState();
        administrativeControl = builderObject.administrativeControl();
        adminsatratveState = builderObject.adminsatratveState();
        lifecycleState = builderObject.lifecycleState();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangStatePacOpType = builderObject.yangStatePacOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed StatePac maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultStatePac processSubtreeFiltering(StatePac appInstance, boolean isSelectAllSchemaChild) {
        StatePacBuilder subTreeFilteringResultBuilder = new StatePacBuilder();
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
        return (DefaultStatePac) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(StatePac appInstance, StatePacBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.OPERATIONALSTATE.getLeafIndex())) {
             if (appInstance.operationalState() == null
                        || !(operationalState()
            .equals(appInstance.operationalState()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.OPERATIONALSTATE)) {
                    subTreeFilteringResultBuilder.operationalState(operationalState());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.operationalState(appInstance.operationalState());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.OPERATIONALSTATE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.operationalState(appInstance.operationalState());
        }

        if (valueLeafFlags.get(LeafIdentifier.ADMINISTRATIVECONTROL.getLeafIndex())) {
             if (appInstance.administrativeControl() == null
                        || !(administrativeControl()
            .equals(appInstance.administrativeControl()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ADMINISTRATIVECONTROL)) {
                    subTreeFilteringResultBuilder.administrativeControl(administrativeControl());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.administrativeControl(appInstance.administrativeControl());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.ADMINISTRATIVECONTROL
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.administrativeControl(appInstance.administrativeControl());
        }

        if (valueLeafFlags.get(LeafIdentifier.ADMINSATRATVESTATE.getLeafIndex())) {
             if (appInstance.adminsatratveState() == null
                        || !(adminsatratveState()
            .equals(appInstance.adminsatratveState()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ADMINSATRATVESTATE)) {
                    subTreeFilteringResultBuilder.adminsatratveState(adminsatratveState());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.adminsatratveState(appInstance.adminsatratveState());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.ADMINSATRATVESTATE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.adminsatratveState(appInstance.adminsatratveState());
        }

        if (valueLeafFlags.get(LeafIdentifier.LIFECYCLESTATE.getLeafIndex())) {
            if (appInstance.lifecycleState() == null || !(lifecycleState().equals(appInstance.lifecycleState()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LIFECYCLESTATE)) {
                    subTreeFilteringResultBuilder.lifecycleState(lifecycleState());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.lifecycleState(appInstance.lifecycleState());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LIFECYCLESTATE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.lifecycleState(appInstance.lifecycleState());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(StatePac appInstance, StatePacBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultStatePac.
     */
    protected DefaultStatePac() {
    }

    /**
     * Returns the attribute statePacBuilder.
     *
     * @return statePacBuilder
     */
    public static StatePacBuilder builder() {
        return new StatePacBuilder();
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
     * Represents the builder implementation of statePac.
     */
    public static class StatePacBuilder implements StatePac.StatePacBuilder {
        protected OperationalState operationalState;
        protected AdministrativeControl administrativeControl;
        protected AdministrativeState adminsatratveState;
        protected LifecycleState lifecycleState;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangStatePacOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public OperationalState operationalState() {
            return operationalState;
        }

        @Override
        public AdministrativeControl administrativeControl() {
            return administrativeControl;
        }

        @Override
        public AdministrativeState adminsatratveState() {
            return adminsatratveState;
        }

        @Override
        public LifecycleState lifecycleState() {
            return lifecycleState;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangStatePacOpType() {
            return yangStatePacOpType;
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
        public StatePacBuilder operationalState(OperationalState operationalState) {
            valueLeafFlags.set(LeafIdentifier.OPERATIONALSTATE.getLeafIndex());
            this.operationalState = operationalState;
            return this;
        }

        @Override
        public StatePacBuilder administrativeControl(AdministrativeControl administrativeControl) {
            valueLeafFlags.set(LeafIdentifier.ADMINISTRATIVECONTROL.getLeafIndex());
            this.administrativeControl = administrativeControl;
            return this;
        }

        @Override
        public StatePacBuilder adminsatratveState(AdministrativeState adminsatratveState) {
            valueLeafFlags.set(LeafIdentifier.ADMINSATRATVESTATE.getLeafIndex());
            this.adminsatratveState = adminsatratveState;
            return this;
        }

        @Override
        public StatePacBuilder lifecycleState(LifecycleState lifecycleState) {
            valueLeafFlags.set(LeafIdentifier.LIFECYCLESTATE.getLeafIndex());
            this.lifecycleState = lifecycleState;
            return this;
        }

        @Override
        public StatePacBuilder yangStatePacOpType(OnosYangOpType yangStatePacOpType) {
            this.yangStatePacOpType = yangStatePacOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public StatePacBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public StatePacBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public StatePacBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public StatePac build() {
            return new DefaultStatePac(this);
        }

        /**
         * Builds object of statePac.
         *
         * @return statePac
         */
        public StatePac buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultStatePac(this);
        }
        /**
         * Creates an instance of statePacBuilder.
         */
        public StatePacBuilder() {
        }

    }
}
