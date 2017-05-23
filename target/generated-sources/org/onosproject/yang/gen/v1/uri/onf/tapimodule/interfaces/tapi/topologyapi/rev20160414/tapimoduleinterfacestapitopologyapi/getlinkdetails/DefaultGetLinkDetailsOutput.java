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

import com.google.common.base.MoreObjects;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.getlinkdetailsoutput.Link;

/**
 * Represents the implementation of getLinkDetailsOutput.
 */
public class DefaultGetLinkDetailsOutput implements GetLinkDetailsOutput {
    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected Link link;

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    @Override
    public Link link() {
        return link;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangAugmentedInfoMap, link);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultGetLinkDetailsOutput) {
            DefaultGetLinkDetailsOutput other = (DefaultGetLinkDetailsOutput) obj;
            return
                Objects.equals(yangAugmentedInfoMap, other.yangAugmentedInfoMap) &&
                Objects.equals(link, other.link);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangAugmentedInfoMap", yangAugmentedInfoMap)
            .add("link", link)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }
    /**
     * Creates an instance of getLinkDetailsOutput.
     *
     * @param builderObject value of builder object of getLinkDetailsOutput
     */
    protected DefaultGetLinkDetailsOutput(GetLinkDetailsOutputBuilder builderObject) {
        yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
        link = builderObject.link();
    }

    /**
     * Creates an instance of defaultGetLinkDetailsOutput.
     */
    protected DefaultGetLinkDetailsOutput() {
    }

    /**
     * Returns the attribute getLinkDetailsOutputBuilder.
     *
     * @return getLinkDetailsOutputBuilder
     */
    public static GetLinkDetailsOutputBuilder builder() {
        return new GetLinkDetailsOutputBuilder();
    }

    /**
     * Represents the builder implementation of getLinkDetailsOutput.
     */
    public static class GetLinkDetailsOutputBuilder implements GetLinkDetailsOutput.GetLinkDetailsOutputBuilder {
        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected Link link;


        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }

        @Override
        public Link link() {
            return link;
        }

        @Override
        public GetLinkDetailsOutputBuilder link(Link link) {
            this.link = link;
            return this;
        }

        @Override
        public GetLinkDetailsOutputBuilder addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
            return this;
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }
        @Override
        public GetLinkDetailsOutput build() {
            return new DefaultGetLinkDetailsOutput(this);
        }

        /**
         * Creates an instance of getLinkDetailsOutputBuilder.
         */
        public GetLinkDetailsOutputBuilder() {
        }

    }
}
