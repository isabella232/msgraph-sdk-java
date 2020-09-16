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
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed App Registration Request Builder.
 */
public interface IManagedAppRegistrationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppRegistrationRequest instance
     */
    IManagedAppRegistrationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppRegistrationRequest instance
     */
    IManagedAppRegistrationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IManagedAppPolicyCollectionRequestBuilder appliedPolicies();

    IManagedAppPolicyRequestBuilder appliedPolicies(final String id);

    IManagedAppPolicyCollectionRequestBuilder intendedPolicies();

    IManagedAppPolicyRequestBuilder intendedPolicies(final String id);

    IManagedAppOperationCollectionRequestBuilder operations();

    IManagedAppOperationRequestBuilder operations(final String id);

}