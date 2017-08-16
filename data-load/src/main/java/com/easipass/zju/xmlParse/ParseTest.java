package com.easipass.zju.xmlParse;

import com.easipass.zju.util.FileUtil;
import org.apache.commons.configuration.ConfigurationException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by ssw on 17-8-1.
 */
public class ParseTest {

    public static void main(String[] args){
        try{
            FileUtil.setFilesPath(FileUtil.getSourceFileInfo().getSourcePath());
            HashSet<String> filePaths = FileUtil.getFilesPath();
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            Resolver resolver;
            Class model;
            for(String s : filePaths){
                model = Class.forName("com.easipass.zju.model."+FileUtil.getReportFileType(s));
                if(FileUtil.getReportFileType(s).equals("ShipData")){
                    resolver = ResolverFactory.getResolver(FileUtil.getReportFileType(s));
                    InputStream inputStream = new FileInputStream(new File(s));
                    saxParser.parse(inputStream, resolver);
                    List dataList = resolver.getList();
                    Random random = new Random();
                    Object o = dataList.get(random.nextInt(100));
                    System.out.println(o.toString());
                }
            }
        }catch (ParserConfigurationException pce){
            pce.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
