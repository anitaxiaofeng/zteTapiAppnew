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
            .tapiprotype;

/**
 * Represents ENUM data of tapiProTypeEnum.
 */
public enum TapiProTypeEnum {

    /**
     * Represents nO_PROTECTION.
     */
    NO_PROTECTION(0, "NO_PROTECTION"),

    /**
     * Represents yangAutoPrefix1_PLUS_1_PROTECTION.
     */
    YANGAUTOPREFIX1_PLUS_1_PROTECTION(1, "yangAutoPrefix1_PLUS_1_PROTECTION"),

    /**
     * Represents yangAutoPrefix1_TO_1_PROTECTION.
     */
    YANGAUTOPREFIX1_TO_1_PROTECTION(2, "yangAutoPrefix1_TO_1_PROTECTION"),

    /**
     * Represents dYNAMIC_RESTORATION.
     */
    DYNAMIC_RESTORATION(3, "DYNAMIC_RESTORATION"),

    /**
     * Represents pRE_RESTORATION.
     */
    PRE_RESTORATION(4, "PRE_RESTORATION"),

    /**
     * Represents pERMANENT_1_PLUS_1_PROTECTION.
     */
    PERMANENT_1_PLUS_1_PROTECTION(5, "PERMANENT_1_PLUS_1_PROTECTION"),

    /**
     * Represents yangAutoPrefix1_TO_1_Y_PROTECTION.
     */
    YANGAUTOPREFIX1_TO_1_Y_PROTECTION(6, "yangAutoPrefix1_TO_1_Y_PROTECTION"),

    /**
     * Represents pERMANENT_1_PLUS_1_Y_PROTECTION.
     */
    PERMANENT_1_PLUS_1_Y_PROTECTION(7, "PERMANENT_1_PLUS_1_Y_PROTECTION");

    private int tapiProTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiProTypeEnum.
     *
     * @param tapiProTypeEnum value of tapiProTypeEnum
     */
     TapiProTypeEnum(int tapiProTypeEnum, String schemaName) {
        this.tapiProTypeEnum = tapiProTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiProTypeEnum for.
     *
     * @param value value of tapiProTypeEnum for
     * @return tapiProTypeEnum for
     */
    public static TapiProTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiProTypeEnum.NO_PROTECTION;
            case 1:
                return TapiProTypeEnum.YANGAUTOPREFIX1_PLUS_1_PROTECTION;
            case 2:
                return TapiProTypeEnum.YANGAUTOPREFIX1_TO_1_PROTECTION;
            case 3:
                return TapiProTypeEnum.DYNAMIC_RESTORATION;
            case 4:
                return TapiProTypeEnum.PRE_RESTORATION;
            case 5:
                return TapiProTypeEnum.PERMANENT_1_PLUS_1_PROTECTION;
            case 6:
                return TapiProTypeEnum.YANGAUTOPREFIX1_TO_1_Y_PROTECTION;
            case 7:
                return TapiProTypeEnum.PERMANENT_1_PLUS_1_Y_PROTECTION;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiProTypeEnum for.
     *
     * @param value value of tapiProTypeEnum for
     * @return tapiProTypeEnum for
     */
    public static TapiProTypeEnum of(String value) {
        switch (value) {
            case "NO_PROTECTION":
                return TapiProTypeEnum.NO_PROTECTION;
            case "yangAutoPrefix1_PLUS_1_PROTECTION":
                return TapiProTypeEnum.YANGAUTOPREFIX1_PLUS_1_PROTECTION;
            case "yangAutoPrefix1_TO_1_PROTECTION":
                return TapiProTypeEnum.YANGAUTOPREFIX1_TO_1_PROTECTION;
            case "DYNAMIC_RESTORATION":
                return TapiProTypeEnum.DYNAMIC_RESTORATION;
            case "PRE_RESTORATION":
                return TapiProTypeEnum.PRE_RESTORATION;
            case "PERMANENT_1_PLUS_1_PROTECTION":
                return TapiProTypeEnum.PERMANENT_1_PLUS_1_PROTECTION;
            case "yangAutoPrefix1_TO_1_Y_PROTECTION":
                return TapiProTypeEnum.YANGAUTOPREFIX1_TO_1_Y_PROTECTION;
            case "PERMANENT_1_PLUS_1_Y_PROTECTION":
                return TapiProTypeEnum.PERMANENT_1_PLUS_1_Y_PROTECTION;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiProTypeEnum.
     *
     * @return tapiProTypeEnum value of tapiProTypeEnum
     */
    public int tapiProTypeEnum() {
        return tapiProTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
