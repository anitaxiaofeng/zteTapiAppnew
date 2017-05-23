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
            .gtapiserviceendpoint.LpList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiTerminationDirection;

/**
 * Abstraction of an entity which represents the functionality of tapiServiceEndPoint.
 */
public interface TapiServiceEndPoint {

    /**
     * Identify the leaf of TapiServiceEndPoint.
     */
    public enum LeafIdentifier {
        /**
         * Represents terminationDirection.
         */
        TERMINATIONDIRECTION(1),
        /**
         * Represents uuid.
         */
        UUID(2);

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
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute nodeEdgePointRefList.
     *
     * @return nodeEdgePointRefList list of nodeEdgePointRefList
     */
    List<Object> nodeEdgePointRefList();

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
     * Returns the attribute yangTapiServiceEndPointOpType.
     *
     * @return yangTapiServiceEndPointOpType value of yangTapiServiceEndPointOpType
     */
    OnosYangOpType yangTapiServiceEndPointOpType();

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
     * Builder for tapiServiceEndPoint.
     */
    interface TapiServiceEndPointBuilder {
        /**
         * Adds to the list of nodeEdgePointRefList.
         *
         * @return builder object of nodeEdgePointRefList
         */
        TapiServiceEndPointBuilder addToNodeEdgePointRefList(Object addTo);

        /**
         * Adds to the list of physicalPortReference.
         *
         * @return builder object of physicalPortReference
         */
        TapiServiceEndPointBuilder addToPhysicalPortReference(String addTo);

        /**
         * Adds to the list of lpList.
         *
         * @return builder object of lpList
         */
        TapiServiceEndPointBuilder addToLpList(LpList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiServiceEndPointBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiServiceEndPointBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiServiceEndPointBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiServiceEndPointBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute terminationDirection.
         *
         * @return terminationDirection value of terminationDirection
         */
        TapiTerminationDirection terminationDirection();

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute nodeEdgePointRefList.
         *
         * @return nodeEdgePointRefList list of nodeEdgePointRefList
         */
        List<Object> nodeEdgePointRefList();

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
         * Returns the attribute yangTapiServiceEndPointOpType.
         *
         * @return yangTapiServiceEndPointOpType value of yangTapiServiceEndPointOpType
         */
        OnosYangOpType yangTapiServiceEndPointOpType();

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
        TapiServiceEndPointBuilder terminationDirection(TapiTerminationDirection terminationDirection);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiServiceEndPointBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of nodeEdgePointRefList.
         *
         * @param nodeEdgePointRefList list of nodeEdgePointRefList
         * @return nodeEdgePointRefList
         */
        TapiServiceEndPointBuilder nodeEdgePointRefList(List<Object> nodeEdgePointRefList);

        /**
         * Returns the builder object of physicalPortReference.
         *
         * @param physicalPortReference list of physicalPortReference
         * @return physicalPortReference
         */
        TapiServiceEndPointBuilder physicalPortReference(List<String> physicalPortReference);

        /**
         * Returns the builder object of yangTapiServiceEndPointOpType.
         *
         * @param yangTapiServiceEndPointOpType value of yangTapiServiceEndPointOpType
         * @return yangTapiServiceEndPointOpType
         */
        TapiServiceEndPointBuilder yangTapiServiceEndPointOpType(OnosYangOpType yangTapiServiceEndPointOpType);

        /**
         * Returns the builder object of lpList.
         *
         * @param lpList list of lpList
         * @return lpList
         */
        TapiServiceEndPointBuilder lpList(List<LpList> lpList);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiServiceEndPointBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiServiceEndPointBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiServiceEndPointBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiServiceEndPointBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiServiceEndPointBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiServiceEndPointBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiServiceEndPointBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiServiceEndPoint.
         *
         * @return tapiServiceEndPoint
         */
        TapiServiceEndPoint build();
    }
}
