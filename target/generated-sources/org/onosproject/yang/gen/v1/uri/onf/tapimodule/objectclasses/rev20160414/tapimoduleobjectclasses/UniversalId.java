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

package org.onosproject.yang.gen.v1.uri.onf.tapimodule.objectclasses.rev20160414.tapimoduleobjectclasses;

import java.util.Objects;

/**
 * Represents the implementation of universalId.
 */
public final class UniversalId {

    private String string;

    /**
     * Creates an instance of universalId.
     */
    private UniversalId() {
    }

    /**
     * Creates an instance of string.
     *
     * @param string value of string
     */
    public UniversalId(String string) {
        this.string = string;
    }

    /**
     * Returns the object of universalId for type string.
     *
     * @param value value of universalId for type string
     * @return universalId for type string
     */
    public static UniversalId of(String value) {
        return new UniversalId(value);
    }

    /**
     * Returns the attribute string.
     *
     * @return string value of string
     */
    public String string() {
        return string;
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniversalId) {
            UniversalId other = (UniversalId) obj;
            return
                Objects.equals(string, other.string);
        }
        return false;
    }

    @Override
    public String toString() {
        return string;
    }
    /**
     * Returns the object of universalId fromString input String universalId.
     *
     * @param valInString value of input String
     * @return universalId
     */
    public static UniversalId fromString(String valInString) {
        try {
            String tmpVal = (valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
