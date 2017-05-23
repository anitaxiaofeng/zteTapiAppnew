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
            .tapisourceindicator;

/**
 * Represents ENUM data of tapiSourceIndicatorEnum.
 */
public enum TapiSourceIndicatorEnum {

    /**
     * Represents rESOURCE_OPERATION.
     */
    RESOURCE_OPERATION(0, "RESOURCE_OPERATION"),

    /**
     * Represents mANAGEMENT_OPERATION.
     */
    MANAGEMENT_OPERATION(1, "MANAGEMENT_OPERATION"),

    /**
     * Represents uNKNOWN.
     */
    UNKNOWN(2, "UNKNOWN");

    private int tapiSourceIndicatorEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiSourceIndicatorEnum.
     *
     * @param tapiSourceIndicatorEnum value of tapiSourceIndicatorEnum
     */
     TapiSourceIndicatorEnum(int tapiSourceIndicatorEnum, String schemaName) {
        this.tapiSourceIndicatorEnum = tapiSourceIndicatorEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiSourceIndicatorEnum for.
     *
     * @param value value of tapiSourceIndicatorEnum for
     * @return tapiSourceIndicatorEnum for
     */
    public static TapiSourceIndicatorEnum of(int value) {
        switch (value) {
            case 0:
                return TapiSourceIndicatorEnum.RESOURCE_OPERATION;
            case 1:
                return TapiSourceIndicatorEnum.MANAGEMENT_OPERATION;
            case 2:
                return TapiSourceIndicatorEnum.UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiSourceIndicatorEnum for.
     *
     * @param value value of tapiSourceIndicatorEnum for
     * @return tapiSourceIndicatorEnum for
     */
    public static TapiSourceIndicatorEnum of(String value) {
        switch (value) {
            case "RESOURCE_OPERATION":
                return TapiSourceIndicatorEnum.RESOURCE_OPERATION;
            case "MANAGEMENT_OPERATION":
                return TapiSourceIndicatorEnum.MANAGEMENT_OPERATION;
            case "UNKNOWN":
                return TapiSourceIndicatorEnum.UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiSourceIndicatorEnum.
     *
     * @return tapiSourceIndicatorEnum value of tapiSourceIndicatorEnum
     */
    public int tapiSourceIndicatorEnum() {
        return tapiSourceIndicatorEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
