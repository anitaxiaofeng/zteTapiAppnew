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
            .tapimultilayertype;

/**
 * Represents ENUM data of tapiMultiLayerTypeEnum.
 */
public enum TapiMultiLayerTypeEnum {

    /**
     * Represents sINGLE_LAYER.
     */
    SINGLE_LAYER(0, "SINGLE_LAYER"),

    /**
     * Represents cROSS_LAYER.
     */
    CROSS_LAYER(1, "CROSS_LAYER");

    private int tapiMultiLayerTypeEnum;
    private String schemaName;

    /**
     * Creates an instance of tapiMultiLayerTypeEnum.
     *
     * @param tapiMultiLayerTypeEnum value of tapiMultiLayerTypeEnum
     */
     TapiMultiLayerTypeEnum(int tapiMultiLayerTypeEnum, String schemaName) {
        this.tapiMultiLayerTypeEnum = tapiMultiLayerTypeEnum;
        this.schemaName = schemaName;
    }

    /**
     * Returns the object of tapiMultiLayerTypeEnum for.
     *
     * @param value value of tapiMultiLayerTypeEnum for
     * @return tapiMultiLayerTypeEnum for
     */
    public static TapiMultiLayerTypeEnum of(int value) {
        switch (value) {
            case 0:
                return TapiMultiLayerTypeEnum.SINGLE_LAYER;
            case 1:
                return TapiMultiLayerTypeEnum.CROSS_LAYER;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the object of tapiMultiLayerTypeEnum for.
     *
     * @param value value of tapiMultiLayerTypeEnum for
     * @return tapiMultiLayerTypeEnum for
     */
    public static TapiMultiLayerTypeEnum of(String value) {
        switch (value) {
            case "SINGLE_LAYER":
                return TapiMultiLayerTypeEnum.SINGLE_LAYER;
            case "CROSS_LAYER":
                return TapiMultiLayerTypeEnum.CROSS_LAYER;
            default :
                throw new IllegalArgumentException("not a valid input element");
        }
    }
    /**
     * Returns the attribute tapiMultiLayerTypeEnum.
     *
     * @return tapiMultiLayerTypeEnum value of tapiMultiLayerTypeEnum
     */
    public int tapiMultiLayerTypeEnum() {
        return tapiMultiLayerTypeEnum;
    }


    @Override
    public String toString() {
        return schemaName;
    }
}
