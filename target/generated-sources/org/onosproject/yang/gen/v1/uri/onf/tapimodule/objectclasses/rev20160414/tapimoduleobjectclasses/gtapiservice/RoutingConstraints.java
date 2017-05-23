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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiservice;

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconstraints.CommonConstraints;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .gtapiconstraints.PathConstraintsList;

/**
 * Abstraction of an entity which represents the functionality of routingConstraints.
 */
public interface RoutingConstraints {

    /**
     * Returns the attribute yangRoutingConstraintsOpType.
     *
     * @return yangRoutingConstraintsOpType value of yangRoutingConstraintsOpType
     */
    OnosYangOpType yangRoutingConstraintsOpType();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute commonConstraints.
     *
     * @return commonConstraints value of commonConstraints
     */
    CommonConstraints commonConstraints();

    /**
     * Returns the attribute pathConstraintsList.
     *
     * @return pathConstraintsList list of pathConstraintsList
     */
    List<PathConstraintsList> pathConstraintsList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for routingConstraints.
     */
    interface RoutingConstraintsBuilder {
        /**
         * Adds to the list of pathConstraintsList.
         *
         * @return builder object of pathConstraintsList
         */
        RoutingConstraintsBuilder addToPathConstraintsList(PathConstraintsList addTo);

        /**
         * Returns the attribute yangRoutingConstraintsOpType.
         *
         * @return yangRoutingConstraintsOpType value of yangRoutingConstraintsOpType
         */
        OnosYangOpType yangRoutingConstraintsOpType();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute commonConstraints.
         *
         * @return commonConstraints value of commonConstraints
         */
        CommonConstraints commonConstraints();

        /**
         * Returns the attribute pathConstraintsList.
         *
         * @return pathConstraintsList list of pathConstraintsList
         */
        List<PathConstraintsList> pathConstraintsList();

        /**
         * Returns the builder object of yangRoutingConstraintsOpType.
         *
         * @param yangRoutingConstraintsOpType value of yangRoutingConstraintsOpType
         * @return yangRoutingConstraintsOpType
         */
        RoutingConstraintsBuilder yangRoutingConstraintsOpType(OnosYangOpType yangRoutingConstraintsOpType);

        /**
         * Returns the builder object of commonConstraints.
         *
         * @param commonConstraints value of commonConstraints
         * @return commonConstraints
         */
        RoutingConstraintsBuilder commonConstraints(CommonConstraints commonConstraints);

        /**
         * Returns the builder object of pathConstraintsList.
         *
         * @param pathConstraintsList list of pathConstraintsList
         * @return pathConstraintsList
         */
        RoutingConstraintsBuilder pathConstraintsList(List<PathConstraintsList> pathConstraintsList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        RoutingConstraintsBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of routingConstraints.
         *
         * @return routingConstraints
         */
        RoutingConstraints build();
    }
}
