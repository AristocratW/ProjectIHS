package com.easipass.zju.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Wangxuyang on 2017/8/16.
 */
public final class ConfInfoUtil {
    private static Properties properties;
    static {
        properties = new Properties();
        try {
            InputStream in =  Object.class.getResourceAsStream("/conf/configuration.properties");
            properties.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Properties doesn't exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        String property;
        try {
            property = properties.getProperty(key);
        } catch (Exception e) {
            return null;
        }
        return property;
    }
    public static void main(String[] args){
        System.out.println(ConfInfoUtil.getProperty("hdfs.root"));
    }
}