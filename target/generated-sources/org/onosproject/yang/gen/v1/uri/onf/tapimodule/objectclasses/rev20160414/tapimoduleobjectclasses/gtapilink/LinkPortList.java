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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiPortDirection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.TapiRole;

/**
 * Abstraction of an entity which represents the functionality of linkPortList.
 */
public interface LinkPortList {

    /**
     * Identify the leaf of LinkPortList.
     */
    public enum LeafIdentifier {
        /**
         * Represents role.
         */
        ROLE(1),
        /**
         * Represents offNetworkAddress.
         */
        OFFNETWORKADDRESS(2),
        /**
         * Represents linkPortDirection.
         */
        LINKPORTDIRECTION(3),
        /**
         * Represents localId.
         */
        LOCALID(4);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute role.
     *
     * @return role value of role
     */
    TapiRole role();

    /**
     * Returns the attribute offNetworkAddress.
     *
     * @return offNetworkAddress value of offNetworkAddress
     */
    String offNetworkAddress();

    /**
     * Returns the attribute linkPortDirection.
     *
     * @return linkPortDirection value of linkPortDirection
     */
    TapiPortDirection linkPortDirection();

    /**
     * Returns the attribute localId.
     *
     * @return localId value of localId
     */
    String localId();

    /**
     * Returns the attribute nodeEdgePointRefList.
     *
     * @return nodeEdgePointRefList list of nodeEdgePointRefList
     */
    List<Object> nodeEdgePointRefList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangLinkPortListOpType.
     *
     * @return yangLinkPortListOpType value of yangLinkPortListOpType
     */
    OnosYangOpType yangLinkPortListOpType();

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
     * Builder for linkPortList.
     */
    interface LinkPortListBuilder {
        /**
         * Adds to the list of nodeEdgePointRefList.
         *
         * @return builder object of nodeEdgePointRefList
         */
        LinkPortListBuilder addToNodeEdgePointRefList(Object addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        LinkPortListBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        LinkPortListBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        LinkPortListBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        LinkPortListBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute role.
         *
         * @return role value of role
         */
        TapiRole role();

        /**
         * Returns the attribute offNetworkAddress.
         *
         * @return offNetworkAddress value of offNetworkAddress
         */
        String offNetworkAddress();

        /**
         * Returns the attribute linkPortDirection.
         *
         * @return linkPortDirection value of linkPortDirection
         */
        TapiPortDirection linkPortDirection();

        /**
         * Returns the attribute localId.
         *
         * @return localId value of localId
         */
        String localId();

        /**
         * Returns the attribute nodeEdgePointRefList.
         *
         * @return nodeEdgePointRefList list of nodeEdgePointRefList
         */
        List<Object> nodeEdgePointRefList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangLinkPortListOpType.
         *
         * @return yangLinkPortListOpType value of yangLinkPortListOpType
         */
        OnosYangOpType yangLinkPortListOpType();

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
         * Returns the builder object of role.
         *
         * @param role value of role
         * @return role
         */
        LinkPortListBuilder role(TapiRole role);

        /**
         * Returns the builder object of offNetworkAddress.
         *
         * @param offNetworkAddress value of offNetworkAddress
         * @return offNetworkAddress
         */
        LinkPortListBuilder offNetworkAddress(String offNetworkAddress);

        /**
         * Returns the builder object of linkPortDirection.
         *
         * @param linkPortDirection value of linkPortDirection
         * @return linkPortDirection
         */
        LinkPortListBuilder linkPortDirection(TapiPortDirection linkPortDirection);

        /**
         * Returns the builder object of localId.
         *
         * @param localId value of localId
         * @return localId
         */
        LinkPortListBuilder localId(String localId);

        /**
         * Returns the builder object of nodeEdgePointRefList.
         *
         * @param nodeEdgePointRefList list of nodeEdgePointRefList
         * @return nodeEdgePointRefList
         */
        LinkPortListBuilder nodeEdgePointRefList(List<Object> nodeEdgePointRefList);

        /**
         * Returns the builder object of yangLinkPortListOpType.
         *
         * @param yangLinkPortListOpType value of yangLinkPortListOpType
         * @return yangLinkPortListOpType
         */
        LinkPortListBuilder yangLinkPortListOpType(OnosYangOpType yangLinkPortListOpType);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        LinkPortListBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        LinkPortListBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        LinkPortListBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        LinkPortListBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        LinkPortListBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        LinkPortListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        LinkPortListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of linkPortList.
         *
         * @return linkPortList
         */
        LinkPortList build();
    }
}
