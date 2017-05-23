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
            .tapimultidomaintype;

/**
 * Represents ENUM data of tapiMultiDomainTypeEnum.
 */
public enum TapiMultiDomainTypeEnum {

    /**
     * Represents eND_TO_END.
     */
    END_TO_END(0, "END_TO_END"),

    /**
     * Represents pER_DOMAIN.
     */
    PER_DOMAIN(1, "PER_DOMAIN");

    private int tapiMultiDomainTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiMultiDomainTypeEnum.
     *
     * @param tapiMultiDomainTypeEnum value of tapiMultiDomainTypeEnum
     */
     TapiMultiDomainTypeEnum(int tapiMultiDomainTypeEnum, String schemaName) {
        this.tapiMultiDomainTypeEnum = tapiMultiDomainTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiMultiDomainTypeEnum for.
     *
     * @param value value of tapiMultiDomainTypeEnum for
     * @return tapiMultiDomainTypeEnum for
     */
    public static TapiMultiDomainTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiMultiDomainTypeEnum.END_TO_END;
            case 1:
                return TapiMultiDomainTypeEnum.PER_DOMAIN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiMultiDomainTypeEnum for.
     *
     * @param value value of tapiMultiDomainTypeEnum for
     * @return tapiMultiDomainTypeEnum for
     */
    public static TapiMultiDomainTypeEnum of(String value) {
        switch (value) {
            case "END_TO_END":
                return TapiMultiDomainTypeEnum.END_TO_END;
            case "PER_DOMAIN":
                return TapiMultiDomainTypeEnum.PER_DOMAIN;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiMultiDomainTypeEnum.
     *
     * @return tapiMultiDomainTypeEnum value of tapiMultiDomainTypeEnum
     */
    public int tapiMultiDomainTypeEnum() {
        return tapiMultiDomainTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
