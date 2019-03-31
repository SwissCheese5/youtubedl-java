package com.sapher.youtubedl.mapper;

import com.google.gson.annotations.SerializedName;

public class VideoFormat {

    public double asr;
    public double tbr;
    public double abr;
    public String format;
    @SerializedName("format_id")
    public String formatId;
    @SerializedName("format_note")
    public String formatNote;
    public String ext;
    public int preference;
    public String vcodec;
    public String acodec;
    public int width;
    public int height;
    public long filesize;
    public int fps;
    public String url;
}
