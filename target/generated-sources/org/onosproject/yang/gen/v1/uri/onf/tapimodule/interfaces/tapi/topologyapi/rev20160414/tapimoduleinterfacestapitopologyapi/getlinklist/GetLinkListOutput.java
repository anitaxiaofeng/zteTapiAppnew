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
            .tapimoduleinterfacestapitopologyapi.getlinklist;

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.getlinklistoutput.LinkList;

/**
 * Abstraction of an entity which represents the functionality of getLinkListOutput.
 */
public interface GetLinkListOutput {

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute linkList.
     *
     * @return linkList list of linkList
     */
    List<LinkList> linkList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for getLinkListOutput.
     */
    interface GetLinkListOutputBuilder {
        /**
         * Adds to the list of linkList.
         *
         * @return builder object of linkList
         */
        GetLinkListOutputBuilder addToLinkList(LinkList addTo);

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute linkList.
         *
         * @return linkList list of linkList
         */
        List<LinkList> linkList();

        /**
         * Returns the builder object of linkList.
         *
         * @param linkList list of linkList
         * @return linkList
         */
        GetLinkListOutputBuilder linkList(List<LinkList> linkList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        GetLinkListOutputBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of getLinkListOutput.
         *
         * @return getLinkListOutput
         */
        GetLinkListOutput build();
    }
}
