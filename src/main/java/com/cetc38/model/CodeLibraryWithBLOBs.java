package com.cetc38.model;

public class CodeLibraryWithBLOBs extends CodeLibrary {
    private String codeHtmlContent;

    private String codeMdContent;

    public String getCodeHtmlContent() {
        return codeHtmlContent;
    }

    public void setCodeHtmlContent(String codeHtmlContent) {
        this.codeHtmlContent = codeHtmlContent == null ? null : codeHtmlContent.trim();
    }

    public String getCodeMdContent() {
        return codeMdContent;
    }

    public void setCodeMdContent(String codeMdContent) {
        this.codeMdContent = codeMdContent == null ? null : codeMdContent.trim();
    }
}