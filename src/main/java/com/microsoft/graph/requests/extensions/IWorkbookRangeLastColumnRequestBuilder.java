// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastColumnRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Last Column Request Builder.
 */
public interface IWorkbookRangeLastColumnRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeLastColumnRequest
     *
     * @return the IWorkbookRangeLastColumnRequest instance
     */
    IWorkbookRangeLastColumnRequest buildRequest();

    /**
     * Creates the IWorkbookRangeLastColumnRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeLastColumnRequest instance
     */
    IWorkbookRangeLastColumnRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    IWorkbookRangeFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    IWorkbookRangeSortRequestBuilder sort();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
}
