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

import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.GetLinkDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinkdetails.GetLinkDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.GetLinkListInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getlinklist.GetLinkListOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodedetails.GetNodeDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodedetails.GetNodeDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails.GetNodeEdgePointDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails.GetNodeEdgePointDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointlist.GetNodeEdgePointListInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.getnodeedgepointlist.GetNodeEdgePointListOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.gettopologydetails.GetTopologyDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414
            .tapimoduleinterfacestapitopologyapi.gettopologydetails.GetTopologyDetailsOutput;

/**
 * Abstraction of an entity which represents the functionality of tapiModuleInterfacesTapiTopologyApiService.
 */
public interface TapiModuleInterfacesTapiTopologyApiService {
    /**
     * Returns the attribute tapiModuleInterfacesTapiTopologyApi.
     *
     * @param tapiModuleInterfacesTapiTopologyApi value of tapiModuleInterfacesTapiTopologyApi
     * @return tapiModuleInterfacesTapiTopologyApi
     */
    TapiModuleInterfacesTapiTopologyApi
                getTapiModuleInterfacesTapiTopologyApi(TapiModuleInterfacesTapiTopologyApiOpParam
                tapiModuleInterfacesTapiTopologyApi);

    /**
     * Sets the value to attribute tapiModuleInterfacesTapiTopologyApi.
     *
     * @param tapiModuleInterfacesTapiTopologyApi value of tapiModuleInterfacesTapiTopologyApi
     */
    void setTapiModuleInterfacesTapiTopologyApi(TapiModuleInterfacesTapiTopologyApiOpParam
                tapiModuleInterfacesTapiTopologyApi);

    /**
     * Service interface of getTopologyDetails.
     *
     * @param inputVar input of service interface getTopologyDetails
     * @return getTopologyDetailsOutput output of service interface getTopologyDetails
     */
    GetTopologyDetailsOutput getTopologyDetails(GetTopologyDetailsInput inputVar);

    /**
     * Service interface of getNodeDetails.
     *
     * @param inputVar input of service interface getNodeDetails
     * @return getNodeDetailsOutput output of service interface getNodeDetails
     */
    GetNodeDetailsOutput getNodeDetails(GetNodeDetailsInput inputVar);

    /**
     * Service interface of getLinkList.
     *
     * @param inputVar input of service interface getLinkList
     * @return getLinkListOutput output of service interface getLinkList
     */
    GetLinkListOutput getLinkList(GetLinkListInput inputVar);

    /**
     * Service interface of getLinkDetails.
     *
     * @param inputVar input of service interface getLinkDetails
     * @return getLinkDetailsOutput output of service interface getLinkDetails
     */
    GetLinkDetailsOutput getLinkDetails(GetLinkDetailsInput inputVar);

    /**
     * Service interface of getNodeEdgePointList.
     *
     * @param inputVar input of service interface getNodeEdgePointList
     * @return getNodeEdgePointListOutput output of service interface getNodeEdgePointList
     */
    GetNodeEdgePointListOutput getNodeEdgePointList(GetNodeEdgePointListInput inputVar);

    /**
     * Service interface of getNodeEdgePointDetails.
     *
     * @param inputVar input of service interface getNodeEdgePointDetails
     * @return getNodeEdgePointDetailsOutput output of service interface getNodeEdgePointDetails
     */
    GetNodeEdgePointDetailsOutput getNodeEdgePointDetails(GetNodeEdgePointDetailsInput inputVar);

}
