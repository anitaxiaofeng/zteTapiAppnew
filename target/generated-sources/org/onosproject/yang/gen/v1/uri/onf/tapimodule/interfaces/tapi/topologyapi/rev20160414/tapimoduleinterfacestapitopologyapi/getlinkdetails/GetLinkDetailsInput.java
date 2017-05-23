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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails;

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.getlinkdetailsinput.LinkName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.getlinkdetailsinput.TopologyName;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .TapiLayerProtocolName;

/**
 * Abstraction of an entity which represents the functionality of getLinkDetailsInput.
 */
public interface GetLinkDetailsInput {

    /**
     * Identify the leaf of GetLinkDetailsInput.
     */
    public enum LeafIdentifier {
        /**
         * Represents topologyId.
         */
        TOPOLOGYID(1),
        /**
         * Represents linkId.
         */
        LINKID(2);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute topologyId.
     *
     * @return topologyId value of topologyId
     */
    UniversalId topologyId();

    /**
     * Returns the attribute linkId.
     *
     * @return linkId value of linkId
     */
    UniversalId linkId();

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
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute topologyName.
     *
     * @return topologyName value of topologyName
     */
    TopologyName topologyName();

    /**
     * Returns the attribute linkName.
     *
     * @return linkName value of linkName
     */
    LinkName linkName();


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
     * Builder for getLinkDetailsInput.
     */
    interface GetLinkDetailsInputBuilder {
        /**
         * Adds to the list of layerProtocolNameList.
         *
         * @return builder object of layerProtocolNameList
         */
        GetLinkDetailsInputBuilder addToLayerProtocolNameList(TapiLayerProtocolName addTo);

        /**
         * Returns the attribute topologyId.
         *
         * @return topologyId value of topologyId
         */
        UniversalId topologyId();

        /**
         * Returns the attribute linkId.
         *
         * @return linkId value of linkId
         */
        UniversalId linkId();

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
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute topologyName.
         *
         * @return topologyName value of topologyName
         */
        TopologyName topologyName();

        /**
         * Returns the attribute linkName.
         *
         * @return linkName value of linkName
         */
        LinkName linkName();

        /**
         * Returns the builder object of topologyId.
         *
         * @param topologyId value of topologyId
         * @return topologyId
         */
        GetLinkDetailsInputBuilder topologyId(UniversalId topologyId);

        /**
         * Returns the builder object of linkId.
         *
         * @param linkId value of linkId
         * @return linkId
         */
        GetLinkDetailsInputBuilder linkId(UniversalId linkId);

        /**
         * Returns the builder object of layerProtocolNameList.
         *
         * @param layerProtocolNameList list of layerProtocolNameList
         * @return layerProtocolNameList
         */
        GetLinkDetailsInputBuilder layerProtocolNameList(List<TapiLayerProtocolName> layerProtocolNameList);

        /**
         * Returns the builder object of topologyName.
         *
         * @param topologyName value of topologyName
         * @return topologyName
         */
        GetLinkDetailsInputBuilder topologyName(TopologyName topologyName);

        /**
         * Returns the builder object of linkName.
         *
         * @param linkName value of linkName
         * @return linkName
         */
        GetLinkDetailsInputBuilder linkName(LinkName linkName);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        GetLinkDetailsInputBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of getLinkDetailsInput.
         *
         * @return getLinkDetailsInput
         */
        GetLinkDetailsInput build();
    }
}
