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
            .payloadtype.PayLoadTypeEnum;
import java.util.Objects;

/**
 * Represents the implementation of payLoadType.
 */
public final class PayLoadType {

    private PayLoadTypeEnum enumeration;

    /**
     * Creates an instance of payLoadType.
     */
    private PayLoadType() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public PayLoadType(PayLoadTypeEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of payLoadType for type enumeration.
     *
     * @param value value of payLoadType for type enumeration
     * @return payLoadType for type enumeration
     */
    public static PayLoadType of(PayLoadTypeEnum value) {
        return new PayLoadType(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public PayLoadTypeEnum enumeration() {
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
        if (obj instanceof PayLoadType) {
            PayLoadType other = (PayLoadType) obj;
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
     * Returns the object of payLoadType fromString input String payLoadType.
     *
     * @param valInString value of input String
     * @return payLoadType
     */
    public static PayLoadType fromString(String valInString) {
        try {
            PayLoadTypeEnum tmpVal = PayLoadTypeEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
