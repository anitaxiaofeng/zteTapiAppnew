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

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Extension;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Label;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .LocalIdList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .Name;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.glocalclass
            .StatePac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconnectionport.ConnectionEndPoint;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiPortDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.TapiRole;

/**
 * Abstraction of an entity which represents the functionality of connectionPortList.
 */
public interface ConnectionPortList {

    /**
     * Identify the leaf of ConnectionPortList.
     */
    public enum LeafIdentifier {
        /**
         * Represents portDirection.
         */
        PORTDIRECTION(1),
        /**
         * Represents role.
         */
        ROLE(2),
        /**
         * Represents localId.
         */
        LOCALID(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute portDirection.
     *
     * @return portDirection value of portDirection
     */
    TapiPortDirection portDirection();

    /**
     * Returns the attribute role.
     *
     * @return role value of role
     */
    TapiRole role();

    /**
     * Returns the attribute localId.
     *
     * @return localId value of localId
     */
    String localId();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangConnectionPortListOpType.
     *
     * @return yangConnectionPortListOpType value of yangConnectionPortListOpType
     */
    OnosYangOpType yangConnectionPortListOpType();

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
     * Returns the attribute connectionEndPoint.
     *
     * @return connectionEndPoint value of connectionEndPoint
     */
    ConnectionEndPoint connectionEndPoint();

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
     * Builder for connectionPortList.
     */
    interface ConnectionPortListBuilder {
        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        ConnectionPortListBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        ConnectionPortListBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        ConnectionPortListBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        ConnectionPortListBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute portDirection.
         *
         * @return portDirection value of portDirection
         */
        TapiPortDirection portDirection();

        /**
         * Returns the attribute role.
         *
         * @return role value of role
         */
        TapiRole role();

        /**
         * Returns the attribute localId.
         *
         * @return localId value of localId
         */
        String localId();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangConnectionPortListOpType.
         *
         * @return yangConnectionPortListOpType value of yangConnectionPortListOpType
         */
        OnosYangOpType yangConnectionPortListOpType();

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
         * Returns the attribute connectionEndPoint.
         *
         * @return connectionEndPoint value of connectionEndPoint
         */
        ConnectionEndPoint connectionEndPoint();

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
         * Returns the builder object of portDirection.
         *
         * @param portDirection value of portDirection
         * @return portDirection
         */
        ConnectionPortListBuilder portDirection(TapiPortDirection portDirection);

        /**
         * Returns the builder object of role.
         *
         * @param role value of role
         * @return role
         */
        ConnectionPortListBuilder role(TapiRole role);

        /**
         * Returns the builder object of localId.
         *
         * @param localId value of localId
         * @return localId
         */
        ConnectionPortListBuilder localId(String localId);

        /**
         * Returns the builder object of yangConnectionPortListOpType.
         *
         * @param yangConnectionPortListOpType value of yangConnectionPortListOpType
         * @return yangConnectionPortListOpType
         */
        ConnectionPortListBuilder yangConnectionPortListOpType(OnosYangOpType yangConnectionPortListOpType);

        /**
         * Returns the builder object of connectionEndPoint.
         *
         * @param connectionEndPoint value of connectionEndPoint
         * @return connectionEndPoint
         */
        ConnectionPortListBuilder connectionEndPoint(ConnectionEndPoint connectionEndPoint);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        ConnectionPortListBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        ConnectionPortListBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        ConnectionPortListBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        ConnectionPortListBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        ConnectionPortListBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ConnectionPortListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ConnectionPortListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of connectionPortList.
         *
         * @return connectionPortList
         */
        ConnectionPortList build();
    }
}
