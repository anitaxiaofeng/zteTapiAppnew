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
            .tapiprotrole;

/**
 * Represents ENUM data of tapiProtRoleEnum.
 */
public enum TapiProtRoleEnum {

    /**
     * Represents unprotected.
     */
    UNPROTECTED(0, "Unprotected"),

    /**
     * Represents protected.
     */
    PROTECTED(1, "Protected"),

    /**
     * Represents working.
     */
    WORKING(2, "Working"),

    /**
     * Represents protecting.
     */
    PROTECTING(3, "Protecting");

    private int tapiProtRoleEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiProtRoleEnum.
     *
     * @param tapiProtRoleEnum value of tapiProtRoleEnum
     */
     TapiProtRoleEnum(int tapiProtRoleEnum, String schemaName) {
        this.tapiProtRoleEnum = tapiProtRoleEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiProtRoleEnum for.
     *
     * @param value value of tapiProtRoleEnum for
     * @return tapiProtRoleEnum for
     */
    public static TapiProtRoleEnum of(int value) {
        switch (value) {
            case 0:
                return TapiProtRoleEnum.UNPROTECTED;
            case 1:
                return TapiProtRoleEnum.PROTECTED;
            case 2:
                return TapiProtRoleEnum.WORKING;
            case 3:
                return TapiProtRoleEnum.PROTECTING;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiProtRoleEnum for.
     *
     * @param value value of tapiProtRoleEnum for
     * @return tapiProtRoleEnum for
     */
    public static TapiProtRoleEnum of(String value) {
        switch (value) {
            case "Unprotected":
                return TapiProtRoleEnum.UNPROTECTED;
            case "Protected":
                return TapiProtRoleEnum.PROTECTED;
            case "Working":
                return TapiProtRoleEnum.WORKING;
            case "Protecting":
                return TapiProtRoleEnum.PROTECTING;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiProtRoleEnum.
     *
     * @return tapiProtRoleEnum value of tapiProtRoleEnum
     */
    public int tapiProtRoleEnum() {
        return tapiProtRoleEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
