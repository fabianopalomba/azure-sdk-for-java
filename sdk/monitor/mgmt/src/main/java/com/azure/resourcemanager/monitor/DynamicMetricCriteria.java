// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The DynamicMetricCriteria model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "criterionType")
@JsonTypeName("DynamicThresholdCriterion")
@Fluent
public final class DynamicMetricCriteria extends MultiMetricCriteria {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DynamicMetricCriteria.class);

    /*
     * The operator used to compare the metric value against the threshold.
     */
    @JsonProperty(value = "operator", required = true)
    private DynamicThresholdOperator operator;

    /*
     * The extent of deviation required to trigger an alert. This will affect
     * how tight the threshold is to the metric series pattern.
     */
    @JsonProperty(value = "alertSensitivity", required = true)
    private DynamicThresholdSensitivity alertSensitivity;

    /*
     * The minimum number of violations required within the selected lookback
     * time window required to raise an alert.
     */
    @JsonProperty(value = "failingPeriods", required = true)
    private DynamicThresholdFailingPeriods failingPeriods;

    /*
     * Use this option to set the date from which to start learning the metric
     * historical data and calculate the dynamic thresholds (in ISO8601 format)
     */
    @JsonProperty(value = "ignoreDataBefore")
    private OffsetDateTime ignoreDataBefore;

    /**
     * Get the operator property: The operator used to compare the metric value against the threshold.
     *
     * @return the operator value.
     */
    public DynamicThresholdOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator used to compare the metric value against the threshold.
     *
     * @param operator the operator value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withOperator(DynamicThresholdOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the alertSensitivity property: The extent of deviation required to trigger an alert. This will affect how
     * tight the threshold is to the metric series pattern.
     *
     * @return the alertSensitivity value.
     */
    public DynamicThresholdSensitivity alertSensitivity() {
        return this.alertSensitivity;
    }

    /**
     * Set the alertSensitivity property: The extent of deviation required to trigger an alert. This will affect how
     * tight the threshold is to the metric series pattern.
     *
     * @param alertSensitivity the alertSensitivity value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withAlertSensitivity(DynamicThresholdSensitivity alertSensitivity) {
        this.alertSensitivity = alertSensitivity;
        return this;
    }

    /**
     * Get the failingPeriods property: The minimum number of violations required within the selected lookback time
     * window required to raise an alert.
     *
     * @return the failingPeriods value.
     */
    public DynamicThresholdFailingPeriods failingPeriods() {
        return this.failingPeriods;
    }

    /**
     * Set the failingPeriods property: The minimum number of violations required within the selected lookback time
     * window required to raise an alert.
     *
     * @param failingPeriods the failingPeriods value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withFailingPeriods(DynamicThresholdFailingPeriods failingPeriods) {
        this.failingPeriods = failingPeriods;
        return this;
    }

    /**
     * Get the ignoreDataBefore property: Use this option to set the date from which to start learning the metric
     * historical data and calculate the dynamic thresholds (in ISO8601 format).
     *
     * @return the ignoreDataBefore value.
     */
    public OffsetDateTime ignoreDataBefore() {
        return this.ignoreDataBefore;
    }

    /**
     * Set the ignoreDataBefore property: Use this option to set the date from which to start learning the metric
     * historical data and calculate the dynamic thresholds (in ISO8601 format).
     *
     * @param ignoreDataBefore the ignoreDataBefore value to set.
     * @return the DynamicMetricCriteria object itself.
     */
    public DynamicMetricCriteria withIgnoreDataBefore(OffsetDateTime ignoreDataBefore) {
        this.ignoreDataBefore = ignoreDataBefore;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property operator in model DynamicMetricCriteria"));
        }
        if (alertSensitivity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property alertSensitivity in model DynamicMetricCriteria"));
        }
        if (failingPeriods() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property failingPeriods in model DynamicMetricCriteria"));
        } else {
            failingPeriods().validate();
        }
    }
}