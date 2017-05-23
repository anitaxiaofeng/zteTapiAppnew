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
            .opertype;

/**
 * Represents ENUM data of operTypeEnum.
 */
public enum OperTypeEnum {

    /**
     * Represents rEVERTIVE.
     */
    REVERTIVE(0, "REVERTIVE"),

    /**
     * Represents nON-REVERTIVE.
     */
    NON_REVERTIVE(1, "NON-REVERTIVE");

    private int operTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of operTypeEnum.
     *
     * @param operTypeEnum value of operTypeEnum
     */
     OperTypeEnum(int operTypeEnum, String schemaName) {
        this.operTypeEnum = operTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of operTypeEnum for.
     *
     * @param value value of operTypeEnum for
     * @return operTypeEnum for
     */
    public static OperTypeEnum of(int value) {
        switch (value) {
            case 0:
                return OperTypeEnum.REVERTIVE;
            case 1:
                return OperTypeEnum.NON_REVERTIVE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of operTypeEnum for.
     *
     * @param value value of operTypeEnum for
     * @return operTypeEnum for
     */
    public static OperTypeEnum of(String value) {
        switch (value) {
            case "REVERTIVE":
                return OperTypeEnum.REVERTIVE;
            case "NON-REVERTIVE":
                return OperTypeEnum.NON_REVERTIVE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute operTypeEnum.
     *
     * @return operTypeEnum value of operTypeEnum
     */
    public int operTypeEnum() {
        return operTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
