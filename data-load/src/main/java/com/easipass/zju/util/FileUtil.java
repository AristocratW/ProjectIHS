package com.easipass.zju.util;

import org.apache.commons.configuration.ConfigurationException;

import java.io.File;
import java.util.HashSet;

/**
 * Created by ssw on 17-8-1.
 */
public class FileUtil {
    private static HashSet<String> filesPath = new HashSet<String>();

    public static HashSet<String> getFilesPath() {
        return filesPath;
    }

    public static void setFilesPath(String sourcePath){
        File sourceFile = new File(sourcePath);
        if(sourceFile.exists()){
            File[] files = sourceFile.listFiles();
            for(File f : files){
                if(f.isDirectory()){
                    setFilesPath(f.getPath());
                }else {
                    filesPath.add(f.getPath());
                }
            }
        }
    }
    public static void deleteFilePath(String sourcePath){
        File sourceFile = new File(sourcePath);
        if(sourceFile.exists()){
            File[] files = sourceFile.listFiles();
            for(File f : files){
                if(f.isDirectory()){
                    deleteFilePath(f.getPath());
                }
                filesPath.remove(f.getPath());
            }
        }
    }

    public static String getReportFileType(String path){
        File file = new File(path);
        String abPath = file.getAbsolutePath();
        String type = null;
        if(abPath.contains("CombinedPositionsData")){
            type = "CombinedPositionsData";
        }else if(abPath.contains("ShipData")){
            type = "ShipData";
        }else if(abPath.contains("PortsData")){
            type = "PortsData";
        }else if(abPath.contains("MovementData")){
            type = "MovementData";
        }else if(abPath.contains("tblPortTerminal")){
            type = "tblPortTerminal";
        }else if(abPath.contains("tblPortBerth")){
            type = "tblPortBerth";
        }
        return type;
    }

    public static void deleteDir(String path){
        File file = new File(path);
        if(file.isDirectory()){
            String[] subFiles = file.list();
            for(String f : subFiles){
                deleteDir(f);
            }
            file.delete();
        }else {
            file.delete();
        }
    }

    public static void main(String[] args) throws ConfigurationException {
    }
}
