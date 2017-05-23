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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses.gtapinode;

import java.util.List;
import java.util.Map;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.TapiModuleObjectClasses
            .OnosYangOpType;
import org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses
            .griskparameterpac.RiskCharacteristicList;

/**
 * Abstraction of an entity which represents the functionality of riskParameterPac.
 */
public interface RiskParameterPac {

    /**
     * Returns the attribute yangRiskParameterPacOpType.
     *
     * @return yangRiskParameterPacOpType value of yangRiskParameterPacOpType
     */
    OnosYangOpType yangRiskParameterPacOpType();

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Returns the attribute riskCharacteristicList.
     *
     * @return riskCharacteristicList list of riskCharacteristicList
     */
    List<RiskCharacteristicList> riskCharacteristicList();


    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of yangAugmentedInfo
     * @return yangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Builder for riskParameterPac.
     */
    interface RiskParameterPacBuilder {
        /**
         * Adds to the list of riskCharacteristicList.
         *
         * @return builder object of riskCharacteristicList
         */
        RiskParameterPacBuilder addToRiskCharacteristicList(RiskCharacteristicList addTo);

        /**
         * Returns the attribute yangRiskParameterPacOpType.
         *
         * @return yangRiskParameterPacOpType value of yangRiskParameterPacOpType
         */
        OnosYangOpType yangRiskParameterPacOpType();

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return yangAugmentedInfoMap value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Returns the attribute riskCharacteristicList.
         *
         * @return riskCharacteristicList list of riskCharacteristicList
         */
        List<RiskCharacteristicList> riskCharacteristicList();

        /**
         * Returns the builder object of yangRiskParameterPacOpType.
         *
         * @param yangRiskParameterPacOpType value of yangRiskParameterPacOpType
         * @return yangRiskParameterPacOpType
         */
        RiskParameterPacBuilder yangRiskParameterPacOpType(OnosYangOpType yangRiskParameterPacOpType);

        /**
         * Returns the builder object of riskCharacteristicList.
         *
         * @param riskCharacteristicList list of riskCharacteristicList
         * @return riskCharacteristicList
         */
        RiskParameterPacBuilder riskCharacteristicList(List<RiskCharacteristicList> riskCharacteristicList);

        /**
         * Sets the value of yangAugmentedInfo.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of yangAugmentedInfo
         */
        RiskParameterPacBuilder addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of yangAugmentedInfo
         * @return yangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);
        /**
         * Builds object of riskParameterPac.
         *
         * @return riskParameterPac
         */
        RiskParameterPac build();
    }
}
