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
            .tapiadaptationtype;

/**
 * Represents ENUM data of tapiAdaptationTypeEnum.
 */
public enum TapiAdaptationTypeEnum {

    /**
     * Represents cBR_AMP.
     */
    CBR_AMP(0, "CBR_AMP"),

    /**
     * Represents cBR_BMP.
     */
    CBR_BMP(1, "CBR_BMP"),

    /**
     * Represents aTMVP.
     */
    ATMVP(2, "ATMVP"),

    /**
     * Represents gFP-T.
     */
    GFP_T(3, "GFP-T"),

    /**
     * Represents gFP-F.
     */
    GFP_F(4, "GFP-F"),

    /**
     * Represents nULL.
     */
    NULL(5, "NULL"),

    /**
     * Represents pRBS.
     */
    PRBS(6, "PRBS"),

    /**
     * Represents rSN_AMP.
     */
    RSN_AMP(7, "RSN_AMP"),

    /**
     * Represents rSN_BMP.
     */
    RSN_BMP(8, "RSN_BMP"),

    /**
     * Represents eTHERNET_PP-OS.
     */
    ETHERNET_PP_OS(9, "ETHERNET_PP-OS"),

    /**
     * Represents cBRx.
     */
    CBRX(10, "CBRx"),

    /**
     * Represents cBRX_GMP.
     */
    CBRX_GMP(11, "CBRX_GMP"),

    /**
     * Represents oDUij.
     */
    ODUIJ(12, "ODUij"),

    /**
     * Represents oDUj21.
     */
    ODUJ21(13, "ODUj21");

    private int tapiAdaptationTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiAdaptationTypeEnum.
     *
     * @param tapiAdaptationTypeEnum value of tapiAdaptationTypeEnum
     */
     TapiAdaptationTypeEnum(int tapiAdaptationTypeEnum, String schemaName) {
        this.tapiAdaptationTypeEnum = tapiAdaptationTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiAdaptationTypeEnum for.
     *
     * @param value value of tapiAdaptationTypeEnum for
     * @return tapiAdaptationTypeEnum for
     */
    public static TapiAdaptationTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiAdaptationTypeEnum.CBR_AMP;
            case 1:
                return TapiAdaptationTypeEnum.CBR_BMP;
            case 2:
                return TapiAdaptationTypeEnum.ATMVP;
            case 3:
                return TapiAdaptationTypeEnum.GFP_T;
            case 4:
                return TapiAdaptationTypeEnum.GFP_F;
            case 5:
                return TapiAdaptationTypeEnum.NULL;
            case 6:
                return TapiAdaptationTypeEnum.PRBS;
            case 7:
                return TapiAdaptationTypeEnum.RSN_AMP;
            case 8:
                return TapiAdaptationTypeEnum.RSN_BMP;
            case 9:
                return TapiAdaptationTypeEnum.ETHERNET_PP_OS;
            case 10:
                return TapiAdaptationTypeEnum.CBRX;
            case 11:
                return TapiAdaptationTypeEnum.CBRX_GMP;
            case 12:
                return TapiAdaptationTypeEnum.ODUIJ;
            case 13:
                return TapiAdaptationTypeEnum.ODUJ21;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiAdaptationTypeEnum for.
     *
     * @param value value of tapiAdaptationTypeEnum for
     * @return tapiAdaptationTypeEnum for
     */
    public static TapiAdaptationTypeEnum of(String value) {
        switch (value) {
            case "CBR_AMP":
                return TapiAdaptationTypeEnum.CBR_AMP;
            case "CBR_BMP":
                return TapiAdaptationTypeEnum.CBR_BMP;
            case "ATMVP":
                return TapiAdaptationTypeEnum.ATMVP;
            case "GFP-T":
                return TapiAdaptationTypeEnum.GFP_T;
            case "GFP-F":
                return TapiAdaptationTypeEnum.GFP_F;
            case "NULL":
                return TapiAdaptationTypeEnum.NULL;
            case "PRBS":
                return TapiAdaptationTypeEnum.PRBS;
            case "RSN_AMP":
                return TapiAdaptationTypeEnum.RSN_AMP;
            case "RSN_BMP":
                return TapiAdaptationTypeEnum.RSN_BMP;
            case "ETHERNET_PP-OS":
                return TapiAdaptationTypeEnum.ETHERNET_PP_OS;
            case "CBRx":
                return TapiAdaptationTypeEnum.CBRX;
            case "CBRX_GMP":
                return TapiAdaptationTypeEnum.CBRX_GMP;
            case "ODUij":
                return TapiAdaptationTypeEnum.ODUIJ;
            case "ODUj21":
                return TapiAdaptationTypeEnum.ODUJ21;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiAdaptationTypeEnum.
     *
     * @return tapiAdaptationTypeEnum value of tapiAdaptationTypeEnum
     */
    public int tapiAdaptationTypeEnum() {
        return tapiAdaptationTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
