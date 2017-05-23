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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions;

import org.onosproject.yang.gen.v1.uri.onf.tapimodule.typedefinitions.rev20160414.tapimoduletypedefinitions
            .tapivlantype.TapiVlanTypeEnum;
import java.util.Objects;

/**
 * Represents the implementation of tapiVlanType.
 */
public final class TapiVlanType {

    private TapiVlanTypeEnum enumeration;

    /**
     * Creates an instance of tapiVlanType.
     */
    private TapiVlanType() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public TapiVlanType(TapiVlanTypeEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of tapiVlanType for type enumeration.
     *
     * @param value value of tapiVlanType for type enumeration
     * @return tapiVlanType for type enumeration
     */
    public static TapiVlanType of(TapiVlanTypeEnum value) {
        return new TapiVlanType(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public TapiVlanTypeEnum enumeration() {
        return enumeration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enumeration);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapiVlanType) {
            TapiVlanType other = (TapiVlanType) obj;
            return
                Objects.equals(enumeration, other.enumeration);
        }
        return false;
    }

    @Override
    public String toString() {
        return enumeration.toString();
    }
    /**
     * Returns the object of tapiVlanType fromString input String tapiVlanType.
     *
     * @param valInString value of input String
     * @return tapiVlanType
     */
    public static TapiVlanType fromString(String valInString) {
        try {
            TapiVlanTypeEnum tmpVal = TapiVlanTypeEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
