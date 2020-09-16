// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartFillClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartFillClearRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Fill Clear Request Builder.
 */
public class WorkbookChartFillClearRequestBuilder extends BaseActionRequestBuilder implements IWorkbookChartFillClearRequestBuilder {

    /**
     * The request builder for this WorkbookChartFillClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFillClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartFillClearRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartFillClearRequest instance
     */
    public IWorkbookChartFillClearRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookChartFillClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartFillClearRequest instance
     */
    public IWorkbookChartFillClearRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartFillClearRequest request = new WorkbookChartFillClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
