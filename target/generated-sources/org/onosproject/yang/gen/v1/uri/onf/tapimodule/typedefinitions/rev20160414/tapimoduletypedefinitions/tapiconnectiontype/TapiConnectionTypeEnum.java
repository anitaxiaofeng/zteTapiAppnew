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
            .tapiconnectiontype;

/**
 * Represents ENUM data of tapiConnectionTypeEnum.
 */
public enum TapiConnectionTypeEnum {

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

    private int tapiConnectionTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiConnectionTypeEnum.
     *
     * @param tapiConnectionTypeEnum value of tapiConnectionTypeEnum
     */
     TapiConnectionTypeEnum(int tapiConnectionTypeEnum, String schemaName) {
        this.tapiConnectionTypeEnum = tapiConnectionTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiConnectionTypeEnum for.
     *
     * @param value value of tapiConnectionTypeEnum for
     * @return tapiConnectionTypeEnum for
     */
    public static TapiConnectionTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiConnectionTypeEnum.P2P;
            case 1:
                return TapiConnectionTypeEnum.P2MP;
            case 2:
                return TapiConnectionTypeEnum.MP2MP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiConnectionTypeEnum for.
     *
     * @param value value of tapiConnectionTypeEnum for
     * @return tapiConnectionTypeEnum for
     */
    public static TapiConnectionTypeEnum of(String value) {
        switch (value) {
            case "P2P":
                return TapiConnectionTypeEnum.P2P;
            case "P2MP":
                return TapiConnectionTypeEnum.P2MP;
            case "MP2MP":
                return TapiConnectionTypeEnum.MP2MP;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiConnectionTypeEnum.
     *
     * @return tapiConnectionTypeEnum value of tapiConnectionTypeEnum
     */
    public int tapiConnectionTypeEnum() {
        return tapiConnectionTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
