// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MicrosoftStoreForBusinessLicenseType;
import com.microsoft.graph.models.extensions.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Store For Business App.
 */
public class MicrosoftStoreForBusinessApp extends MobileApp implements IJsonBackedObject {


    /**
     * The License Type.
     * The app license type. Possible values are: offline, online.
     */
    @SerializedName(value = "licenseType", alternate = {"LicenseType"})
    @Expose
    public MicrosoftStoreForBusinessLicenseType licenseType;

    /**
     * The Package Identity Name.
     * The app package identifier
     */
    @SerializedName(value = "packageIdentityName", alternate = {"PackageIdentityName"})
    @Expose
    public String packageIdentityName;

    /**
     * The Product Key.
     * The app product key
     */
    @SerializedName(value = "productKey", alternate = {"ProductKey"})
    @Expose
    public String productKey;

    /**
     * The Total License Count.
     * The total number of Microsoft Store for Business licenses.
     */
    @SerializedName(value = "totalLicenseCount", alternate = {"TotalLicenseCount"})
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * The number of Microsoft Store for Business licenses in use.
     */
    @SerializedName(value = "usedLicenseCount", alternate = {"UsedLicenseCount"})
    @Expose
    public Integer usedLicenseCount;


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
