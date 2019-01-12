package com.xenosnowfox.openapi3.models.info;

import java.net.URL;

/**
 * Basic implementation of the {@link License} interface
 *
 * @since
 *      1.0.0
 */
public class LicenseImpl implements License {

    private String name;
    private URL url;

    /**
     * Instantiates a License object with the given license name
     *
     * @param name
     *      Name of the license
     * @since
     *      1.0.0
     */
    public LicenseImpl(final String name) {
        this(name, null);
    }

    /**
     * Instantiates a License object with the given license name and url
     *
     * @param name
     *      Name of the license
     * @param url
     *      URL to the license
     * @since
     *      1.0.0
     */
    public LicenseImpl(final String name, final URL url) {
        this.setName(name);
        this.setUrl(url);
    }

    @Override
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new NullPointerException("Name cannot be null or blank");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public URL getUrl() {
        return this.url;
    }
}
