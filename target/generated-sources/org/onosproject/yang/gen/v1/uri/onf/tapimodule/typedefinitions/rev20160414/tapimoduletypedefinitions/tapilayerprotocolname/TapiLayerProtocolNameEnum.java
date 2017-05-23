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
            .tapilayerprotocolname;

/**
 * Represents ENUM data of tapiLayerProtocolNameEnum.
 */
public enum TapiLayerProtocolNameEnum {

    /**
     * Represents eTH.
     */
    ETH(0, "ETH"),

    /**
     * Represents oDU.
     */
    ODU(1, "ODU"),

    /**
     * Represents oCH.
     */
    OCH(2, "OCH"),

    /**
     * Represents mPLS-TP.
     */
    MPLS_TP(3, "MPLS-TP");

    private int tapiLayerProtocolNameEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiLayerProtocolNameEnum.
     *
     * @param tapiLayerProtocolNameEnum value of tapiLayerProtocolNameEnum
     */
     TapiLayerProtocolNameEnum(int tapiLayerProtocolNameEnum, String schemaName) {
        this.tapiLayerProtocolNameEnum = tapiLayerProtocolNameEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiLayerProtocolNameEnum for.
     *
     * @param value value of tapiLayerProtocolNameEnum for
     * @return tapiLayerProtocolNameEnum for
     */
    public static TapiLayerProtocolNameEnum of(int value) {
        switch (value) {
            case 0:
                return TapiLayerProtocolNameEnum.ETH;
            case 1:
                return TapiLayerProtocolNameEnum.ODU;
            case 2:
                return TapiLayerProtocolNameEnum.OCH;
            case 3:
                return TapiLayerProtocolNameEnum.MPLS_TP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiLayerProtocolNameEnum for.
     *
     * @param value value of tapiLayerProtocolNameEnum for
     * @return tapiLayerProtocolNameEnum for
     */
    public static TapiLayerProtocolNameEnum of(String value) {
        switch (value) {
            case "ETH":
                return TapiLayerProtocolNameEnum.ETH;
            case "ODU":
                return TapiLayerProtocolNameEnum.ODU;
            case "OCH":
                return TapiLayerProtocolNameEnum.OCH;
            case "MPLS-TP":
                return TapiLayerProtocolNameEnum.MPLS_TP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiLayerProtocolNameEnum.
     *
     * @return tapiLayerProtocolNameEnum value of tapiLayerProtocolNameEnum
     */
    public int tapiLayerProtocolNameEnum() {
        return tapiLayerProtocolNameEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
