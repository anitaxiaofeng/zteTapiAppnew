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
            .tapibroadcastfilteringmode;

/**
 * Represents ENUM data of tapiBroadcastFilteringModeEnum.
 */
public enum TapiBroadcastFilteringModeEnum {

    /**
     * Represents bLOCK.
     */
    BLOCK(0, "BLOCK"),

    /**
     * Represents pASS.
     */
    PASS(1, "PASS");

    private int tapiBroadcastFilteringModeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiBroadcastFilteringModeEnum.
     *
     * @param tapiBroadcastFilteringModeEnum value of tapiBroadcastFilteringModeEnum
     */
     TapiBroadcastFilteringModeEnum(int tapiBroadcastFilteringModeEnum, String schemaName) {
        this.tapiBroadcastFilteringModeEnum = tapiBroadcastFilteringModeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiBroadcastFilteringModeEnum for.
     *
     * @param value value of tapiBroadcastFilteringModeEnum for
     * @return tapiBroadcastFilteringModeEnum for
     */
    public static TapiBroadcastFilteringModeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiBroadcastFilteringModeEnum.BLOCK;
            case 1:
                return TapiBroadcastFilteringModeEnum.PASS;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiBroadcastFilteringModeEnum for.
     *
     * @param value value of tapiBroadcastFilteringModeEnum for
     * @return tapiBroadcastFilteringModeEnum for
     */
    public static TapiBroadcastFilteringModeEnum of(String value) {
        switch (value) {
            case "BLOCK":
                return TapiBroadcastFilteringModeEnum.BLOCK;
            case "PASS":
                return TapiBroadcastFilteringModeEnum.PASS;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiBroadcastFilteringModeEnum.
     *
     * @return tapiBroadcastFilteringModeEnum value of tapiBroadcastFilteringModeEnum
     */
    public int tapiBroadcastFilteringModeEnum() {
        return tapiBroadcastFilteringModeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
