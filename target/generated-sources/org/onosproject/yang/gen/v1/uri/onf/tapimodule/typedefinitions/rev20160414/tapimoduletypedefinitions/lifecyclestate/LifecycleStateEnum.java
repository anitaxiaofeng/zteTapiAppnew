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
            .lifecyclestate;

/**
 * Represents ENUM data of lifecycleStateEnum.
 */
public enum LifecycleStateEnum {

    /**
     * Represents pLANNED.
     */
    PLANNED(0, "PLANNED"),

    /**
     * Represents pOTENTIAL.
     */
    POTENTIAL(1, "POTENTIAL"),

    /**
     * Represents iNSTALLED.
     */
    INSTALLED(2, "INSTALLED"),

    /**
     * Represents iN_CONFLICT.
     */
    IN_CONFLICT(3, "IN_CONFLICT"),

    /**
     * Represents pENDING_REMOVAL.
     */
    PENDING_REMOVAL(4, "PENDING_REMOVAL");

    private int lifecycleStateEnum;
    private String schemaName;

    /**
     * Creates an instance of lifecycleStateEnum.
     *
     * @param lifecycleStateEnum value of lifecycleStateEnum
     */
     LifecycleStateEnum(int lifecycleStateEnum, String schemaName) {
        this.lifecycleStateEnum = lifecycleStateEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of lifecycleStateEnum for.
     *
     * @param value value of lifecycleStateEnum for
     * @return lifecycleStateEnum for
     */
    public static LifecycleStateEnum of(int value) {
        switch (value) {
            case 0:
                return LifecycleStateEnum.PLANNED;
            case 1:
                return LifecycleStateEnum.POTENTIAL;
            case 2:
                return LifecycleStateEnum.INSTALLED;
            case 3:
                return LifecycleStateEnum.IN_CONFLICT;
            case 4:
                return LifecycleStateEnum.PENDING_REMOVAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of lifecycleStateEnum for.
     *
     * @param value value of lifecycleStateEnum for
     * @return lifecycleStateEnum for
     */
    public static LifecycleStateEnum of(String value) {
        switch (value) {
            case "PLANNED":
                return LifecycleStateEnum.PLANNED;
            case "POTENTIAL":
                return LifecycleStateEnum.POTENTIAL;
            case "INSTALLED":
                return LifecycleStateEnum.INSTALLED;
            case "IN_CONFLICT":
                return LifecycleStateEnum.IN_CONFLICT;
            case "PENDING_REMOVAL":
                return LifecycleStateEnum.PENDING_REMOVAL;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute lifecycleStateEnum.
     *
     * @return lifecycleStateEnum value of lifecycleStateEnum
     */
    public int lifecycleStateEnum() {
        return lifecycleStateEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
