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
            .gtapiconnection;

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
            .gtapiconstraints.CommonConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconstraints.DefaultCommonConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconstraints.DefaultPathConstraintsList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconstraints.PathConstraintsList;

/**
 * Represents the implementation of routingConstraints.
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
public class DefaultRoutingConstraints implements RoutingConstraints {
    protected OnosYangOpType yangRoutingConstraintsOpType;
    protected boolean isSubTreeFiltered;
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected CommonConstraints commonConstraints;
    protected List<PathConstraintsList> pathConstraintsList;

    @Override
    public OnosYangOpType yangRoutingConstraintsOpType() {
        return yangRoutingConstraintsOpType;
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
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public CommonConstraints commonConstraints() {
        return commonConstraints;
    }

    @Override
    public List<PathConstraintsList> pathConstraintsList() {
        return pathConstraintsList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangRoutingConstraintsOpType, isSubTreeFiltered, yangAugmentedInfoMap, commonConstraints,
                    pathConstraintsList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRoutingConstraints) {
            DefaultRoutingConstraints other = (DefaultRoutingConstraints) obj;
            return
                Objects
                .equals(yangRoutingConstraintsOpType,
                 other.yangRoutingConstraintsOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(commonConstraints, other.commonConstraints) &&
                Objects.equals(pathConstraintsList, other.pathConstraintsList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangRoutingConstraintsOpType", yangRoutingConstraintsOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("commonConstraints", commonConstraints)
            .add("pathConstraintsList", pathConstraintsList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of routingConstraints.
     *
     * @param builderObject value of builder object of routingConstraints
     */
    protected DefaultRoutingConstraints(RoutingConstraintsBuilder builderObject) {
        yangRoutingConstraintsOpType = builderObject.yangRoutingConstraintsOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        commonConstraints = builderObject.commonConstraints();
        pathConstraintsList = builderObject.pathConstraintsList();
    }

    /**
     * Checks if the passed RoutingConstraints maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultRoutingConstraints processSubtreeFiltering(RoutingConstraints appInstance, boolean
                isSelectAllSchemaChild) {
        RoutingConstraintsBuilder subTreeFilteringResultBuilder = new RoutingConstraintsBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
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
        return (DefaultRoutingConstraints) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processChildNodesSubTreeFiltering(RoutingConstraints appInstance, RoutingConstraintsBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (commonConstraints() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.commonConstraints() != null) {
                CommonConstraints result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultCommonConstraints) DefaultCommonConstraints.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.commonConstraints(), true);
                } else {
                    result = ((DefaultCommonConstraints) commonConstraints)
                            .processSubtreeFiltering(appInstance.commonConstraints(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.commonConstraints(result);
                }
            } else {
                if (isSubTreeFiltered && commonConstraints() != null) {
                    subTreeFilteringResultBuilder.commonConstraints(commonConstraints);
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.pathConstraintsList() != null) {
                for (PathConstraintsList pathConstraintsList : appInstance.pathConstraintsList()) {
                    PathConstraintsList result;
                    result = ((DefaultPathConstraintsList) DefaultPathConstraintsList.builder()
                            .buildForFilter()).processSubtreeFiltering(pathConstraintsList, true);
                    subTreeFilteringResultBuilder.addToPathConstraintsList(result);
                }
            } else {
                if (isSubTreeFiltered && pathConstraintsList() != null) {
                    subTreeFilteringResultBuilder.pathConstraintsList(pathConstraintsList);
                }
            }
        } else if (pathConstraintsList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!pathConstraintsList().isEmpty()) {
                if (appInstance.pathConstraintsList() != null && !appInstance.pathConstraintsList().isEmpty()) {
                for (PathConstraintsList pathConstraintsList : pathConstraintsList()) {
                    for (PathConstraintsList pathConstraintsList2 : appInstance.pathConstraintsList()) {
                            PathConstraintsList result = ((DefaultPathConstraintsList) pathConstraintsList)
                            .processSubtreeFiltering(pathConstraintsList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToPathConstraintsList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && pathConstraintsList() != null) {
                    subTreeFilteringResultBuilder.pathConstraintsList(pathConstraintsList);
                }
            }
            } else {
                if (appInstance.pathConstraintsList() != null && !appInstance.pathConstraintsList().isEmpty()) {
                for (PathConstraintsList pathConstraintsList : appInstance.pathConstraintsList()) {
                        subTreeFilteringResultBuilder.addToPathConstraintsList(pathConstraintsList);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultRoutingConstraints.
     */
    protected DefaultRoutingConstraints() {
    }

    /**
     * Returns the attribute routingConstraintsBuilder.
     *
     * @return routingConstraintsBuilder
     */
    public static RoutingConstraintsBuilder builder() {
        return new RoutingConstraintsBuilder();
    }

    /**
     * Represents the builder implementation of routingConstraints.
     */
    public static class RoutingConstraintsBuilder implements RoutingConstraints.RoutingConstraintsBuilder {
        protected OnosYangOpType yangRoutingConstraintsOpType;
        protected boolean isSubTreeFiltered;
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected CommonConstraints commonConstraints;
        protected List<PathConstraintsList> pathConstraintsList;


        @Override
        public OnosYangOpType yangRoutingConstraintsOpType() {
            return yangRoutingConstraintsOpType;
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
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public CommonConstraints commonConstraints() {
            return commonConstraints;
        }

        @Override
        public List<PathConstraintsList> pathConstraintsList() {
            return pathConstraintsList;
        }

        @Override
        public RoutingConstraintsBuilder yangRoutingConstraintsOpType(OnosYangOpType yangRoutingConstraintsOpType) {
            this.yangRoutingConstraintsOpType = yangRoutingConstraintsOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public RoutingConstraintsBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public RoutingConstraintsBuilder commonConstraints(CommonConstraints commonConstraints) {
            this.commonConstraints = commonConstraints;
            return this;
        }

        @Override
        public RoutingConstraintsBuilder pathConstraintsList(List<PathConstraintsList> pathConstraintsList) {
            this.pathConstraintsList = pathConstraintsList;
            return this;
        }

        @Override
        public RoutingConstraintsBuilder addToPathConstraintsList(PathConstraintsList addTo) {
            if (pathConstraintsList == null) {
                pathConstraintsList = new ArrayList<>();
            }
            pathConstraintsList.add(addTo);
            return this;
        }


        @Override
        public RoutingConstraintsBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public RoutingConstraints build() {
            return new DefaultRoutingConstraints(this);
        }

        /**
         * Builds object of routingConstraints.
         *
         * @return routingConstraints
         */
        public RoutingConstraints buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultRoutingConstraints(this);
        }
        /**
         * Creates an instance of routingConstraintsBuilder.
         */
        public RoutingConstraintsBuilder() {
        }

    }
}
