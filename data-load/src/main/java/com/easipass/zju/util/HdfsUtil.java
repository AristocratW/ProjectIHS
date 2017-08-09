package com.easipass.zju.util;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

/**
 * Created by ssw on 17-8-2.
 */
public class HdfsUtil {
    public static String getTargetPath() throws ConfigurationException {
        Configuration configuration = new XMLConfiguration("conf/hdfs_configuration.xml");
        String targetPath = configuration.getString("configuration.targetPath");
        return targetPath;
    }

    public static String getSourcePath() throws ConfigurationException {
        Configuration configuration = new XMLConfiguration("conf/hdfs_configuration.xml");
        String sourcePath = configuration.getString("configuration.sourcePath");
        return sourcePath;
    }

    public static void main(String[] args) throws ConfigurationException {
        System.out.println(getTargetPath());
    }
}
