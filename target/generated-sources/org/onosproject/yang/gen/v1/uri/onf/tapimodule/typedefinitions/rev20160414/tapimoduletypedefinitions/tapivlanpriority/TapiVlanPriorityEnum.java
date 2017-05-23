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
            .tapivlanpriority;

/**
 * Represents ENUM data of tapiVlanPriorityEnum.
 */
public enum TapiVlanPriorityEnum {

    /**
     * Represents yangAutoPrefix0.
     */
    YANGAUTOPREFIX0(0, "yangAutoPrefix0"),

    /**
     * Represents yangAutoPrefix1.
     */
    YANGAUTOPREFIX1(1, "yangAutoPrefix1"),

    /**
     * Represents yangAutoPrefix2.
     */
    YANGAUTOPREFIX2(2, "yangAutoPrefix2"),

    /**
     * Represents yangAutoPrefix3.
     */
    YANGAUTOPREFIX3(3, "yangAutoPrefix3"),

    /**
     * Represents yangAutoPrefix4.
     */
    YANGAUTOPREFIX4(4, "yangAutoPrefix4"),

    /**
     * Represents yangAutoPrefix5.
     */
    YANGAUTOPREFIX5(5, "yangAutoPrefix5"),

    /**
     * Represents yangAutoPrefix6.
     */
    YANGAUTOPREFIX6(6, "yangAutoPrefix6"),

    /**
     * Represents yangAutoPrefix7.
     */
    YANGAUTOPREFIX7(7, "yangAutoPrefix7");

    private int tapiVlanPriorityEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiVlanPriorityEnum.
     *
     * @param tapiVlanPriorityEnum value of tapiVlanPriorityEnum
     */
     TapiVlanPriorityEnum(int tapiVlanPriorityEnum, String schemaName) {
        this.tapiVlanPriorityEnum = tapiVlanPriorityEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiVlanPriorityEnum for.
     *
     * @param value value of tapiVlanPriorityEnum for
     * @return tapiVlanPriorityEnum for
     */
    public static TapiVlanPriorityEnum of(int value) {
        switch (value) {
            case 0:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX0;
            case 1:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX1;
            case 2:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX2;
            case 3:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX3;
            case 4:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX4;
            case 5:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX5;
            case 6:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX6;
            case 7:
                return TapiVlanPriorityEnum.YANGAUTOPREFIX7;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiVlanPriorityEnum for.
     *
     * @param value value of tapiVlanPriorityEnum for
     * @return tapiVlanPriorityEnum for
     */
    public static TapiVlanPriorityEnum of(String value) {
        switch (value) {
            case "yangAutoPrefix0":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX0;
            case "yangAutoPrefix1":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX1;
            case "yangAutoPrefix2":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX2;
            case "yangAutoPrefix3":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX3;
            case "yangAutoPrefix4":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX4;
            case "yangAutoPrefix5":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX5;
            case "yangAutoPrefix6":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX6;
            case "yangAutoPrefix7":
                return TapiVlanPriorityEnum.YANGAUTOPREFIX7;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiVlanPriorityEnum.
     *
     * @return tapiVlanPriorityEnum value of tapiVlanPriorityEnum
     */
    public int tapiVlanPriorityEnum() {
        return tapiVlanPriorityEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
