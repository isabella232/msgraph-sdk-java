// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupAssignLicenseRequest;
import com.microsoft.graph.requests.extensions.GroupAssignLicenseRequest;
import com.microsoft.graph.models.extensions.AssignedLicense;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Assign License Request Builder.
 */
public class GroupAssignLicenseRequestBuilder extends BaseActionRequestBuilder implements IGroupAssignLicenseRequestBuilder {

    /**
     * The request builder for this GroupAssignLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param addLicenses the addLicenses
     * @param removeLicenses the removeLicenses
     */
    public GroupAssignLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("addLicenses", addLicenses);
        bodyParams.put("removeLicenses", removeLicenses);
    }

    /**
     * Creates the IGroupAssignLicenseRequest
     *
     * @return the IGroupAssignLicenseRequest instance
     */
    public IGroupAssignLicenseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupAssignLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupAssignLicenseRequest instance
     */
    public IGroupAssignLicenseRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        GroupAssignLicenseRequest request = new GroupAssignLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("addLicenses")) {
            request.body.addLicenses = getParameter("addLicenses");
        }

        if (hasParameter("removeLicenses")) {
            request.body.removeLicenses = getParameter("removeLicenses");
        }

        return request;
    }
}