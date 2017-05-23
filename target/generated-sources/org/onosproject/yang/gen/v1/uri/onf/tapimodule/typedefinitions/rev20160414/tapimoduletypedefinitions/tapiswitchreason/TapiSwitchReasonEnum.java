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
            .tapiswitchreason;

/**
 * Represents ENUM data of tapiSwitchReasonEnum.
 */
public enum TapiSwitchReasonEnum {

    /**
     * Represents nO_SWITCH.
     */
    NO_SWITCH(0, "NO_SWITCH"),

    /**
     * Represents sF_SWITCH.
     */
    SF_SWITCH(1, "SF_SWITCH"),

    /**
     * Represents sD_SWITCH.
     */
    SD_SWITCH(2, "SD_SWITCH"),

    /**
     * Represents mANUAL_SWITCH.
     */
    MANUAL_SWITCH(3, "MANUAL_SWITCH"),

    /**
     * Represents fORCE_SWITCH.
     */
    FORCE_SWITCH(4, "FORCE_SWITCH");

    private int tapiSwitchReasonEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSwitchReasonEnum.
     *
     * @param tapiSwitchReasonEnum value of tapiSwitchReasonEnum
     */
     TapiSwitchReasonEnum(int tapiSwitchReasonEnum, String schemaName) {
        this.tapiSwitchReasonEnum = tapiSwitchReasonEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSwitchReasonEnum for.
     *
     * @param value value of tapiSwitchReasonEnum for
     * @return tapiSwitchReasonEnum for
     */
    public static TapiSwitchReasonEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSwitchReasonEnum.NO_SWITCH;
            case 1:
                return TapiSwitchReasonEnum.SF_SWITCH;
            case 2:
                return TapiSwitchReasonEnum.SD_SWITCH;
            case 3:
                return TapiSwitchReasonEnum.MANUAL_SWITCH;
            case 4:
                return TapiSwitchReasonEnum.FORCE_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSwitchReasonEnum for.
     *
     * @param value value of tapiSwitchReasonEnum for
     * @return tapiSwitchReasonEnum for
     */
    public static TapiSwitchReasonEnum of(String value) {
        switch (value) {
            case "NO_SWITCH":
                return TapiSwitchReasonEnum.NO_SWITCH;
            case "SF_SWITCH":
                return TapiSwitchReasonEnum.SF_SWITCH;
            case "SD_SWITCH":
                return TapiSwitchReasonEnum.SD_SWITCH;
            case "MANUAL_SWITCH":
                return TapiSwitchReasonEnum.MANUAL_SWITCH;
            case "FORCE_SWITCH":
                return TapiSwitchReasonEnum.FORCE_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSwitchReasonEnum.
     *
     * @return tapiSwitchReasonEnum value of tapiSwitchReasonEnum
     */
    public int tapiSwitchReasonEnum() {
        return tapiSwitchReasonEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
