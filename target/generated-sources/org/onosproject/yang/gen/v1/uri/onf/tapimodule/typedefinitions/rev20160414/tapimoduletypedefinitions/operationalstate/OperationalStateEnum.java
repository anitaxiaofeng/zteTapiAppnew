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
            .operationalstate;

/**
 * Represents ENUM data of operationalStateEnum.
 */
public enum OperationalStateEnum {

    /**
     * Represents dISABLED.
     */
    DISABLED(0, "DISABLED"),

    /**
     * Represents eNABLED.
     */
    ENABLED(1, "ENABLED");

    private int operationalStateEnum;
    private String schemaName;

    /**
     * Creates an instance of operationalStateEnum.
     *
     * @param operationalStateEnum value of operationalStateEnum
     */
     OperationalStateEnum(int operationalStateEnum, String schemaName) {
        this.operationalStateEnum = operationalStateEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of operationalStateEnum for.
     *
     * @param value value of operationalStateEnum for
     * @return operationalStateEnum for
     */
    public static OperationalStateEnum of(int value) {
        switch (value) {
            case 0:
                return OperationalStateEnum.DISABLED;
            case 1:
                return OperationalStateEnum.ENABLED;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of operationalStateEnum for.
     *
     * @param value value of operationalStateEnum for
     * @return operationalStateEnum for
     */
    public static OperationalStateEnum of(String value) {
        switch (value) {
            case "DISABLED":
                return OperationalStateEnum.DISABLED;
            case "ENABLED":
                return OperationalStateEnum.ENABLED;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute operationalStateEnum.
     *
     * @return operationalStateEnum value of operationalStateEnum
     */
    public int operationalStateEnum() {
        return operationalStateEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
