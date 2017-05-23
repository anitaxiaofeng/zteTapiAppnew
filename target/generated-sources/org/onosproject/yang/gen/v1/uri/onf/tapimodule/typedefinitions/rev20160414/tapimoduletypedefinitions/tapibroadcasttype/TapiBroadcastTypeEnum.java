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
            .tapibroadcasttype;

/**
 * Represents ENUM data of tapiBroadcastTypeEnum.
 */
public enum TapiBroadcastTypeEnum {

    /**
     * Represents mULTICAST.
     */
    MULTICAST(0, "MULTICAST"),

    /**
     * Represents bROADCAST.
     */
    BROADCAST(1, "BROADCAST"),

    /**
     * Represents uNICAST.
     */
    UNICAST(2, "UNICAST");

    private int tapiBroadcastTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiBroadcastTypeEnum.
     *
     * @param tapiBroadcastTypeEnum value of tapiBroadcastTypeEnum
     */
     TapiBroadcastTypeEnum(int tapiBroadcastTypeEnum, String schemaName) {
        this.tapiBroadcastTypeEnum = tapiBroadcastTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiBroadcastTypeEnum for.
     *
     * @param value value of tapiBroadcastTypeEnum for
     * @return tapiBroadcastTypeEnum for
     */
    public static TapiBroadcastTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiBroadcastTypeEnum.MULTICAST;
            case 1:
                return TapiBroadcastTypeEnum.BROADCAST;
            case 2:
                return TapiBroadcastTypeEnum.UNICAST;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiBroadcastTypeEnum for.
     *
     * @param value value of tapiBroadcastTypeEnum for
     * @return tapiBroadcastTypeEnum for
     */
    public static TapiBroadcastTypeEnum of(String value) {
        switch (value) {
            case "MULTICAST":
                return TapiBroadcastTypeEnum.MULTICAST;
            case "BROADCAST":
                return TapiBroadcastTypeEnum.BROADCAST;
            case "UNICAST":
                return TapiBroadcastTypeEnum.UNICAST;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiBroadcastTypeEnum.
     *
     * @return tapiBroadcastTypeEnum value of tapiBroadcastTypeEnum
     */
    public int tapiBroadcastTypeEnum() {
        return tapiBroadcastTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
