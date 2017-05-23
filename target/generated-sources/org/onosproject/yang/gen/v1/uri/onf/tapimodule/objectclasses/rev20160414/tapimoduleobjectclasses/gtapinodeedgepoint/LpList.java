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
            .gtapinodeedgepoint;

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
            .gtapilayerprotocol.EthCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.EthNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.OduCepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapilayerprotocol.OduNepPac;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Abstraction of an entity which represents the functionality of lpList.
 */
public interface LpList {

    /**
     * Identify the leaf of LpList.
     */
    public enum LeafIdentifier {
        /**
         * Represents layerProtocolName.
         */
        LAYERPROTOCOLNAME(1),
        /**
         * Represents configuredClientCapacity.
         */
        CONFIGUREDCLIENTCAPACITY(2),
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
     * Returns the attribute layerProtocolName.
     *
     * @return layerProtocolName value of layerProtocolName
     */
    TapiLayerProtocolName layerProtocolName();

    /**
     * Returns the attribute configuredClientCapacity.
     *
     * @return configuredClientCapacity value of configuredClientCapacity
     */
    String configuredClientCapacity();

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
     * Returns the attribute yangLpListOpType.
     *
     * @return yangLpListOpType value of yangLpListOpType
     */
    OnosYangOpType yangLpListOpType();

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
     * Returns the attribute oduNepPac.
     *
     * @return oduNepPac value of oduNepPac
     */
    OduNepPac oduNepPac();

    /**
     * Returns the attribute oduCepPac.
     *
     * @return oduCepPac value of oduCepPac
     */
    OduCepPac oduCepPac();

    /**
     * Returns the attribute ethNepPac.
     *
     * @return ethNepPac value of ethNepPac
     */
    EthNepPac ethNepPac();

    /**
     * Returns the attribute ethCepPac.
     *
     * @return ethCepPac value of ethCepPac
     */
    EthCepPac ethCepPac();

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
     * Builder for lpList.
     */
    interface LpListBuilder {
        /**
         * Adds to the list of localIdList.
         *
         * @return builder object of localIdList
         */
        LpListBuilder addToLocalIdList(LocalIdList addTo);

        /**
         * Adds to the list of name.
         *
         * @return builder object of name
         */
        LpListBuilder addToName(Name addTo);

        /**
         * Adds to the list of label.
         *
         * @return builder object of label
         */
        LpListBuilder addToLabel(Label addTo);

        /**
         * Adds to the list of extension.
         *
         * @return builder object of extension
         */
        LpListBuilder addToExtension(Extension addTo);

        /**
         * Returns the attribute layerProtocolName.
         *
         * @return layerProtocolName value of layerProtocolName
         */
        TapiLayerProtocolName layerProtocolName();

        /**
         * Returns the attribute configuredClientCapacity.
         *
         * @return configuredClientCapacity value of configuredClientCapacity
         */
        String configuredClientCapacity();

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
         * Returns the attribute yangLpListOpType.
         *
         * @return yangLpListOpType value of yangLpListOpType
         */
        OnosYangOpType yangLpListOpType();

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
         * Returns the attribute oduNepPac.
         *
         * @return oduNepPac value of oduNepPac
         */
        OduNepPac oduNepPac();

        /**
         * Returns the attribute oduCepPac.
         *
         * @return oduCepPac value of oduCepPac
         */
        OduCepPac oduCepPac();

        /**
         * Returns the attribute ethNepPac.
         *
         * @return ethNepPac value of ethNepPac
         */
        EthNepPac ethNepPac();

        /**
         * Returns the attribute ethCepPac.
         *
         * @return ethCepPac value of ethCepPac
         */
        EthCepPac ethCepPac();

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
         * Returns the builder object of layerProtocolName.
         *
         * @param layerProtocolName value of layerProtocolName
         * @return layerProtocolName
         */
        LpListBuilder layerProtocolName(TapiLayerProtocolName layerProtocolName);

        /**
         * Returns the builder object of configuredClientCapacity.
         *
         * @param configuredClientCapacity value of configuredClientCapacity
         * @return configuredClientCapacity
         */
        LpListBuilder configuredClientCapacity(String configuredClientCapacity);

        /**
         * Returns the builder object of localId.
         *
         * @param localId value of localId
         * @return localId
         */
        LpListBuilder localId(String localId);

        /**
         * Returns the builder object of yangLpListOpType.
         *
         * @param yangLpListOpType value of yangLpListOpType
         * @return yangLpListOpType
         */
        LpListBuilder yangLpListOpType(OnosYangOpType yangLpListOpType);

        /**
         * Returns the builder object of oduNepPac.
         *
         * @param oduNepPac value of oduNepPac
         * @return oduNepPac
         */
        LpListBuilder oduNepPac(OduNepPac oduNepPac);

        /**
         * Returns the builder object of oduCepPac.
         *
         * @param oduCepPac value of oduCepPac
         * @return oduCepPac
         */
        LpListBuilder oduCepPac(OduCepPac oduCepPac);

        /**
         * Returns the builder object of ethNepPac.
         *
         * @param ethNepPac value of ethNepPac
         * @return ethNepPac
         */
        LpListBuilder ethNepPac(EthNepPac ethNepPac);

        /**
         * Returns the builder object of ethCepPac.
         *
         * @param ethCepPac value of ethCepPac
         * @return ethCepPac
         */
        LpListBuilder ethCepPac(EthCepPac ethCepPac);

        /**
         * Returns the builder object of localIdList.
         *
         * @param localIdList list of localIdList
         * @return localIdList
         */
        LpListBuilder localIdList(List<LocalIdList> localIdList);

        /**
         * Returns the builder object of name.
         *
         * @param name list of name
         * @return name
         */
        LpListBuilder name(List<Name> name);

        /**
         * Returns the builder object of label.
         *
         * @param label list of label
         * @return label
         */
        LpListBuilder label(List<Label> label);

        /**
         * Returns the builder object of extension.
         *
         * @param extension list of extension
         * @return extension
         */
        LpListBuilder extension(List<Extension> extension);

        /**
         * Returns the builder object of statePac.
         *
         * @param statePac value of statePac
         * @return statePac
         */
        LpListBuilder statePac(StatePac statePac);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        LpListBuilder addYangAugmentedInfo(Object value, Class classObject);

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
        LpListBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of lpList.
         *
         * @return lpList
         */
        LpList build();
    }
}
