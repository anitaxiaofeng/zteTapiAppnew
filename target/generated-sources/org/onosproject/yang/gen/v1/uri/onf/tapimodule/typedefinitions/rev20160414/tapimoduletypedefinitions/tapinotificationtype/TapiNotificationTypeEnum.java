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
            .tapinotificationtype;

/**
 * Represents ENUM data of tapiNotificationTypeEnum.
 */
public enum TapiNotificationTypeEnum {

    /**
     * Represents oBJECT_CREATION.
     */
    OBJECT_CREATION(0, "OBJECT_CREATION"),

    /**
     * Represents oBJECT_DELETION.
     */
    OBJECT_DELETION(1, "OBJECT_DELETION"),

    /**
     * Represents vALUE_CHANGE.
     */
    VALUE_CHANGE(2, "VALUE_CHANGE"),

    /**
     * Represents sTATE_CHANGE.
     */
    STATE_CHANGE(3, "STATE_CHANGE");

    private int tapiNotificationTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiNotificationTypeEnum.
     *
     * @param tapiNotificationTypeEnum value of tapiNotificationTypeEnum
     */
     TapiNotificationTypeEnum(int tapiNotificationTypeEnum, String schemaName) {
        this.tapiNotificationTypeEnum = tapiNotificationTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiNotificationTypeEnum for.
     *
     * @param value value of tapiNotificationTypeEnum for
     * @return tapiNotificationTypeEnum for
     */
    public static TapiNotificationTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiNotificationTypeEnum.OBJECT_CREATION;
            case 1:
                return TapiNotificationTypeEnum.OBJECT_DELETION;
            case 2:
                return TapiNotificationTypeEnum.VALUE_CHANGE;
            case 3:
                return TapiNotificationTypeEnum.STATE_CHANGE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiNotificationTypeEnum for.
     *
     * @param value value of tapiNotificationTypeEnum for
     * @return tapiNotificationTypeEnum for
     */
    public static TapiNotificationTypeEnum of(String value) {
        switch (value) {
            case "OBJECT_CREATION":
                return TapiNotificationTypeEnum.OBJECT_CREATION;
            case "OBJECT_DELETION":
                return TapiNotificationTypeEnum.OBJECT_DELETION;
            case "VALUE_CHANGE":
                return TapiNotificationTypeEnum.VALUE_CHANGE;
            case "STATE_CHANGE":
                return TapiNotificationTypeEnum.STATE_CHANGE;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiNotificationTypeEnum.
     *
     * @return tapiNotificationTypeEnum value of tapiNotificationTypeEnum
     */
    public int tapiNotificationTypeEnum() {
        return tapiNotificationTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
