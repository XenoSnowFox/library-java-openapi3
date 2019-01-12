package com.xenosnowfox.openapi3.models.util;

/**
 * Defines a class that can be invoked with a given class instance
 *
 * @param <T>
 *      Object being passed into the invoked class
 */
public interface Invokable<T> {
    /**
     * Invoke a class with the given object
     *
     * @param arg
     *      object being passed into the invoked class
     */
    void invoke(final T arg);
}
