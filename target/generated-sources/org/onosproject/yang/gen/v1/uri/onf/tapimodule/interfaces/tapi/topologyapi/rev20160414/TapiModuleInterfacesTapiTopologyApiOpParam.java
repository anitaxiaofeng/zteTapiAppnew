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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414;

import com.google.common.base.MoreObjects;
import java.util.BitSet;
import java.util.Objects;

/**
 * Represents the implementation of tapiModuleInterfacesTapiTopologyApi.
 *
 * <p>
 * valueLeafFlags identify the leafs whose value are explicitly set
 * Applicable in protocol edit and query operation.
 * </p>
 *
 * <p>
 * selectLeafFlags identify the leafs to be selected, in a query operation.
 * </p>
 *
 * <p>
 * Operation type specify the node specific operation in protocols like NETCONF.
 * Applicable in protocol edit operation, not applicable in query operation.
 * </p>
 */
public class TapiModuleInterfacesTapiTopologyApiOpParam implements TapiModuleInterfacesTapiTopologyApi {
    protected OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType;
    protected boolean isSubTreeFiltered;

    @Override
    public OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType() {
        return yangTapiModuleInterfacesTapiTopologyApiOpType;
    }
    /**
     * Returns the attribute isSubTreeFiltered.
     *
     * @return isSubTreeFiltered value of isSubTreeFiltered
     */
    public boolean isSubTreeFiltered() {
        return isSubTreeFiltered;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yangTapiModuleInterfacesTapiTopologyApiOpType, isSubTreeFiltered);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapiModuleInterfacesTapiTopologyApiOpParam) {
            TapiModuleInterfacesTapiTopologyApiOpParam other = (TapiModuleInterfacesTapiTopologyApiOpParam) obj;
            return
                Objects
                .equals(yangTapiModuleInterfacesTapiTopologyApiOpType,
                 other.yangTapiModuleInterfacesTapiTopologyApiOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangTapiModuleInterfacesTapiTopologyApiOpType", yangTapiModuleInterfacesTapiTopologyApiOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .toString();
    }
    /**
     * Creates an instance of tapiModuleInterfacesTapiTopologyApi.
     *
     * @param builderObject value of builder object of tapiModuleInterfacesTapiTopologyApi
     */
    protected TapiModuleInterfacesTapiTopologyApiOpParam(TapiModuleInterfacesTapiTopologyApiBuilder builderObject) {
         yangTapiModuleInterfacesTapiTopologyApiOpType
                    = builderObject
            .yangTapiModuleInterfacesTapiTopologyApiOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
    }

    /**
     * Checks if the passed TapiModuleInterfacesTapiTopologyApi maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
     public TapiModuleInterfacesTapiTopologyApiOpParam processSubtreeFiltering(TapiModuleInterfacesTapiTopologyApi
                appInstance, boolean isSelectAllSchemaChild) {
        TapiModuleInterfacesTapiTopologyApiBuilder subTreeFilteringResultBuilder = new
                    TapiModuleInterfacesTapiTopologyApiBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
         if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
                    isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode.get(0)) {
            return processSubtreeFiltering(appInstance, true);
        }
        return (TapiModuleInterfacesTapiTopologyApiOpParam) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processChildNodesSubTreeFiltering(TapiModuleInterfacesTapiTopologyApi appInstance,
                TapiModuleInterfacesTapiTopologyApiBuilder subTreeFilteringResultBuilder, BitSet
                isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }

    /**
     * Creates an instance of tapiModuleInterfacesTapiTopologyApiOpParam.
     */
    protected TapiModuleInterfacesTapiTopologyApiOpParam() {
    }

    /**
     * Returns the attribute tapiModuleInterfacesTapiTopologyApiBuilder.
     *
     * @return tapiModuleInterfacesTapiTopologyApiBuilder
     */
    public static TapiModuleInterfacesTapiTopologyApiBuilder builder() {
        return new TapiModuleInterfacesTapiTopologyApiBuilder();
    }

    /**
     * Represents the builder implementation of tapiModuleInterfacesTapiTopologyApi.
     */
    public static class TapiModuleInterfacesTapiTopologyApiBuilder implements
                TapiModuleInterfacesTapiTopologyApi.TapiModuleInterfacesTapiTopologyApiBuilder {
        protected OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType;
        protected boolean isSubTreeFiltered;


        @Override
        public OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType() {
            return yangTapiModuleInterfacesTapiTopologyApiOpType;
        }
        /**
         * Returns the attribute isSubTreeFiltered.
         *
         * @return isSubTreeFiltered value of isSubTreeFiltered
         */
        public boolean isSubTreeFiltered() {
            return isSubTreeFiltered;
        }

        @Override
        public TapiModuleInterfacesTapiTopologyApiBuilder
                    yangTapiModuleInterfacesTapiTopologyApiOpType(OnosYangOpType
                    yangTapiModuleInterfacesTapiTopologyApiOpType) {
            this.yangTapiModuleInterfacesTapiTopologyApiOpType = yangTapiModuleInterfacesTapiTopologyApiOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiModuleInterfacesTapiTopologyApiBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }
        @Override
        public TapiModuleInterfacesTapiTopologyApi build() {
            return new TapiModuleInterfacesTapiTopologyApiOpParam(this);
        }

        /**
         * Builds object of tapiModuleInterfacesTapiTopologyApi.
         *
         * @return tapiModuleInterfacesTapiTopologyApi
         */
        public TapiModuleInterfacesTapiTopologyApi buildForFilter() {
            isSubTreeFiltered = true;
            return new TapiModuleInterfacesTapiTopologyApiOpParam(this);
        }
        /**
         * Creates an instance of tapiModuleInterfacesTapiTopologyApiBuilder.
         */
        public TapiModuleInterfacesTapiTopologyApiBuilder() {
        }

    }
}
