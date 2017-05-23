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
            .tapipathtype;

/**
 * Represents ENUM data of tapiPathTypeEnum.
 */
public enum TapiPathTypeEnum {

    /**
     * Represents p2P.
     */
    P2P(0, "P2P"),

    /**
     * Represents p2MP.
     */
    P2MP(1, "P2MP"),

    /**
     * Represents mP2MP.
     */
    MP2MP(2, "MP2MP");

    private int tapiPathTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiPathTypeEnum.
     *
     * @param tapiPathTypeEnum value of tapiPathTypeEnum
     */
     TapiPathTypeEnum(int tapiPathTypeEnum, String schemaName) {
        this.tapiPathTypeEnum = tapiPathTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiPathTypeEnum for.
     *
     * @param value value of tapiPathTypeEnum for
     * @return tapiPathTypeEnum for
     */
    public static TapiPathTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiPathTypeEnum.P2P;
            case 1:
                return TapiPathTypeEnum.P2MP;
            case 2:
                return TapiPathTypeEnum.MP2MP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiPathTypeEnum for.
     *
     * @param value value of tapiPathTypeEnum for
     * @return tapiPathTypeEnum for
     */
    public static TapiPathTypeEnum of(String value) {
        switch (value) {
            case "P2P":
                return TapiPathTypeEnum.P2P;
            case "P2MP":
                return TapiPathTypeEnum.P2MP;
            case "MP2MP":
                return TapiPathTypeEnum.MP2MP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiPathTypeEnum.
     *
     * @return tapiPathTypeEnum value of tapiPathTypeEnum
     */
    public int tapiPathTypeEnum() {
        return tapiPathTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
