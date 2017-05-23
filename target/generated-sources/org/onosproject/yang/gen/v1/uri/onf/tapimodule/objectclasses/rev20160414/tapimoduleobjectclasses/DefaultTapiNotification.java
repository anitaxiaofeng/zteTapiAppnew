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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapinotification.DefaultStateChangeList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapinotification.StateChangeList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiNotificationType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiObjectType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSourceIndicator;

/**
 * Represents the implementation of tapiNotification.
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
public class DefaultTapiNotification implements TapiNotification {
    protected TapiNotificationType notificationType;
    protected TapiObjectType objectType;
    protected String objectInstanceIdentifier;
    protected String eventTimeStamp;
    protected TapiSourceIndicator sourceIndicator;
    protected String additionalInformation;
    protected UniversalId uuid;
    protected List<String> objectInstanceNameList;
    protected BitSet valueLeafFlags = new BitSet();
    protected OnosYangOpType yangTapiNotificationOpType;
    protected boolean isSubTreeFiltered;
    protected BitSet selectLeafFlags = new BitSet();
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<StateChangeList> stateChangeList;
    protected List<LocalIdList> localIdList;
    protected List<Name> name;
    protected List<Label> label;
    protected List<Extension> extension;
    protected StatePac statePac;

    @Override
    public TapiNotificationType notificationType() {
        return notificationType;
    }

    @Override
    public TapiObjectType objectType() {
        return objectType;
    }

    @Override
    public String objectInstanceIdentifier() {
        return objectInstanceIdentifier;
    }

    @Override
    public String eventTimeStamp() {
        return eventTimeStamp;
    }

    @Override
    public TapiSourceIndicator sourceIndicator() {
        return sourceIndicator;
    }

    @Override
    public String additionalInformation() {
        return additionalInformation;
    }

    @Override
    public UniversalId uuid() {
        return uuid;
    }

    @Override
    public List<String> objectInstanceNameList() {
        return objectInstanceNameList;
    }

    @Override
    public BitSet valueLeafFlags() {
        return valueLeafFlags;
    }

    @Override
    public OnosYangOpType yangTapiNotificationOpType() {
        return yangTapiNotificationOpType;
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
    public List<StateChangeList> stateChangeList() {
        return stateChangeList;
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
         return Objects.hash(notificationType, objectType, objectInstanceIdentifier, eventTimeStamp, sourceIndicator,
                    additionalInformation, uuid, objectInstanceNameList, valueLeafFlags, yangTapiNotificationOpType,
                    isSubTreeFiltered, selectLeafFlags, yangAugmentedInfoMap, stateChangeList, localIdList, name,
                    label, extension, statePac);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTapiNotification) {
            DefaultTapiNotification other = (DefaultTapiNotification) obj;
            return
                Objects.equals(notificationType, other.notificationType) &&
                Objects.equals(objectType, other.objectType) &&
                Objects.equals(objectInstanceIdentifier, other.objectInstanceIdentifier) &&
                Objects.equals(eventTimeStamp, other.eventTimeStamp) &&
                Objects.equals(sourceIndicator, other.sourceIndicator) &&
                Objects.equals(additionalInformation, other.additionalInformation) &&
                Objects.equals(uuid, other.uuid) &&
                Objects.equals(objectInstanceNameList, other.objectInstanceNameList) &&
                Objects.equals(valueLeafFlags, other.valueLeafFlags) &&
                Objects
                .equals(yangTapiNotificationOpType,
                 other.yangTapiNotificationOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(selectLeafFlags, other.selectLeafFlags) &&
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(stateChangeList, other.stateChangeList) &&
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
            .add("notificationType", notificationType)
            .add("objectType", objectType)
            .add("objectInstanceIdentifier", objectInstanceIdentifier)
            .add("eventTimeStamp", eventTimeStamp)
            .add("sourceIndicator", sourceIndicator)
            .add("additionalInformation", additionalInformation)
            .add("uuid", uuid)
            .add("objectInstanceNameList", objectInstanceNameList)
            .add("valueLeafFlags", valueLeafFlags)
            .add("yangTapiNotificationOpType", yangTapiNotificationOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("selectLeafFlags", selectLeafFlags)
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("stateChangeList", stateChangeList)
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
     * Creates an instance of tapiNotification.
     *
     * @param builderObject value of builder object of tapiNotification
     */
    protected DefaultTapiNotification(TapiNotificationBuilder builderObject) {
        notificationType = builderObject.notificationType();
        objectType = builderObject.objectType();
        objectInstanceIdentifier = builderObject.objectInstanceIdentifier();
        eventTimeStamp = builderObject.eventTimeStamp();
        sourceIndicator = builderObject.sourceIndicator();
        additionalInformation = builderObject.additionalInformation();
        uuid = builderObject.uuid();
        objectInstanceNameList = builderObject.objectInstanceNameList();
        valueLeafFlags = builderObject.valueLeafFlags();
        yangTapiNotificationOpType = builderObject.yangTapiNotificationOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        selectLeafFlags = builderObject.selectLeafFlags();
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        stateChangeList = builderObject.stateChangeList();
        localIdList = builderObject.localIdList();
        name = builderObject.name();
        label = builderObject.label();
        extension = builderObject.extension();
        statePac = builderObject.statePac();
    }

    /**
     * Checks if the passed TapiNotification maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public DefaultTapiNotification processSubtreeFiltering(TapiNotification appInstance, boolean
                isSelectAllSchemaChild) {
        TapiNotificationBuilder subTreeFilteringResultBuilder = new TapiNotificationBuilder();
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
        return (DefaultTapiNotification) subTreeFilteringResultBuilder.buildForFilter();
    }

    private boolean processLeafSubtreeFiltering(TapiNotification appInstance, TapiNotificationBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (valueLeafFlags.get(LeafIdentifier.NOTIFICATIONTYPE.getLeafIndex())) {
             if (appInstance.notificationType() == null
                        || !(notificationType()
            .equals(appInstance.notificationType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.NOTIFICATIONTYPE)) {
                    subTreeFilteringResultBuilder.notificationType(notificationType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.notificationType(appInstance.notificationType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.NOTIFICATIONTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.notificationType(appInstance.notificationType());
        }

        if (valueLeafFlags.get(LeafIdentifier.OBJECTTYPE.getLeafIndex())) {
            if (appInstance.objectType() == null || !(objectType().equals(appInstance.objectType()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.OBJECTTYPE)) {
                    subTreeFilteringResultBuilder.objectType(objectType());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.objectType(appInstance.objectType());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.OBJECTTYPE.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.objectType(appInstance.objectType());
        }

        if (valueLeafFlags.get(LeafIdentifier.OBJECTINSTANCEIDENTIFIER.getLeafIndex())) {
            if (appInstance.objectInstanceIdentifier() == null
                        ||
                        !(objectInstanceIdentifier()
            .equals(appInstance.objectInstanceIdentifier()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.OBJECTINSTANCEIDENTIFIER)) {
                    subTreeFilteringResultBuilder.objectInstanceIdentifier(objectInstanceIdentifier());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.objectInstanceIdentifier(appInstance.objectInstanceIdentifier());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier
            .OBJECTINSTANCEIDENTIFIER.getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.objectInstanceIdentifier(appInstance.objectInstanceIdentifier());
        }

        if (valueLeafFlags.get(LeafIdentifier.EVENTTIMESTAMP.getLeafIndex())) {
            if (appInstance.eventTimeStamp() == null || !(eventTimeStamp().equals(appInstance.eventTimeStamp()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.EVENTTIMESTAMP)) {
                    subTreeFilteringResultBuilder.eventTimeStamp(eventTimeStamp());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.eventTimeStamp(appInstance.eventTimeStamp());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.EVENTTIMESTAMP.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.eventTimeStamp(appInstance.eventTimeStamp());
        }

        if (valueLeafFlags.get(LeafIdentifier.SOURCEINDICATOR.getLeafIndex())) {
             if (appInstance.sourceIndicator() == null
                        || !(sourceIndicator()
            .equals(appInstance.sourceIndicator()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.SOURCEINDICATOR)) {
                    subTreeFilteringResultBuilder.sourceIndicator(sourceIndicator());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.sourceIndicator(appInstance.sourceIndicator());
            }
        } else if (selectLeafFlags.get(LeafIdentifier.SOURCEINDICATOR.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.sourceIndicator(appInstance.sourceIndicator());
        }

        if (valueLeafFlags.get(LeafIdentifier.ADDITIONALINFORMATION.getLeafIndex())) {
             if (appInstance.additionalInformation() == null
                        || !(additionalInformation()
            .equals(appInstance.additionalInformation()))) {
                if (isSubTreeFiltered && !appInstance.isLeafValueSet(LeafIdentifier.ADDITIONALINFORMATION)) {
                    subTreeFilteringResultBuilder.additionalInformation(additionalInformation());
                } else {
                    return false;
                }
            } else {
                subTreeFilteringResultBuilder.additionalInformation(appInstance.additionalInformation());
            }
        } else if
                    (selectLeafFlags.get(LeafIdentifier.ADDITIONALINFORMATION
            .getLeafIndex()) ||
                    isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode.set(0);
            subTreeFilteringResultBuilder.additionalInformation(appInstance.additionalInformation());
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

    private boolean processLeafListSubTreeFiltering(TapiNotification appInstance, TapiNotificationBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.objectInstanceNameList() != null) {
                for (String objectInstanceNameList : appInstance.objectInstanceNameList()) {
                    subTreeFilteringResultBuilder.addToObjectInstanceNameList(objectInstanceNameList);
                }
            } else {
                if (isSubTreeFiltered && objectInstanceNameList() != null) {
                    subTreeFilteringResultBuilder.objectInstanceNameList(objectInstanceNameList);
                }
            }
        } else if (objectInstanceNameList() != null) {
            if (!objectInstanceNameList().isEmpty()) {
                if (appInstance.objectInstanceNameList() == null || appInstance.objectInstanceNameList().isEmpty()) {
                    return false;
                }
                for (String objectInstanceNameList : objectInstanceNameList()) {
                    boolean flag = false;
                    for (String objectInstanceNameList2 : appInstance.objectInstanceNameList()) {
                        if (objectInstanceNameList.equals(objectInstanceNameList2)) {
                            flag = true;
                            subTreeFilteringResultBuilder.addToObjectInstanceNameList(objectInstanceNameList2);
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            } else {
            isAnySelectOrContainmentNode.set(0);
                if (appInstance.objectInstanceNameList() != null &&
                            !appInstance.objectInstanceNameList().isEmpty()) {
                for (String objectInstanceNameList : appInstance.objectInstanceNameList()) {
                        subTreeFilteringResultBuilder.addToObjectInstanceNameList(objectInstanceNameList);
                    }
                }
            }
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(TapiNotification appInstance, TapiNotificationBuilder
                subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode, boolean
                isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.stateChangeList() != null) {
                for (StateChangeList stateChangeList : appInstance.stateChangeList()) {
                    StateChangeList result;
                    result = ((DefaultStateChangeList) DefaultStateChangeList.builder()
                            .buildForFilter()).processSubtreeFiltering(stateChangeList, true);
                    subTreeFilteringResultBuilder.addToStateChangeList(result);
                }
            } else {
                if (isSubTreeFiltered && stateChangeList() != null) {
                    subTreeFilteringResultBuilder.stateChangeList(stateChangeList);
                }
            }
        } else if (stateChangeList() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!stateChangeList().isEmpty()) {
                if (appInstance.stateChangeList() != null && !appInstance.stateChangeList().isEmpty()) {
                for (StateChangeList stateChangeList : stateChangeList()) {
                    for (StateChangeList stateChangeList2 : appInstance.stateChangeList()) {
                            StateChangeList result = ((DefaultStateChangeList) stateChangeList)
                            .processSubtreeFiltering(stateChangeList2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToStateChangeList(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && stateChangeList() != null) {
                    subTreeFilteringResultBuilder.stateChangeList(stateChangeList);
                }
            }
            } else {
                if (appInstance.stateChangeList() != null && !appInstance.stateChangeList().isEmpty()) {
                for (StateChangeList stateChangeList : appInstance.stateChangeList()) {
                        subTreeFilteringResultBuilder.addToStateChangeList(stateChangeList);
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
     * Creates an instance of defaultTapiNotification.
     */
    protected DefaultTapiNotification() {
    }

    /**
     * Returns the attribute tapiNotificationBuilder.
     *
     * @return tapiNotificationBuilder
     */
    public static TapiNotificationBuilder builder() {
        return new TapiNotificationBuilder();
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
     * Represents the builder implementation of tapiNotification.
     */
    public static class TapiNotificationBuilder implements TapiNotification.TapiNotificationBuilder {
        protected TapiNotificationType notificationType;
        protected TapiObjectType objectType;
        protected String objectInstanceIdentifier;
        protected String eventTimeStamp;
        protected TapiSourceIndicator sourceIndicator;
        protected String additionalInformation;
        protected UniversalId uuid;
        protected List<String> objectInstanceNameList;
        protected BitSet valueLeafFlags = new BitSet();
        protected OnosYangOpType yangTapiNotificationOpType;
        protected boolean isSubTreeFiltered;
        protected BitSet selectLeafFlags = new BitSet();
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<StateChangeList> stateChangeList;
        protected List<LocalIdList> localIdList;
        protected List<Name> name;
        protected List<Label> label;
        protected List<Extension> extension;
        protected StatePac statePac;



        @Override
        public TapiNotificationType notificationType() {
            return notificationType;
        }

        @Override
        public TapiObjectType objectType() {
            return objectType;
        }

        @Override
        public String objectInstanceIdentifier() {
            return objectInstanceIdentifier;
        }

        @Override
        public String eventTimeStamp() {
            return eventTimeStamp;
        }

        @Override
        public TapiSourceIndicator sourceIndicator() {
            return sourceIndicator;
        }

        @Override
        public String additionalInformation() {
            return additionalInformation;
        }

        @Override
        public UniversalId uuid() {
            return uuid;
        }

        @Override
        public List<String> objectInstanceNameList() {
            return objectInstanceNameList;
        }

        @Override
        public BitSet valueLeafFlags() {
            return valueLeafFlags;
        }

        @Override
        public OnosYangOpType yangTapiNotificationOpType() {
            return yangTapiNotificationOpType;
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
        public List<StateChangeList> stateChangeList() {
            return stateChangeList;
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
        public TapiNotificationBuilder notificationType(TapiNotificationType notificationType) {
            valueLeafFlags.set(LeafIdentifier.NOTIFICATIONTYPE.getLeafIndex());
            this.notificationType = notificationType;
            return this;
        }

        @Override
        public TapiNotificationBuilder objectType(TapiObjectType objectType) {
            valueLeafFlags.set(LeafIdentifier.OBJECTTYPE.getLeafIndex());
            this.objectType = objectType;
            return this;
        }

        @Override
        public TapiNotificationBuilder objectInstanceIdentifier(String objectInstanceIdentifier) {
            valueLeafFlags.set(LeafIdentifier.OBJECTINSTANCEIDENTIFIER.getLeafIndex());
            this.objectInstanceIdentifier = objectInstanceIdentifier;
            return this;
        }

        @Override
        public TapiNotificationBuilder eventTimeStamp(String eventTimeStamp) {
            valueLeafFlags.set(LeafIdentifier.EVENTTIMESTAMP.getLeafIndex());
            this.eventTimeStamp = eventTimeStamp;
            return this;
        }

        @Override
        public TapiNotificationBuilder sourceIndicator(TapiSourceIndicator sourceIndicator) {
            valueLeafFlags.set(LeafIdentifier.SOURCEINDICATOR.getLeafIndex());
            this.sourceIndicator = sourceIndicator;
            return this;
        }

        @Override
        public TapiNotificationBuilder additionalInformation(String additionalInformation) {
            valueLeafFlags.set(LeafIdentifier.ADDITIONALINFORMATION.getLeafIndex());
            this.additionalInformation = additionalInformation;
            return this;
        }

        @Override
        public TapiNotificationBuilder uuid(UniversalId uuid) {
            valueLeafFlags.set(LeafIdentifier.UUID.getLeafIndex());
            this.uuid = uuid;
            return this;
        }

        @Override
        public TapiNotificationBuilder objectInstanceNameList(List<String> objectInstanceNameList) {
            this.objectInstanceNameList = objectInstanceNameList;
            return this;
        }

        @Override
        public TapiNotificationBuilder yangTapiNotificationOpType(OnosYangOpType yangTapiNotificationOpType) {
            this.yangTapiNotificationOpType = yangTapiNotificationOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiNotificationBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiNotificationBuilder stateChangeList(List<StateChangeList> stateChangeList) {
            this.stateChangeList = stateChangeList;
            return this;
        }

        @Override
        public TapiNotificationBuilder localIdList(List<LocalIdList> localIdList) {
            this.localIdList = localIdList;
            return this;
        }

        @Override
        public TapiNotificationBuilder name(List<Name> name) {
            this.name = name;
            return this;
        }

        @Override
        public TapiNotificationBuilder label(List<Label> label) {
            this.label = label;
            return this;
        }

        @Override
        public TapiNotificationBuilder extension(List<Extension> extension) {
            this.extension = extension;
            return this;
        }

        @Override
        public TapiNotificationBuilder statePac(StatePac statePac) {
            this.statePac = statePac;
            return this;
        }

        @Override
        public TapiNotificationBuilder addToObjectInstanceNameList(String addTo) {
            if (objectInstanceNameList == null) {
                objectInstanceNameList = new ArrayList<>();
            }
            objectInstanceNameList.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder addToStateChangeList(StateChangeList addTo) {
            if (stateChangeList == null) {
                stateChangeList = new ArrayList<>();
            }
            stateChangeList.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder addToLocalIdList(LocalIdList addTo) {
            if (localIdList == null) {
                localIdList = new ArrayList<>();
            }
            localIdList.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder addToName(Name addTo) {
            if (name == null) {
                name = new ArrayList<>();
            }
            name.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder addToLabel(Label addTo) {
            if (label == null) {
                label = new ArrayList<>();
            }
            label.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder addToExtension(Extension addTo) {
            if (extension == null) {
                extension = new ArrayList<>();
            }
            extension.add(addTo);
            return this;
        }


        @Override
        public TapiNotificationBuilder selectLeaf(LeafIdentifier leaf) {
            selectLeafFlags.set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public TapiNotificationBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public TapiNotification build() {
            return new DefaultTapiNotification(this);
        }

        /**
         * Builds object of tapiNotification.
         *
         * @return tapiNotification
         */
        public TapiNotification buildForFilter() {
            isSubTreeFiltered = true;
            return new DefaultTapiNotification(this);
        }
        /**
         * Creates an instance of tapiNotificationBuilder.
         */
        public TapiNotificationBuilder() {
        }

    }
}
