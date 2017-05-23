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

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
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
            .gtapinotification.StateChangeList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiNotificationType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiObjectType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSourceIndicator;

/**
 * Abstraction of an entity which represents the functionality of tapiNotification.
 */
public interface TapiNotification {

    /**
     * Identify the leaf of TapiNotification.
     */
    public enum LeafIdentifier {
        /**
         * Represents notificationType.
         */
        NOTIFICATIONTYPE(1),
        /**
         * Represents objectType.
         */
        OBJECTTYPE(2),
        /**
         * Represents objectInstanceIdentifier.
         */
        OBJECTINSTANCEIDENTIFIER(3),
        /**
         * Represents eventTimeStamp.
         */
        EVENTTIMESTAMP(4),
        /**
         * Represents sourceIndicator.
         */
        SOURCEINDICATOR(5),
        /**
         * Represents additionalInformation.
         */
        ADDITIONALINFORMATION(6),
        /**
         * Represents uuid.
         */
        UUID(7);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute notificationType.
     *
     * @return notificationType value of notificationType
     */
    TapiNotificationType notificationType();

    /**
     * Returns the attribute objectType.
     *
     * @return objectType value of objectType
     */
    TapiObjectType objectType();

    /**
     * Returns the attribute objectInstanceIdentifier.
     *
     * @return objectInstanceIdentifier value of objectInstanceIdentifier
     */
    String objectInstanceIdentifier();

    /**
     * Returns the attribute eventTimeStamp.
     *
     * @return eventTimeStamp value of eventTimeStamp
     */
    String eventTimeStamp();

    /**
     * Returns the attribute sourceIndicator.
     *
     * @return sourceIndicator value of sourceIndicator
     */
    TapiSourceIndicator sourceIndicator();

    /**
     * Returns the attribute additionalInformation.
     *
     * @return additionalInformation value of additionalInformation
     */
    String additionalInformation();

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute objectInstanceNameList.
     *
     * @return objectInstanceNameList list of objectInstanceNameList
     */
    List<String> objectInstanceNameList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTapiNotificationOpType.
     *
     * @return yangTapiNotificationOpType value of yangTapiNotificationOpType
     */
    OnosYangOpType yangTapiNotificationOpType();

    /**
     * Returns the attribute selectLeafFlags.
     *
     * @return selectLeafFlags value of selectLeafFlags
     */
    BitSet selectLeafFlags();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute stateChangeList.
     *
     * @return stateChangeList list of stateChangeList
     */
    List<StateChangeList> stateChangeList();

    /**
     * Returns the attribute localIdList.
     *
     * @return localIdList list of localIdList
     */
    List<LocalIdList> localIdList();

    /**
     * Returns the attribute name.
     *
     * @return name list of name
     */
    List<Name> name();

    /**
     * Returns the attribute label.
     *
     * @return label list of label
     */
    List<Label> label();

    /**
     * Returns the attribute extension.
     *
     * @return extension list of extension
     */
    List<Extension> extension();

    /**
     * Returns the attribute statePac.
     *
     * @return statePac value of statePac
     */
    StatePac statePac();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    boolean isLeafValueSet(LeafIdentifier leaf);

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    boolean isSelectLeaf(LeafIdentifier leaf);

    /**
     * Builder for tapiNotification.
     */
    interface TapiNotificationBuilder {
        /**
         * Adds to the list of objectInstanceNameList.
         *
         * @return builder object of objectInstanceNameList
         */
        TapiNotificationBuilder addToObjectInstanceNameList(String addTo);

        /**
         * Adds to the list of stateChangeList.
         *
         * @return builder object of stateChangeList
         */
        TapiNotificationBuilder addToStateChangeList(StateChangeList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiNotificationBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiNotificationBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiNotificationBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiNotificationBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute notificationType.
         *
         * @return notificationType value of notificationType
         */
        TapiNotificationType notificationType();

        /**
         * Returns the attribute objectType.
         *
         * @return objectType value of objectType
         */
        TapiObjectType objectType();

        /**
         * Returns the attribute objectInstanceIdentifier.
         *
         * @return objectInstanceIdentifier value of objectInstanceIdentifier
         */
        String objectInstanceIdentifier();

        /**
         * Returns the attribute eventTimeStamp.
         *
         * @return eventTimeStamp value of eventTimeStamp
         */
        String eventTimeStamp();

        /**
         * Returns the attribute sourceIndicator.
         *
         * @return sourceIndicator value of sourceIndicator
         */
        TapiSourceIndicator sourceIndicator();

        /**
         * Returns the attribute additionalInformation.
         *
         * @return additionalInformation value of additionalInformation
         */
        String additionalInformation();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute objectInstanceNameList.
         *
         * @return objectInstanceNameList list of objectInstanceNameList
         */
        List<String> objectInstanceNameList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTapiNotificationOpType.
         *
         * @return yangTapiNotificationOpType value of yangTapiNotificationOpType
         */
        OnosYangOpType yangTapiNotificationOpType();

        /**
         * Returns the attribute selectLeafFlags.
         *
         * @return selectLeafFlags value of selectLeafFlags
         */
        BitSet selectLeafFlags();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute stateChangeList.
         *
         * @return stateChangeList list of stateChangeList
         */
        List<StateChangeList> stateChangeList();

        /**
         * Returns the attribute localIdList.
         *
         * @return localIdList list of localIdList
         */
        List<LocalIdList> localIdList();

        /**
         * Returns the attribute name.
         *
         * @return name list of name
         */
        List<Name> name();

        /**
         * Returns the attribute label.
         *
         * @return label list of label
         */
        List<Label> label();

        /**
         * Returns the attribute extension.
         *
         * @return extension list of extension
         */
        List<Extension> extension();

        /**
         * Returns the attribute statePac.
         *
         * @return statePac value of statePac
         */
        StatePac statePac();

        /**
         * Returns the builder object of notificationType.
         *
         * @param notificationType value of notificationType
         * @return notificationType
         */
        TapiNotificationBuilder notificationType(TapiNotificationType notificationType);

        /**
         * Returns the builder object of objectType.
         *
         * @param objectType value of objectType
         * @return objectType
         */
        TapiNotificationBuilder objectType(TapiObjectType objectType);

        /**
         * Returns the builder object of objectInstanceIdentifier.
         *
         * @param objectInstanceIdentifier value of objectInstanceIdentifier
         * @return objectInstanceIdentifier
         */
        TapiNotificationBuilder objectInstanceIdentifier(String objectInstanceIdentifier);

        /**
         * Returns the builder object of eventTimeStamp.
         *
         * @param eventTimeStamp value of eventTimeStamp
         * @return eventTimeStamp
         */
        TapiNotificationBuilder eventTimeStamp(String eventTimeStamp);

        /**
         * Returns the builder object of sourceIndicator.
         *
         * @param sourceIndicator value of sourceIndicator
         * @return sourceIndicator
         */
        TapiNotificationBuilder sourceIndicator(TapiSourceIndicator sourceIndicator);

        /**
         * Returns the builder object of additionalInformation.
         *
         * @param additionalInformation value of additionalInformation
         * @return additionalInformation
         */
        TapiNotificationBuilder additionalInformation(String additionalInformation);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiNotificationBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of objectInstanceNameList.
         *
         * @param objectInstanceNameList list of objectInstanceNameList
         * @return objectInstanceNameList
         */
        TapiNotificationBuilder objectInstanceNameList(List<String> objectInstanceNameList);

        /**
         * Returns the builder object of yangTapiNotificationOpType.
         *
         * @param yangTapiNotificationOpType value of yangTapiNotificationOpType
         * @return yangTapiNotificationOpType
         */
        TapiNotificationBuilder yangTapiNotificationOpType(OnosYangOpType yangTapiNotificationOpType);

        /**
         * Returns the builder object of stateChangeList.
         *
         * @param stateChangeList list of stateChangeList
         * @return stateChangeList
         */
        TapiNotificationBuilder stateChangeList(List<StateChangeList> stateChangeList);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiNotificationBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiNotificationBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiNotificationBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiNotificationBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiNotificationBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiNotificationBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        TapiNotificationBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiNotification.
         *
         * @return tapiNotification
         */
        TapiNotification build();
    }
}
