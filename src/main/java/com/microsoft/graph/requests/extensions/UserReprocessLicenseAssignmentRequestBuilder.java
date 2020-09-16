// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserReprocessLicenseAssignmentRequest;
import com.microsoft.graph.requests.extensions.UserReprocessLicenseAssignmentRequest;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Reprocess License Assignment Request Builder.
 */
public class UserReprocessLicenseAssignmentRequestBuilder extends BaseActionRequestBuilder implements IUserReprocessLicenseAssignmentRequestBuilder {

    /**
     * The request builder for this UserReprocessLicenseAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserReprocessLicenseAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IUserReprocessLicenseAssignmentRequest
     *
     * @param requestOptions the options for the request
     * @return the IUserReprocessLicenseAssignmentRequest instance
     */
    public IUserReprocessLicenseAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IUserReprocessLicenseAssignmentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserReprocessLicenseAssignmentRequest instance
     */
    public IUserReprocessLicenseAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserReprocessLicenseAssignmentRequest request = new UserReprocessLicenseAssignmentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
