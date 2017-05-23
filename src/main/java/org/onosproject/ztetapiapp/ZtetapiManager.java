/*
 * Copyright 2016-present Open Networking Laboratory
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
package org.onosproject.ztetapiapp;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.Service;
import org.onosproject.core.ApplicationId;
import org.onosproject.core.CoreService;
import org.onosproject.net.DefaultDevice;
import org.onosproject.net.Device;
import org.onosproject.net.Link;
import org.onosproject.net.device.DeviceService;
import org.onosproject.net.link.LinkService;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.TapiModuleInterfacesTapiTopologyApiService;
import org.onosproject.yms.ymsm.YmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.TapiModuleInterfacesTapiTopologyApi;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.TapiModuleInterfacesTapiTopologyApiOpParam;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getlinkdetails.GetLinkDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getlinkdetails.GetLinkDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getlinklist.GetLinkListInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getlinklist.GetLinkListOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodedetails.GetNodeDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodedetails.GetNodeDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails.GetNodeEdgePointDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodeedgepointdetails.GetNodeEdgePointDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodeedgepointlist.GetNodeEdgePointListInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.getnodeedgepointlist.GetNodeEdgePointListOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.gettopologydetails.DefaultGetTopologyDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.gettopologydetails.GetTopologyDetailsInput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.gettopologydetails.GetTopologyDetailsOutput;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.gettopologydetails.gettopologydetailsoutput.DefaultTopology;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.interfaces.tapi.topologyapi.rev20160414.tapimoduleinterfacestapitopologyapi.gettopologydetails.gettopologydetailsoutput.Topology;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.UniversalId;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Skeletal ONOS application component.
 */
@Component(immediate = true)
@Service
public class ZtetapiManager implements TapiModuleInterfacesTapiTopologyApiService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected CoreService coreService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected YmsService ymsService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected DeviceService deviceService;

    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    protected LinkService linkService;

    private ApplicationId appId;
    @Activate
    protected void activate() {
        appId = coreService.registerApplication("org.onosproject.zteTapiApp");
        ymsService.registerService(this,
                                   TapiModuleInterfacesTapiTopologyApiService.class, null);
        log.info("RestconfTapi Started");
    }

    @Deactivate
    protected void deactivate() {
        ymsService.unRegisterService(this, TapiModuleInterfacesTapiTopologyApiService.class);
        log.info("RestconfTapi Stopped");
    }


    @Override
    public TapiModuleInterfacesTapiTopologyApi getTapiModuleInterfacesTapiTopologyApi(
            TapiModuleInterfacesTapiTopologyApiOpParam tapiModuleInterfacesTapiTopologyApi) {
        return null;
    }

    @Override
    public void setTapiModuleInterfacesTapiTopologyApi(
            TapiModuleInterfacesTapiTopologyApiOpParam tapiModuleInterfacesTapiTopologyApi) {
        System.out.println("TODO: setTapiModuleInterfacesTapiTopologyApi");
    }

    @Override
    public GetTopologyDetailsOutput getTopologyDetails(GetTopologyDetailsInput inputVar) {
        UniversalId universalId = new UniversalId(inputVar.topologyId().toString());
        List<Object> nodeList = getDevicesList();
        List<Object> linkList = getLinkInformation();
        DefaultTopology.TopologyBuilder topologyBuilder = new DefaultTopology.TopologyBuilder();
        Topology topology = topologyBuilder.nodeRefList(nodeList).linkRefList(linkList)
                .uuid(universalId).build();
        DefaultGetTopologyDetailsOutput.GetTopologyDetailsOutputBuilder getTopologyDetailsOutputBuilder =
                new DefaultGetTopologyDetailsOutput.GetTopologyDetailsOutputBuilder();
        return getTopologyDetailsOutputBuilder.topology(topology).build();
    }

    private List<Object> getDevicesList() {
        List<Object> nodeofList = new LinkedList<>();
        log.info("DeviceService", deviceService);
        Iterable<Device> deviceList = deviceService.getAvailableDevices();
        if (deviceList == null) {
            return null;
        }
        Iterator<Device> deviceIterator = deviceList.iterator();
        while (deviceIterator.hasNext()) {
            Device device = deviceIterator.next();
           // String deviceof = device.id().toString();
            Object  deviceof = new DefaultDevice(device.providerId(), device.id(), device.type(),
                                                 device.manufacturer(), device.hwVersion(), device.swVersion(),
                                                 device.serialNumber(), device.chassisId(), device.annotations());
             nodeofList.add(deviceof);

        }
        return nodeofList;
    }

    private List<Object> getLinkInformation() {
        List<Object> linkofList = new LinkedList<>();
        Iterable<Link> linkList = linkService.getLinks();
        if (linkList == null) {
            return null;
        }
        Iterator<Link> linkIterator = linkList.iterator();
        while (linkIterator.hasNext()) {
            Link link = linkIterator.next();
            Object linkof = org.onosproject.net.DefaultLink.builder()
                     .providerId(link.providerId())
                    .src(link.src())
                    .dst(link.dst())
                    .state(link.state())
                    .type(link.type())
                    .annotations(link.annotations())
                    .build();
            linkofList.add(linkof);

        }
        return linkofList;
    }

  /*  private List<Link> getLinkInformation() {
        List<Link> ymsLinkInfo = new LinkedList<>();
        Iterable<org.onosproject.net.Link> linkList = linkService.getLinks();
        if (linkList == null) {
            return null;
        }
        Iterator<org.onosproject.net.Link> linkIterator = linkList.iterator();
        while (linkIterator.hasNext()) {
            org.onosproject.net.Link link = linkIterator.next();
            Link ymsLink = DefaultLink.builder()
                    .isDurable(link.isDurable())
                    .isExpected(link.isExpected())
                    .leafType(LeafTypeEnum.of(link.type().toString().toLowerCase()))
                    .state(StateEnum.of(link.state().toString().toLowerCase()))
                    .srcDeviceId(DeviceId.of(link.src().deviceId().toString()))
                    .srcPortNumber(link.src().port().toLong())
                    .dstDeviceId(DeviceId.of(link.dst().deviceId().toString()))
                    .dstPortNumber(link.dst().port().toLong())
                    .build();
            ymsLinkInfo.add(ymsLink);
        }
        return ymsLinkInfo;
    }*/






    @Override
    public GetNodeDetailsOutput getNodeDetails(GetNodeDetailsInput inputVar) {
        return null;
    }

    @Override
    public GetLinkListOutput getLinkList(GetLinkListInput inputVar) {
        return null;
    }

    @Override
    public GetLinkDetailsOutput getLinkDetails(GetLinkDetailsInput inputVar) {
        return null;
    }

    @Override
    public GetNodeEdgePointListOutput getNodeEdgePointList(GetNodeEdgePointListInput inputVar) {


        return null;
    }

    @Override
    public GetNodeEdgePointDetailsOutput getNodeEdgePointDetails(GetNodeEdgePointDetailsInput inputVar) {
        return null;
    }

}
