// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TenantCategory. */
public enum TenantCategory {
    /** Enum value Home. */
    HOME("Home"),

    /** Enum value ProjectedBy. */
    PROJECTED_BY("ProjectedBy"),

    /** Enum value ManagedBy. */
    MANAGED_BY("ManagedBy");

    /** The actual serialized value for a TenantCategory instance. */
    private final String value;

    TenantCategory(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TenantCategory instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TenantCategory object, or null if unable to parse.
     */
    @JsonCreator
    public static TenantCategory fromString(String value) {
        TenantCategory[] items = TenantCategory.values();
        for (TenantCategory item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}