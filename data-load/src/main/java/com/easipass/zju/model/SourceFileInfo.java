package com.easipass.zju.model;

/**
 * Created by ssw on 17-8-3.
 */
public class SourceFileInfo {
    private String sourcePath;
    private String initTime;
    private String cron;

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
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
        return "SourceFileInfo{" +
                "sourcePath='" + sourcePath + '\'' +
                ", initTime='" + initTime + '\'' +
                ", cron='" + cron + '\'' +
                '}';
    }
}
