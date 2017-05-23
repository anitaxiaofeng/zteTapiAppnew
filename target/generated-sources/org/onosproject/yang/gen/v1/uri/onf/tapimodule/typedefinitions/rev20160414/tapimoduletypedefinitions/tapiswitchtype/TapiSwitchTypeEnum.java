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
            .tapiswitchtype;

/**
 * Represents ENUM data of tapiSwitchTypeEnum.
 */
public enum TapiSwitchTypeEnum {

    /**
     * Represents uNI_SWITCH.
     */
    UNI_SWITCH(0, "UNI_SWITCH"),

    /**
     * Represents bI_SWITCH.
     */
    BI_SWITCH(1, "BI_SWITCH");

    private int tapiSwitchTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSwitchTypeEnum.
     *
     * @param tapiSwitchTypeEnum value of tapiSwitchTypeEnum
     */
     TapiSwitchTypeEnum(int tapiSwitchTypeEnum, String schemaName) {
        this.tapiSwitchTypeEnum = tapiSwitchTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSwitchTypeEnum for.
     *
     * @param value value of tapiSwitchTypeEnum for
     * @return tapiSwitchTypeEnum for
     */
    public static TapiSwitchTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSwitchTypeEnum.UNI_SWITCH;
            case 1:
                return TapiSwitchTypeEnum.BI_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSwitchTypeEnum for.
     *
     * @param value value of tapiSwitchTypeEnum for
     * @return tapiSwitchTypeEnum for
     */
    public static TapiSwitchTypeEnum of(String value) {
        switch (value) {
            case "UNI_SWITCH":
                return TapiSwitchTypeEnum.UNI_SWITCH;
            case "BI_SWITCH":
                return TapiSwitchTypeEnum.BI_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSwitchTypeEnum.
     *
     * @return tapiSwitchTypeEnum value of tapiSwitchTypeEnum
     */
    public int tapiSwitchTypeEnum() {
        return tapiSwitchTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
