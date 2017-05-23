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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultExtension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultLabel;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultLocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .DefaultStatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Extension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Label;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .LocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .Name;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gglobalclass
            .StatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapipath
            .DefaultPathElementList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapipath
            .PathElementList;

/**
 * Represents the implementation of tapiPath.
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
public class DefaultTapiPath implements TapiPath {
    protected Integer pathCost;
    protected Integer pathLatency;
    protected UniversalId uuid;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiPathOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<PathElementList> pathElementList;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public Integer pathCost() {
        return pathCost;
    }

    @Override
    public Integer pathLatency() {
        return pathLatency;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTapiPathOpType() {
        return yangTapiPathOpType;
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
    public List<PathElementList> pathElementList() {
        return pathElementList;
    }

    @Override
    public List<LocalIdList> localIdList() {
        return localIdList;
    }

    @Override
    public List<Name> name() {
        return name;
    }

    @Override
    public List<Label> label() {
        return label;
    }

    @Override
    public List<Extension> extension() {
        return extension;
    }

    @Override
    public StatePac statePac() {
        return statePac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathCost, pathLatency, uuid, valueLeafFlags, yangTapiPathOpType, isSubTreeFiltered,
                    selectLeafFlags, yangAugmentedInfoMap, pathElementList, localIdList, name, label, extension,
                    statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiPath) {
            DefaultTapiPath other = (DefaultTapiPath) obj;
            return
                Objects.equals(pathCost, other.pathCost) &&
                Objects.equals(pathLatency, other.pathLatency) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiPathOpType,
                 other.yangTapiPathOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(pathElementList, other.pathElementList) &&
                Objects.equals(localIdList, other.localIdList) &&
                Objects.equals(name, other.name) &&
                Objects.equals(label, other.label) &&
                Objects.equals(extension, other.extension) &&
                Objects.equals(statePac, other.statePac);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("pathCost", pathCost)
            .add("pathLatency", pathLatency)
            .add("uuid", uuid)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiPathOpType", yangTapiPathOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("pathElementList", pathElementList)
            .add("localIdList", localIdList)
            .add("name", name)
            .add("label", label)
            .add("extension", extension)
            .add("statePac", statePac)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of tapiPath.
     *
     * @param builderObject value of builder object of tapiPath
     */
    protected DefaultTapiPath(TapiPathBuilder builderObject) {
        pathCost = builderObject.pathCost();
        pathLatency = builderObject.pathLatency();
        uuid = builderObject.uuid();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiPathOpType = builderObject.yangTapiPathOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        pathElementList = builderObject.pathElementList();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed TapiPath maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiPath processSubtreeFiltering(TapiPath appInstance, boolean isSelectAllSchemaChild) {
        TapiPathBuilder subTreeFilteringResultBuilder = new TapiPathBuilder();
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
        return (DefaultTapiPath) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processLeafSubtreeFiltering(TapiPath appInstance, TapiPathBuilder subTreeFilteringResultBuilder,
                BitSet isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
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

        if (valueLeafFlags.get(LeafIdentifier.UUID.getLeafIndex())) {
            if (appInstance.uuid() == null || !(uuid().equals(appInstance.uuid()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.UUID)) {
                    subTreeFilteringResultBuilder.uuid(uuid());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.uuid(appInstance.uuid());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.UUID.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.uuid(appInstance.uuid());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiPath appInstance, TapiPathBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.pathElementList() != null) {
                for (PathElementList pathElementList : appInstance.pathElementList()) {
                    PathElementList result;
                    result = ((DefaultPathElementList) DefaultPathElementList.builder()
                            .buildForFilter()).processSubtreeFiltering(pathElementList, true);
                    subTreeFilteringResultBuilder.addToPathElementList(result);
                }
            } else {
                if (isSubTreeFiltered && pathElementList() != null) {
                    subTreeFilteringResultBuilder.pathElementList(pathElementList);
                }
            }
        } else if (pathElementList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!pathElementList().isEmpty()) {
                if (appInstance.pathElementList() != null && !appInstance.pathElementList().isEmpty()) {
                for (PathElementList pathElementList : pathElementList()) {
                    for (PathElementList pathElementList2 : appInstance.pathElementList()) {
                            PathElementList result = ((DefaultPathElementList) pathElementList)
                            .processSubtreeFiltering(pathElementList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToPathElementList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && pathElementList() != null) {
                    subTreeFilteringResultBuilder.pathElementList(pathElementList);
                }
            }
            } else {
                if (appInstance.pathElementList() != null && !appInstance.pathElementList().isEmpty()) {
                for (PathElementList pathElementList : appInstance.pathElementList()) {
                        subTreeFilteringResultBuilder.addToPathElementList(pathElementList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.localIdList() != null) {
                for (LocalIdList localIdList : appInstance.localIdList()) {
                    LocalIdList result;
                    result = ((DefaultLocalIdList) DefaultLocalIdList.builder()
                            .buildForFilter()).processSubtreeFiltering(localIdList, true);
                    subTreeFilteringResultBuilder.addToLocalIdList(result);
                }
            } else {
                if (isSubTreeFiltered && localIdList() != null) {
                    subTreeFilteringResultBuilder.localIdList(localIdList);
                }
            }
        } else if (localIdList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!localIdList().isEmpty()) {
                if (appInstance.localIdList() != null && !appInstance.localIdList().isEmpty()) {
                for (LocalIdList localIdList : localIdList()) {
                    for (LocalIdList localIdList2 : appInstance.localIdList()) {
                            LocalIdList result = ((DefaultLocalIdList) localIdList)
                            .processSubtreeFiltering(localIdList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLocalIdList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && localIdList() != null) {
                    subTreeFilteringResultBuilder.localIdList(localIdList);
                }
            }
            } else {
                if (appInstance.localIdList() != null && !appInstance.localIdList().isEmpty()) {
                for (LocalIdList localIdList : appInstance.localIdList()) {
                        subTreeFilteringResultBuilder.addToLocalIdList(localIdList);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.name() != null) {
                for (Name name : appInstance.name()) {
                    Name result;
                    result = ((DefaultName) DefaultName.builder()
                            .buildForFilter()).processSubtreeFiltering(name, true);
                    subTreeFilteringResultBuilder.addToName(result);
                }
            } else {
                if (isSubTreeFiltered && name() != null) {
                    subTreeFilteringResultBuilder.name(name);
                }
            }
        } else if (name() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!name().isEmpty()) {
                if (appInstance.name() != null && !appInstance.name().isEmpty()) {
                for (Name name : name()) {
                    for (Name name2 : appInstance.name()) {
                            Name result = ((DefaultName) name)
                            .processSubtreeFiltering(name2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToName(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && name() != null) {
                    subTreeFilteringResultBuilder.name(name);
                }
            }
            } else {
                if (appInstance.name() != null && !appInstance.name().isEmpty()) {
                for (Name name : appInstance.name()) {
                        subTreeFilteringResultBuilder.addToName(name);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.label() != null) {
                for (Label label : appInstance.label()) {
                    Label result;
                    result = ((DefaultLabel) DefaultLabel.builder()
                            .buildForFilter()).processSubtreeFiltering(label, true);
                    subTreeFilteringResultBuilder.addToLabel(result);
                }
            } else {
                if (isSubTreeFiltered && label() != null) {
                    subTreeFilteringResultBuilder.label(label);
                }
            }
        } else if (label() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!label().isEmpty()) {
                if (appInstance.label() != null && !appInstance.label().isEmpty()) {
                for (Label label : label()) {
                    for (Label label2 : appInstance.label()) {
                            Label result = ((DefaultLabel) label)
                            .processSubtreeFiltering(label2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToLabel(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && label() != null) {
                    subTreeFilteringResultBuilder.label(label);
                }
            }
            } else {
                if (appInstance.label() != null && !appInstance.label().isEmpty()) {
                for (Label label : appInstance.label()) {
                        subTreeFilteringResultBuilder.addToLabel(label);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.extension() != null) {
                for (Extension extension : appInstance.extension()) {
                    Extension result;
                    result = ((DefaultExtension) DefaultExtension.builder()
                            .buildForFilter()).processSubtreeFiltering(extension, true);
                    subTreeFilteringResultBuilder.addToExtension(result);
                }
            } else {
                if (isSubTreeFiltered && extension() != null) {
                    subTreeFilteringResultBuilder.extension(extension);
                }
            }
        } else if (extension() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!extension().isEmpty()) {
                if (appInstance.extension() != null && !appInstance.extension().isEmpty()) {
                for (Extension extension : extension()) {
                    for (Extension extension2 : appInstance.extension()) {
                            Extension result = ((DefaultExtension) extension)
                            .processSubtreeFiltering(extension2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToExtension(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && extension() != null) {
                    subTreeFilteringResultBuilder.extension(extension);
                }
            }
            } else {
                if (appInstance.extension() != null && !appInstance.extension().isEmpty()) {
                for (Extension extension : appInstance.extension()) {
                        subTreeFilteringResultBuilder.addToExtension(extension);
                    }
                }
            }
        }

        if (statePac() != null || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            if (appInstance.statePac() != null) {
                StatePac result = null;
                if (isSelectAllSchemaChild) {
                    result = ((DefaultStatePac) DefaultStatePac.builder()
                            .buildForFilter()).processSubtreeFiltering(appInstance.statePac(), true);
                } else {
                    result = ((DefaultStatePac) statePac)
                            .processSubtreeFiltering(appInstance.statePac(), false);
                }
                if (result != null) {
                    subTreeFilteringResultBuilder.statePac(result);
                }
            } else {
                if (isSubTreeFiltered && statePac() != null) {
                    subTreeFilteringResultBuilder.statePac(statePac);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of defaultTapiPath.
     */
    protected DefaultTapiPath() {
    }

    /**
     * Returns the attribute tapiPathBuilder.
     *
     * @return tapiPathBuilder
     */
    public static TapiPathBuilder builder() {
        return new TapiPathBuilder();
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
     * Represents the builder implementation of tapiPath.
     */
    public static class TapiPathBuilder implements TapiPath.TapiPathBuilder {
        protected Integer pathCost;
        protected Integer pathLatency;
        protected UniversalId uuid;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiPathOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<PathElementList> pathElementList;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;



        @Override
        public Integer pathCost() {
            return pathCost;
        }

        @Override
        public Integer pathLatency() {
            return pathLatency;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTapiPathOpType() {
            return yangTapiPathOpType;
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
        public List<PathElementList> pathElementList() {
            return pathElementList;
        }

        @Override
        public List<LocalIdList> localIdList() {
            return localIdList;
        }

        @Override
        public List<Name> name() {
            return name;
        }

        @Override
        public List<Label> label() {
            return label;
        }

        @Override
        public List<Extension> extension() {
            return extension;
        }

        @Override
        public StatePac statePac() {
            return statePac;
        }

        @Override
        public TapiPathBuilder pathCost(Integer pathCost) {
            valueLeafFlags.set(LeafIdentifier.PATHCOST.getLeafIndex());
            this.pathCost = pathCost;
            return this;
        }

        @Override
        public TapiPathBuilder pathLatency(Integer pathLatency) {
            valueLeafFlags.set(LeafIdentifier.PATHLATENCY.getLeafIndex());
            this.pathLatency = pathLatency;
            return this;
        }

        @Override
        public TapiPathBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiPathBuilder yangTapiPathOpType(OnosYangOpType yangTapiPathOpType) {
            this.yangTapiPathOpType = yangTapiPathOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiPathBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiPathBuilder pathElementList(List<PathElementList> pathElementList) {
            this.pathElementList = pathElementList;
            return this;
        }

        @Override
        public TapiPathBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiPathBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiPathBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiPathBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiPathBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiPathBuilder addToPathElementList(PathElementList addTo) {
            if (pathElementList == null) {
                pathElementList = new ArrayList<>();
            }
            pathElementList.add(addTo);
            return this;
        }


        @Override
        public TapiPathBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiPathBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiPathBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiPathBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiPathBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiPathBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiPath build() {
            return new DefaultTapiPath(this);
        }

        /**
         * Builds object of tapiPath.
         *
         * @return tapiPath
         */
        public TapiPath buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiPath(this);
        }
        /**
         * Creates an instance of tapiPathBuilder.
         */
        public TapiPathBuilder() {
        }

    }
}
