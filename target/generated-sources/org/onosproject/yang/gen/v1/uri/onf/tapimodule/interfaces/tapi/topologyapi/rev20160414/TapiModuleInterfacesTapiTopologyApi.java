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

/**
 * Abstraction of an entity which represents the functionality of tapiModuleInterfacesTapiTopologyApi.
 */
public interface TapiModuleInterfacesTapiTopologyApi {
    /**
     * Specify the node specific operation in protocols like NETCONF.
     * Applicable in protocol edit operation, not applicable in query operation
     */
    public static enum OnosYangOpType {
        MERGE,
        REPLACE,
        CREATE,
        DELETE,
        REMOVE,
        NONE
    }

    /**
     * Returns the attribute yangTapiModuleInterfacesTapiTopologyApiOpType.
     *
     * @return yangTapiModuleInterfacesTapiTopologyApiOpType value of yangTapiModuleInterfacesTapiTopologyApiOpType
     */
    OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType();


    /**
     * Builder for tapiModuleInterfacesTapiTopologyApi.
     */
    interface TapiModuleInterfacesTapiTopologyApiBuilder {
        /**
         * Returns the attribute yangTapiModuleInterfacesTapiTopologyApiOpType.
         *
         * @return yangTapiModuleInterfacesTapiTopologyApiOpType value of
                     yangTapiModuleInterfacesTapiTopologyApiOpType
         */
        OnosYangOpType yangTapiModuleInterfacesTapiTopologyApiOpType();

        /**
         * Returns the builder object of yangTapiModuleInterfacesTapiTopologyApiOpType.
         *
         * @param yangTapiModuleInterfacesTapiTopologyApiOpType value of
                     yangTapiModuleInterfacesTapiTopologyApiOpType
         * @return yangTapiModuleInterfacesTapiTopologyApiOpType
         */
        TapiModuleInterfacesTapiTopologyApiBuilder yangTapiModuleInterfacesTapiTopologyApiOpType(OnosYangOpType
                    yangTapiModuleInterfacesTapiTopologyApiOpType);

        /**
         * Builds object of tapiModuleInterfacesTapiTopologyApi.
         *
         * @return tapiModuleInterfacesTapiTopologyApi
         */
        TapiModuleInterfacesTapiTopologyApi build();
    }
}
