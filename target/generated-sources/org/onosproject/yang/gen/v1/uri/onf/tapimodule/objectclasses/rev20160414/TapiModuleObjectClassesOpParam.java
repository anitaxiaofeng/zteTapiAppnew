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

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultGtapiContext;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiConnection;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiLink;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiNode;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiNodeEdgePoint;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiNotification;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiPath;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiService;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiServiceEndPoint;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .DefaultTapiTopology;
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
 * Represents the implementation of tapiModuleObjectClasses.
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
public class TapiModuleObjectClassesOpParam implements TapiModuleObjectClasses {
    protected OnosYangOpType yangTapiModuleObjectClassesOpType;
    protected boolean isSubTreeFiltered;
    protected List<TapiTopology> tapiTopology;
    protected List<GtapiContext> gTapiContext;
    protected List<TapiNode> tapiNode;
    protected List<TapiLink> tapiLink;
    protected List<TapiNodeEdgePoint> tapiNodeEdgePoint;
    protected List<TapiServiceEndPoint> tapiServiceEndPoint;
    protected List<TapiConnection> tapiConnection;
    protected List<TapiPath> tapiPath;
    protected List<TapiService> tapiService;
    protected List<TapiNotification> tapiNotification;

    @Override
    public OnosYangOpType yangTapiModuleObjectClassesOpType() {
        return yangTapiModuleObjectClassesOpType;
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
    public List<TapiTopology> tapiTopology() {
        return tapiTopology;
    }

    @Override
    public List<GtapiContext> gTapiContext() {
        return gTapiContext;
    }

    @Override
    public List<TapiNode> tapiNode() {
        return tapiNode;
    }

    @Override
    public List<TapiLink> tapiLink() {
        return tapiLink;
    }

    @Override
    public List<TapiNodeEdgePoint> tapiNodeEdgePoint() {
        return tapiNodeEdgePoint;
    }

    @Override
    public List<TapiServiceEndPoint> tapiServiceEndPoint() {
        return tapiServiceEndPoint;
    }

    @Override
    public List<TapiConnection> tapiConnection() {
        return tapiConnection;
    }

    @Override
    public List<TapiPath> tapiPath() {
        return tapiPath;
    }

    @Override
    public List<TapiService> tapiService() {
        return tapiService;
    }

    @Override
    public List<TapiNotification> tapiNotification() {
        return tapiNotification;
    }

    @Override
    public int hashCode() {
         return Objects.hash(yangTapiModuleObjectClassesOpType, isSubTreeFiltered, tapiTopology, gTapiContext,
                    tapiNode, tapiLink, tapiNodeEdgePoint, tapiServiceEndPoint, tapiConnection, tapiPath,
                    tapiService, tapiNotification);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapiModuleObjectClassesOpParam) {
            TapiModuleObjectClassesOpParam other = (TapiModuleObjectClassesOpParam) obj;
            return
                Objects
                .equals(yangTapiModuleObjectClassesOpType,
                 other.yangTapiModuleObjectClassesOpType) &&
                Objects.equals(isSubTreeFiltered, other.isSubTreeFiltered) &&
                Objects.equals(tapiTopology, other.tapiTopology) &&
                Objects.equals(gTapiContext, other.gTapiContext) &&
                Objects.equals(tapiNode, other.tapiNode) &&
                Objects.equals(tapiLink, other.tapiLink) &&
                Objects.equals(tapiNodeEdgePoint, other.tapiNodeEdgePoint) &&
                Objects.equals(tapiServiceEndPoint, other.tapiServiceEndPoint) &&
                Objects.equals(tapiConnection, other.tapiConnection) &&
                Objects.equals(tapiPath, other.tapiPath) &&
                Objects.equals(tapiService, other.tapiService) &&
                Objects.equals(tapiNotification, other.tapiNotification);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangTapiModuleObjectClassesOpType", yangTapiModuleObjectClassesOpType)
            .add("isSubTreeFiltered", isSubTreeFiltered)
            .add("tapiTopology", tapiTopology)
            .add("gTapiContext", gTapiContext)
            .add("tapiNode", tapiNode)
            .add("tapiLink", tapiLink)
            .add("tapiNodeEdgePoint", tapiNodeEdgePoint)
            .add("tapiServiceEndPoint", tapiServiceEndPoint)
            .add("tapiConnection", tapiConnection)
            .add("tapiPath", tapiPath)
            .add("tapiService", tapiService)
            .add("tapiNotification", tapiNotification)
            .toString();
    }
    /**
     * Creates an instance of tapiModuleObjectClasses.
     *
     * @param builderObject value of builder object of tapiModuleObjectClasses
     */
    protected TapiModuleObjectClassesOpParam(TapiModuleObjectClassesBuilder builderObject) {
        yangTapiModuleObjectClassesOpType = builderObject.yangTapiModuleObjectClassesOpType();
        isSubTreeFiltered = builderObject.isSubTreeFiltered();
        tapiTopology = builderObject.tapiTopology();
        gTapiContext = builderObject.gTapiContext();
        tapiNode = builderObject.tapiNode();
        tapiLink = builderObject.tapiLink();
        tapiNodeEdgePoint = builderObject.tapiNodeEdgePoint();
        tapiServiceEndPoint = builderObject.tapiServiceEndPoint();
        tapiConnection = builderObject.tapiConnection();
        tapiPath = builderObject.tapiPath();
        tapiService = builderObject.tapiService();
        tapiNotification = builderObject.tapiNotification();
    }

    /**
     * Checks if the passed TapiModuleObjectClasses maps the content match query condition.
     *
     * @param appInstance appInstance being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    public TapiModuleObjectClassesOpParam processSubtreeFiltering(TapiModuleObjectClasses appInstance, boolean
                isSelectAllSchemaChild) {
        TapiModuleObjectClassesBuilder subTreeFilteringResultBuilder = new TapiModuleObjectClassesBuilder();
        BitSet isAnySelectOrContainmentNode = new BitSet();
         if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
                    isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode.get(0)) {
            return processSubtreeFiltering(appInstance, true);
        }
        return (TapiModuleObjectClassesOpParam) subTreeFilteringResultBuilder.buildForFilter();
    }

     private boolean processChildNodesSubTreeFiltering(TapiModuleObjectClasses appInstance,
                TapiModuleObjectClassesBuilder subTreeFilteringResultBuilder, BitSet isAnySelectOrContainmentNode,
                boolean isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            if (appInstance.tapiTopology() != null) {
                for (TapiTopology tapiTopology : appInstance.tapiTopology()) {
                    TapiTopology result;
                    result = ((DefaultTapiTopology) DefaultTapiTopology.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiTopology, true);
                    subTreeFilteringResultBuilder.addToTapiTopology(result);
                }
            } else {
                if (isSubTreeFiltered && tapiTopology() != null) {
                    subTreeFilteringResultBuilder.tapiTopology(tapiTopology);
                }
            }
        } else if (tapiTopology() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiTopology().isEmpty()) {
                if (appInstance.tapiTopology() != null && !appInstance.tapiTopology().isEmpty()) {
                for (TapiTopology tapiTopology : tapiTopology()) {
                    for (TapiTopology tapiTopology2 : appInstance.tapiTopology()) {
                            TapiTopology result = ((DefaultTapiTopology) tapiTopology)
                            .processSubtreeFiltering(tapiTopology2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiTopology(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiTopology() != null) {
                    subTreeFilteringResultBuilder.tapiTopology(tapiTopology);
                }
            }
            } else {
                if (appInstance.tapiTopology() != null && !appInstance.tapiTopology().isEmpty()) {
                for (TapiTopology tapiTopology : appInstance.tapiTopology()) {
                        subTreeFilteringResultBuilder.addToTapiTopology(tapiTopology);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.gTapiContext() != null) {
                for (GtapiContext gTapiContext : appInstance.gTapiContext()) {
                    GtapiContext result;
                    result = ((DefaultGtapiContext) DefaultGtapiContext.builder()
                            .buildForFilter()).processSubtreeFiltering(gTapiContext, true);
                    subTreeFilteringResultBuilder.addToGtapiContext(result);
                }
            } else {
                if (isSubTreeFiltered && gTapiContext() != null) {
                    subTreeFilteringResultBuilder.gTapiContext(gTapiContext);
                }
            }
        } else if (gTapiContext() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!gTapiContext().isEmpty()) {
                if (appInstance.gTapiContext() != null && !appInstance.gTapiContext().isEmpty()) {
                for (GtapiContext gTapiContext : gTapiContext()) {
                    for (GtapiContext gTapiContext2 : appInstance.gTapiContext()) {
                            GtapiContext result = ((DefaultGtapiContext) gTapiContext)
                            .processSubtreeFiltering(gTapiContext2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToGtapiContext(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && gTapiContext() != null) {
                    subTreeFilteringResultBuilder.gTapiContext(gTapiContext);
                }
            }
            } else {
                if (appInstance.gTapiContext() != null && !appInstance.gTapiContext().isEmpty()) {
                for (GtapiContext gTapiContext : appInstance.gTapiContext()) {
                        subTreeFilteringResultBuilder.addToGtapiContext(gTapiContext);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiNode() != null) {
                for (TapiNode tapiNode : appInstance.tapiNode()) {
                    TapiNode result;
                    result = ((DefaultTapiNode) DefaultTapiNode.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiNode, true);
                    subTreeFilteringResultBuilder.addToTapiNode(result);
                }
            } else {
                if (isSubTreeFiltered && tapiNode() != null) {
                    subTreeFilteringResultBuilder.tapiNode(tapiNode);
                }
            }
        } else if (tapiNode() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiNode().isEmpty()) {
                if (appInstance.tapiNode() != null && !appInstance.tapiNode().isEmpty()) {
                for (TapiNode tapiNode : tapiNode()) {
                    for (TapiNode tapiNode2 : appInstance.tapiNode()) {
                            TapiNode result = ((DefaultTapiNode) tapiNode)
                            .processSubtreeFiltering(tapiNode2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiNode(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiNode() != null) {
                    subTreeFilteringResultBuilder.tapiNode(tapiNode);
                }
            }
            } else {
                if (appInstance.tapiNode() != null && !appInstance.tapiNode().isEmpty()) {
                for (TapiNode tapiNode : appInstance.tapiNode()) {
                        subTreeFilteringResultBuilder.addToTapiNode(tapiNode);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiLink() != null) {
                for (TapiLink tapiLink : appInstance.tapiLink()) {
                    TapiLink result;
                    result = ((DefaultTapiLink) DefaultTapiLink.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiLink, true);
                    subTreeFilteringResultBuilder.addToTapiLink(result);
                }
            } else {
                if (isSubTreeFiltered && tapiLink() != null) {
                    subTreeFilteringResultBuilder.tapiLink(tapiLink);
                }
            }
        } else if (tapiLink() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiLink().isEmpty()) {
                if (appInstance.tapiLink() != null && !appInstance.tapiLink().isEmpty()) {
                for (TapiLink tapiLink : tapiLink()) {
                    for (TapiLink tapiLink2 : appInstance.tapiLink()) {
                            TapiLink result = ((DefaultTapiLink) tapiLink)
                            .processSubtreeFiltering(tapiLink2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiLink(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiLink() != null) {
                    subTreeFilteringResultBuilder.tapiLink(tapiLink);
                }
            }
            } else {
                if (appInstance.tapiLink() != null && !appInstance.tapiLink().isEmpty()) {
                for (TapiLink tapiLink : appInstance.tapiLink()) {
                        subTreeFilteringResultBuilder.addToTapiLink(tapiLink);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiNodeEdgePoint() != null) {
                for (TapiNodeEdgePoint tapiNodeEdgePoint : appInstance.tapiNodeEdgePoint()) {
                    TapiNodeEdgePoint result;
                    result = ((DefaultTapiNodeEdgePoint) DefaultTapiNodeEdgePoint.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiNodeEdgePoint, true);
                    subTreeFilteringResultBuilder.addToTapiNodeEdgePoint(result);
                }
            } else {
                if (isSubTreeFiltered && tapiNodeEdgePoint() != null) {
                    subTreeFilteringResultBuilder.tapiNodeEdgePoint(tapiNodeEdgePoint);
                }
            }
        } else if (tapiNodeEdgePoint() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiNodeEdgePoint().isEmpty()) {
                if (appInstance.tapiNodeEdgePoint() != null && !appInstance.tapiNodeEdgePoint().isEmpty()) {
                for (TapiNodeEdgePoint tapiNodeEdgePoint : tapiNodeEdgePoint()) {
                    for (TapiNodeEdgePoint tapiNodeEdgePoint2 : appInstance.tapiNodeEdgePoint()) {
                            TapiNodeEdgePoint result = ((DefaultTapiNodeEdgePoint) tapiNodeEdgePoint)
                            .processSubtreeFiltering(tapiNodeEdgePoint2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiNodeEdgePoint(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiNodeEdgePoint() != null) {
                    subTreeFilteringResultBuilder.tapiNodeEdgePoint(tapiNodeEdgePoint);
                }
            }
            } else {
                if (appInstance.tapiNodeEdgePoint() != null && !appInstance.tapiNodeEdgePoint().isEmpty()) {
                for (TapiNodeEdgePoint tapiNodeEdgePoint : appInstance.tapiNodeEdgePoint()) {
                        subTreeFilteringResultBuilder.addToTapiNodeEdgePoint(tapiNodeEdgePoint);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiServiceEndPoint() != null) {
                for (TapiServiceEndPoint tapiServiceEndPoint : appInstance.tapiServiceEndPoint()) {
                    TapiServiceEndPoint result;
                    result = ((DefaultTapiServiceEndPoint) DefaultTapiServiceEndPoint.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiServiceEndPoint, true);
                    subTreeFilteringResultBuilder.addToTapiServiceEndPoint(result);
                }
            } else {
                if (isSubTreeFiltered && tapiServiceEndPoint() != null) {
                    subTreeFilteringResultBuilder.tapiServiceEndPoint(tapiServiceEndPoint);
                }
            }
        } else if (tapiServiceEndPoint() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiServiceEndPoint().isEmpty()) {
                if (appInstance.tapiServiceEndPoint() != null && !appInstance.tapiServiceEndPoint().isEmpty()) {
                for (TapiServiceEndPoint tapiServiceEndPoint : tapiServiceEndPoint()) {
                    for (TapiServiceEndPoint tapiServiceEndPoint2 : appInstance.tapiServiceEndPoint()) {
                            TapiServiceEndPoint result = ((DefaultTapiServiceEndPoint) tapiServiceEndPoint)
                            .processSubtreeFiltering(tapiServiceEndPoint2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiServiceEndPoint(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiServiceEndPoint() != null) {
                    subTreeFilteringResultBuilder.tapiServiceEndPoint(tapiServiceEndPoint);
                }
            }
            } else {
                if (appInstance.tapiServiceEndPoint() != null && !appInstance.tapiServiceEndPoint().isEmpty()) {
                for (TapiServiceEndPoint tapiServiceEndPoint : appInstance.tapiServiceEndPoint()) {
                        subTreeFilteringResultBuilder.addToTapiServiceEndPoint(tapiServiceEndPoint);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiConnection() != null) {
                for (TapiConnection tapiConnection : appInstance.tapiConnection()) {
                    TapiConnection result;
                    result = ((DefaultTapiConnection) DefaultTapiConnection.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiConnection, true);
                    subTreeFilteringResultBuilder.addToTapiConnection(result);
                }
            } else {
                if (isSubTreeFiltered && tapiConnection() != null) {
                    subTreeFilteringResultBuilder.tapiConnection(tapiConnection);
                }
            }
        } else if (tapiConnection() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiConnection().isEmpty()) {
                if (appInstance.tapiConnection() != null && !appInstance.tapiConnection().isEmpty()) {
                for (TapiConnection tapiConnection : tapiConnection()) {
                    for (TapiConnection tapiConnection2 : appInstance.tapiConnection()) {
                            TapiConnection result = ((DefaultTapiConnection) tapiConnection)
                            .processSubtreeFiltering(tapiConnection2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiConnection(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiConnection() != null) {
                    subTreeFilteringResultBuilder.tapiConnection(tapiConnection);
                }
            }
            } else {
                if (appInstance.tapiConnection() != null && !appInstance.tapiConnection().isEmpty()) {
                for (TapiConnection tapiConnection : appInstance.tapiConnection()) {
                        subTreeFilteringResultBuilder.addToTapiConnection(tapiConnection);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiPath() != null) {
                for (TapiPath tapiPath : appInstance.tapiPath()) {
                    TapiPath result;
                    result = ((DefaultTapiPath) DefaultTapiPath.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiPath, true);
                    subTreeFilteringResultBuilder.addToTapiPath(result);
                }
            } else {
                if (isSubTreeFiltered && tapiPath() != null) {
                    subTreeFilteringResultBuilder.tapiPath(tapiPath);
                }
            }
        } else if (tapiPath() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiPath().isEmpty()) {
                if (appInstance.tapiPath() != null && !appInstance.tapiPath().isEmpty()) {
                for (TapiPath tapiPath : tapiPath()) {
                    for (TapiPath tapiPath2 : appInstance.tapiPath()) {
                            TapiPath result = ((DefaultTapiPath) tapiPath)
                            .processSubtreeFiltering(tapiPath2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiPath(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiPath() != null) {
                    subTreeFilteringResultBuilder.tapiPath(tapiPath);
                }
            }
            } else {
                if (appInstance.tapiPath() != null && !appInstance.tapiPath().isEmpty()) {
                for (TapiPath tapiPath : appInstance.tapiPath()) {
                        subTreeFilteringResultBuilder.addToTapiPath(tapiPath);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiService() != null) {
                for (TapiService tapiService : appInstance.tapiService()) {
                    TapiService result;
                    result = ((DefaultTapiService) DefaultTapiService.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiService, true);
                    subTreeFilteringResultBuilder.addToTapiService(result);
                }
            } else {
                if (isSubTreeFiltered && tapiService() != null) {
                    subTreeFilteringResultBuilder.tapiService(tapiService);
                }
            }
        } else if (tapiService() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiService().isEmpty()) {
                if (appInstance.tapiService() != null && !appInstance.tapiService().isEmpty()) {
                for (TapiService tapiService : tapiService()) {
                    for (TapiService tapiService2 : appInstance.tapiService()) {
                            TapiService result = ((DefaultTapiService) tapiService)
                            .processSubtreeFiltering(tapiService2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiService(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiService() != null) {
                    subTreeFilteringResultBuilder.tapiService(tapiService);
                }
            }
            } else {
                if (appInstance.tapiService() != null && !appInstance.tapiService().isEmpty()) {
                for (TapiService tapiService : appInstance.tapiService()) {
                        subTreeFilteringResultBuilder.addToTapiService(tapiService);
                    }
                }
            }
        }

        if (isSelectAllSchemaChild) {
            if (appInstance.tapiNotification() != null) {
                for (TapiNotification tapiNotification : appInstance.tapiNotification()) {
                    TapiNotification result;
                    result = ((DefaultTapiNotification) DefaultTapiNotification.builder()
                            .buildForFilter()).processSubtreeFiltering(tapiNotification, true);
                    subTreeFilteringResultBuilder.addToTapiNotification(result);
                }
            } else {
                if (isSubTreeFiltered && tapiNotification() != null) {
                    subTreeFilteringResultBuilder.tapiNotification(tapiNotification);
                }
            }
        } else if (tapiNotification() != null) {
            isAnySelectOrContainmentNode.set(0);
            if (!tapiNotification().isEmpty()) {
                if (appInstance.tapiNotification() != null && !appInstance.tapiNotification().isEmpty()) {
                for (TapiNotification tapiNotification : tapiNotification()) {
                    for (TapiNotification tapiNotification2 : appInstance.tapiNotification()) {
                            TapiNotification result = ((DefaultTapiNotification) tapiNotification)
                            .processSubtreeFiltering(tapiNotification2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToTapiNotification(result);
                            }
                        }
                    }
                } else {
                if (isSubTreeFiltered && tapiNotification() != null) {
                    subTreeFilteringResultBuilder.tapiNotification(tapiNotification);
                }
            }
            } else {
                if (appInstance.tapiNotification() != null && !appInstance.tapiNotification().isEmpty()) {
                for (TapiNotification tapiNotification : appInstance.tapiNotification()) {
                        subTreeFilteringResultBuilder.addToTapiNotification(tapiNotification);
                    }
                }
            }
        }

        return true;
    }

    /**
     * Creates an instance of tapiModuleObjectClassesOpParam.
     */
    protected TapiModuleObjectClassesOpParam() {
    }

    /**
     * Returns the attribute tapiModuleObjectClassesBuilder.
     *
     * @return tapiModuleObjectClassesBuilder
     */
    public static TapiModuleObjectClassesBuilder builder() {
        return new TapiModuleObjectClassesBuilder();
    }

    /**
     * Represents the builder implementation of tapiModuleObjectClasses.
     */
    public static class TapiModuleObjectClassesBuilder implements
                TapiModuleObjectClasses.TapiModuleObjectClassesBuilder {
        protected OnosYangOpType yangTapiModuleObjectClassesOpType;
        protected boolean isSubTreeFiltered;
        protected List<TapiTopology> tapiTopology;
        protected List<GtapiContext> gTapiContext;
        protected List<TapiNode> tapiNode;
        protected List<TapiLink> tapiLink;
        protected List<TapiNodeEdgePoint> tapiNodeEdgePoint;
        protected List<TapiServiceEndPoint> tapiServiceEndPoint;
        protected List<TapiConnection> tapiConnection;
        protected List<TapiPath> tapiPath;
        protected List<TapiService> tapiService;
        protected List<TapiNotification> tapiNotification;


        @Override
        public OnosYangOpType yangTapiModuleObjectClassesOpType() {
            return yangTapiModuleObjectClassesOpType;
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
        public List<TapiTopology> tapiTopology() {
            return tapiTopology;
        }

        @Override
        public List<GtapiContext> gTapiContext() {
            return gTapiContext;
        }

        @Override
        public List<TapiNode> tapiNode() {
            return tapiNode;
        }

        @Override
        public List<TapiLink> tapiLink() {
            return tapiLink;
        }

        @Override
        public List<TapiNodeEdgePoint> tapiNodeEdgePoint() {
            return tapiNodeEdgePoint;
        }

        @Override
        public List<TapiServiceEndPoint> tapiServiceEndPoint() {
            return tapiServiceEndPoint;
        }

        @Override
        public List<TapiConnection> tapiConnection() {
            return tapiConnection;
        }

        @Override
        public List<TapiPath> tapiPath() {
            return tapiPath;
        }

        @Override
        public List<TapiService> tapiService() {
            return tapiService;
        }

        @Override
        public List<TapiNotification> tapiNotification() {
            return tapiNotification;
        }

        @Override
        public TapiModuleObjectClassesBuilder yangTapiModuleObjectClassesOpType(OnosYangOpType
                    yangTapiModuleObjectClassesOpType) {
            this.yangTapiModuleObjectClassesOpType = yangTapiModuleObjectClassesOpType;
            return this;
        }
        /**
         * Returns the builder object of isSubTreeFiltered.
         *
         * @param isSubTreeFiltered value of isSubTreeFiltered
         * @return isSubTreeFiltered
         */
        public TapiModuleObjectClassesBuilder isSubTreeFiltered(boolean isSubTreeFiltered) {
            this.isSubTreeFiltered = isSubTreeFiltered;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiTopology(List<TapiTopology> tapiTopology) {
            this.tapiTopology = tapiTopology;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder gTapiContext(List<GtapiContext> gTapiContext) {
            this.gTapiContext = gTapiContext;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiNode(List<TapiNode> tapiNode) {
            this.tapiNode = tapiNode;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiLink(List<TapiLink> tapiLink) {
            this.tapiLink = tapiLink;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiNodeEdgePoint(List<TapiNodeEdgePoint> tapiNodeEdgePoint) {
            this.tapiNodeEdgePoint = tapiNodeEdgePoint;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiServiceEndPoint(List<TapiServiceEndPoint> tapiServiceEndPoint) {
            this.tapiServiceEndPoint = tapiServiceEndPoint;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiConnection(List<TapiConnection> tapiConnection) {
            this.tapiConnection = tapiConnection;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiPath(List<TapiPath> tapiPath) {
            this.tapiPath = tapiPath;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiService(List<TapiService> tapiService) {
            this.tapiService = tapiService;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder tapiNotification(List<TapiNotification> tapiNotification) {
            this.tapiNotification = tapiNotification;
            return this;
        }

        @Override
        public TapiModuleObjectClassesBuilder addToTapiTopology(TapiTopology addTo) {
            if (tapiTopology == null) {
                tapiTopology = new ArrayList<>();
            }
            tapiTopology.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToGtapiContext(GtapiContext addTo) {
            if (gTapiContext == null) {
                gTapiContext = new ArrayList<>();
            }
            gTapiContext.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiNode(TapiNode addTo) {
            if (tapiNode == null) {
                tapiNode = new ArrayList<>();
            }
            tapiNode.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiLink(TapiLink addTo) {
            if (tapiLink == null) {
                tapiLink = new ArrayList<>();
            }
            tapiLink.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiNodeEdgePoint(TapiNodeEdgePoint addTo) {
            if (tapiNodeEdgePoint == null) {
                tapiNodeEdgePoint = new ArrayList<>();
            }
            tapiNodeEdgePoint.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiServiceEndPoint(TapiServiceEndPoint addTo) {
            if (tapiServiceEndPoint == null) {
                tapiServiceEndPoint = new ArrayList<>();
            }
            tapiServiceEndPoint.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiConnection(TapiConnection addTo) {
            if (tapiConnection == null) {
                tapiConnection = new ArrayList<>();
            }
            tapiConnection.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiPath(TapiPath addTo) {
            if (tapiPath == null) {
                tapiPath = new ArrayList<>();
            }
            tapiPath.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiService(TapiService addTo) {
            if (tapiService == null) {
                tapiService = new ArrayList<>();
            }
            tapiService.add(addTo);
            return this;
        }


        @Override
        public TapiModuleObjectClassesBuilder addToTapiNotification(TapiNotification addTo) {
            if (tapiNotification == null) {
                tapiNotification = new ArrayList<>();
            }
            tapiNotification.add(addTo);
            return this;
        }

        @Override
        public TapiModuleObjectClasses build() {
            return new TapiModuleObjectClassesOpParam(this);
        }

        /**
         * Builds object of tapiModuleObjectClasses.
         *
         * @return tapiModuleObjectClasses
         */
        public TapiModuleObjectClasses buildForFilter() {
            isSubTreeFiltered = true;
            return new TapiModuleObjectClassesOpParam(this);
        }
        /**
         * Creates an instance of tapiModuleObjectClassesBuilder.
         */
        public TapiModuleObjectClassesBuilder() {
        }

    }
}
