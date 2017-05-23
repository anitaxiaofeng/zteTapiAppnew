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
            .tapiservicetype;

/**
 * Represents ENUM data of tapiServiceTypeEnum.
 */
public enum TapiServiceTypeEnum {

    /**
     * Represents oDUk.
     */
    ODUK(0, "ODUk"),

    /**
     * Represents ePL.
     */
    EPL(1, "EPL"),

    /**
     * Represents eVPL.
     */
    EVPL(2, "EVPL"),

    /**
     * Represents ePLAN.
     */
    EPLAN(3, "EPLAN"),

    /**
     * Represents eVPLAN.
     */
    EVPLAN(4, "EVPLAN"),

    /**
     * Represents ePTREE.
     */
    EPTREE(5, "EPTREE"),

    /**
     * Represents eVPTREE.
     */
    EVPTREE(6, "EVPTREE");

    private int tapiServiceTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiServiceTypeEnum.
     *
     * @param tapiServiceTypeEnum value of tapiServiceTypeEnum
     */
     TapiServiceTypeEnum(int tapiServiceTypeEnum, String schemaName) {
        this.tapiServiceTypeEnum = tapiServiceTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiServiceTypeEnum for.
     *
     * @param value value of tapiServiceTypeEnum for
     * @return tapiServiceTypeEnum for
     */
    public static TapiServiceTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiServiceTypeEnum.ODUK;
            case 1:
                return TapiServiceTypeEnum.EPL;
            case 2:
                return TapiServiceTypeEnum.EVPL;
            case 3:
                return TapiServiceTypeEnum.EPLAN;
            case 4:
                return TapiServiceTypeEnum.EVPLAN;
            case 5:
                return TapiServiceTypeEnum.EPTREE;
            case 6:
                return TapiServiceTypeEnum.EVPTREE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiServiceTypeEnum for.
     *
     * @param value value of tapiServiceTypeEnum for
     * @return tapiServiceTypeEnum for
     */
    public static TapiServiceTypeEnum of(String value) {
        switch (value) {
            case "ODUk":
                return TapiServiceTypeEnum.ODUK;
            case "EPL":
                return TapiServiceTypeEnum.EPL;
            case "EVPL":
                return TapiServiceTypeEnum.EVPL;
            case "EPLAN":
                return TapiServiceTypeEnum.EPLAN;
            case "EVPLAN":
                return TapiServiceTypeEnum.EVPLAN;
            case "EPTREE":
                return TapiServiceTypeEnum.EPTREE;
            case "EVPTREE":
                return TapiServiceTypeEnum.EVPTREE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiServiceTypeEnum.
     *
     * @return tapiServiceTypeEnum value of tapiServiceTypeEnum
     */
    public int tapiServiceTypeEnum() {
        return tapiServiceTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
