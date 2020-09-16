// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDays360Request;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Days360Request Builder.
 */
public interface IWorkbookFunctionsDays360RequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDays360Request
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDays360Request instance
     */
    IWorkbookFunctionsDays360Request buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsDays360Request with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDays360Request instance
     */
    IWorkbookFunctionsDays360Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
