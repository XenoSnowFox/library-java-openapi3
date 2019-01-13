package com.xenosnowfox.openapi3.models;

import com.xenosnowfox.openapi3.models.info.Info;

/**
 * Basic implementation of the {@link Document} interface
 */
public class OpenApiDocument implements Document {
    private Info info;

    @Override
    public Info getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(Info info) {
        this.info = info;
    }
}
