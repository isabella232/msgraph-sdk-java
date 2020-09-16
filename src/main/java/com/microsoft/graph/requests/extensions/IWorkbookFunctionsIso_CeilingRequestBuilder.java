// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIso_CeilingRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Iso_Ceiling Request Builder.
 */
public interface IWorkbookFunctionsIso_CeilingRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIso_CeilingRequest instance
     */
    IWorkbookFunctionsIso_CeilingRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsIso_CeilingRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIso_CeilingRequest instance
     */
    IWorkbookFunctionsIso_CeilingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
