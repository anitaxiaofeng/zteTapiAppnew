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
            .tapiaccessaction;

/**
 * Represents ENUM data of tapiAccessActionEnum.
 */
public enum TapiAccessActionEnum {

    /**
     * Represents kEEP.
     */
    KEEP(0, "KEEP"),

    /**
     * Represents pUSH.
     */
    PUSH(1, "PUSH"),

    /**
     * Represents pOP.
     */
    POP(2, "POP"),

    /**
     * Represents sWAP.
     */
    SWAP(3, "SWAP");

    private int tapiAccessActionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiAccessActionEnum.
     *
     * @param tapiAccessActionEnum value of tapiAccessActionEnum
     */
     TapiAccessActionEnum(int tapiAccessActionEnum, String schemaName) {
        this.tapiAccessActionEnum = tapiAccessActionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiAccessActionEnum for.
     *
     * @param value value of tapiAccessActionEnum for
     * @return tapiAccessActionEnum for
     */
    public static TapiAccessActionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiAccessActionEnum.KEEP;
            case 1:
                return TapiAccessActionEnum.PUSH;
            case 2:
                return TapiAccessActionEnum.POP;
            case 3:
                return TapiAccessActionEnum.SWAP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiAccessActionEnum for.
     *
     * @param value value of tapiAccessActionEnum for
     * @return tapiAccessActionEnum for
     */
    public static TapiAccessActionEnum of(String value) {
        switch (value) {
            case "KEEP":
                return TapiAccessActionEnum.KEEP;
            case "PUSH":
                return TapiAccessActionEnum.PUSH;
            case "POP":
                return TapiAccessActionEnum.POP;
            case "SWAP":
                return TapiAccessActionEnum.SWAP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiAccessActionEnum.
     *
     * @return tapiAccessActionEnum value of tapiAccessActionEnum
     */
    public int tapiAccessActionEnum() {
        return tapiAccessActionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
