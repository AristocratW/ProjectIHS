package com.easipass.zju.hdfs;

import com.easipass.zju.util.HdfsUtil;

import java.io.IOException;

/**
 * Created by Wangxuyang on 2017/8/16.
 */
public class HdfsInitiation {
    public static void init(String root){
        HdfsUtil hdfsUtil = new HdfsUtil();
        try {
            hdfsUtil.mkdir(root+"/CombinedPositionsData");
            hdfsUtil.mkdir(root+"/MovementData");
            hdfsUtil.mkdir(root+"/PortsData");
            hdfsUtil.mkdir(root+"/ShipData");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void main(String[] args){
//        init("/IHS_BACKUP");
//    }
}
