package com.cetc38.model;

import java.util.Date;

public class ImageUpload {
    private Integer imageId;

    private String imageName;

    private String imageUrl;

    private Date imageUploadDate;

    private Integer imageType;

    private Integer imageDownloadCount;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getImageUploadDate() {
        return imageUploadDate;
    }

    public void setImageUploadDate(Date imageUploadDate) {
        this.imageUploadDate = imageUploadDate;
    }

    public Integer getImageType() {
        return imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    public Integer getImageDownloadCount() {
        return imageDownloadCount;
    }

    public void setImageDownloadCount(Integer imageDownloadCount) {
        this.imageDownloadCount = imageDownloadCount;
    }
}