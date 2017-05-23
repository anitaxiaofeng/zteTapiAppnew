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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .RoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapiservice
            .ServicePortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiServiceType;

/**
 * Abstraction of an entity which represents the functionality of tapiService.
 */
public interface TapiService {

    /**
     * Identify the leaf of TapiService.
     */
    public enum LeafIdentifier {
        /**
         * Represents serviceType.
         */
        SERVICETYPE(1),
        /**
         * Represents serviceDirection.
         */
        SERVICEDIRECTION(2),
        /**
         * Represents layerProtocolName.
         */
        LAYERPROTOCOLNAME(3),
        /**
         * Represents capacity.
         */
        CAPACITY(4),
        /**
         * Represents serviceLevel.
         */
        SERVICELEVEL(5),
        /**
         * Represents startTime.
         */
        STARTTIME(6),
        /**
         * Represents endTime.
         */
        ENDTIME(7),
        /**
         * Represents uuid.
         */
        UUID(8);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute serviceType.
     *
     * @return serviceType value of serviceType
     */
    TapiServiceType serviceType();

    /**
     * Returns the attribute serviceDirection.
     *
     * @return serviceDirection value of serviceDirection
     */
    TapiConnectionDirection serviceDirection();

    /**
     * Returns the attribute layerProtocolName.
     *
     * @return layerProtocolName value of layerProtocolName
     */
    TapiLayerProtocolName layerProtocolName();

    /**
     * Returns the attribute capacity.
     *
     * @return capacity value of capacity
     */
    Integer capacity();

    /**
     * Returns the attribute serviceLevel.
     *
     * @return serviceLevel value of serviceLevel
     */
    String serviceLevel();

    /**
     * Returns the attribute startTime.
     *
     * @return startTime value of startTime
     */
    String startTime();

    /**
     * Returns the attribute endTime.
     *
     * @return endTime value of endTime
     */
    String endTime();

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute connectionRefList.
     *
     * @return connectionRefList list of connectionRefList
     */
    List<Object> connectionRefList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTapiServiceOpType.
     *
     * @return yangTapiServiceOpType value of yangTapiServiceOpType
     */
    OnosYangOpType yangTapiServiceOpType();

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
     * Returns the attribute servicePortList.
     *
     * @return servicePortList list of servicePortList
     */
    List<ServicePortList> servicePortList();

    /**
     * Returns the attribute routingConstraints.
     *
     * @return routingConstraints value of routingConstraints
     */
    RoutingConstraints routingConstraints();

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
     * Builder for tapiService.
     */
    interface TapiServiceBuilder {
        /**
         * Adds to the list of connectionRefList.
         *
         * @return builder object of connectionRefList
         */
        TapiServiceBuilder addToConnectionRefList(Object addTo);

        /**
         * Adds to the list of servicePortList.
         *
         * @return builder object of servicePortList
         */
        TapiServiceBuilder addToServicePortList(ServicePortList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiServiceBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiServiceBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiServiceBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiServiceBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute serviceType.
         *
         * @return serviceType value of serviceType
         */
        TapiServiceType serviceType();

        /**
         * Returns the attribute serviceDirection.
         *
         * @return serviceDirection value of serviceDirection
         */
        TapiConnectionDirection serviceDirection();

        /**
         * Returns the attribute layerProtocolName.
         *
         * @return layerProtocolName value of layerProtocolName
         */
        TapiLayerProtocolName layerProtocolName();

        /**
         * Returns the attribute capacity.
         *
         * @return capacity value of capacity
         */
        Integer capacity();

        /**
         * Returns the attribute serviceLevel.
         *
         * @return serviceLevel value of serviceLevel
         */
        String serviceLevel();

        /**
         * Returns the attribute startTime.
         *
         * @return startTime value of startTime
         */
        String startTime();

        /**
         * Returns the attribute endTime.
         *
         * @return endTime value of endTime
         */
        String endTime();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute connectionRefList.
         *
         * @return connectionRefList list of connectionRefList
         */
        List<Object> connectionRefList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTapiServiceOpType.
         *
         * @return yangTapiServiceOpType value of yangTapiServiceOpType
         */
        OnosYangOpType yangTapiServiceOpType();

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
         * Returns the attribute servicePortList.
         *
         * @return servicePortList list of servicePortList
         */
        List<ServicePortList> servicePortList();

        /**
         * Returns the attribute routingConstraints.
         *
         * @return routingConstraints value of routingConstraints
         */
        RoutingConstraints routingConstraints();

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
         * Returns the builder object of serviceType.
         *
         * @param serviceType value of serviceType
         * @return serviceType
         */
        TapiServiceBuilder serviceType(TapiServiceType serviceType);

        /**
         * Returns the builder object of serviceDirection.
         *
         * @param serviceDirection value of serviceDirection
         * @return serviceDirection
         */
        TapiServiceBuilder serviceDirection(TapiConnectionDirection serviceDirection);

        /**
         * Returns the builder object of layerProtocolName.
         *
         * @param layerProtocolName value of layerProtocolName
         * @return layerProtocolName
         */
        TapiServiceBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName);

        /**
         * Returns the builder object of capacity.
         *
         * @param capacity value of capacity
         * @return capacity
         */
        TapiServiceBuilder capacity(Integer capacity);

        /**
         * Returns the builder object of serviceLevel.
         *
         * @param serviceLevel value of serviceLevel
         * @return serviceLevel
         */
        TapiServiceBuilder serviceLevel(String serviceLevel);

        /**
         * Returns the builder object of startTime.
         *
         * @param startTime value of startTime
         * @return startTime
         */
        TapiServiceBuilder startTime(String startTime);

        /**
         * Returns the builder object of endTime.
         *
         * @param endTime value of endTime
         * @return endTime
         */
        TapiServiceBuilder endTime(String endTime);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiServiceBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of connectionRefList.
         *
         * @param connectionRefList list of connectionRefList
         * @return connectionRefList
         */
        TapiServiceBuilder connectionRefList(List<Object> connectionRefList);

        /**
         * Returns the builder object of yangTapiServiceOpType.
         *
         * @param yangTapiServiceOpType value of yangTapiServiceOpType
         * @return yangTapiServiceOpType
         */
        TapiServiceBuilder yangTapiServiceOpType(OnosYangOpType yangTapiServiceOpType);

        /**
         * Returns the builder object of servicePortList.
         *
         * @param servicePortList list of servicePortList
         * @return servicePortList
         */
        TapiServiceBuilder servicePortList(List<ServicePortList> servicePortList);

        /**
         * Returns the builder object of routingConstraints.
         *
         * @param routingConstraints value of routingConstraints
         * @return routingConstraints
         */
        TapiServiceBuilder routingConstraints(RoutingConstraints routingConstraints);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiServiceBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiServiceBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiServiceBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiServiceBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiServiceBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiServiceBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiServiceBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiService.
         *
         * @return tapiService
         */
        TapiService build();
    }
}
