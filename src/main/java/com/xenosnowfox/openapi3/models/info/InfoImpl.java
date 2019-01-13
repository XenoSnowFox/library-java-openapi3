package com.xenosnowfox.openapi3.models.info;

import java.net.URL;

/**
 * Basic implementation of the {@link Info} interface
 *
 * @since
 *      1.0.0
 */
public class InfoImpl implements Info {

    private String title;
    private String version;
    private String description = null;
    private URL termsOfService = null;
    private Contact contact = null;
    private License license = null;

    /**
     * Instantiates a new instance with the given title and version number
     *
     * @param title
     *      Application title
     * @param version
     *      Document version number
     */
    public InfoImpl(final String title, final String version) {
        this.setTitle(title);
        this.setVersion(version);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new NullPointerException("Title cannot be null or blank");
        }
        this.title = title;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public void setVersion(String version) {
        if (version == null || version.isBlank()) {
            throw new NullPointerException("Version cannot be null or blank");
        }
        this.version = version;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public URL getTermsOfService() {
        return this.termsOfService;
    }

    @Override
    public void setTermsOfService(URL url) {
        this.termsOfService = url;
    }

    @Override
    public Contact getContact() {
        return this.contact;
    }

    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public License getLicense() {
        return this.license;
    }

    @Override
    public void setLicense(License license) {
        this.license = license;
    }
}
