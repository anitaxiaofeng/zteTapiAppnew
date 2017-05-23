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
            .tapicolourmode;

/**
 * Represents ENUM data of tapiColourModeEnum.
 */
public enum TapiColourModeEnum {

    /**
     * Represents cOLOUR_BLIND.
     */
    COLOUR_BLIND(0, "COLOUR_BLIND"),

    /**
     * Represents cOLOUR_AWARE.
     */
    COLOUR_AWARE(1, "COLOUR_AWARE");

    private int tapiColourModeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiColourModeEnum.
     *
     * @param tapiColourModeEnum value of tapiColourModeEnum
     */
     TapiColourModeEnum(int tapiColourModeEnum, String schemaName) {
        this.tapiColourModeEnum = tapiColourModeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiColourModeEnum for.
     *
     * @param value value of tapiColourModeEnum for
     * @return tapiColourModeEnum for
     */
    public static TapiColourModeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiColourModeEnum.COLOUR_BLIND;
            case 1:
                return TapiColourModeEnum.COLOUR_AWARE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiColourModeEnum for.
     *
     * @param value value of tapiColourModeEnum for
     * @return tapiColourModeEnum for
     */
    public static TapiColourModeEnum of(String value) {
        switch (value) {
            case "COLOUR_BLIND":
                return TapiColourModeEnum.COLOUR_BLIND;
            case "COLOUR_AWARE":
                return TapiColourModeEnum.COLOUR_AWARE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiColourModeEnum.
     *
     * @return tapiColourModeEnum value of tapiColourModeEnum
     */
    public int tapiColourModeEnum() {
        return tapiColourModeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
