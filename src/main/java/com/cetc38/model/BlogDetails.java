package com.cetc38.model;

import java.util.Date;

public class BlogDetails {
    private Integer blogId;

    private String blogTitle;

    private String blogAuthor;

    private Date blogDate;

    private Integer blogRead;

    private String blogSummary;

    private String blogLabel;

    private Integer blogDelete;

    private Integer blogCategory;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor == null ? null : blogAuthor.trim();
    }

    public Date getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }

    public Integer getBlogRead() {
        return blogRead;
    }

    public void setBlogRead(Integer blogRead) {
        this.blogRead = blogRead;
    }

    public String getBlogSummary() {
        return blogSummary;
    }

    public void setBlogSummary(String blogSummary) {
        this.blogSummary = blogSummary == null ? null : blogSummary.trim();
    }

    public String getBlogLabel() {
        return blogLabel;
    }

    public void setBlogLabel(String blogLabel) {
        this.blogLabel = blogLabel == null ? null : blogLabel.trim();
    }

    public Integer getBlogDelete() {
        return blogDelete;
    }

    public void setBlogDelete(Integer blogDelete) {
        this.blogDelete = blogDelete;
    }

    public Integer getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(Integer blogCategory) {
        this.blogCategory = blogCategory;
    }
}