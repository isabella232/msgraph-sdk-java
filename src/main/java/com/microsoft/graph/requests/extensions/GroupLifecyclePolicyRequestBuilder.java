// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Request Builder.
 */
public class GroupLifecyclePolicyRequestBuilder extends BaseRequestBuilder implements IGroupLifecyclePolicyRequestBuilder {

    /**
     * The request builder for the GroupLifecyclePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupLifecyclePolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupLifecyclePolicyRequest instance
     */
    public IGroupLifecyclePolicyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupLifecyclePolicyRequest instance
     */
    public IGroupLifecyclePolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IGroupLifecyclePolicyAddGroupRequestBuilder addGroup(final String groupId) {
        return new GroupLifecyclePolicyAddGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addGroup"), getClient(), null, groupId);
    }

    public IGroupLifecyclePolicyRemoveGroupRequestBuilder removeGroup(final String groupId) {
        return new GroupLifecyclePolicyRemoveGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeGroup"), getClient(), null, groupId);
    }
}
