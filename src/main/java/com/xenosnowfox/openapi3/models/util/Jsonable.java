package com.xenosnowfox.openapi3.models.util;

import org.json.JSONObject;

/**
 * Defines a class that can be converted into a JSON Object representation of itself
 */
public interface Jsonable {

    /**
     * Obtains the JSON Object representation of the class
     *
     * @return
     *      JSON Object
     */
    JSONObject toJsonObject();
}
