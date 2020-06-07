// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterLoadBalancerProfileOutboundIPs model. */
@Fluent
public final class ManagedClusterLoadBalancerProfileOutboundIPs {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ManagedClusterLoadBalancerProfileOutboundIPs.class);

    /*
     * A list of public IP resources.
     */
    @JsonProperty(value = "publicIPs")
    private List<ResourceReference> publicIPs;

    /**
     * Get the publicIPs property: A list of public IP resources.
     *
     * @return the publicIPs value.
     */
    public List<ResourceReference> publicIPs() {
        return this.publicIPs;
    }

    /**
     * Set the publicIPs property: A list of public IP resources.
     *
     * @param publicIPs the publicIPs value to set.
     * @return the ManagedClusterLoadBalancerProfileOutboundIPs object itself.
     */
    public ManagedClusterLoadBalancerProfileOutboundIPs withPublicIPs(List<ResourceReference> publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicIPs() != null) {
            publicIPs().forEach(e -> e.validate());
        }
    }
}