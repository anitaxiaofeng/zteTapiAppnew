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
            .tapiswitchcapability;

/**
 * Represents ENUM data of tapiSwitchCapabilityEnum.
 */
public enum TapiSwitchCapabilityEnum {

    /**
     * Represents pORT_TRANSPARENT.
     */
    PORT_TRANSPARENT(0, "PORT_TRANSPARENT"),

    /**
     * Represents vLAN_SWITCH.
     */
    VLAN_SWITCH(1, "VLAN_SWITCH"),

    /**
     * Represents lAYER_2_SWITCH.
     */
    LAYER_2_SWITCH(2, "LAYER_2_SWITCH");

    private int tapiSwitchCapabilityEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSwitchCapabilityEnum.
     *
     * @param tapiSwitchCapabilityEnum value of tapiSwitchCapabilityEnum
     */
     TapiSwitchCapabilityEnum(int tapiSwitchCapabilityEnum, String schemaName) {
        this.tapiSwitchCapabilityEnum = tapiSwitchCapabilityEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSwitchCapabilityEnum for.
     *
     * @param value value of tapiSwitchCapabilityEnum for
     * @return tapiSwitchCapabilityEnum for
     */
    public static TapiSwitchCapabilityEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSwitchCapabilityEnum.PORT_TRANSPARENT;
            case 1:
                return TapiSwitchCapabilityEnum.VLAN_SWITCH;
            case 2:
                return TapiSwitchCapabilityEnum.LAYER_2_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSwitchCapabilityEnum for.
     *
     * @param value value of tapiSwitchCapabilityEnum for
     * @return tapiSwitchCapabilityEnum for
     */
    public static TapiSwitchCapabilityEnum of(String value) {
        switch (value) {
            case "PORT_TRANSPARENT":
                return TapiSwitchCapabilityEnum.PORT_TRANSPARENT;
            case "VLAN_SWITCH":
                return TapiSwitchCapabilityEnum.VLAN_SWITCH;
            case "LAYER_2_SWITCH":
                return TapiSwitchCapabilityEnum.LAYER_2_SWITCH;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSwitchCapabilityEnum.
     *
     * @return tapiSwitchCapabilityEnum value of tapiSwitchCapabilityEnum
     */
    public int tapiSwitchCapabilityEnum() {
        return tapiSwitchCapabilityEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
