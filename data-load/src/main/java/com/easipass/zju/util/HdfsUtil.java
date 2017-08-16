package com.easipass.zju.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.HdfsConfiguration;

import java.io.IOException;
import java.util.List;

/**
 * Created by ssw on 17-8-2.
 */
public class HdfsUtil {
    private static Configuration configuration;

    public static Configuration getConfiguration() {
        return configuration;
    }

    static {
        configuration = new HdfsConfiguration();
        configuration.addResource("conf/core-site.xml");
        configuration.addResource("conf/hdfs-site.xml");
        configuration.addResource("conf/mapred-site.xml");
    }


    public void mkdir(String dir) throws IOException {
        Path path = new Path(dir);
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        if(!fileSystem.exists(path)){
            fileSystem.mkdirs(path);
            System.out.println("Create: " + dir);
        }
        fileSystem.close();
    }

    public void rmdir(String dir) throws IOException {
        Path path = new Path(dir);
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        fileSystem.deleteOnExit(path);
        System.out.println("Delete: " + dir);
        fileSystem.close();
    }

    public void renamedir(String srcdir, String dstdir) throws IOException {
        Path src = new Path(srcdir);
        Path dst = new Path(dstdir);
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        fileSystem.rename(src,dst);
        System.out.println("Rename: from "+ srcdir+" to "+ dstdir);
        fileSystem.close();
    }

    public void ls(String dir) throws IOException {
        Path path = new Path(dir);
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        FileStatus[] list = fileSystem.listStatus(path);
        System.out.println("List: " + dir);
        System.out.println("=============================================================");
        for(FileStatus fs : list){
            System.out.println("name: "+fs.getPath()+" folder: "+fs.isDirectory()+" size: "+fs.getLen());
        }
        System.out.println("=============================================================");
        fileSystem.close();
    }

    public void upload(String dir, String dst) throws IOException {
        Path source = new Path(dir);
        Path target = new Path(dst);
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        fileSystem.copyFromLocalFile(source,target);
        fileSystem.close();
    }

    public void upload(List<String> dirs, String dst) throws IOException {
        FileSystem fileSystem = FileSystem.get(getConfiguration());
        Path target = new Path(dst);
        Path source;
        for (String s:dirs){
            source = new Path(s);
            fileSystem.copyFromLocalFile(source,target);
        }
        fileSystem.close();
    }

        public static void main(String[] args) throws IOException {
            HdfsUtil hdfsUtil = new HdfsUtil();
            hdfsUtil.ls("/IHS_BACKUP/CombinedPositionsData");
    }
}
