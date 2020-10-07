// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Record.
 */
public class DomainDnsRecord extends Entity implements IJsonBackedObject {


    /**
     * The Is Optional.
     * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     */
    @SerializedName(value = "isOptional", alternate = {"IsOptional"})
    @Expose
    public Boolean isOptional;

    /**
     * The Label.
     * Value used when configuring the name of the DNS record at the DNS host.
     */
    @SerializedName(value = "label", alternate = {"Label"})
    @Expose
    public String label;

    /**
     * The Record Type.
     * Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, TxtKey
     */
    @SerializedName(value = "recordType", alternate = {"RecordType"})
    @Expose
    public String recordType;

    /**
     * The Supported Service.
     * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune
     */
    @SerializedName(value = "supportedService", alternate = {"SupportedService"})
    @Expose
    public String supportedService;

    /**
     * The Ttl.
     * Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable
     */
    @SerializedName(value = "ttl", alternate = {"Ttl"})
    @Expose
    public Integer ttl;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
