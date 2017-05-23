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

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.getlinklistoutput.LinkList;

/**
 * Represents the implementation of getLinkListOutput.
 */
public class DefaultGetLinkListOutput implements GetLinkListOutput {
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected List<LinkList> linkList;

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public List<LinkList> linkList() {
        return linkList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangAugmentedInfoMap, linkList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetLinkListOutput) {
            DefaultGetLinkListOutput other = (DefaultGetLinkListOutput) obj;
            return
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(linkList, other.linkList);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("linkList", linkList)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getLinkListOutput.
     *
     * @param builderObject value of builder object of getLinkListOutput
     */
    protected DefaultGetLinkListOutput(GetLinkListOutputBuilder builderObject) {
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        linkList = builderObject.linkList();
    }

    /**
     * Creates an instance of defaultGetLinkListOutput.
     */
    protected DefaultGetLinkListOutput() {
    }

    /**
     * Returns the attribute getLinkListOutputBuilder.
     *
     * @return getLinkListOutputBuilder
     */
    public static GetLinkListOutputBuilder builder() {
        return new GetLinkListOutputBuilder();
    }

    /**
     * Represents the builder implementation of getLinkListOutput.
     */
    public static class GetLinkListOutputBuilder implements GetLinkListOutput.GetLinkListOutputBuilder {
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected List<LinkList> linkList;


        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public List<LinkList> linkList() {
            return linkList;
        }

        @Override
        public GetLinkListOutputBuilder linkList(List<LinkList> linkList) {
            this.linkList = linkList;
            return this;
        }

        @Override
        public GetLinkListOutputBuilder addToLinkList(LinkList addTo) {
            if (linkList == null) {
                linkList = new ArrayList<>();
            }
            linkList.add(addTo);
            return this;
        }


        @Override
        public GetLinkListOutputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetLinkListOutput build() {
            return new DefaultGetLinkListOutput(this);
        }

        /**
         * Creates an instance of getLinkListOutputBuilder.
         */
        public GetLinkListOutputBuilder() {
        }

    }
}
