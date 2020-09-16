// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerGroup;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Group Request Builder.
 */
public class PlannerGroupRequestBuilder extends BaseRequestBuilder implements IPlannerGroupRequestBuilder {

    /**
     * The request builder for the PlannerGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPlannerGroupRequest instance
     */
    public IPlannerGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerGroupRequest instance
     */
    public IPlannerGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPlannerPlanCollectionRequestBuilder plans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public IPlannerPlanRequestBuilder plans(final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
}
