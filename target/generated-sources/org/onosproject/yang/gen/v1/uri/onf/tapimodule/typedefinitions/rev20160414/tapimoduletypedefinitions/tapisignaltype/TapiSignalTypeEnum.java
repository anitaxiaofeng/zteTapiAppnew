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
            .tapisignaltype;

/**
 * Represents ENUM data of tapiSignalTypeEnum.
 */
public enum TapiSignalTypeEnum {

    /**
     * Represents oDU0.
     */
    ODU0(0, "ODU0"),

    /**
     * Represents oDU1.
     */
    ODU1(1, "ODU1"),

    /**
     * Represents oDU2.
     */
    ODU2(2, "ODU2"),

    /**
     * Represents oDU2e.
     */
    ODU2E(3, "ODU2e"),

    /**
     * Represents oDU3.
     */
    ODU3(4, "ODU3"),

    /**
     * Represents oDU4.
     */
    ODU4(5, "ODU4"),

    /**
     * Represents oDUflex-GFP.
     */
    ODUFLEX_GFP(6, "ODUflex-GFP"),

    /**
     * Represents oDUflex-CBR.
     */
    ODUFLEX_CBR(7, "ODUflex-CBR");

    private int tapiSignalTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSignalTypeEnum.
     *
     * @param tapiSignalTypeEnum value of tapiSignalTypeEnum
     */
     TapiSignalTypeEnum(int tapiSignalTypeEnum, String schemaName) {
        this.tapiSignalTypeEnum = tapiSignalTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSignalTypeEnum for.
     *
     * @param value value of tapiSignalTypeEnum for
     * @return tapiSignalTypeEnum for
     */
    public static TapiSignalTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSignalTypeEnum.ODU0;
            case 1:
                return TapiSignalTypeEnum.ODU1;
            case 2:
                return TapiSignalTypeEnum.ODU2;
            case 3:
                return TapiSignalTypeEnum.ODU2E;
            case 4:
                return TapiSignalTypeEnum.ODU3;
            case 5:
                return TapiSignalTypeEnum.ODU4;
            case 6:
                return TapiSignalTypeEnum.ODUFLEX_GFP;
            case 7:
                return TapiSignalTypeEnum.ODUFLEX_CBR;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSignalTypeEnum for.
     *
     * @param value value of tapiSignalTypeEnum for
     * @return tapiSignalTypeEnum for
     */
    public static TapiSignalTypeEnum of(String value) {
        switch (value) {
            case "ODU0":
                return TapiSignalTypeEnum.ODU0;
            case "ODU1":
                return TapiSignalTypeEnum.ODU1;
            case "ODU2":
                return TapiSignalTypeEnum.ODU2;
            case "ODU2e":
                return TapiSignalTypeEnum.ODU2E;
            case "ODU3":
                return TapiSignalTypeEnum.ODU3;
            case "ODU4":
                return TapiSignalTypeEnum.ODU4;
            case "ODUflex-GFP":
                return TapiSignalTypeEnum.ODUFLEX_GFP;
            case "ODUflex-CBR":
                return TapiSignalTypeEnum.ODUFLEX_CBR;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSignalTypeEnum.
     *
     * @return tapiSignalTypeEnum value of tapiSignalTypeEnum
     */
    public int tapiSignalTypeEnum() {
        return tapiSignalTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
