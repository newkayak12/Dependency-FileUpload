package org.newkayak.FileUpload;

public class FileResult {
    private String originalFileName;
    private String storedFileName;
    private String contentType;
    private Long fileSize;

    public FileResult(String originalFileName, String storedFileName, String contentType, Long fileSize) {
        this.originalFileName = originalFileName;
        this.storedFileName = storedFileName;
        this.contentType = contentType;
        this.fileSize = fileSize;
    }

    public FileResult() {
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public String getStoredFileName() {
        return storedFileName;
    }

    public String getContentType() {
        return contentType;
    }

    public Long getFileSize() {
        return fileSize;
    }
}
