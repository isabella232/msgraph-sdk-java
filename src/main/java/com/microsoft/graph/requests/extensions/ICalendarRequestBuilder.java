// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.generated.CalendarRoleType;
import com.microsoft.graph.requests.extensions.ICalendarPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Calendar Request Builder.
 */
public interface ICalendarRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICalendarRequest instance
     */
    ICalendarRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICalendarRequest instance
     */
    ICalendarRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ICalendarPermissionCollectionRequestBuilder calendarPermissions();

    ICalendarPermissionRequestBuilder calendarPermissions(final String id);

    IEventCollectionRequestBuilder calendarView();

    IEventRequestBuilder calendarView(final String id);

    IEventCollectionRequestBuilder events();

    IEventRequestBuilder events(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    ICalendarGetScheduleCollectionRequestBuilder getSchedule(final java.util.List<String> schedules, final DateTimeTimeZone endTime, final DateTimeTimeZone startTime, final Integer availabilityViewInterval);

    ICalendarAllowedCalendarSharingRolesCollectionRequestBuilder allowedCalendarSharingRoles(final String user);

}