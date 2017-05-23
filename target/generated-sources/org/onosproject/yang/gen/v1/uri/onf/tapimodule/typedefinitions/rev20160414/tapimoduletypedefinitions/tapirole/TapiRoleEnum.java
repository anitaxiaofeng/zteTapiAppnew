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
            .tapirole;

/**
 * Represents ENUM data of tapiRoleEnum.
 */
public enum TapiRoleEnum {

    /**
     * Represents sYMMETRIC.
     */
    SYMMETRIC(0, "SYMMETRIC"),

    /**
     * Represents rOOT.
     */
    ROOT(1, "ROOT"),

    /**
     * Represents lEAF.
     */
    LEAF(2, "LEAF");

    private int tapiRoleEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiRoleEnum.
     *
     * @param tapiRoleEnum value of tapiRoleEnum
     */
     TapiRoleEnum(int tapiRoleEnum, String schemaName) {
        this.tapiRoleEnum = tapiRoleEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiRoleEnum for.
     *
     * @param value value of tapiRoleEnum for
     * @return tapiRoleEnum for
     */
    public static TapiRoleEnum of(int value) {
        switch (value) {
            case 0:
                return TapiRoleEnum.SYMMETRIC;
            case 1:
                return TapiRoleEnum.ROOT;
            case 2:
                return TapiRoleEnum.LEAF;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiRoleEnum for.
     *
     * @param value value of tapiRoleEnum for
     * @return tapiRoleEnum for
     */
    public static TapiRoleEnum of(String value) {
        switch (value) {
            case "SYMMETRIC":
                return TapiRoleEnum.SYMMETRIC;
            case "ROOT":
                return TapiRoleEnum.ROOT;
            case "LEAF":
                return TapiRoleEnum.LEAF;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiRoleEnum.
     *
     * @return tapiRoleEnum value of tapiRoleEnum
     */
    public int tapiRoleEnum() {
        return tapiRoleEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
