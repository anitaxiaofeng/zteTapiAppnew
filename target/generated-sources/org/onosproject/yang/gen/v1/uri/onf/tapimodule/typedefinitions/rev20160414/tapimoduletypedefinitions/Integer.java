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

import java.util.Objects;

/**
 * Represents the implementation of integer.
 */
public final class Integer {

    private short int16;

    /**
     * Creates an instance of integer.
     */
    private Integer() {
    }

    /**
     * Creates an instance of int16.
     *
     * @param int16 value of int16
     */
    public Integer(short int16) {
        this.int16 = int16;
    }

    /**
     * Returns the object of integer for type int16.
     *
     * @param value value of integer for type int16
     * @return integer for type int16
     */
    public static Integer of(short value) {
        return new Integer(value);
    }

    /**
     * Returns the attribute int16.
     *
     * @return int16 value of int16
     */
    public short int16() {
        return int16;
    }

    @Override
    public int hashCode() {
        return Objects.hash(int16);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Integer) {
            Integer other = (Integer) obj;
            return
                Objects.equals(int16, other.int16);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(int16);
    }
    /**
     * Returns the object of integer fromString input String integer.
     *
     * @param valInString value of input String
     * @return integer
     */
    public static Integer fromString(String valInString) {
        try {
            short tmpVal = Short.parseShort(valInString);
            return of(tmpVal);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a valid input element");
        }
    }
}
