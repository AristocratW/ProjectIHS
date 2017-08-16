package com.easipass.zju.hdfs;

import com.easipass.zju.util.HdfsUtil;

import java.io.IOException;
import java.util.List;

/**
 * Created by ssw on 17-8-2.
 */
public class UploadZip {
    private List<String> dirs;
    private String dirType;
    public UploadZip(List<String> dirs, String dirType){
        this.dirs = dirs;
        this.dirType = dirType;
    }
    public void upload(String hdfsRoot){
        HdfsUtil hdfsUtil = new HdfsUtil();
        String target = hdfsRoot + "/" + dirType;
        try {
            hdfsUtil.upload(dirs,dirType);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Uploading error");
        }
    }
    public static void main(String[] args){
    }
}
