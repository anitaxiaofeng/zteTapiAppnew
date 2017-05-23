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
            .tapiswitchstate;

/**
 * Represents ENUM data of tapiSwitchStateEnum.
 */
public enum TapiSwitchStateEnum {

    /**
     * Represents nORMAL.
     */
    NORMAL(0, "NORMAL"),

    /**
     * Represents sWITCHED.
     */
    SWITCHED(1, "SWITCHED");

    private int tapiSwitchStateEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSwitchStateEnum.
     *
     * @param tapiSwitchStateEnum value of tapiSwitchStateEnum
     */
     TapiSwitchStateEnum(int tapiSwitchStateEnum, String schemaName) {
        this.tapiSwitchStateEnum = tapiSwitchStateEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSwitchStateEnum for.
     *
     * @param value value of tapiSwitchStateEnum for
     * @return tapiSwitchStateEnum for
     */
    public static TapiSwitchStateEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSwitchStateEnum.NORMAL;
            case 1:
                return TapiSwitchStateEnum.SWITCHED;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSwitchStateEnum for.
     *
     * @param value value of tapiSwitchStateEnum for
     * @return tapiSwitchStateEnum for
     */
    public static TapiSwitchStateEnum of(String value) {
        switch (value) {
            case "NORMAL":
                return TapiSwitchStateEnum.NORMAL;
            case "SWITCHED":
                return TapiSwitchStateEnum.SWITCHED;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSwitchStateEnum.
     *
     * @return tapiSwitchStateEnum value of tapiSwitchStateEnum
     */
    public int tapiSwitchStateEnum() {
        return tapiSwitchStateEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
