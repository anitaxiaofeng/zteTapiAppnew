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
            .gtapiconnectionport;

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
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
            .gtapiconnectionendpoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Abstraction of an entity which represents the functionality of connectionEndPoint.
 */
public interface ConnectionEndPoint {

    /**
     * Identify the leaf of ConnectionEndPoint.
     */
    public enum LeafIdentifier {
        /**
         * Represents terminationDirection.
         */
        TERMINATIONDIRECTION(1),
        /**
         * Represents serverNodeEpref.
         */
        SERVERNODEEPREF(2),
        /**
         * Represents uuid.
         */
        UUID(3);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute terminationDirection.
     *
     * @return terminationDirection value of terminationDirection
     */
    TapiTerminationDirection terminationDirection();

    /**
     * Returns the attribute serverNodeEpref.
     *
     * @return serverNodeEpref value of serverNodeEpref
     */
    Object serverNodeEpref();

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute clientNodeEprefList.
     *
     * @return clientNodeEprefList list of clientNodeEprefList
     */
    List<Object> clientNodeEprefList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangConnectionEndPointOpType.
     *
     * @return yangConnectionEndPointOpType value of yangConnectionEndPointOpType
     */
    OnosYangOpType yangConnectionEndPointOpType();

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
     * Returns the attribute lpList.
     *
     * @return lpList list of lpList
     */
    List<LpList> lpList();

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
     * Builder for connectionEndPoint.
     */
    interface ConnectionEndPointBuilder {
        /**
         * Adds to the list of clientNodeEprefList.
         *
         * @return builder object of clientNodeEprefList
         */
        ConnectionEndPointBuilder addToClientNodeEprefList(Object addTo);

        /**
         * Adds to the list of lpList.
         *
         * @return builder object of lpList
         */
        ConnectionEndPointBuilder addToLpList(LpList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        ConnectionEndPointBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        ConnectionEndPointBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        ConnectionEndPointBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        ConnectionEndPointBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute terminationDirection.
         *
         * @return terminationDirection value of terminationDirection
         */
        TapiTerminationDirection terminationDirection();

        /**
         * Returns the attribute serverNodeEpref.
         *
         * @return serverNodeEpref value of serverNodeEpref
         */
        Object serverNodeEpref();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute clientNodeEprefList.
         *
         * @return clientNodeEprefList list of clientNodeEprefList
         */
        List<Object> clientNodeEprefList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangConnectionEndPointOpType.
         *
         * @return yangConnectionEndPointOpType value of yangConnectionEndPointOpType
         */
        OnosYangOpType yangConnectionEndPointOpType();

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
         * Returns the attribute lpList.
         *
         * @return lpList list of lpList
         */
        List<LpList> lpList();

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
         * Returns the builder object of terminationDirection.
         *
         * @param terminationDirection value of terminationDirection
         * @return terminationDirection
         */
        ConnectionEndPointBuilder terminationDirection(TapiTerminationDirection terminationDirection);

        /**
         * Returns the builder object of serverNodeEpref.
         *
         * @param serverNodeEpref value of serverNodeEpref
         * @return serverNodeEpref
         */
        ConnectionEndPointBuilder serverNodeEpref(Object serverNodeEpref);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        ConnectionEndPointBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of clientNodeEprefList.
         *
         * @param clientNodeEprefList list of clientNodeEprefList
         * @return clientNodeEprefList
         */
        ConnectionEndPointBuilder clientNodeEprefList(List<Object> clientNodeEprefList);

        /**
         * Returns the builder object of yangConnectionEndPointOpType.
         *
         * @param yangConnectionEndPointOpType value of yangConnectionEndPointOpType
         * @return yangConnectionEndPointOpType
         */
        ConnectionEndPointBuilder yangConnectionEndPointOpType(OnosYangOpType yangConnectionEndPointOpType);

        /**
         * Returns the builder object of lpList.
         *
         * @param lpList list of lpList
         * @return lpList
         */
        ConnectionEndPointBuilder lpList(List<LpList> lpList);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        ConnectionEndPointBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        ConnectionEndPointBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        ConnectionEndPointBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        ConnectionEndPointBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        ConnectionEndPointBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        ConnectionEndPointBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        ConnectionEndPointBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of connectionEndPoint.
         *
         * @return connectionEndPoint
         */
        ConnectionEndPoint build();
    }
}
