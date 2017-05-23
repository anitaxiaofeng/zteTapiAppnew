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
            .tapiswitchcapability.TapiSwitchCapabilityEnum;
import java.util.Objects;

/**
 * Represents the implementation of tapiSwitchCapability.
 */
public final class TapiSwitchCapability {

    private TapiSwitchCapabilityEnum enumeration;

    /**
     * Creates an instance of tapiSwitchCapability.
     */
    private TapiSwitchCapability() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public TapiSwitchCapability(TapiSwitchCapabilityEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of tapiSwitchCapability for type enumeration.
     *
     * @param value value of tapiSwitchCapability for type enumeration
     * @return tapiSwitchCapability for type enumeration
     */
    public static TapiSwitchCapability of(TapiSwitchCapabilityEnum value) {
        return new TapiSwitchCapability(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public TapiSwitchCapabilityEnum enumeration() {
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
        if (obj instanceof TapiSwitchCapability) {
            TapiSwitchCapability other = (TapiSwitchCapability) obj;
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
     * Returns the object of tapiSwitchCapability fromString input String tapiSwitchCapability.
     *
     * @param valInString value of input String
     * @return tapiSwitchCapability
     */
    public static TapiSwitchCapability fromString(String valInString) {
        try {
            TapiSwitchCapabilityEnum tmpVal = TapiSwitchCapabilityEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
