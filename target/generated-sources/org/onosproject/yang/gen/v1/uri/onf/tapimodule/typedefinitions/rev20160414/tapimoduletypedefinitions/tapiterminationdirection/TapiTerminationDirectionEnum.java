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
            .tapiterminationdirection;

/**
 * Represents ENUM data of tapiTerminationDirectionEnum.
 */
public enum TapiTerminationDirectionEnum {

    /**
     * Represents sINK.
     */
    SINK(0, "SINK"),

    /**
     * Represents sOURCE.
     */
    SOURCE(1, "SOURCE"),

    /**
     * Represents bIDIRECTIONAL.
     */
    BIDIRECTIONAL(2, "BIDIRECTIONAL");

    private int tapiTerminationDirectionEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiTerminationDirectionEnum.
     *
     * @param tapiTerminationDirectionEnum value of tapiTerminationDirectionEnum
     */
     TapiTerminationDirectionEnum(int tapiTerminationDirectionEnum, String schemaName) {
        this.tapiTerminationDirectionEnum = tapiTerminationDirectionEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiTerminationDirectionEnum for.
     *
     * @param value value of tapiTerminationDirectionEnum for
     * @return tapiTerminationDirectionEnum for
     */
    public static TapiTerminationDirectionEnum of(int value) {
        switch (value) {
            case 0:
                return TapiTerminationDirectionEnum.SINK;
            case 1:
                return TapiTerminationDirectionEnum.SOURCE;
            case 2:
                return TapiTerminationDirectionEnum.BIDIRECTIONAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiTerminationDirectionEnum for.
     *
     * @param value value of tapiTerminationDirectionEnum for
     * @return tapiTerminationDirectionEnum for
     */
    public static TapiTerminationDirectionEnum of(String value) {
        switch (value) {
            case "SINK":
                return TapiTerminationDirectionEnum.SINK;
            case "SOURCE":
                return TapiTerminationDirectionEnum.SOURCE;
            case "BIDIRECTIONAL":
                return TapiTerminationDirectionEnum.BIDIRECTIONAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiTerminationDirectionEnum.
     *
     * @return tapiTerminationDirectionEnum value of tapiTerminationDirectionEnum
     */
    public int tapiTerminationDirectionEnum() {
        return tapiTerminationDirectionEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
