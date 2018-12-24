package com.cetc38.model;

import java.util.Date;

public class CodeLibrary {
    private Integer codeId;

    private String codeTitle;

    private String codeAuthor;

    private Date codeDate;

    private Integer codeRead;

    private String codeSummary;

    private String codeLabel;

    private Integer codeDelete;

    private Integer codeCategory;

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle == null ? null : codeTitle.trim();
    }

    public String getCodeAuthor() {
        return codeAuthor;
    }

    public void setCodeAuthor(String codeAuthor) {
        this.codeAuthor = codeAuthor == null ? null : codeAuthor.trim();
    }

    public Date getCodeDate() {
        return codeDate;
    }

    public void setCodeDate(Date codeDate) {
        this.codeDate = codeDate;
    }

    public Integer getCodeRead() {
        return codeRead;
    }

    public void setCodeRead(Integer codeRead) {
        this.codeRead = codeRead;
    }

    public String getCodeSummary() {
        return codeSummary;
    }

    public void setCodeSummary(String codeSummary) {
        this.codeSummary = codeSummary == null ? null : codeSummary.trim();
    }

    public String getCodeLabel() {
        return codeLabel;
    }

    public void setCodeLabel(String codeLabel) {
        this.codeLabel = codeLabel == null ? null : codeLabel.trim();
    }

    public Integer getCodeDelete() {
        return codeDelete;
    }

    public void setCodeDelete(Integer codeDelete) {
        this.codeDelete = codeDelete;
    }

    public Integer getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(Integer codeCategory) {
        this.codeCategory = codeCategory;
    }
}