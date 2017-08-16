package com.easipass.zju.hdfs;

import com.easipass.zju.util.HdfsUtil;

import java.io.IOException;

/**
 * Created by Wangxuyang on 2017/8/16.
 */
public class HdfsInitiation {
    public static void init(){
        HdfsUtil hdfsUtil = new HdfsUtil();
        try {
            hdfsUtil.mkdir("/IHS_BACKUP/CombinedPositionsData");
            hdfsUtil.mkdir("/IHS_BACKUP/MovementData");
            hdfsUtil.mkdir("/IHS_BACKUP/PortsData");
            hdfsUtil.mkdir("/IHS_BACKUP/ShipData");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        init();
    }
}
