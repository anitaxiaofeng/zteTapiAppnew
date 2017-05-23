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
            .gtapinotification;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Represents the implementation of stateChangeList.
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
public class DefaultStateChangeList implements StateChangeList {
    protected String stateName;
    protected String newStateValue;
    protected String oldStateValue;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangStateChangeListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public String stateName() {
        return stateName;
    }

    @Override
    public String newStateValue() {
        return newStateValue;
    }

    @Override
    public String oldStateValue() {
        return oldStateValue;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangStateChangeListOpType() {
        return yangStateChangeListOpType;
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
         return Objects.hash(stateName, newStateValue, oldStateValue, valueLeafFlags, yangStateChangeListOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultStateChangeList) {
            DefaultStateChangeList other = (DefaultStateChangeList) obj;
            return
                Objects.equals(stateName, other.stateName) &&
                Objects.equals(newStateValue, other.newStateValue) &&
                Objects.equals(oldStateValue, other.oldStateValue) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangStateChangeListOpType,
                 other.yangStateChangeListOpType) &&
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
            .add("stateName", stateName)
            .add("newStateValue", newStateValue)
            .add("oldStateValue", oldStateValue)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangStateChangeListOpType", yangStateChangeListOpType)
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
     * Creates an instance of stateChangeList.
     *
     * @param builderObject value of builder object of stateChangeList
     */
    protected DefaultStateChangeList(StateChangeListBuilder builderObject) {
        stateName = builderObject.stateName();
        newStateValue = builderObject.newStateValue();
        oldStateValue = builderObject.oldStateValue();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangStateChangeListOpType = builderObject.yangStateChangeListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed StateChangeList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultStateChangeList processSubtreeFiltering(StateChangeList appInstance, boolean
                isSelectAllSchemaChild) {
        StateChangeListBuilder subTreeFilteringResultBuilder = new StateChangeListBuilder();
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
        return (DefaultStateChangeList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(StateChangeList appInstance, StateChangeListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.STATENAME.getLeafIndex())) {
            if (appInstance.stateName() == null || !(stateName().equals(appInstance.stateName()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.STATENAME)) {
                    subTreeFilteringResultBuilder.stateName(stateName());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.stateName(appInstance.stateName());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.STATENAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.stateName(appInstance.stateName());
        }

        if (valueLeafFlags.get(LeafIdentifier.NEWSTATEVALUE.getLeafIndex())) {
            if (appInstance.newStateValue() == null || !(newStateValue().equals(appInstance.newStateValue()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.NEWSTATEVALUE)) {
                    subTreeFilteringResultBuilder.newStateValue(newStateValue());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.newStateValue(appInstance.newStateValue());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.NEWSTATEVALUE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.newStateValue(appInstance.newStateValue());
        }

        if (valueLeafFlags.get(LeafIdentifier.OLDSTATEVALUE.getLeafIndex())) {
            if (appInstance.oldStateValue() == null || !(oldStateValue().equals(appInstance.oldStateValue()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.OLDSTATEVALUE)) {
                    subTreeFilteringResultBuilder.oldStateValue(oldStateValue());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.oldStateValue(appInstance.oldStateValue());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.OLDSTATEVALUE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.oldStateValue(appInstance.oldStateValue());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(StateChangeList appInstance, StateChangeListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultStateChangeList.
     */
    protected DefaultStateChangeList() {
    }

    /**
     * Returns the attribute stateChangeListBuilder.
     *
     * @return stateChangeListBuilder
     */
    public static StateChangeListBuilder builder() {
        return new StateChangeListBuilder();
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
     * Represents the builder implementation of stateChangeList.
     */
    public static class StateChangeListBuilder implements StateChangeList.StateChangeListBuilder {
        protected String stateName;
        protected String newStateValue;
        protected String oldStateValue;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangStateChangeListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public String stateName() {
            return stateName;
        }

        @Override
        public String newStateValue() {
            return newStateValue;
        }

        @Override
        public String oldStateValue() {
            return oldStateValue;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangStateChangeListOpType() {
            return yangStateChangeListOpType;
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
        public StateChangeListBuilder stateName(String stateName) {
            valueLeafFlags.set(LeafIdentifier.STATENAME.getLeafIndex());
            this.stateName = stateName;
            return this;
        }

        @Override
        public StateChangeListBuilder newStateValue(String newStateValue) {
            valueLeafFlags.set(LeafIdentifier.NEWSTATEVALUE.getLeafIndex());
            this.newStateValue = newStateValue;
            return this;
        }

        @Override
        public StateChangeListBuilder oldStateValue(String oldStateValue) {
            valueLeafFlags.set(LeafIdentifier.OLDSTATEVALUE.getLeafIndex());
            this.oldStateValue = oldStateValue;
            return this;
        }

        @Override
        public StateChangeListBuilder yangStateChangeListOpType(OnosYangOpType yangStateChangeListOpType) {
            this.yangStateChangeListOpType = yangStateChangeListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public StateChangeListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public StateChangeListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public StateChangeListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public StateChangeList build() {
            return new DefaultStateChangeList(this);
        }

        /**
         * Builds object of stateChangeList.
         *
         * @return stateChangeList
         */
        public StateChangeList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultStateChangeList(this);
        }
        /**
         * Creates an instance of stateChangeListBuilder.
         */
        public StateChangeListBuilder() {
        }

    }
}
