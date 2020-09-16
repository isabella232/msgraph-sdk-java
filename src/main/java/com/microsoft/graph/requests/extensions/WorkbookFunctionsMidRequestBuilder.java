// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsMidRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMidRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Mid Request Builder.
 */
public class WorkbookFunctionsMidRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsMidRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMid
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param startNum the startNum
     * @param numChars the numChars
     */
    public WorkbookFunctionsMidRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsMidRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMidRequest instance
     */
    public IWorkbookFunctionsMidRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsMidRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMidRequest instance
     */
    public IWorkbookFunctionsMidRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsMidRequest request = new WorkbookFunctionsMidRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        return request;
    }
}
