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
            .operationalstate.OperationalStateEnum;
import java.util.Objects;

/**
 * Represents the implementation of operationalState.
 */
public final class OperationalState {

    private OperationalStateEnum enumeration;

    /**
     * Creates an instance of operationalState.
     */
    private OperationalState() {
    }

    /**
     * Creates an instance of enumeration.
     *
     * @param enumeration value of enumeration
     */
    public OperationalState(OperationalStateEnum enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * Returns the object of operationalState for type enumeration.
     *
     * @param value value of operationalState for type enumeration
     * @return operationalState for type enumeration
     */
    public static OperationalState of(OperationalStateEnum value) {
        return new OperationalState(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return enumeration value of enumeration
     */
    public OperationalStateEnum enumeration() {
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
        if (obj instanceof OperationalState) {
            OperationalState other = (OperationalState) obj;
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
     * Returns the object of operationalState fromString input String operationalState.
     *
     * @param valInString value of input String
     * @return operationalState
     */
    public static OperationalState fromString(String valInString) {
        try {
            OperationalStateEnum tmpVal = OperationalStateEnum.of(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
