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
            .gtapiconnection.ConnectionPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.ProtectionType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.RouteList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnection.RoutingConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiConnectionType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiServiceType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiSignalType;

/**
 * Abstraction of an entity which represents the functionality of tapiConnection.
 */
public interface TapiConnection {

    /**
     * Identify the leaf of TapiConnection.
     */
    public enum LeafIdentifier {
        /**
         * Represents serviceType.
         */
        SERVICETYPE(1),
        /**
         * Represents connectionType.
         */
        CONNECTIONTYPE(2),
        /**
         * Represents connectionDirection.
         */
        CONNECTIONDIRECTION(3),
        /**
         * Represents capacity.
         */
        CAPACITY(4),
        /**
         * Represents layerProtocolName.
         */
        LAYERPROTOCOLNAME(5),
        /**
         * Represents parentNodeRef.
         */
        PARENTNODEREF(6),
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
     * Returns the attribute serviceType.
     *
     * @return serviceType value of serviceType
     */
    TapiServiceType serviceType();

    /**
     * Returns the attribute connectionType.
     *
     * @return connectionType value of connectionType
     */
    TapiConnectionType connectionType();

    /**
     * Returns the attribute connectionDirection.
     *
     * @return connectionDirection value of connectionDirection
     */
    TapiConnectionDirection connectionDirection();

    /**
     * Returns the attribute capacity.
     *
     * @return capacity value of capacity
     */
    Integer capacity();

    /**
     * Returns the attribute layerProtocolName.
     *
     * @return layerProtocolName value of layerProtocolName
     */
    TapiLayerProtocolName layerProtocolName();

    /**
     * Returns the attribute parentNodeRef.
     *
     * @return parentNodeRef value of parentNodeRef
     */
    Object parentNodeRef();

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute connectionSignalType.
     *
     * @return connectionSignalType list of connectionSignalType
     */
    List<TapiSignalType> connectionSignalType();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTapiConnectionOpType.
     *
     * @return yangTapiConnectionOpType value of yangTapiConnectionOpType
     */
    OnosYangOpType yangTapiConnectionOpType();

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
     * Returns the attribute connectionPortList.
     *
     * @return connectionPortList list of connectionPortList
     */
    List<ConnectionPortList> connectionPortList();

    /**
     * Returns the attribute routeList.
     *
     * @return routeList list of routeList
     */
    List<RouteList> routeList();

    /**
     * Returns the attribute protectionType.
     *
     * @return protectionType value of protectionType
     */
    ProtectionType protectionType();

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
     * Builder for tapiConnection.
     */
    interface TapiConnectionBuilder {
        /**
         * Adds to the list of connectionSignalType.
         *
         * @return builder object of connectionSignalType
         */
        TapiConnectionBuilder addToConnectionSignalType(TapiSignalType addTo);

        /**
         * Adds to the list of connectionPortList.
         *
         * @return builder object of connectionPortList
         */
        TapiConnectionBuilder addToConnectionPortList(ConnectionPortList addTo);

        /**
         * Adds to the list of routeList.
         *
         * @return builder object of routeList
         */
        TapiConnectionBuilder addToRouteList(RouteList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiConnectionBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiConnectionBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiConnectionBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiConnectionBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute serviceType.
         *
         * @return serviceType value of serviceType
         */
        TapiServiceType serviceType();

        /**
         * Returns the attribute connectionType.
         *
         * @return connectionType value of connectionType
         */
        TapiConnectionType connectionType();

        /**
         * Returns the attribute connectionDirection.
         *
         * @return connectionDirection value of connectionDirection
         */
        TapiConnectionDirection connectionDirection();

        /**
         * Returns the attribute capacity.
         *
         * @return capacity value of capacity
         */
        Integer capacity();

        /**
         * Returns the attribute layerProtocolName.
         *
         * @return layerProtocolName value of layerProtocolName
         */
        TapiLayerProtocolName layerProtocolName();

        /**
         * Returns the attribute parentNodeRef.
         *
         * @return parentNodeRef value of parentNodeRef
         */
        Object parentNodeRef();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute connectionSignalType.
         *
         * @return connectionSignalType list of connectionSignalType
         */
        List<TapiSignalType> connectionSignalType();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTapiConnectionOpType.
         *
         * @return yangTapiConnectionOpType value of yangTapiConnectionOpType
         */
        OnosYangOpType yangTapiConnectionOpType();

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
         * Returns the attribute connectionPortList.
         *
         * @return connectionPortList list of connectionPortList
         */
        List<ConnectionPortList> connectionPortList();

        /**
         * Returns the attribute routeList.
         *
         * @return routeList list of routeList
         */
        List<RouteList> routeList();

        /**
         * Returns the attribute protectionType.
         *
         * @return protectionType value of protectionType
         */
        ProtectionType protectionType();

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
        TapiConnectionBuilder serviceType(TapiServiceType serviceType);

        /**
         * Returns the builder object of connectionType.
         *
         * @param connectionType value of connectionType
         * @return connectionType
         */
        TapiConnectionBuilder connectionType(TapiConnectionType connectionType);

        /**
         * Returns the builder object of connectionDirection.
         *
         * @param connectionDirection value of connectionDirection
         * @return connectionDirection
         */
        TapiConnectionBuilder connectionDirection(TapiConnectionDirection connectionDirection);

        /**
         * Returns the builder object of capacity.
         *
         * @param capacity value of capacity
         * @return capacity
         */
        TapiConnectionBuilder capacity(Integer capacity);

        /**
         * Returns the builder object of layerProtocolName.
         *
         * @param layerProtocolName value of layerProtocolName
         * @return layerProtocolName
         */
        TapiConnectionBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName);

        /**
         * Returns the builder object of parentNodeRef.
         *
         * @param parentNodeRef value of parentNodeRef
         * @return parentNodeRef
         */
        TapiConnectionBuilder parentNodeRef(Object parentNodeRef);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiConnectionBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of connectionSignalType.
         *
         * @param connectionSignalType list of connectionSignalType
         * @return connectionSignalType
         */
        TapiConnectionBuilder connectionSignalType(List<TapiSignalType> connectionSignalType);

        /**
         * Returns the builder object of yangTapiConnectionOpType.
         *
         * @param yangTapiConnectionOpType value of yangTapiConnectionOpType
         * @return yangTapiConnectionOpType
         */
        TapiConnectionBuilder yangTapiConnectionOpType(OnosYangOpType yangTapiConnectionOpType);

        /**
         * Returns the builder object of connectionPortList.
         *
         * @param connectionPortList list of connectionPortList
         * @return connectionPortList
         */
        TapiConnectionBuilder connectionPortList(List<ConnectionPortList> connectionPortList);

        /**
         * Returns the builder object of routeList.
         *
         * @param routeList list of routeList
         * @return routeList
         */
        TapiConnectionBuilder routeList(List<RouteList> routeList);

        /**
         * Returns the builder object of protectionType.
         *
         * @param protectionType value of protectionType
         * @return protectionType
         */
        TapiConnectionBuilder protectionType(ProtectionType protectionType);

        /**
         * Returns the builder object of routingConstraints.
         *
         * @param routingConstraints value of routingConstraints
         * @return routingConstraints
         */
        TapiConnectionBuilder routingConstraints(RoutingConstraints routingConstraints);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiConnectionBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiConnectionBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiConnectionBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiConnectionBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiConnectionBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiConnectionBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiConnectionBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiConnection.
         *
         * @return tapiConnection
         */
        TapiConnection build();
    }
}
