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
            .administrativecontrol;

/**
 * Represents ENUM data of administrativeControlEnum.
 */
public enum AdministrativeControlEnum {

    /**
     * Represents uNLOCK.
     */
    UNLOCK(0, "UNLOCK"),

    /**
     * Represents lOCK_PASSIVE.
     */
    LOCK_PASSIVE(1, "LOCK_PASSIVE"),

    /**
     * Represents lOCK_ACTIVE.
     */
    LOCK_ACTIVE(2, "LOCK_ACTIVE"),

    /**
     * Represents lOCK_IMMEDIATE.
     */
    LOCK_IMMEDIATE(3, "LOCK_IMMEDIATE");

    private int administrativeControlEnum;
    private String schemaName;

    /**
     * Creates an instance of administrativeControlEnum.
     *
     * @param administrativeControlEnum value of administrativeControlEnum
     */
     AdministrativeControlEnum(int administrativeControlEnum, String schemaName) {
        this.administrativeControlEnum = administrativeControlEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of administrativeControlEnum for.
     *
     * @param value value of administrativeControlEnum for
     * @return administrativeControlEnum for
     */
    public static AdministrativeControlEnum of(int value) {
        switch (value) {
            case 0:
                return AdministrativeControlEnum.UNLOCK;
            case 1:
                return AdministrativeControlEnum.LOCK_PASSIVE;
            case 2:
                return AdministrativeControlEnum.LOCK_ACTIVE;
            case 3:
                return AdministrativeControlEnum.LOCK_IMMEDIATE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of administrativeControlEnum for.
     *
     * @param value value of administrativeControlEnum for
     * @return administrativeControlEnum for
     */
    public static AdministrativeControlEnum of(String value) {
        switch (value) {
            case "UNLOCK":
                return AdministrativeControlEnum.UNLOCK;
            case "LOCK_PASSIVE":
                return AdministrativeControlEnum.LOCK_PASSIVE;
            case "LOCK_ACTIVE":
                return AdministrativeControlEnum.LOCK_ACTIVE;
            case "LOCK_IMMEDIATE":
                return AdministrativeControlEnum.LOCK_IMMEDIATE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute administrativeControlEnum.
     *
     * @return administrativeControlEnum value of administrativeControlEnum
     */
    public int administrativeControlEnum() {
        return administrativeControlEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
