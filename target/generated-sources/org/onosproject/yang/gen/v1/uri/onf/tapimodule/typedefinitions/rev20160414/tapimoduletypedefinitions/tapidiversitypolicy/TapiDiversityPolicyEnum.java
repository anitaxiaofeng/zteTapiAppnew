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
            .tapidiversitypolicy;

/**
 * Represents ENUM data of tapiDiversityPolicyEnum.
 */
public enum TapiDiversityPolicyEnum {

    /**
     * Represents sRLG.
     */
    SRLG(0, "SRLG"),

    /**
     * Represents sRNG.
     */
    SRNG(1, "SRNG"),

    /**
     * Represents sRG.
     */
    SRG(2, "SRG"),

    /**
     * Represents dOMAIN_DIVERSE.
     */
    DOMAIN_DIVERSE(3, "DOMAIN_DIVERSE");

    private int tapiDiversityPolicyEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiDiversityPolicyEnum.
     *
     * @param tapiDiversityPolicyEnum value of tapiDiversityPolicyEnum
     */
     TapiDiversityPolicyEnum(int tapiDiversityPolicyEnum, String schemaName) {
        this.tapiDiversityPolicyEnum = tapiDiversityPolicyEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiDiversityPolicyEnum for.
     *
     * @param value value of tapiDiversityPolicyEnum for
     * @return tapiDiversityPolicyEnum for
     */
    public static TapiDiversityPolicyEnum of(int value) {
        switch (value) {
            case 0:
                return TapiDiversityPolicyEnum.SRLG;
            case 1:
                return TapiDiversityPolicyEnum.SRNG;
            case 2:
                return TapiDiversityPolicyEnum.SRG;
            case 3:
                return TapiDiversityPolicyEnum.DOMAIN_DIVERSE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiDiversityPolicyEnum for.
     *
     * @param value value of tapiDiversityPolicyEnum for
     * @return tapiDiversityPolicyEnum for
     */
    public static TapiDiversityPolicyEnum of(String value) {
        switch (value) {
            case "SRLG":
                return TapiDiversityPolicyEnum.SRLG;
            case "SRNG":
                return TapiDiversityPolicyEnum.SRNG;
            case "SRG":
                return TapiDiversityPolicyEnum.SRG;
            case "DOMAIN_DIVERSE":
                return TapiDiversityPolicyEnum.DOMAIN_DIVERSE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiDiversityPolicyEnum.
     *
     * @return tapiDiversityPolicyEnum value of tapiDiversityPolicyEnum
     */
    public int tapiDiversityPolicyEnum() {
        return tapiDiversityPolicyEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
