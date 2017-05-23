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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414;

import java.util.List;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.GtapiContext;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .TapiConnection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.TapiLink;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.TapiNode;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .TapiNodeEdgePoint;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .TapiNotification;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.TapiPath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.TapiService;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .TapiServiceEndPoint;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.TapiTopology;

/**
 * Abstraction of an entity which represents the functionality of tapiModuleObjectClasses.
 */
public interface TapiModuleObjectClasses {
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
     * Returns the attribute yangTapiModuleObjectClassesOpType.
     *
     * @return yangTapiModuleObjectClassesOpType value of yangTapiModuleObjectClassesOpType
     */
    OnosYangOpType yangTapiModuleObjectClassesOpType();

    /**
     * Returns the attribute tapiTopology.
     *
     * @return tapiTopology list of tapiTopology
     */
    List<TapiTopology> tapiTopology();

    /**
     * Returns the attribute gTapiContext.
     *
     * @return gTapiContext list of gTapiContext
     */
    List<GtapiContext> gTapiContext();

    /**
     * Returns the attribute tapiNode.
     *
     * @return tapiNode list of tapiNode
     */
    List<TapiNode> tapiNode();

    /**
     * Returns the attribute tapiLink.
     *
     * @return tapiLink list of tapiLink
     */
    List<TapiLink> tapiLink();

    /**
     * Returns the attribute tapiNodeEdgePoint.
     *
     * @return tapiNodeEdgePoint list of tapiNodeEdgePoint
     */
    List<TapiNodeEdgePoint> tapiNodeEdgePoint();

    /**
     * Returns the attribute tapiServiceEndPoint.
     *
     * @return tapiServiceEndPoint list of tapiServiceEndPoint
     */
    List<TapiServiceEndPoint> tapiServiceEndPoint();

    /**
     * Returns the attribute tapiConnection.
     *
     * @return tapiConnection list of tapiConnection
     */
    List<TapiConnection> tapiConnection();

    /**
     * Returns the attribute tapiPath.
     *
     * @return tapiPath list of tapiPath
     */
    List<TapiPath> tapiPath();

    /**
     * Returns the attribute tapiService.
     *
     * @return tapiService list of tapiService
     */
    List<TapiService> tapiService();

    /**
     * Returns the attribute tapiNotification.
     *
     * @return tapiNotification list of tapiNotification
     */
    List<TapiNotification> tapiNotification();


    /**
     * Builder for tapiModuleObjectClasses.
     */
    interface TapiModuleObjectClassesBuilder {
        /**
         * Adds to the list of tapiTopology.
         *
         * @return builder object of tapiTopology
         */
        TapiModuleObjectClassesBuilder addToTapiTopology(TapiTopology addTo);

        /**
         * Adds to the list of gTapiContext.
         *
         * @return builder object of gTapiContext
         */
        TapiModuleObjectClassesBuilder addToGtapiContext(GtapiContext addTo);

        /**
         * Adds to the list of tapiNode.
         *
         * @return builder object of tapiNode
         */
        TapiModuleObjectClassesBuilder addToTapiNode(TapiNode addTo);

        /**
         * Adds to the list of tapiLink.
         *
         * @return builder object of tapiLink
         */
        TapiModuleObjectClassesBuilder addToTapiLink(TapiLink addTo);

        /**
         * Adds to the list of tapiNodeEdgePoint.
         *
         * @return builder object of tapiNodeEdgePoint
         */
        TapiModuleObjectClassesBuilder addToTapiNodeEdgePoint(TapiNodeEdgePoint addTo);

        /**
         * Adds to the list of tapiServiceEndPoint.
         *
         * @return builder object of tapiServiceEndPoint
         */
        TapiModuleObjectClassesBuilder addToTapiServiceEndPoint(TapiServiceEndPoint addTo);

        /**
         * Adds to the list of tapiConnection.
         *
         * @return builder object of tapiConnection
         */
        TapiModuleObjectClassesBuilder addToTapiConnection(TapiConnection addTo);

        /**
         * Adds to the list of tapiPath.
         *
         * @return builder object of tapiPath
         */
        TapiModuleObjectClassesBuilder addToTapiPath(TapiPath addTo);

        /**
         * Adds to the list of tapiService.
         *
         * @return builder object of tapiService
         */
        TapiModuleObjectClassesBuilder addToTapiService(TapiService addTo);

        /**
         * Adds to the list of tapiNotification.
         *
         * @return builder object of tapiNotification
         */
        TapiModuleObjectClassesBuilder addToTapiNotification(TapiNotification addTo);

        /**
         * Returns the attribute yangTapiModuleObjectClassesOpType.
         *
         * @return yangTapiModuleObjectClassesOpType value of yangTapiModuleObjectClassesOpType
         */
        OnosYangOpType yangTapiModuleObjectClassesOpType();

        /**
         * Returns the attribute tapiTopology.
         *
         * @return tapiTopology list of tapiTopology
         */
        List<TapiTopology> tapiTopology();

        /**
         * Returns the attribute gTapiContext.
         *
         * @return gTapiContext list of gTapiContext
         */
        List<GtapiContext> gTapiContext();

        /**
         * Returns the attribute tapiNode.
         *
         * @return tapiNode list of tapiNode
         */
        List<TapiNode> tapiNode();

        /**
         * Returns the attribute tapiLink.
         *
         * @return tapiLink list of tapiLink
         */
        List<TapiLink> tapiLink();

        /**
         * Returns the attribute tapiNodeEdgePoint.
         *
         * @return tapiNodeEdgePoint list of tapiNodeEdgePoint
         */
        List<TapiNodeEdgePoint> tapiNodeEdgePoint();

        /**
         * Returns the attribute tapiServiceEndPoint.
         *
         * @return tapiServiceEndPoint list of tapiServiceEndPoint
         */
        List<TapiServiceEndPoint> tapiServiceEndPoint();

        /**
         * Returns the attribute tapiConnection.
         *
         * @return tapiConnection list of tapiConnection
         */
        List<TapiConnection> tapiConnection();

        /**
         * Returns the attribute tapiPath.
         *
         * @return tapiPath list of tapiPath
         */
        List<TapiPath> tapiPath();

        /**
         * Returns the attribute tapiService.
         *
         * @return tapiService list of tapiService
         */
        List<TapiService> tapiService();

        /**
         * Returns the attribute tapiNotification.
         *
         * @return tapiNotification list of tapiNotification
         */
        List<TapiNotification> tapiNotification();

        /**
         * Returns the builder object of yangTapiModuleObjectClassesOpType.
         *
         * @param yangTapiModuleObjectClassesOpType value of yangTapiModuleObjectClassesOpType
         * @return yangTapiModuleObjectClassesOpType
         */
        TapiModuleObjectClassesBuilder yangTapiModuleObjectClassesOpType(OnosYangOpType
                    yangTapiModuleObjectClassesOpType);

        /**
         * Returns the builder object of tapiTopology.
         *
         * @param tapiTopology list of tapiTopology
         * @return tapiTopology
         */
        TapiModuleObjectClassesBuilder tapiTopology(List<TapiTopology> tapiTopology);

        /**
         * Returns the builder object of gTapiContext.
         *
         * @param gTapiContext list of gTapiContext
         * @return gTapiContext
         */
        TapiModuleObjectClassesBuilder gTapiContext(List<GtapiContext> gTapiContext);

        /**
         * Returns the builder object of tapiNode.
         *
         * @param tapiNode list of tapiNode
         * @return tapiNode
         */
        TapiModuleObjectClassesBuilder tapiNode(List<TapiNode> tapiNode);

        /**
         * Returns the builder object of tapiLink.
         *
         * @param tapiLink list of tapiLink
         * @return tapiLink
         */
        TapiModuleObjectClassesBuilder tapiLink(List<TapiLink> tapiLink);

        /**
         * Returns the builder object of tapiNodeEdgePoint.
         *
         * @param tapiNodeEdgePoint list of tapiNodeEdgePoint
         * @return tapiNodeEdgePoint
         */
        TapiModuleObjectClassesBuilder tapiNodeEdgePoint(List<TapiNodeEdgePoint> tapiNodeEdgePoint);

        /**
         * Returns the builder object of tapiServiceEndPoint.
         *
         * @param tapiServiceEndPoint list of tapiServiceEndPoint
         * @return tapiServiceEndPoint
         */
        TapiModuleObjectClassesBuilder tapiServiceEndPoint(List<TapiServiceEndPoint> tapiServiceEndPoint);

        /**
         * Returns the builder object of tapiConnection.
         *
         * @param tapiConnection list of tapiConnection
         * @return tapiConnection
         */
        TapiModuleObjectClassesBuilder tapiConnection(List<TapiConnection> tapiConnection);

        /**
         * Returns the builder object of tapiPath.
         *
         * @param tapiPath list of tapiPath
         * @return tapiPath
         */
        TapiModuleObjectClassesBuilder tapiPath(List<TapiPath> tapiPath);

        /**
         * Returns the builder object of tapiService.
         *
         * @param tapiService list of tapiService
         * @return tapiService
         */
        TapiModuleObjectClassesBuilder tapiService(List<TapiService> tapiService);

        /**
         * Returns the builder object of tapiNotification.
         *
         * @param tapiNotification list of tapiNotification
         * @return tapiNotification
         */
        TapiModuleObjectClassesBuilder tapiNotification(List<TapiNotification> tapiNotification);

        /**
         * Builds object of tapiModuleObjectClasses.
         *
         * @return tapiModuleObjectClasses
         */
        TapiModuleObjectClasses build();
    }
}
