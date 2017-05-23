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
            .tapiobjecttype;

/**
 * Represents ENUM data of tapiObjectTypeEnum.
 */
public enum TapiObjectTypeEnum {

    /**
     * Represents lINK.
     */
    LINK(0, "LINK"),

    /**
     * Represents nODE_EDGE_POINT.
     */
    NODE_EDGE_POINT(1, "NODE_EDGE_POINT");

    private int tapiObjectTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiObjectTypeEnum.
     *
     * @param tapiObjectTypeEnum value of tapiObjectTypeEnum
     */
     TapiObjectTypeEnum(int tapiObjectTypeEnum, String schemaName) {
        this.tapiObjectTypeEnum = tapiObjectTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiObjectTypeEnum for.
     *
     * @param value value of tapiObjectTypeEnum for
     * @return tapiObjectTypeEnum for
     */
    public static TapiObjectTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiObjectTypeEnum.LINK;
            case 1:
                return TapiObjectTypeEnum.NODE_EDGE_POINT;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiObjectTypeEnum for.
     *
     * @param value value of tapiObjectTypeEnum for
     * @return tapiObjectTypeEnum for
     */
    public static TapiObjectTypeEnum of(String value) {
        switch (value) {
            case "LINK":
                return TapiObjectTypeEnum.LINK;
            case "NODE_EDGE_POINT":
                return TapiObjectTypeEnum.NODE_EDGE_POINT;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiObjectTypeEnum.
     *
     * @return tapiObjectTypeEnum value of tapiObjectTypeEnum
     */
    public int tapiObjectTypeEnum() {
        return tapiObjectTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
