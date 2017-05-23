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
            .payloadtype;

/**
 * Represents ENUM data of payLoadTypeEnum.
 */
public enum PayLoadTypeEnum {

    /**
     * Represents oTU1.
     */
    OTU1(0, "OTU1"),

    /**
     * Represents oTU2.
     */
    OTU2(1, "OTU2"),

    /**
     * Represents oTU3.
     */
    OTU3(2, "OTU3"),

    /**
     * Represents oTU4.
     */
    OTU4(3, "OTU4"),

    /**
     * Represents sTM-1.
     */
    STM_1(4, "STM-1"),

    /**
     * Represents sTM-4.
     */
    STM_4(5, "STM-4"),

    /**
     * Represents sTM-16.
     */
    STM_16(6, "STM-16"),

    /**
     * Represents sTM-256.
     */
    STM_256(7, "STM-256"),

    /**
     * Represents gE.
     */
    GE(8, "GE"),

    /**
     * Represents yangAutoPrefix10GE-LAN.
     */
    YANGAUTOPREFIX10GE_LAN(9, "yangAutoPrefix10GE-LAN"),

    /**
     * Represents yangAutoPrefix40GE.
     */
    YANGAUTOPREFIX40GE(10, "yangAutoPrefix40GE"),

    /**
     * Represents yangAutoPrefix100GE.
     */
    YANGAUTOPREFIX100GE(11, "yangAutoPrefix100GE"),

    /**
     * Represents yangAutoPrefix1GFC.
     */
    YANGAUTOPREFIX1GFC(12, "yangAutoPrefix1GFC"),

    /**
     * Represents yangAutoPrefix4GFC.
     */
    YANGAUTOPREFIX4GFC(13, "yangAutoPrefix4GFC"),

    /**
     * Represents yangAutoPrefix16GFC.
     */
    YANGAUTOPREFIX16GFC(14, "yangAutoPrefix16GFC"),

    /**
     * Represents eSCON.
     */
    ESCON(15, "ESCON"),

    /**
     * Represents pKT.
     */
    PKT(16, "PKT");

    private int payLoadTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of payLoadTypeEnum.
     *
     * @param payLoadTypeEnum value of payLoadTypeEnum
     */
     PayLoadTypeEnum(int payLoadTypeEnum, String schemaName) {
        this.payLoadTypeEnum = payLoadTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of payLoadTypeEnum for.
     *
     * @param value value of payLoadTypeEnum for
     * @return payLoadTypeEnum for
     */
    public static PayLoadTypeEnum of(int value) {
        switch (value) {
            case 0:
                return PayLoadTypeEnum.OTU1;
            case 1:
                return PayLoadTypeEnum.OTU2;
            case 2:
                return PayLoadTypeEnum.OTU3;
            case 3:
                return PayLoadTypeEnum.OTU4;
            case 4:
                return PayLoadTypeEnum.STM_1;
            case 5:
                return PayLoadTypeEnum.STM_4;
            case 6:
                return PayLoadTypeEnum.STM_16;
            case 7:
                return PayLoadTypeEnum.STM_256;
            case 8:
                return PayLoadTypeEnum.GE;
            case 9:
                return PayLoadTypeEnum.YANGAUTOPREFIX10GE_LAN;
            case 10:
                return PayLoadTypeEnum.YANGAUTOPREFIX40GE;
            case 11:
                return PayLoadTypeEnum.YANGAUTOPREFIX100GE;
            case 12:
                return PayLoadTypeEnum.YANGAUTOPREFIX1GFC;
            case 13:
                return PayLoadTypeEnum.YANGAUTOPREFIX4GFC;
            case 14:
                return PayLoadTypeEnum.YANGAUTOPREFIX16GFC;
            case 15:
                return PayLoadTypeEnum.ESCON;
            case 16:
                return PayLoadTypeEnum.PKT;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of payLoadTypeEnum for.
     *
     * @param value value of payLoadTypeEnum for
     * @return payLoadTypeEnum for
     */
    public static PayLoadTypeEnum of(String value) {
        switch (value) {
            case "OTU1":
                return PayLoadTypeEnum.OTU1;
            case "OTU2":
                return PayLoadTypeEnum.OTU2;
            case "OTU3":
                return PayLoadTypeEnum.OTU3;
            case "OTU4":
                return PayLoadTypeEnum.OTU4;
            case "STM-1":
                return PayLoadTypeEnum.STM_1;
            case "STM-4":
                return PayLoadTypeEnum.STM_4;
            case "STM-16":
                return PayLoadTypeEnum.STM_16;
            case "STM-256":
                return PayLoadTypeEnum.STM_256;
            case "GE":
                return PayLoadTypeEnum.GE;
            case "yangAutoPrefix10GE-LAN":
                return PayLoadTypeEnum.YANGAUTOPREFIX10GE_LAN;
            case "yangAutoPrefix40GE":
                return PayLoadTypeEnum.YANGAUTOPREFIX40GE;
            case "yangAutoPrefix100GE":
                return PayLoadTypeEnum.YANGAUTOPREFIX100GE;
            case "yangAutoPrefix1GFC":
                return PayLoadTypeEnum.YANGAUTOPREFIX1GFC;
            case "yangAutoPrefix4GFC":
                return PayLoadTypeEnum.YANGAUTOPREFIX4GFC;
            case "yangAutoPrefix16GFC":
                return PayLoadTypeEnum.YANGAUTOPREFIX16GFC;
            case "ESCON":
                return PayLoadTypeEnum.ESCON;
            case "PKT":
                return PayLoadTypeEnum.PKT;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute payLoadTypeEnum.
     *
     * @return payLoadTypeEnum value of payLoadTypeEnum
     */
    public int payLoadTypeEnum() {
        return payLoadTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
