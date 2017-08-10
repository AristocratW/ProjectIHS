package com.easipass.zju.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

/**
 * Created by Wangxuyang on 2017/8/9.
 */

public class HBaseUtil {
    public static Configuration configuration;
    static {
        configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.property.clientPort", "2181");
        configuration.set("hbase.zookeeper.quorum", "192.168.130.141,192.168.130.142,192.168.130.143");
        configuration.set("hbase.master", "192.168.130.141:16000");
        configuration.setInt("hbase.client.operation.timeout", 60000);
        configuration.setInt("hbase.client.retries.number", 10);
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
