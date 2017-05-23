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
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .LinkPortList;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .RiskParameterPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferCapacityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferCostPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferIntegrityPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .TransferTimingPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapilink
            .ValidationPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLinkDirection;

/**
 * Abstraction of an entity which represents the functionality of tapiLink.
 */
public interface TapiLink {

    /**
     * Identify the leaf of TapiLink.
     */
    public enum LeafIdentifier {
        /**
         * Represents linkDirection.
         */
        LINKDIRECTION(1),
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
     * Returns the attribute linkDirection.
     *
     * @return linkDirection value of linkDirection
     */
    TapiLinkDirection linkDirection();

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
     * Returns the attribute yangTapiLinkOpType.
     *
     * @return yangTapiLinkOpType value of yangTapiLinkOpType
     */
    OnosYangOpType yangTapiLinkOpType();

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
     * Returns the attribute linkPortList.
     *
     * @return linkPortList list of linkPortList
     */
    List<LinkPortList> linkPortList();

    /**
     * Returns the attribute riskParameterPac.
     *
     * @return riskParameterPac value of riskParameterPac
     */
    RiskParameterPac riskParameterPac();

    /**
     * Returns the attribute transferCostPac.
     *
     * @return transferCostPac value of transferCostPac
     */
    TransferCostPac transferCostPac();

    /**
     * Returns the attribute transferTimingPac.
     *
     * @return transferTimingPac value of transferTimingPac
     */
    TransferTimingPac transferTimingPac();

    /**
     * Returns the attribute transferCapacityPac.
     *
     * @return transferCapacityPac value of transferCapacityPac
     */
    TransferCapacityPac transferCapacityPac();

    /**
     * Returns the attribute transferIntegrityPac.
     *
     * @return transferIntegrityPac value of transferIntegrityPac
     */
    TransferIntegrityPac transferIntegrityPac();

    /**
     * Returns the attribute validationPac.
     *
     * @return validationPac value of validationPac
     */
    ValidationPac validationPac();

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
     * Builder for tapiLink.
     */
    interface TapiLinkBuilder {
        /**
         * Adds to the list of nodeRefList.
         *
         * @return builder object of nodeRefList
         */
        TapiLinkBuilder addToNodeRefList(Object addTo);

        /**
         * Adds to the list of layerProtocolNameList.
         *
         * @return builder object of layerProtocolNameList
         */
        TapiLinkBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo);

        /**
         * Adds to the list of linkPortList.
         *
         * @return builder object of linkPortList
         */
        TapiLinkBuilder addToLinkPortList(LinkPortList addTo);

        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        TapiLinkBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        TapiLinkBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        TapiLinkBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        TapiLinkBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute linkDirection.
         *
         * @return linkDirection value of linkDirection
         */
        TapiLinkDirection linkDirection();

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
         * Returns the attribute yangTapiLinkOpType.
         *
         * @return yangTapiLinkOpType value of yangTapiLinkOpType
         */
        OnosYangOpType yangTapiLinkOpType();

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
         * Returns the attribute linkPortList.
         *
         * @return linkPortList list of linkPortList
         */
        List<LinkPortList> linkPortList();

        /**
         * Returns the attribute riskParameterPac.
         *
         * @return riskParameterPac value of riskParameterPac
         */
        RiskParameterPac riskParameterPac();

        /**
         * Returns the attribute transferCostPac.
         *
         * @return transferCostPac value of transferCostPac
         */
        TransferCostPac transferCostPac();

        /**
         * Returns the attribute transferTimingPac.
         *
         * @return transferTimingPac value of transferTimingPac
         */
        TransferTimingPac transferTimingPac();

        /**
         * Returns the attribute transferCapacityPac.
         *
         * @return transferCapacityPac value of transferCapacityPac
         */
        TransferCapacityPac transferCapacityPac();

        /**
         * Returns the attribute transferIntegrityPac.
         *
         * @return transferIntegrityPac value of transferIntegrityPac
         */
        TransferIntegrityPac transferIntegrityPac();

        /**
         * Returns the attribute validationPac.
         *
         * @return validationPac value of validationPac
         */
        ValidationPac validationPac();

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
         * Returns the builder object of linkDirection.
         *
         * @param linkDirection value of linkDirection
         * @return linkDirection
         */
        TapiLinkBuilder linkDirection(TapiLinkDirection linkDirection);

        /**
         * Returns the builder object of uuid.
         *
         * @param uuid value of uuid
         * @return uuid
         */
        TapiLinkBuilder uuid(UniversalId uuid);

        /**
         * Returns the builder object of nodeRefList.
         *
         * @param nodeRefList list of nodeRefList
         * @return nodeRefList
         */
        TapiLinkBuilder nodeRefList(List<Object> nodeRefList);

        /**
         * Returns the builder object of layerProtocolNameList.
         *
         * @param layerProtocolNameList list of layerProtocolNameList
         * @return layerProtocolNameList
         */
        TapiLinkBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList);

        /**
         * Returns the builder object of yangTapiLinkOpType.
         *
         * @param yangTapiLinkOpType value of yangTapiLinkOpType
         * @return yangTapiLinkOpType
         */
        TapiLinkBuilder yangTapiLinkOpType(OnosYangOpType yangTapiLinkOpType);

        /**
         * Returns the builder object of linkPortList.
         *
         * @param linkPortList list of linkPortList
         * @return linkPortList
         */
        TapiLinkBuilder linkPortList(List<LinkPortList> linkPortList);

        /**
         * Returns the builder object of riskParameterPac.
         *
         * @param riskParameterPac value of riskParameterPac
         * @return riskParameterPac
         */
        TapiLinkBuilder riskParameterPac(RiskParameterPac riskParameterPac);

        /**
         * Returns the builder object of transferCostPac.
         *
         * @param transferCostPac value of transferCostPac
         * @return transferCostPac
         */
        TapiLinkBuilder transferCostPac(TransferCostPac transferCostPac);

        /**
         * Returns the builder object of transferTimingPac.
         *
         * @param transferTimingPac value of transferTimingPac
         * @return transferTimingPac
         */
        TapiLinkBuilder transferTimingPac(TransferTimingPac transferTimingPac);

        /**
         * Returns the builder object of transferCapacityPac.
         *
         * @param transferCapacityPac value of transferCapacityPac
         * @return transferCapacityPac
         */
        TapiLinkBuilder transferCapacityPac(TransferCapacityPac transferCapacityPac);

        /**
         * Returns the builder object of transferIntegrityPac.
         *
         * @param transferIntegrityPac value of transferIntegrityPac
         * @return transferIntegrityPac
         */
        TapiLinkBuilder transferIntegrityPac(TransferIntegrityPac transferIntegrityPac);

        /**
         * Returns the builder object of validationPac.
         *
         * @param validationPac value of validationPac
         * @return validationPac
         */
        TapiLinkBuilder validationPac(ValidationPac validationPac);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        TapiLinkBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        TapiLinkBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        TapiLinkBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        TapiLinkBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        TapiLinkBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        TapiLinkBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        TapiLinkBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of tapiLink.
         *
         * @return tapiLink
         */
        TapiLink build();
    }
}
