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
            .gtapiservice;

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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions.TapiRole;

/**
 * Abstraction of an entity which represents the functionality of servicePortList.
 */
public interface ServicePortList {

    /**
     * Identify the leaf of ServicePortList.
     */
    public enum LeafIdentifier {
        /**
         * Represents serviceEndPointRef.
         */
        SERVICEENDPOINTREF(1),
        /**
         * Represents connectionEndPointRef.
         */
        CONNECTIONENDPOINTREF(2),
        /**
         * Represents role.
         */
        ROLE(3),
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
     * Returns the attribute serviceEndPointRef.
     *
     * @return serviceEndPointRef value of serviceEndPointRef
     */
    Object serviceEndPointRef();

    /**
     * Returns the attribute connectionEndPointRef.
     *
     * @return connectionEndPointRef value of connectionEndPointRef
     */
    Object connectionEndPointRef();

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
     * Returns the attribute yangServicePortListOpType.
     *
     * @return yangServicePortListOpType value of yangServicePortListOpType
     */
    OnosYangOpType yangServicePortListOpType();

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
     * Builder for servicePortList.
     */
    interface ServicePortListBuilder {
        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        ServicePortListBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        ServicePortListBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        ServicePortListBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        ServicePortListBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute serviceEndPointRef.
         *
         * @return serviceEndPointRef value of serviceEndPointRef
         */
        Object serviceEndPointRef();

        /**
         * Returns the attribute connectionEndPointRef.
         *
         * @return connectionEndPointRef value of connectionEndPointRef
         */
        Object connectionEndPointRef();

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
         * Returns the attribute yangServicePortListOpType.
         *
         * @return yangServicePortListOpType value of yangServicePortListOpType
         */
        OnosYangOpType yangServicePortListOpType();

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
         * Returns the builder object of serviceEndPointRef.
         *
         * @param serviceEndPointRef value of serviceEndPointRef
         * @return serviceEndPointRef
         */
        ServicePortListBuilder serviceEndPointRef(Object serviceEndPointRef);

        /**
         * Returns the builder object of connectionEndPointRef.
         *
         * @param connectionEndPointRef value of connectionEndPointRef
         * @return connectionEndPointRef
         */
        ServicePortListBuilder connectionEndPointRef(Object connectionEndPointRef);

        /**
         * Returns the builder object of role.
         *
         * @param role value of role
         * @return role
         */
        ServicePortListBuilder role(TapiRole role);

        /**
         * Returns the builder object of localId.
         *
         * @param localId value of localId
         * @return localId
         */
        ServicePortListBuilder localId(String localId);

        /**
         * Returns the builder object of yangServicePortListOpType.
         *
         * @param yangServicePortListOpType value of yangServicePortListOpType
         * @return yangServicePortListOpType
         */
        ServicePortListBuilder yangServicePortListOpType(OnosYangOpType yangServicePortListOpType);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        ServicePortListBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        ServicePortListBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        ServicePortListBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        ServicePortListBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        ServicePortListBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ServicePortListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ServicePortListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of servicePortList.
         *
         * @return servicePortList
         */
        ServicePortList build();
    }
}
