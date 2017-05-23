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
            .tapivlantype;

/**
 * Represents ENUM data of tapiVlanTypeEnum.
 */
public enum TapiVlanTypeEnum {

    /**
     * Represents c_TAG.
     */
    C_TAG(0, "C_TAG"),

    /**
     * Represents s_TAG.
     */
    S_TAG(1, "S_TAG"),

    /**
     * Represents uN_TAG.
     */
    UN_TAG(2, "UN_TAG");

    private int tapiVlanTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiVlanTypeEnum.
     *
     * @param tapiVlanTypeEnum value of tapiVlanTypeEnum
     */
     TapiVlanTypeEnum(int tapiVlanTypeEnum, String schemaName) {
        this.tapiVlanTypeEnum = tapiVlanTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiVlanTypeEnum for.
     *
     * @param value value of tapiVlanTypeEnum for
     * @return tapiVlanTypeEnum for
     */
    public static TapiVlanTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiVlanTypeEnum.C_TAG;
            case 1:
                return TapiVlanTypeEnum.S_TAG;
            case 2:
                return TapiVlanTypeEnum.UN_TAG;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiVlanTypeEnum for.
     *
     * @param value value of tapiVlanTypeEnum for
     * @return tapiVlanTypeEnum for
     */
    public static TapiVlanTypeEnum of(String value) {
        switch (value) {
            case "C_TAG":
                return TapiVlanTypeEnum.C_TAG;
            case "S_TAG":
                return TapiVlanTypeEnum.S_TAG;
            case "UN_TAG":
                return TapiVlanTypeEnum.UN_TAG;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiVlanTypeEnum.
     *
     * @return tapiVlanTypeEnum value of tapiVlanTypeEnum
     */
    public int tapiVlanTypeEnum() {
        return tapiVlanTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
