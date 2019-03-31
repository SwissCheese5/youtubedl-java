package com.sapher.youtubedl.mapper;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VideoInfo {

    public String id;
    public String fulltitle;
    public String title;
    @SerializedName("upload_date")
    public String uploadDate;
    @SerializedName("display_id")
    public String displayId;
    public int duration;
    public String description;
    public String thumbnail;
    public String license;

    @SerializedName("uploader_id")
    public String uploaderId;
    public String uploader;

    @SerializedName("player_url")
    public String playerUrl;
    @SerializedName("webpage_url")
    public String webpageUrl;
    @SerializedName("webpage_url_basename")
    public String webpageUrlBasename;

    public String resolution;
    public int width;
    public int height;
    public String format;
    public String ext;

    @SerializedName("http_headers")
    public HttpHeader httpHeader;
    public ArrayList<String> categories;
    public ArrayList<String> tags;
    public ArrayList<VideoFormat> formats;
    public ArrayList<VideoThumbnail> thumbnails;
    //public ArrayList<VideoSubtitle> subtitles;
}
