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
            .gtapinodeedgepoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Abstraction of an entity which represents the functionality of tapiNodeEdgePoint.
 */
public interface TapiNodeEdgePoint {

    /**
     * Identify the leaf of TapiNodeEdgePoint.
     */
    public enum LeafIdentifier {
        /**
         * Represents terminationDirection.
         */
        TERMINATIONDIRECTION(1),
        /**
         * Represents serverConnEpref.
         */
        SERVERCONNEPREF(2),
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
     * Returns the attribute serverConnEpref.
     *
     * @return serverConnEpref value of serverConnEpref
     */
    Object serverConnEpref();

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute serviceEprefList.
     *
     * @return serviceEprefList list of serviceEprefList
     */
    List<Object> serviceEprefList();

    /**
     * Returns the attribute clientConnEprefList.
     *
     * @return clientConnEprefList list of clientConnEprefList
     */
    List<Object> clientConnEprefList();

    /**
     * Returns the attribute physicalPortReference.
     *
     * @return physicalPortReference list of physicalPortReference
     */
    List<String> physicalPortReference();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTapiNodeEdgePointOpType.
     *
     * @return yangTapiNodeEdgePointOpType value of yangTapiNodeEdgePointOpType
     */
    OnosYangOpType yangTapiNodeEdgePointOpType();

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
     * Builder for tapiNodeEdgePoint.
     */
    interface TapiNodeEdgePointBuilder {
        /**
         * Adds to the list of serviceEprefList.
         *
         * @return builder object of serviceEprefList
         */
        TapiNodeEdgePointBuilder addToServiceEprefList(Object addTo);

        /**
         * Adds to the list of clientConnEprefList.
         *
         * @return builder object of clientConnEprefList
         */
        TapiNodeEdgePointBuilder addToClientConnEprefList(Object addTo);

        /**
         * Adds to the list of physicalPortReference.
         *
         * @return builder object of physicalPortReference
         */
        TapiNodeEdgePointBuilder addToPhysicalPortReference(String addTo);

        /**
         * Adds to the list of lpList.
         *
         * @return builder object of lpList
         */
        TapiNodeEdgePointBuilder addToLpList(LpList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiNodeEdgePointBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiNodeEdgePointBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiNodeEdgePointBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiNodeEdgePointBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute terminationDirection.
         *
         * @return terminationDirection value of terminationDirection
         */
        TapiTerminationDirection terminationDirection();

        /**
         * Returns the attribute serverConnEpref.
         *
         * @return serverConnEpref value of serverConnEpref
         */
        Object serverConnEpref();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute serviceEprefList.
         *
         * @return serviceEprefList list of serviceEprefList
         */
        List<Object> serviceEprefList();

        /**
         * Returns the attribute clientConnEprefList.
         *
         * @return clientConnEprefList list of clientConnEprefList
         */
        List<Object> clientConnEprefList();

        /**
         * Returns the attribute physicalPortReference.
         *
         * @return physicalPortReference list of physicalPortReference
         */
        List<String> physicalPortReference();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTapiNodeEdgePointOpType.
         *
         * @return yangTapiNodeEdgePointOpType value of yangTapiNodeEdgePointOpType
         */
        OnosYangOpType yangTapiNodeEdgePointOpType();

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
        TapiNodeEdgePointBuilder terminationDirection(TapiTerminationDirection terminationDirection);

        /**
         * Returns the builder object of serverConnEpref.
         *
         * @param serverConnEpref value of serverConnEpref
         * @return serverConnEpref
         */
        TapiNodeEdgePointBuilder serverConnEpref(Object serverConnEpref);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiNodeEdgePointBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of serviceEprefList.
         *
         * @param serviceEprefList list of serviceEprefList
         * @return serviceEprefList
         */
        TapiNodeEdgePointBuilder serviceEprefList(List<Object> serviceEprefList);

        /**
         * Returns the builder object of clientConnEprefList.
         *
         * @param clientConnEprefList list of clientConnEprefList
         * @return clientConnEprefList
         */
        TapiNodeEdgePointBuilder clientConnEprefList(List<Object> clientConnEprefList);

        /**
         * Returns the builder object of physicalPortReference.
         *
         * @param physicalPortReference list of physicalPortReference
         * @return physicalPortReference
         */
        TapiNodeEdgePointBuilder physicalPortReference(List<String> physicalPortReference);

        /**
         * Returns the builder object of yangTapiNodeEdgePointOpType.
         *
         * @param yangTapiNodeEdgePointOpType value of yangTapiNodeEdgePointOpType
         * @return yangTapiNodeEdgePointOpType
         */
        TapiNodeEdgePointBuilder yangTapiNodeEdgePointOpType(OnosYangOpType yangTapiNodeEdgePointOpType);

        /**
         * Returns the builder object of lpList.
         *
         * @param lpList list of lpList
         * @return lpList
         */
        TapiNodeEdgePointBuilder lpList(List<LpList> lpList);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiNodeEdgePointBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiNodeEdgePointBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiNodeEdgePointBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiNodeEdgePointBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiNodeEdgePointBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiNodeEdgePointBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiNodeEdgePointBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiNodeEdgePoint.
         *
         * @return tapiNodeEdgePoint
         */
        TapiNodeEdgePoint build();
    }
}
