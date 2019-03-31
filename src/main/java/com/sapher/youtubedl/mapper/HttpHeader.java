package com.sapher.youtubedl.mapper;

import com.google.gson.annotations.SerializedName;

public class HttpHeader {

    @SerializedName("Accept-Charset")
    public String acceptCharset;
    @SerializedName("Accept-Language")
    public String acceptLanguage;
    @SerializedName("Accept-Encoding")
    public String acceptEncoding;
    @SerializedName("Accept")
    public String accept;
    @SerializedName("User-Agent")
    public String userAgent;
}