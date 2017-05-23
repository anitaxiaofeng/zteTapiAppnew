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
            .tapilinkdirection.TapiLinkDirectionEnum;
import java.util.Objects;

/**
 * Represents the implementation of tapiLinkDirection.
 */
public final class TapiLinkDirection {

    private TapiLinkDirectionEnum enumeration;

    /**
     * Creates an instance of tapiLinkDirection.
     */
    private TapiLinkDirection() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public TapiLinkDirection(TapiLinkDirectionEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of tapiLinkDirection for type enumeration.
     *
     * @param value value of tapiLinkDirection for type enumeration
     * @return tapiLinkDirection for type enumeration
     */
    public static TapiLinkDirection of(TapiLinkDirectionEnum value) {
        return new TapiLinkDirection(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public TapiLinkDirectionEnum enumeration() {
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
        if (obj instanceof TapiLinkDirection) {
            TapiLinkDirection other = (TapiLinkDirection) obj;
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
     * Returns the object of tapiLinkDirection fromString input String tapiLinkDirection.
     *
     * @param valInString value of input String
     * @return tapiLinkDirection
     */
    public static TapiLinkDirection fromString(String valInString) {
        try {
            TapiLinkDirectionEnum tmpVal = TapiLinkDirectionEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
