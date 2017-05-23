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
            .tapiportdirection;

/**
 * Represents ENUM data of tapiPortDirectionEnum.
 */
public enum TapiPortDirectionEnum {

    /**
     * Represents uNDEFINED_OR_UNKNOWN.
     */
    UNDEFINED_OR_UNKNOWN(0, "UNDEFINED_OR_UNKNOWN"),

    /**
     * Represents iNPUT.
     */
    INPUT(1, "INPUT"),

    /**
     * Represents oUTPUT.
     */
    OUTPUT(2, "OUTPUT"),

    /**
     * Represents bIDIRECTIONAL.
     */
    BIDIRECTIONAL(3, "BIDIRECTIONAL");

    private int tapiPortDirectionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiPortDirectionEnum.
     *
     * @param tapiPortDirectionEnum value of tapiPortDirectionEnum
     */
     TapiPortDirectionEnum(int tapiPortDirectionEnum, String schemaName) {
        this.tapiPortDirectionEnum = tapiPortDirectionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiPortDirectionEnum for.
     *
     * @param value value of tapiPortDirectionEnum for
     * @return tapiPortDirectionEnum for
     */
    public static TapiPortDirectionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiPortDirectionEnum.UNDEFINED_OR_UNKNOWN;
            case 1:
                return TapiPortDirectionEnum.INPUT;
            case 2:
                return TapiPortDirectionEnum.OUTPUT;
            case 3:
                return TapiPortDirectionEnum.BIDIRECTIONAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiPortDirectionEnum for.
     *
     * @param value value of tapiPortDirectionEnum for
     * @return tapiPortDirectionEnum for
     */
    public static TapiPortDirectionEnum of(String value) {
        switch (value) {
            case "UNDEFINED_OR_UNKNOWN":
                return TapiPortDirectionEnum.UNDEFINED_OR_UNKNOWN;
            case "INPUT":
                return TapiPortDirectionEnum.INPUT;
            case "OUTPUT":
                return TapiPortDirectionEnum.OUTPUT;
            case "BIDIRECTIONAL":
                return TapiPortDirectionEnum.BIDIRECTIONAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiPortDirectionEnum.
     *
     * @return tapiPortDirectionEnum value of tapiPortDirectionEnum
     */
    public int tapiPortDirectionEnum() {
        return tapiPortDirectionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
