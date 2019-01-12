package com.xenosnowfox.openapi3.models.info;

import com.xenosnowfox.openapi3.models.util.Jsonable;
import org.json.JSONObject;

import java.net.URL;

/**
 * Contact information for the exposed API.
 *
 * @since
 *      1.0.0
 * @see
 *      <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#contact-object">https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#contact-object</a>
 */
public interface Contact extends Jsonable {

    /**
     * Obtains the identifying name of the contact person/organisation
     *
     * @return
     *      Contact's name
     * @since
     *      1.0.0
     */
    String getName();

    /**
     * Sets the identifying name of the contact person/organisation
     *
     * @param name
     *      Contact's name
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
     * Shorthand version of {@link #setName(String)} that return's itself for method chaining
     *
     * @since
     *      1.0.0
     */
    default Contact name(final String name) {
        this.setName(name);
        return this;
    }

    /**
     * Obtains the URL pointing to the contact information.
     *
     * @return
     *      URL pointing to contact information
     * @since
     *      1.0.0
     */
    URL getUrl();

    /**
     * Sets the URL pointing to the contact information. MUST be in the format of a URL.
     *
     * @param url
     *      URL pointing to contact information
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
      @since
            1.0.0
     */
    default Contact url(final URL url) {
        this.setUrl(url);
        return this;
    }

    /**
     * Obtains the email address of the contact person/organization.
     *
     * @return
     *      Email address of the contact person/organization
     * @since
     *      1.0.0
     */
    String getEmail();

    /**
     * Sets the email address of the contact person/organization. MUST be in the format of an email address.
     *
     * @param email
     *      Email address of the contact person/organization
     * @since
     *      1.0.0
     */
    void setEmail(final String email);

    /**
     * Shorthand version of {@link #getEmail()}
     *
     * @since
     *      1.0.0
     */
    default String email() {
        return this.getEmail();
    }

    /**
     * Shorthand version of {@link #setEmail(String)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Contact email(final String email) {
        this.setEmail(email);
        return this;
    }

    @Override
    default JSONObject toJsonObject() {
        JSONObject jsonObject = new JSONObject();

        // add name and email
        jsonObject.putOpt("name", this.getName());
        jsonObject.putOpt("email", this.getEmail());

        // add url
        URL url = this.getUrl();
        if (url != null) {
            jsonObject.putOpt("url", url.toExternalForm());
        }

        return jsonObject;
    }

}
