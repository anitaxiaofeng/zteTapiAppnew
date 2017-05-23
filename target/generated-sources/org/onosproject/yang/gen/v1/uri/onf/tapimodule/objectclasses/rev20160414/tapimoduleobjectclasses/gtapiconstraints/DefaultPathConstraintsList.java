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
            .gtapiconstraints;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.DefaultExcludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.DefaultExplicitPath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.DefaultIncludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.ExcludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.ExplicitPath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapipathconstraints.IncludePath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiPathProtType;

/**
 * Represents the implementation of pathConstraintsList.
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
public class DefaultPathConstraintsList implements PathConstraintsList {
    protected String localId;
    protected TapiPathProtType pathProtType;
    protected Integer pathCost;
    protected Integer pathLatency;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangPathConstraintsListOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<IncludePath> includePath;
    protected List<ExcludePath> excludePath;
    protected List<ExplicitPath> explicitPath;

    @Override
    public String localId() {
        return localId;
    }

    @Override
    public TapiPathProtType pathProtType() {
        return pathProtType;
    }

    @Override
    public Integer pathCost() {
        return pathCost;
    }

    @Override
    public Integer pathLatency() {
        return pathLatency;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangPathConstraintsListOpType() {
        return yangPathConstraintsListOpType;
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
    public List<IncludePath> includePath() {
        return includePath;
    }

    @Override
    public List<ExcludePath> excludePath() {
        return excludePath;
    }

    @Override
    public List<ExplicitPath> explicitPath() {
        return explicitPath;
    }

    @Override
    public int hashCode() {
         return Objects.hash(localId, pathProtType, pathCost, pathLatency, valueLeafFlags,
                    yangPathConstraintsListOpType, isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap,
                    includePath, excludePath, explicitPath);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultPathConstraintsList) {
            DefaultPathConstraintsList other = (DefaultPathConstraintsList) obj;
            return
                Objects.equals(localId, other.localId) &&
                Objects.equals(pathProtType, other.pathProtType) &&
                Objects.equals(pathCost, other.pathCost) &&
                Objects.equals(pathLatency, other.pathLatency) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangPathConstraintsListOpType,
                 other.yangPathConstraintsListOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(includePath, other.includePath) &&
                Objects.equals(excludePath, other.excludePath) &&
                Objects.equals(explicitPath, other.explicitPath);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("localId", localId)
            .add("pathProtType", pathProtType)
            .add("pathCost", pathCost)
            .add("pathLatency", pathLatency)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangPathConstraintsListOpType", yangPathConstraintsListOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("includePath", includePath)
            .add("excludePath", excludePath)
            .add("explicitPath", explicitPath)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of pathConstraintsList.
     *
     * @param builderObject value of builder object of pathConstraintsList
     */
    protected DefaultPathConstraintsList(PathConstraintsListBuilder builderObject) {
        localId = builderObject.localId();
        pathProtType = builderObject.pathProtType();
        pathCost = builderObject.pathCost();
        pathLatency = builderObject.pathLatency();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangPathConstraintsListOpType = builderObject.yangPathConstraintsListOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        includePath = builderObject.includePath();
        excludePath = builderObject.excludePath();
        explicitPath = builderObject.explicitPath();
    }

    /**
     * Checks if the passed PathConstraintsList maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultPathConstraintsList processSubtreeFiltering(PathConstraintsList appInstance, boolean
                isSelectAllSchemaChild) {
        PathConstraintsListBuilder subTreeFilteringResultBuilder = new PathConstraintsListBuilder();
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
        return (DefaultPathConstraintsList) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(PathConstraintsList appInstance, PathConstraintsListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.LOCALID.getLeafIndex())) {
            if (appInstance.localId() == null || !(localId().equals(appInstance.localId()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.LOCALID)) {
                    subTreeFilteringResultBuilder.localId(localId());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.localId(appInstance.localId());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.LOCALID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.localId(appInstance.localId());
        }

        if (valueLeafFlags.get(LeafIdentifier.PATHPROTTYPE.getLeafIndex())) {
            if (appInstance.pathProtType() == null || !(pathProtType().equals(appInstance.pathProtType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PATHPROTTYPE)) {
                    subTreeFilteringResultBuilder.pathProtType(pathProtType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.pathProtType(appInstance.pathProtType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PATHPROTTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.pathProtType(appInstance.pathProtType());
        }

        if (valueLeafFlags.get(LeafIdentifier.PATHCOST.getLeafIndex())) {
            if (appInstance.pathCost() == null || !(pathCost().equals(appInstance.pathCost()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PATHCOST)) {
                    subTreeFilteringResultBuilder.pathCost(pathCost());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.pathCost(appInstance.pathCost());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PATHCOST.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.pathCost(appInstance.pathCost());
        }

        if (valueLeafFlags.get(LeafIdentifier.PATHLATENCY.getLeafIndex())) {
            if (appInstance.pathLatency() == null || !(pathLatency().equals(appInstance.pathLatency()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.PATHLATENCY)) {
                    subTreeFilteringResultBuilder.pathLatency(pathLatency());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.pathLatency(appInstance.pathLatency());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.PATHLATENCY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.pathLatency(appInstance.pathLatency());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(PathConstraintsList appInstance, PathConstraintsListBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.includePath() != null) {
                for (IncludePath includePath : appInstance.includePath()) {
                    IncludePath result;
                    result = ((DefaultIncludePath) DefaultIncludePath.builder()
                            .buildForFilter()).processSubtreeFiltering(includePath, true);
                    subTreeFilteringResultBuilder.addToIncludePath(result);
                }
            } else {
                if (isSubTreeFiltered && includePath() != null) {
                    subTreeFilteringResultBuilder.includePath(includePath);
                }
            }
        } else if (includePath() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!includePath().isEmpty()) {
                if (appInstance.includePath() != null && !appInstance.includePath().isEmpty()) {
                for (IncludePath includePath : includePath()) {
                    for (IncludePath includePath2 : appInstance.includePath()) {
                            IncludePath result = ((DefaultIncludePath) includePath)
                            .processSubtreeFiltering(includePath2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToIncludePath(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && includePath() != null) {
                    subTreeFilteringResultBuilder.includePath(includePath);
                }
            }
            } else {
                if (appInstance.includePath() != null && !appInstance.includePath().isEmpty()) {
                for (IncludePath includePath : appInstance.includePath()) {
                        subTreeFilteringResultBuilder.addToIncludePath(includePath);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.excludePath() != null) {
                for (ExcludePath excludePath : appInstance.excludePath()) {
                    ExcludePath result;
                    result = ((DefaultExcludePath) DefaultExcludePath.builder()
                            .buildForFilter()).processSubtreeFiltering(excludePath, true);
                    subTreeFilteringResultBuilder.addToExcludePath(result);
                }
            } else {
                if (isSubTreeFiltered && excludePath() != null) {
                    subTreeFilteringResultBuilder.excludePath(excludePath);
                }
            }
        } else if (excludePath() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!excludePath().isEmpty()) {
                if (appInstance.excludePath() != null && !appInstance.excludePath().isEmpty()) {
                for (ExcludePath excludePath : excludePath()) {
                    for (ExcludePath excludePath2 : appInstance.excludePath()) {
                            ExcludePath result = ((DefaultExcludePath) excludePath)
                            .processSubtreeFiltering(excludePath2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToExcludePath(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && excludePath() != null) {
                    subTreeFilteringResultBuilder.excludePath(excludePath);
                }
            }
            } else {
                if (appInstance.excludePath() != null && !appInstance.excludePath().isEmpty()) {
                for (ExcludePath excludePath : appInstance.excludePath()) {
                        subTreeFilteringResultBuilder.addToExcludePath(excludePath);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.explicitPath() != null) {
                for (ExplicitPath explicitPath : appInstance.explicitPath()) {
                    ExplicitPath result;
                    result = ((DefaultExplicitPath) DefaultExplicitPath.builder()
                            .buildForFilter()).processSubtreeFiltering(explicitPath, true);
                    subTreeFilteringResultBuilder.addToExplicitPath(result);
                }
            } else {
                if (isSubTreeFiltered && explicitPath() != null) {
                    subTreeFilteringResultBuilder.explicitPath(explicitPath);
                }
            }
        } else if (explicitPath() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!explicitPath().isEmpty()) {
                if (appInstance.explicitPath() != null && !appInstance.explicitPath().isEmpty()) {
                for (ExplicitPath explicitPath : explicitPath()) {
                    for (ExplicitPath explicitPath2 : appInstance.explicitPath()) {
                            ExplicitPath result = ((DefaultExplicitPath) explicitPath)
                            .processSubtreeFiltering(explicitPath2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToExplicitPath(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && explicitPath() != null) {
                    subTreeFilteringResultBuilder.explicitPath(explicitPath);
                }
            }
            } else {
                if (appInstance.explicitPath() != null && !appInstance.explicitPath().isEmpty()) {
                for (ExplicitPath explicitPath : appInstance.explicitPath()) {
                        subTreeFilteringResultBuilder.addToExplicitPath(explicitPath);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultPathConstraintsList.
     */
    protected DefaultPathConstraintsList() {
    }

    /**
     * Returns the attribute pathConstraintsListBuilder.
     *
     * @return pathConstraintsListBuilder
     */
    public static PathConstraintsListBuilder builder() {
        return new PathConstraintsListBuilder();
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
     * Represents the builder implementation of pathConstraintsList.
     */
    public static class PathConstraintsListBuilder implements PathConstraintsList.PathConstraintsListBuilder {
        protected String localId;
        protected TapiPathProtType pathProtType;
        protected Integer pathCost;
        protected Integer pathLatency;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangPathConstraintsListOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<IncludePath> includePath;
        protected List<ExcludePath> excludePath;
        protected List<ExplicitPath> explicitPath;



        @Override
        public String localId() {
            return localId;
        }

        @Override
        public TapiPathProtType pathProtType() {
            return pathProtType;
        }

        @Override
        public Integer pathCost() {
            return pathCost;
        }

        @Override
        public Integer pathLatency() {
            return pathLatency;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangPathConstraintsListOpType() {
            return yangPathConstraintsListOpType;
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
        public List<IncludePath> includePath() {
            return includePath;
        }

        @Override
        public List<ExcludePath> excludePath() {
            return excludePath;
        }

        @Override
        public List<ExplicitPath> explicitPath() {
            return explicitPath;
        }

        @Override
        public PathConstraintsListBuilder localId(String localId) {
            valueLeafFlags.set(LeafIdentifier.LOCALID.getLeafIndex());
            this.localId = localId;
            return this;
        }

        @Override
        public PathConstraintsListBuilder pathProtType(TapiPathProtType pathProtType) {
            valueLeafFlags.set(LeafIdentifier.PATHPROTTYPE.getLeafIndex());
            this.pathProtType = pathProtType;
            return this;
        }

        @Override
        public PathConstraintsListBuilder pathCost(Integer pathCost) {
            valueLeafFlags.set(LeafIdentifier.PATHCOST.getLeafIndex());
            this.pathCost = pathCost;
            return this;
        }

        @Override
        public PathConstraintsListBuilder pathLatency(Integer pathLatency) {
            valueLeafFlags.set(LeafIdentifier.PATHLATENCY.getLeafIndex());
            this.pathLatency = pathLatency;
            return this;
        }

        @Override
        public PathConstraintsListBuilder yangPathConstraintsListOpType(OnosYangOpType
                    yangPathConstraintsListOpType) {
            this.yangPathConstraintsListOpType = yangPathConstraintsListOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public PathConstraintsListBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public PathConstraintsListBuilder includePath(List<IncludePath> includePath) {
            this.includePath = includePath;
            return this;
        }

        @Override
        public PathConstraintsListBuilder excludePath(List<ExcludePath> excludePath) {
            this.excludePath = excludePath;
            return this;
        }

        @Override
        public PathConstraintsListBuilder explicitPath(List<ExplicitPath> explicitPath) {
            this.explicitPath = explicitPath;
            return this;
        }

        @Override
        public PathConstraintsListBuilder addToIncludePath(IncludePath addTo) {
            if (includePath == null) {
                includePath = new ArrayList<>();
            }
            includePath.add(addTo);
            return this;
        }


        @Override
        public PathConstraintsListBuilder addToExcludePath(ExcludePath addTo) {
            if (excludePath == null) {
                excludePath = new ArrayList<>();
            }
            excludePath.add(addTo);
            return this;
        }


        @Override
        public PathConstraintsListBuilder addToExplicitPath(ExplicitPath addTo) {
            if (explicitPath == null) {
                explicitPath = new ArrayList<>();
            }
            explicitPath.add(addTo);
            return this;
        }


        @Override
        public PathConstraintsListBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public PathConstraintsListBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public PathConstraintsList build() {
            return new DefaultPathConstraintsList(this);
        }

        /**
         * Builds object of pathConstraintsList.
         *
         * @return pathConstraintsList
         */
        public PathConstraintsList buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultPathConstraintsList(this);
        }
        /**
         * Creates an instance of pathConstraintsListBuilder.
         */
        public PathConstraintsListBuilder() {
        }

    }
}
