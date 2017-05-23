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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapipath;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;

/**
 * Represents the implementation of pathElementList.
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
public class DefaultPathElementList implements PathElementList {
    protected Object nodeRef;
    protected Object linkPortRef;
    protected Object linkRef;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangPathElementListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();

    @Override
    public Object nodeRef() {
        return nodeRef;
    }

    @Override
    public Object linkPortRef() {
        return linkPortRef;
    }

    @Override
    public Object linkRef() {
        return linkRef;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangPathElementListOpType() {
        return yangPathElementListOpType;
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
         return Objects.hash(nodeRef, linkPortRef, linkRef, valueLeafFlags, yangPathElementListOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultPathElementList) {
            DefaultPathElementList other = (DefaultPathElementList) obj;
            return
                Objects.equals(nodeRef, other.nodeRef) &&
                Objects.equals(linkPortRef, other.linkPortRef) &&
                Objects.equals(linkRef, other.linkRef) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangPathElementListOpType,
                 other.yangPathElementListOpType) &&
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
            .add("nodeRef", nodeRef)
            .add("linkPortRef", linkPortRef)
            .add("linkRef", linkRef)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangPathElementListOpType", yangPathElementListOpType)
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
     * Creates an instance of pathElementList.
     *
     * @param builderObject value of builder object of pathElementList
     */
    protected DefaultPathElementList(PathElementListBuilder builderObject) {
        nodeRef = builderObject.nodeRef();
        linkPortRef = builderObject.linkPortRef();
        linkRef = builderObject.linkRef();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangPathElementListOpType = builderObject.yangPathElementListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    /**
     * Checks if the passed PathElementList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultPathElementList processSubtreeFiltering(PathElementList appInstance, boolean
                isSelectAllSchemaChild) {
        PathElementListBuilder subTreeFilteringResultBuilder = new PathElementListBuilder();
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
        return (DefaultPathElementList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(PathElementList appInstance, PathElementListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.NODEREF.getLeafIndex())) {
            if (appInstance.nodeRef() == null || !(nodeRef().equals(appInstance.nodeRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.NODEREF)) {
                    subTreeFilteringResultBuilder.nodeRef(nodeRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.nodeRef(appInstance.nodeRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.NODEREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.nodeRef(appInstance.nodeRef());
        }

        if (valueLeafFlags.get(LeafIdentifier.LINKPORTREF.getLeafIndex())) {
            if (appInstance.linkPortRef() == null || !(linkPortRef().equals(appInstance.linkPortRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LINKPORTREF)) {
                    subTreeFilteringResultBuilder.linkPortRef(linkPortRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.linkPortRef(appInstance.linkPortRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LINKPORTREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.linkPortRef(appInstance.linkPortRef());
        }

        if (valueLeafFlags.get(LeafIdentifier.LINKREF.getLeafIndex())) {
            if (appInstance.linkRef() == null || !(linkRef().equals(appInstance.linkRef()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LINKREF)) {
                    subTreeFilteringResultBuilder.linkRef(linkRef());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.linkRef(appInstance.linkRef());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LINKREF.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.linkRef(appInstance.linkRef());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(PathElementList appInstance, PathElementListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of defaultPathElementList.
     */
    protected DefaultPathElementList() {
    }

    /**
     * Returns the attribute pathElementListBuilder.
     *
     * @return pathElementListBuilder
     */
    public static PathElementListBuilder builder() {
        return new PathElementListBuilder();
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
     * Represents the builder implementation of pathElementList.
     */
    public static class PathElementListBuilder implements PathElementList.PathElementListBuilder {
        protected Object nodeRef;
        protected Object linkPortRef;
        protected Object linkRef;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangPathElementListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();



        @Override
        public Object nodeRef() {
            return nodeRef;
        }

        @Override
        public Object linkPortRef() {
            return linkPortRef;
        }

        @Override
        public Object linkRef() {
            return linkRef;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangPathElementListOpType() {
            return yangPathElementListOpType;
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
        public PathElementListBuilder nodeRef(Object nodeRef) {
            valueLeafFlags.set(LeafIdentifier.NODEREF.getLeafIndex());
            this.nodeRef = nodeRef;
            return this;
        }

        @Override
        public PathElementListBuilder linkPortRef(Object linkPortRef) {
            valueLeafFlags.set(LeafIdentifier.LINKPORTREF.getLeafIndex());
            this.linkPortRef = linkPortRef;
            return this;
        }

        @Override
        public PathElementListBuilder linkRef(Object linkRef) {
            valueLeafFlags.set(LeafIdentifier.LINKREF.getLeafIndex());
            this.linkRef = linkRef;
            return this;
        }

        @Override
        public PathElementListBuilder yangPathElementListOpType(OnosYangOpType yangPathElementListOpType) {
            this.yangPathElementListOpType = yangPathElementListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public PathElementListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public PathElementListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public PathElementListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public PathElementList build() {
            return new DefaultPathElementList(this);
        }

        /**
         * Builds object of pathElementList.
         *
         * @return pathElementList
         */
        public PathElementList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultPathElementList(this);
        }
        /**
         * Creates an instance of pathElementListBuilder.
         */
        public PathElementListBuilder() {
        }

    }
}
