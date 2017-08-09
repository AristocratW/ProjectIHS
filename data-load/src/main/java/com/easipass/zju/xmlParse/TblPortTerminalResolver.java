package com.easipass.zju.xmlParse;

import com.easipass.zju.model.tblPortTerminal;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public class TblPortTerminalResolver extends Resolver{
    private List<com.easipass.zju.model.tblPortTerminal> list;
    private com.easipass.zju.model.tblPortTerminal tbl;
    private String tagName;

    @Override
    public List<com.easipass.zju.model.tblPortTerminal> getList() {
        return list;
    }

    public void setList(List<com.easipass.zju.model.tblPortTerminal> list) {
        this.list = list;
    }

    public com.easipass.zju.model.tblPortTerminal getTblPortTerminal() {
        return tbl;
    }

    public void setTblPortTerminal(com.easipass.zju.model.tblPortTerminal tblPortTerminal) {
        this.tbl = tblPortTerminal;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<com.easipass.zju.model.tblPortTerminal>();
    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("tblPortTerminal")){
            tbl = new tblPortTerminal();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("tblPortTerminal")){
            this.list.add(this.tbl);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(tbl!= null){
            String data = new String(ch,start,length);
            if("Terminal_ID".equals(tagName)){
                tbl.setTerminal_ID(data);
            }
            if("Port_ID".equals(tagName)){
                tbl.setPort_ID(data);
            }
            if("Legacy_Terminal_ID".equals(tagName)){
                tbl.setLegacy_Terminal_ID(data);
            }
            if("Terminal_Name".equals(tagName)){
                tbl.setTerminal_Name(data);
            }
            if("Terminal_Operator".equals(tagName)){
                tbl.setTerminal_Operator(data);
            }
            if("Facility_Type".equals(tagName)){
                tbl.setFacility_Type(data);
            }
            if("Latitude_Degrees".equals(tagName)){
                tbl.setLatitude_Degrees(data);
            }
            if("Latitude_Minutes".equals(tagName)){
                tbl.setLatitude_Minutes(data);
            }
            if("Latitude_Indicator".equals(tagName)){
                tbl.setLatitude_Indicator(data);
            }
            if("Longitude_Degrees".equals(tagName)){
                tbl.setLongitude_Degrees(data);
            }
            if("Longitude_Minutes".equals(tagName)){
                tbl.setLongitude_Minutes(data);
            }
            if("Longitude_Indicator".equals(tagName)){
                tbl.setLongitude_Indicator(data);
            }
            if("Dec_Latitude".equals(tagName)){
                tbl.setDec_Latitude(data);
            }
            if("Dec_Longitude".equals(tagName)){
                tbl.setDec_Longitude(data);
            }
            if("GlobalPortID".equals(tagName)){
                tbl.setGlobalPortID(data);
            }
            if("GlobalTerminalID".equals(tagName)){
                tbl.setGlobalTerminalID(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }
}
