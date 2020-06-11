// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.inner.IncidentInner;
import com.azure.resourcemanager.monitor.fluent.inner.IncidentListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AlertRuleIncidents. */
public final class AlertRuleIncidentsClient {
    private final ClientLogger logger = new ClientLogger(AlertRuleIncidentsClient.class);

    /** The proxy service used to perform REST calls. */
    private final AlertRuleIncidentsService service;

    /** The service client containing this operation class. */
    private final MonitorClient client;

    /**
     * Initializes an instance of AlertRuleIncidentsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public AlertRuleIncidentsClient(MonitorClient client) {
        this.service =
            RestProxy.create(AlertRuleIncidentsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientAlertRuleIncidents to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientAlertRu")
    private interface AlertRuleIncidentsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/alertrules"
                + "/{ruleName}/incidents/{incidentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IncidentInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @PathParam("incidentName") String incidentName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.insights/alertrules"
                + "/{ruleName}/incidents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IncidentListResultInner>> listByAlertRule(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IncidentInner>> getWithResponseAsync(
        String resourceGroupName, String ruleName, String incidentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (incidentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter incidentName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2016-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            ruleName,
                            incidentName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IncidentInner>> getWithResponseAsync(
        String resourceGroupName, String ruleName, String incidentName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (incidentName == null) {
            return Mono.error(new IllegalArgumentException("Parameter incidentName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2016-03-01";
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                ruleName,
                incidentName,
                apiVersion,
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IncidentInner> getAsync(String resourceGroupName, String ruleName, String incidentName) {
        return getWithResponseAsync(resourceGroupName, ruleName, incidentName)
            .flatMap(
                (Response<IncidentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IncidentInner> getAsync(
        String resourceGroupName, String ruleName, String incidentName, Context context) {
        return getWithResponseAsync(resourceGroupName, ruleName, incidentName, context)
            .flatMap(
                (Response<IncidentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IncidentInner get(String resourceGroupName, String ruleName, String incidentName) {
        return getAsync(resourceGroupName, ruleName, incidentName).block();
    }

    /**
     * Gets an incident associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param incidentName The name of the incident to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an incident associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IncidentInner get(String resourceGroupName, String ruleName, String incidentName, Context context) {
        return getAsync(resourceGroupName, ruleName, incidentName, context).block();
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IncidentInner>> listByAlertRuleSinglePageAsync(
        String resourceGroupName, String ruleName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2016-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByAlertRule(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            ruleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<IncidentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IncidentInner>> listByAlertRuleSinglePageAsync(
        String resourceGroupName, String ruleName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2016-03-01";
        return service
            .listByAlertRule(
                this.client.getEndpoint(),
                resourceGroupName,
                ruleName,
                apiVersion,
                this.client.getSubscriptionId(),
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IncidentInner> listByAlertRuleAsync(String resourceGroupName, String ruleName) {
        return new PagedFlux<>(() -> listByAlertRuleSinglePageAsync(resourceGroupName, ruleName));
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IncidentInner> listByAlertRuleAsync(String resourceGroupName, String ruleName, Context context) {
        return new PagedFlux<>(() -> listByAlertRuleSinglePageAsync(resourceGroupName, ruleName, context));
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IncidentInner> listByAlertRule(String resourceGroupName, String ruleName) {
        return new PagedIterable<>(listByAlertRuleAsync(resourceGroupName, ruleName));
    }

    /**
     * Gets a list of incidents associated to an alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of incidents associated to an alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IncidentInner> listByAlertRule(String resourceGroupName, String ruleName, Context context) {
        return new PagedIterable<>(listByAlertRuleAsync(resourceGroupName, ruleName, context));
    }
}