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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .tapirouteobjectivefunction;

/**
 * Represents ENUM data of tapiRouteObjectiveFunctionEnum.
 */
public enum TapiRouteObjectiveFunctionEnum {

    /**
     * Represents wORKING_MIN_HOP.
     */
    WORKING_MIN_HOP(0, "WORKING_MIN_HOP"),

    /**
     * Represents wORKING_MIN_COST.
     */
    WORKING_MIN_COST(1, "WORKING_MIN_COST"),

    /**
     * Represents wORKING_MIN_LATENCY.
     */
    WORKING_MIN_LATENCY(2, "WORKING_MIN_LATENCY"),

    /**
     * Represents wORKING_PROTECTION_MIN_HOP.
     */
    WORKING_PROTECTION_MIN_HOP(3, "WORKING_PROTECTION_MIN_HOP"),

    /**
     * Represents wORKING_PROTECTION_MIN_COST.
     */
    WORKING_PROTECTION_MIN_COST(4, "WORKING_PROTECTION_MIN_COST"),

    /**
     * Represents wORKING_PROTECTION_MIN_LATENCY.
     */
    WORKING_PROTECTION_MIN_LATENCY(5, "WORKING_PROTECTION_MIN_LATENCY"),

    /**
     * Represents lOAD_BALANCING.
     */
    LOAD_BALANCING(6, "LOAD_BALANCING"),

    /**
     * Represents wORKING_PROTECTION_MIN_BANDWIDTH.
     */
    WORKING_PROTECTION_MIN_BANDWIDTH(7, "WORKING_PROTECTION_MIN_BANDWIDTH"),

    /**
     * Represents mAX_ACCEPT_NUMBER.
     */
    MAX_ACCEPT_NUMBER(8, "MAX_ACCEPT_NUMBER");

    private int tapiRouteObjectiveFunctionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiRouteObjectiveFunctionEnum.
     *
     * @param tapiRouteObjectiveFunctionEnum value of tapiRouteObjectiveFunctionEnum
     */
     TapiRouteObjectiveFunctionEnum(int tapiRouteObjectiveFunctionEnum, String schemaName) {
        this.tapiRouteObjectiveFunctionEnum = tapiRouteObjectiveFunctionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiRouteObjectiveFunctionEnum for.
     *
     * @param value value of tapiRouteObjectiveFunctionEnum for
     * @return tapiRouteObjectiveFunctionEnum for
     */
    public static TapiRouteObjectiveFunctionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_HOP;
            case 1:
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_COST;
            case 2:
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_LATENCY;
            case 3:
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_HOP;
            case 4:
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_COST;
            case 5:
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_LATENCY;
            case 6:
                return TapiRouteObjectiveFunctionEnum.LOAD_BALANCING;
            case 7:
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_BANDWIDTH;
            case 8:
                return TapiRouteObjectiveFunctionEnum.MAX_ACCEPT_NUMBER;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiRouteObjectiveFunctionEnum for.
     *
     * @param value value of tapiRouteObjectiveFunctionEnum for
     * @return tapiRouteObjectiveFunctionEnum for
     */
    public static TapiRouteObjectiveFunctionEnum of(String value) {
        switch (value) {
            case "WORKING_MIN_HOP":
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_HOP;
            case "WORKING_MIN_COST":
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_COST;
            case "WORKING_MIN_LATENCY":
                return TapiRouteObjectiveFunctionEnum.WORKING_MIN_LATENCY;
            case "WORKING_PROTECTION_MIN_HOP":
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_HOP;
            case "WORKING_PROTECTION_MIN_COST":
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_COST;
            case "WORKING_PROTECTION_MIN_LATENCY":
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_LATENCY;
            case "LOAD_BALANCING":
                return TapiRouteObjectiveFunctionEnum.LOAD_BALANCING;
            case "WORKING_PROTECTION_MIN_BANDWIDTH":
                return TapiRouteObjectiveFunctionEnum.WORKING_PROTECTION_MIN_BANDWIDTH;
            case "MAX_ACCEPT_NUMBER":
                return TapiRouteObjectiveFunctionEnum.MAX_ACCEPT_NUMBER;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiRouteObjectiveFunctionEnum.
     *
     * @return tapiRouteObjectiveFunctionEnum value of tapiRouteObjectiveFunctionEnum
     */
    public int tapiRouteObjectiveFunctionEnum() {
        return tapiRouteObjectiveFunctionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
