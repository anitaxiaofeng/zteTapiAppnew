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
            .tapiaccessaction.TapiAccessActionEnum;
import java.util.Objects;

/**
 * Represents the implementation of tapiAccessAction.
 */
public final class TapiAccessAction {

    private TapiAccessActionEnum enumeration;

    /**
     * Creates an instance of tapiAccessAction.
     */
    private TapiAccessAction() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public TapiAccessAction(TapiAccessActionEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of tapiAccessAction for type enumeration.
     *
     * @param value value of tapiAccessAction for type enumeration
     * @return tapiAccessAction for type enumeration
     */
    public static TapiAccessAction of(TapiAccessActionEnum value) {
        return new TapiAccessAction(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public TapiAccessActionEnum enumeration() {
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
        if (obj instanceof TapiAccessAction) {
            TapiAccessAction other = (TapiAccessAction) obj;
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
     * Returns the object of tapiAccessAction fromString input String tapiAccessAction.
     *
     * @param valInString value of input String
     * @return tapiAccessAction
     */
    public static TapiAccessAction fromString(String valInString) {
        try {
            TapiAccessActionEnum tmpVal = TapiAccessActionEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
