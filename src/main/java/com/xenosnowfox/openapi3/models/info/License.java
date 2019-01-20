package com.xenosnowfox.openapi3.models.info;

import com.xenosnowfox.openapi3.models.util.Jsonable;
import org.json.JSONObject;

import java.net.URL;

/**
 * License information for the exposed API
 *
 * @since
 *      1.0.0
 * @see
 *      <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#license-object">https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#license-object</a>
 */
public interface License extends Jsonable {

    /**
     * Obtains the license name used for the API.
     *
     * @return
     *      License name
     * @since
     *      1.0.0
     */
    String getName();

    /**
     * Sets the license name used for the API.
     *
     * @param name
     *      License name
     * @since
     *      1.0.0
     */
    void setName(final String name);

    /**
     * Shorthand version of {@link #getName()}
     *
     * @since
     *      1.0.0
     */
    default String name() {
        return this.getName();
    }

    /**
     * Shorthand version of {@link #setName(String)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default License name(final String name) {
        this.setName(name);
        return this;
    }

    /**
     * Obtains the URL to the license used for the API.
     *
     * @return
     *      License URL
     * @since
     *      1.0.0
     */
    URL getUrl();

    /**
     * Defines the URL to the license used for the API. MUST be in the format of a URL.
     *
     * @param url
     *      License URL
     * @since
     *      1.0.0
     */
    void setUrl(final URL url);

    /**
     * Shorthand version of {@link #getUrl()}
     *
     * @since
     *      1.0.0
     */
    default URL url() {
        return this.getUrl();
    }

    /**
     * Shorthand version of {@link #setUrl(URL)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default License url(final URL url) {
        this.setUrl(url);
        return this;
    }

    @Override
    default JSONObject toJsonObject() {
        JSONObject jsonObject = new JSONObject();

        // add name
        String name = this.getName();
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Name has not been defined");
        }
        jsonObject.putOpt("name", name);

        // add url
        URL url = this.getUrl();
        if (url != null) {
            jsonObject.putOpt("url", url.toExternalForm());
        }

        return jsonObject;
    }
}
