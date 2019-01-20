package com.xenosnowfox.openapi3.models.info;

import com.xenosnowfox.openapi3.models.util.Invokable;
import com.xenosnowfox.openapi3.models.util.Jsonable;
import org.json.JSONObject;

import java.net.URL;

/**
 * The object provides metadata about the API. The metadata MAY be used by the clients if needed, and MAY be presented in editing or documentation generation tools for convenience.
 *
 * @since
 *      1.0.0
 * @see
 *      <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#info-object">https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#info-object</a>
 */
public interface Info extends Jsonable {

    /**
     * Obtains the title of the application.
     *
     * @return
     *      Application title
     * @since
     *      1.0.0
     */
    String getTitle();

    /**
     * Defines the title of the application. This cannot be null.
     *
     * @param title
     *      Application title
     * @since
     *      1.0.0
     */
    void setTitle(final String title);

    /**
     * Shorthand version of {@link #getTitle()}
     *
     * @since
     *      1.0.0
     */
    default String title() {
        return this.getTitle();
    }

    /**
     * Shorthand version of {@link #setTitle(String)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info title(final String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * Obtains the version of the OpenAPI document (which is distinct from the OpenAPI Specification version or the API implementation version).
     *
     * @return
     *      Document version number
     * @since
     *      1.0.0
     */
    String getVersion();

    /**
     * Defines the version of the OpenAPI document (which is distinct from the OpenAPI Specification version or the API implementation version).
     *
     * @param version
     *      Document version number
     * @since
     *      1.0.0
     */
    void setVersion(final String version);

    /**
     * Shorthand version of {@link #getVersion()}
     * @since
     *      1.0.0
     *
     */
    default String version() {
        return this.getVersion();
    }

    /**
     * Shorthand version of {@link #setVersion(String)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info version(final String version) {
        this.setVersion(version);
        return this;
    }

    /**
     * Obtains a short description of the application.
     *
     * @return
     *      Short description about the application
     * @since
     *      1.0.0
     */
    String getDescription();

    /**
     * Defines a short description of the application. <a href="http://spec.commonmark.org/">CommonMark syntax</a> MAY be used for rich text representation.
     *
     * @param description
     *      Short description about the application
     * @since
     *      1.0.0
     */
    void setDescription(final String description);

    /**
     * Shorthand version of {@link #getDescription()}
     *
     * @since
     *      1.0.0
     */
    default String description() {
        return this.getDescription();
    }

    /**
     * Shorthand version of {@link #setDescription(String)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info description(final String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * Obtains the URL to the Terms of Service for the API
     *
     * @return
     *      URL that directs to the Terms of Service
     * @since
     *      1.0.0
     */
    URL getTermsOfService();

    /**
     * Defines the URL to the Terms of Service for the API. MUST be in the format of a URL.
     *
     * @param url
     *      URL that directs to the Terms of Service
     * @since
     *      1.0.0
     */
    void setTermsOfService(final URL url);

    /**
     * Shorthand version of {@link #getTermsOfService()}
     *
     * @since
     *      1.0.0
     */
    default URL termsOfService() {
        return this.getTermsOfService();
    }

    /**
     * Shorthand version of {@link #setTermsOfService(URL)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info termsOfService(final URL url) {
        this.setTermsOfService(url);
        return this;
    }

    /**
     * Obtains the contact information for the exposed API.
     *
     * @return
     *      Contact information
     * @since
     *      1.0.0
     */
    Contact getContact();

    /**
     * Defines the contact information for the exposed API
     *
     * @param contact
     *      Contact information
     * @since
     *      1.0.0
     */
    void setContact(final Contact contact);

    /**
     * Invokes the given callback with the contact information for the exposed API.
     *
     * @param callback
     *      Callback to invoke with the contact information
     * @since
     *      1.0.0
     */
    default void getContact(final Invokable<Contact> callback) {
        callback.invoke(this.getContact());
    }

    /**
     * Invokes the given callback with the contact information for the exposed API.
     * If no contact information has already been defined then the provided default value is assigned to the instance.
     *
     * @param callback
     *      Callback to invoke with the contact information
     * @param defaultContact
     *      Default contact object to use
     * @since
     *      1.0.0
     */
    default void getContact(final Invokable<Contact> callback, final Contact defaultContact) {
        if (this.getContact() == null) {
            this.setContact(defaultContact);
        }
        this.getContact(callback);
    }

    /**
     * Shorthand version of {@link #getContact()}
     *
     * @since
     *      1.0.0
     */
    default Contact contact() {
        return this.getContact();
    }

    /**
     * Shorthand version of {@link #getContact(Invokable)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info contact(final Invokable<Contact> callback) {
        this.getContact(callback);
        return this;
    }

    /**
     * Shorthand version of {@link #getContact(Invokable, Contact)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info contact(final Invokable<Contact> callback, final Contact defaultContact) {
        this.getContact(callback, defaultContact);
        return this;
    }

    /**
     * Shorthand version of {@link #setContact(Contact)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info contact(final Contact contact) {
        this.setContact(contact);
        return this;
    }

    /**
     * Obtains the license information for the exposed API.
     *
     * @return
     *      License information
     * @since
     *      1.0.0
     */
    License getLicense();

    /**
     * Defines the license information to use for the exposed API.
     *
     * @param license
     *      License information
     * @since
     *      1.0.0
     */
    void setLicense(final License license);

    /**
     * Invokes the given callback with the license information for the exposed API.
     *
     * @param callback
     *      Callback to invoke with the license information
     * @since
     *      1.0.0
     */
    default void getLicense(final Invokable<License> callback) {
        callback.invoke(this.getLicense());
    }


    /**
     * Invokes the given callback with the license information for the exposed API.
     * If no license information has already been defined then the provided default value is assigned to the instance.
     *
     * @param callback
     *      Callback to invoke with the license information
     * @param defaultLicense
     *      Default license object to use
     * @since
     *      1.0.0
     */
    default void getLicense(final Invokable<License> callback, final License defaultLicense) {
        if (this.getLicense() == null) {
            this.setLicense(defaultLicense);
        }
        this.getLicense(callback);
    }

    /**
     * Shorthand version of {@link #getLicense()}
     *
     * @since
     *      1.0.0
     */
    default License license() {
        return this.getLicense();
    }

    /**
     * Shorthand version of {@link #getLicense(Invokable)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info license(final Invokable<License> callback) {
        this.getLicense(callback);
        return this;
    }

    /**
     * Shorthand version of {@link #getLicense(Invokable, License)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info license(final Invokable<License> callback, final License defaultLicense) {
        this.getLicense(callback, defaultLicense);
        return this;
    }

    /**
     * Shorthand version of {@link #setLicense(License)} that returns itself to allow for method chaining
     *
     * @since
     *      1.0.0
     */
    default Info license(final License license) {
        this.setLicense(license);
        return this;
    }

    @Override
    default JSONObject toJsonObject() {
        Jsonable jsonable;
        JSONObject jsonObject = new JSONObject();

        // add title
        String title = this.getTitle();
        if (title == null || title.trim().isEmpty()) {
            throw new NullPointerException("Title has not been defined");
        }
        jsonObject.putOpt("title", title);

        // add version
        String version = this.getVersion();
        if (version == null || version.trim().isEmpty()) {
            throw new NullPointerException("Version has not been defined");
        }
        jsonObject.putOpt("version", version);

        // add description
        jsonObject.putOpt("description", this.getDescription());

        // add terms of service
        URL url = this.getTermsOfService();
        if (url != null) {
            jsonObject.putOpt("termsOfService", url.toExternalForm());
        }

        // contact
        jsonable = this.getContact();
        if (jsonable != null) {
            jsonObject.putOpt("contact", jsonable.toJsonObject());
        }

        // license
        jsonable = this.getLicense();
        if (jsonable != null) {
            jsonObject.putOpt("license", jsonable.toJsonObject());
        }

        return jsonObject;
    }
}
