package com.xenosnowfox.openapi3.models.info;

import java.net.URL;

/**
 * Basic implementation of the {@link Contact} interface
 *
 * @since
 *      1.0.0
 */
public class ContactImpl implements Contact {

    private String name;
    private String email;
    private URL url;

    /**
     * Instantiate a blank contact object
     *
     * @since
     *      1.0.0
     */
    public ContactImpl() {
        this(null, null, null);
    }

    /**
     * Instantiates a contact object with only a contact name
     *
     * @param name
     *      Contact's name
     * @since
     *      1.0.0
     */
    public ContactImpl(final String name) {
        this(name, null, null);
    }

    /**
     * Instantiates a contact object with a contact name and email address
     *
     * @param name
     *      Contact's name
     * @param email
     *      Email address
     * @since
     *      1.0.0
     */
    public ContactImpl(final String name, final String email) {
        this(name, email, null);
    }

    /**
     * Instantiates a contact object with a contact name and url
     *
     * @param name
     *      Contact's name
     * @param url
     *      URL directing to contact information
     * @since
     *      1.0.0
     */
    public ContactImpl(final String name, final URL url) {
        this(name, null, url);
    }

    /**
     * Instantiates a contact object with contact name, email address and url
     *
     * @param name
     *      Contact's name
     * @param email
     *      Email address
     * @param url
     *      URL directing to contact information
     * @since
     *      1.0.0
     */
    public ContactImpl(final String name, final String email, final URL url) {
        this.setName(name);
        this.setEmail(email);
        this.setUrl(url);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public URL getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
