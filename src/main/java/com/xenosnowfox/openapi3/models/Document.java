package com.xenosnowfox.openapi3.models;

import com.xenosnowfox.openapi3.models.info.Info;
import com.xenosnowfox.openapi3.models.util.Invokable;
import com.xenosnowfox.openapi3.models.util.Jsonable;
import org.json.JSONObject;

/**
 * A document (or set of documents) that defines or describes an API. An OpenAPI definition uses and conforms to the OpenAPI Specification.
 *
 * @since
 *      1.0.0
 * @see
 *      <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#openapi-document">https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#openapi-document</a>
 */
public interface Document extends Jsonable {
    String OPENAPI_VERSION = "3.0.2";

    /**
     * Obtains the semantic version number of the OpenAPI Specification version that the OpenAPI document uses.
     *
     * @return
     *      OpenAPI Specification version number
     * @since
     *      1.0.0
     */
    default String getVersion() {
        return OPENAPI_VERSION;
    }

    /**
     * Shorthand version of {@link #getVersion()}
     *
     * @since
     *      1.0.0
     */
    default String version() {
        return this.getVersion();
    }

    /**
     * Obtains the metadata about the API.
     *
     * @return
     *      Info metadata
     * @since
     *      1.0.0
     */
    Info getInfo();

    /**
     * Invokes the given callback with the metadata information for the exposed API.
     *
     * @param callback
     *      Callback to invoke with the metadata information
     * @since
     *      1.0.0
     */
    default void getInfo(final Invokable<Info> callback) {
        callback.invoke(this.getInfo());
    }

    /**
     * Invokes the given callback with the metadata information for the exposed API.
     * If no metadata information has already been defined then the provided default value is assigned to the instance.
     *
     * @param callback
     *      Callback to invoke with the metadata information
     * @param defaultValue
     *      Default info object to use
     * @since
     *      1.0.0
     */
    default void getInfo(final Invokable<Info> callback, final Info defaultValue) {
        if (this.getInfo() == null) {
            this.setInfo(defaultValue);
        }
        this.getInfo(callback);
    }

    /**
     * Defines the metadata about the API
     *
     * @param info
     *      Info metadata
     * @since
     *      1.0.0
     */
    void setInfo(final Info info);

    /**
     * Shorthand version of {@link #getInfo()}
     *
     * @since
     *      1.0.0
     */
    default Info info() {
        return this.info();
    }

    /**
     * Shorthand version of {@link #getInfo(Invokable)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Document info(final Invokable<Info> callback) {
        this.getInfo(callback);
        return this;
    }

    /**
     * Shorthand version of {@link #getInfo(Invokable, Info)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Document info(final Invokable<Info> callback, final Info defaultValue) {
        this.getInfo(callback, defaultValue);
        return this;
    }

    /**
     * Shorthand version of {@link #setInfo(Info)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Document info(final Info info) {
        this.setInfo(info);
        return this;
    }

    @Override
    default JSONObject toJsonObject() {
        JSONObject jsonObject = new JSONObject();

        // store the openapi version
        jsonObject.put("openapi", OPENAPI_VERSION);

        // get info
        Info info = this.getInfo();
        if (info == null) {
            throw new NullPointerException("Info has not been defined");
        }
        jsonObject.putOpt("info", info.toJsonObject());


        return jsonObject;
    }
}
