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
            .administrativestate;

/**
 * Represents ENUM data of administrativeStateEnum.
 */
public enum AdministrativeStateEnum {

    /**
     * Represents lOCKED.
     */
    LOCKED(0, "LOCKED"),

    /**
     * Represents uNLOCKED.
     */
    UNLOCKED(1, "UNLOCKED"),

    /**
     * Represents sHUTTING_DOWN_ACTIVE.
     */
    SHUTTING_DOWN_ACTIVE(2, "SHUTTING_DOWN_ACTIVE"),

    /**
     * Represents sHUTTING_DOWN_PASSIVE.
     */
    SHUTTING_DOWN_PASSIVE(3, "SHUTTING_DOWN_PASSIVE");

    private int administrativeStateEnum;
    private String schemaName;

    /**
     * Creates an instance of administrativeStateEnum.
     *
     * @param administrativeStateEnum value of administrativeStateEnum
     */
     AdministrativeStateEnum(int administrativeStateEnum, String schemaName) {
        this.administrativeStateEnum = administrativeStateEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of administrativeStateEnum for.
     *
     * @param value value of administrativeStateEnum for
     * @return administrativeStateEnum for
     */
    public static AdministrativeStateEnum of(int value) {
        switch (value) {
            case 0:
                return AdministrativeStateEnum.LOCKED;
            case 1:
                return AdministrativeStateEnum.UNLOCKED;
            case 2:
                return AdministrativeStateEnum.SHUTTING_DOWN_ACTIVE;
            case 3:
                return AdministrativeStateEnum.SHUTTING_DOWN_PASSIVE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of administrativeStateEnum for.
     *
     * @param value value of administrativeStateEnum for
     * @return administrativeStateEnum for
     */
    public static AdministrativeStateEnum of(String value) {
        switch (value) {
            case "LOCKED":
                return AdministrativeStateEnum.LOCKED;
            case "UNLOCKED":
                return AdministrativeStateEnum.UNLOCKED;
            case "SHUTTING_DOWN_ACTIVE":
                return AdministrativeStateEnum.SHUTTING_DOWN_ACTIVE;
            case "SHUTTING_DOWN_PASSIVE":
                return AdministrativeStateEnum.SHUTTING_DOWN_PASSIVE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute administrativeStateEnum.
     *
     * @return administrativeStateEnum value of administrativeStateEnum
     */
    public int administrativeStateEnum() {
        return administrativeStateEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
