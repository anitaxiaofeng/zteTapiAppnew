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
            .tapipathprottype;

/**
 * Represents ENUM data of tapiPathProtTypeEnum.
 */
public enum TapiPathProtTypeEnum {

    /**
     * Represents wORKING.
     */
    WORKING(0, "WORKING"),

    /**
     * Represents pROTECTION.
     */
    PROTECTION(1, "PROTECTION"),

    /**
     * Represents wORK_RESTORATION.
     */
    WORK_RESTORATION(2, "WORK_RESTORATION"),

    /**
     * Represents pRO_RESTORATION.
     */
    PRO_RESTORATION(3, "PRO_RESTORATION");

    private int tapiPathProtTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiPathProtTypeEnum.
     *
     * @param tapiPathProtTypeEnum value of tapiPathProtTypeEnum
     */
     TapiPathProtTypeEnum(int tapiPathProtTypeEnum, String schemaName) {
        this.tapiPathProtTypeEnum = tapiPathProtTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiPathProtTypeEnum for.
     *
     * @param value value of tapiPathProtTypeEnum for
     * @return tapiPathProtTypeEnum for
     */
    public static TapiPathProtTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiPathProtTypeEnum.WORKING;
            case 1:
                return TapiPathProtTypeEnum.PROTECTION;
            case 2:
                return TapiPathProtTypeEnum.WORK_RESTORATION;
            case 3:
                return TapiPathProtTypeEnum.PRO_RESTORATION;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiPathProtTypeEnum for.
     *
     * @param value value of tapiPathProtTypeEnum for
     * @return tapiPathProtTypeEnum for
     */
    public static TapiPathProtTypeEnum of(String value) {
        switch (value) {
            case "WORKING":
                return TapiPathProtTypeEnum.WORKING;
            case "PROTECTION":
                return TapiPathProtTypeEnum.PROTECTION;
            case "WORK_RESTORATION":
                return TapiPathProtTypeEnum.WORK_RESTORATION;
            case "PRO_RESTORATION":
                return TapiPathProtTypeEnum.PRO_RESTORATION;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiPathProtTypeEnum.
     *
     * @return tapiPathProtTypeEnum value of tapiPathProtTypeEnum
     */
    public int tapiPathProtTypeEnum() {
        return tapiPathProtTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
