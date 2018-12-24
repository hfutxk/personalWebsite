package com.cetc38.model;

public class BlogDetailsWithBLOBs extends BlogDetails {
    private String blogHtmlContent;

    private String blogMdContent;

    public String getBlogHtmlContent() {
        return blogHtmlContent;
    }

    public void setBlogHtmlContent(String blogHtmlContent) {
        this.blogHtmlContent = blogHtmlContent == null ? null : blogHtmlContent.trim();
    }

    public String getBlogMdContent() {
        return blogMdContent;
    }

    public void setBlogMdContent(String blogMdContent) {
        this.blogMdContent = blogMdContent == null ? null : blogMdContent.trim();
    }
}