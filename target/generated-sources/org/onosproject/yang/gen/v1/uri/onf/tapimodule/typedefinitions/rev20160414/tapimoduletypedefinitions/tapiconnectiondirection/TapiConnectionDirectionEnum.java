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
            .tapiconnectiondirection;

/**
 * Represents ENUM data of tapiConnectionDirectionEnum.
 */
public enum TapiConnectionDirectionEnum {

    /**
     * Represents bIDIRECTIONAL.
     */
    BIDIRECTIONAL(0, "BIDIRECTIONAL"),

    /**
     * Represents uNIDIRECTIONAL.
     */
    UNIDIRECTIONAL(1, "UNIDIRECTIONAL"),

    /**
     * Represents uNDEFINED_OR_UNKNOWN.
     */
    UNDEFINED_OR_UNKNOWN(2, "UNDEFINED_OR_UNKNOWN");

    private int tapiConnectionDirectionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiConnectionDirectionEnum.
     *
     * @param tapiConnectionDirectionEnum value of tapiConnectionDirectionEnum
     */
     TapiConnectionDirectionEnum(int tapiConnectionDirectionEnum, String schemaName) {
        this.tapiConnectionDirectionEnum = tapiConnectionDirectionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiConnectionDirectionEnum for.
     *
     * @param value value of tapiConnectionDirectionEnum for
     * @return tapiConnectionDirectionEnum for
     */
    public static TapiConnectionDirectionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiConnectionDirectionEnum.BIDIRECTIONAL;
            case 1:
                return TapiConnectionDirectionEnum.UNIDIRECTIONAL;
            case 2:
                return TapiConnectionDirectionEnum.UNDEFINED_OR_UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiConnectionDirectionEnum for.
     *
     * @param value value of tapiConnectionDirectionEnum for
     * @return tapiConnectionDirectionEnum for
     */
    public static TapiConnectionDirectionEnum of(String value) {
        switch (value) {
            case "BIDIRECTIONAL":
                return TapiConnectionDirectionEnum.BIDIRECTIONAL;
            case "UNIDIRECTIONAL":
                return TapiConnectionDirectionEnum.UNIDIRECTIONAL;
            case "UNDEFINED_OR_UNKNOWN":
                return TapiConnectionDirectionEnum.UNDEFINED_OR_UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiConnectionDirectionEnum.
     *
     * @return tapiConnectionDirectionEnum value of tapiConnectionDirectionEnum
     */
    public int tapiConnectionDirectionEnum() {
        return tapiConnectionDirectionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
