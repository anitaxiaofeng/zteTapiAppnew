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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Abstraction of an entity which represents the functionality of tapiTopology.
 */
public interface TapiTopology {

    /**
     * Identify the leaf of TapiTopology.
     */
    public enum LeafIdentifier {
        /**
         * Represents uuid.
         */
        UUID(1);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute uuid.
     *
     * @return uuid value of uuid
     */
    UniversalId uuid();

    /**
     * Returns the attribute nodeRefList.
     *
     * @return nodeRefList list of nodeRefList
     */
    List<Object> nodeRefList();

    /**
     * Returns the attribute linkRefList.
     *
     * @return linkRefList list of linkRefList
     */
    List<Object> linkRefList();

    /**
     * Returns the attribute layerProtocolNameList.
     *
     * @return layerProtocolNameList list of layerProtocolNameList
     */
    List<TapiLayerProtocolName> layerProtocolNameList();

    /**
     * Returns the attribute valueLeafFlags.
     *
     * @return valueLeafFlags value of valueLeafFlags
     */
    BitSet valueLeafFlags();

    /**
     * Returns the attribute yangTapiTopologyOpType.
     *
     * @return yangTapiTopologyOpType value of yangTapiTopologyOpType
     */
    OnosYangOpType yangTapiTopologyOpType();

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
     * Builder for tapiTopology.
     */
    interface TapiTopologyBuilder {
        /**
         * Adds to the list of nodeRefList.
         *
         * @return builder object of nodeRefList
         */
        TapiTopologyBuilder addToNodeRefList(Object addTo);

        /**
         * Adds to the list of linkRefList.
         *
         * @return builder object of linkRefList
         */
        TapiTopologyBuilder addToLinkRefList(Object addTo);

        /**
         * Adds to the list of layerProtocolNameList.
         *
         * @return builder object of layerProtocolNameList
         */
        TapiTopologyBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiTopologyBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiTopologyBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiTopologyBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiTopologyBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute uuid.
         *
         * @return uuid value of uuid
         */
        UniversalId uuid();

        /**
         * Returns the attribute nodeRefList.
         *
         * @return nodeRefList list of nodeRefList
         */
        List<Object> nodeRefList();

        /**
         * Returns the attribute linkRefList.
         *
         * @return linkRefList list of linkRefList
         */
        List<Object> linkRefList();

        /**
         * Returns the attribute layerProtocolNameList.
         *
         * @return layerProtocolNameList list of layerProtocolNameList
         */
        List<TapiLayerProtocolName> layerProtocolNameList();

        /**
         * Returns the attribute valueLeafFlags.
         *
         * @return valueLeafFlags value of valueLeafFlags
         */
        BitSet valueLeafFlags();

        /**
         * Returns the attribute yangTapiTopologyOpType.
         *
         * @return yangTapiTopologyOpType value of yangTapiTopologyOpType
         */
        OnosYangOpType yangTapiTopologyOpType();

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
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiTopologyBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of nodeRefList.
         *
         * @param nodeRefList list of nodeRefList
         * @return nodeRefList
         */
        TapiTopologyBuilder nodeRefList(List<Object> nodeRefList);

        /**
         * Returns the builder object of linkRefList.
         *
         * @param linkRefList list of linkRefList
         * @return linkRefList
         */
        TapiTopologyBuilder linkRefList(List<Object> linkRefList);

        /**
         * Returns the builder object of layerProtocolNameList.
         *
         * @param layerProtocolNameList list of layerProtocolNameList
         * @return layerProtocolNameList
         */
        TapiTopologyBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList);

        /**
         * Returns the builder object of yangTapiTopologyOpType.
         *
         * @param yangTapiTopologyOpType value of yangTapiTopologyOpType
         * @return yangTapiTopologyOpType
         */
        TapiTopologyBuilder yangTapiTopologyOpType(OnosYangOpType yangTapiTopologyOpType);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiTopologyBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiTopologyBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiTopologyBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiTopologyBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiTopologyBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiTopologyBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiTopologyBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiTopology.
         *
         * @return tapiTopology
         */
        TapiTopology build();
    }
}
