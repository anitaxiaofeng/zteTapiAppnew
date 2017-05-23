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
            .tapilinkdirection;

/**
 * Represents ENUM data of tapiLinkDirectionEnum.
 */
public enum TapiLinkDirectionEnum {

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

    private int tapiLinkDirectionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiLinkDirectionEnum.
     *
     * @param tapiLinkDirectionEnum value of tapiLinkDirectionEnum
     */
     TapiLinkDirectionEnum(int tapiLinkDirectionEnum, String schemaName) {
        this.tapiLinkDirectionEnum = tapiLinkDirectionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiLinkDirectionEnum for.
     *
     * @param value value of tapiLinkDirectionEnum for
     * @return tapiLinkDirectionEnum for
     */
    public static TapiLinkDirectionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiLinkDirectionEnum.BIDIRECTIONAL;
            case 1:
                return TapiLinkDirectionEnum.UNIDIRECTIONAL;
            case 2:
                return TapiLinkDirectionEnum.UNDEFINED_OR_UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiLinkDirectionEnum for.
     *
     * @param value value of tapiLinkDirectionEnum for
     * @return tapiLinkDirectionEnum for
     */
    public static TapiLinkDirectionEnum of(String value) {
        switch (value) {
            case "BIDIRECTIONAL":
                return TapiLinkDirectionEnum.BIDIRECTIONAL;
            case "UNIDIRECTIONAL":
                return TapiLinkDirectionEnum.UNIDIRECTIONAL;
            case "UNDEFINED_OR_UNKNOWN":
                return TapiLinkDirectionEnum.UNDEFINED_OR_UNKNOWN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiLinkDirectionEnum.
     *
     * @return tapiLinkDirectionEnum value of tapiLinkDirectionEnum
     */
    public int tapiLinkDirectionEnum() {
        return tapiLinkDirectionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
