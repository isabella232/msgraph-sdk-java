
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Reference Request Builder.
 */
public class ManagedAppRegistrationReferenceRequestBuilder extends BaseRequestBuilder implements IManagedAppRegistrationReferenceRequestBuilder {

    /**
     * The request builder for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The IManagedAppRegistrationReferenceRequest instance
     */
    public IManagedAppRegistrationReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppRegistrationReferenceRequest instance
     */
    public IManagedAppRegistrationReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedAppRegistrationReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
