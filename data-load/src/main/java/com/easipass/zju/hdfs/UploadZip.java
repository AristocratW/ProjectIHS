package com.easipass.zju.hdfs;

import com.easipass.zju.util.HdfsUtil;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by ssw on 17-8-2.
 */
public class UploadZip {
    public static boolean upload(){
        Configuration configuration = new Configuration();
        URI targetURI;
        FileSystem fileSystem ;
        try {
            Path path = new Path(HdfsUtil.getSourcePath()+"/ShipData_20170714.zip");
            targetURI = new URI(HdfsUtil.getTargetPath());
            fileSystem = FileSystem.get(targetURI,configuration);
            fileSystem.copyFromLocalFile(path,new Path(HdfsUtil.getTargetPath()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
    public static void main(String[] args){
        upload();
    }
}
