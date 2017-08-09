package com.easipass.zju.model;

/**
 * Created by ssw on 17-8-3.
 */
public class HdfsInfo {
    private String sourcePath;
    private String targetPath;
    private String initTime;
    private String cron;

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    @Override
    public String toString() {
        return "HdfsInfo{" +
                "sourcePath='" + sourcePath + '\'' +
                ", targetPath='" + targetPath + '\'' +
                ", initTime='" + initTime + '\'' +
                ", cron='" + cron + '\'' +
                '}';
    }
}
