package com.cetc38.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MessageArea {
    private Integer messageId;

    private Integer messageParent;

    private Integer messageBelong;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date messageDate;

    private String messageEmail;

    private String messageUsername;

    private String messageContent;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageParent() {
        return messageParent;
    }

    public void setMessageParent(Integer messageParent) {
        this.messageParent = messageParent;
    }

    public Integer getMessageBelong() {
        return messageBelong;
    }

    public void setMessageBelong(Integer messageBelong) {
        this.messageBelong = messageBelong;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageEmail() {
        return messageEmail;
    }

    public void setMessageEmail(String messageEmail) {
        this.messageEmail = messageEmail == null ? null : messageEmail.trim();
    }

    public String getMessageUsername() {
        return messageUsername;
    }

    public void setMessageUsername(String messageUsername) {
        this.messageUsername = messageUsername == null ? null : messageUsername.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}