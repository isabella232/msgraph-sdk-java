// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeFont;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Font Request.
 */
public interface IWorkbookRangeFontRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRangeFont from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookRangeFont> callback);

    /**
     * Gets the WorkbookRangeFont from the service
     *
     * @return the WorkbookRangeFont from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeFont get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookRangeFont> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRangeFont with a source
     *
     * @param sourceWorkbookRangeFont the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookRangeFont sourceWorkbookRangeFont, final ICallback<? super WorkbookRangeFont> callback);

    /**
     * Patches this WorkbookRangeFont with a source
     *
     * @param sourceWorkbookRangeFont the source object with updates
     * @return the updated WorkbookRangeFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeFont patch(final WorkbookRangeFont sourceWorkbookRangeFont) throws ClientException;

    /**
     * Posts a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookRangeFont newWorkbookRangeFont, final ICallback<? super WorkbookRangeFont> callback);

    /**
     * Posts a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the new object to create
     * @return the created WorkbookRangeFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeFont post(final WorkbookRangeFont newWorkbookRangeFont) throws ClientException;

    /**
     * Posts a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookRangeFont newWorkbookRangeFont, final ICallback<? super WorkbookRangeFont> callback);

    /**
     * Posts a WorkbookRangeFont with a new object
     *
     * @param newWorkbookRangeFont the object to create/update
     * @return the created WorkbookRangeFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeFont put(final WorkbookRangeFont newWorkbookRangeFont) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRangeFontRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRangeFontRequest expand(final String value);

}
