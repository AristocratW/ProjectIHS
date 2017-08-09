package com.easipass.zju.xmlParse;

import com.easipass.zju.model.PortsData;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public class PortsDataResolver extends Resolver{
    private List<PortsData> list;
    private PortsData portsData;
    private String tagName;

    @Override
    public List<PortsData> getList() {
        return list;
    }

    public void setList(List<PortsData> list) {
        this.list = list;
    }

    public PortsData getPortsData() {
        return portsData;
    }

    public void setPortsData(PortsData portsData) {
        this.portsData = portsData;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<PortsData>();
    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("PortsData")){
            portsData = new PortsData();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("PortsData")){
            this.list.add(this.portsData);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(portsData != null){
            String data = new String(ch,start,length);
            if("PortID".equals(tagName)){
                portsData.setPortID(data);
            }
            if("WorldPortNumber".equals(tagName)){
                portsData.setWorldPortNumber(data);
            }
            if("PortName".equals(tagName)){
                portsData.setPortName(data);
            }
            if("FullPortStyle".equals(tagName)){
                portsData.setFullPortStyle(data);
            }
            if("GlobalPortID".equals(tagName)){
                portsData.setGlobalPortID(data);
            }
            if("WSPort".equals(tagName)){
                portsData.setWSPort(data);
            }
            if("UNLOCODE".equals(tagName)){
                portsData.setUNLOCODE(data);
            }
            if("AlternativeName".equals(tagName)){
                portsData.setAlternativeName(data);
            }
            if("Country".equals(tagName)){
                portsData.setCountry(data);
            }
            if("CountryCode".equals(tagName)){
                portsData.setCountryCode(data);
            }
            if("CountryCodeLRF".equals(tagName)){
                portsData.setCountryCodeLRF(data);
            }
            if("LatitudeDecimal".equals(tagName)){
                portsData.setLatitudeDecimal(data);
            }
            if("LatitudeDegrees".equals(tagName)){
                portsData.setLatitudeDegrees(data);
            }
            if("LatitudeIndicator".equals(tagName)){
                portsData.setLatitudeIndicator(data);
            }
            if("LatitudeMinutes".equals(tagName)){
                portsData.setLatitudeMinutes(data);
            }
            if("LongitudeDecimal".equals(tagName)){
                portsData.setLongitudeDecimal(data);
            }
            if("LongitudeDegrees".equals(tagName)){
                portsData.setLongitudeDegrees(data);
            }
            if("LongitudeIndicator".equals(tagName)){
                portsData.setLongitudeIndicator(data);
            }
            if("LongitudeMinutes".equals(tagName)){
                portsData.setLongitudeMinutes(data);
            }
            if("MasterPOID".equals(tagName)){
                portsData.setMasterPOID(data);
            }
            if("MaxBeam".equals(tagName)){
                portsData.setMaxBeam(data);
            }
            if("MaxDWT".equals(tagName)){
                portsData.setMaxDWT(data);
            }
            if("MaxLOA".equals(tagName)){
                portsData.setMaxLOA(data);
            }
            if("MaxOffshoreBCM".equals(tagName)){
                portsData.setMaxOffshoreBCM(data);
            }
            if("MaxOffshoreDraught".equals(tagName)){
                portsData.setMaxOffshoreDraught(data);
            }
            if("MaxOffshoreDWT".equals(tagName)){
                portsData.setMaxOffshoreDWT(data);
            }
            if("MaxOffshoreLOA".equals(tagName)){
                portsData.setMaxOffshoreLOA(data);
            }
            if("MaximumDraft".equals(tagName)){
                portsData.setMaximumDraft(data);
            }
            if("Status".equals(tagName)){
                portsData.setStatus(data);
            }
            if("CSICompliant".equals(tagName)){
                portsData.setCSICompliant(data);
            }
            if("ISPSCompliant".equals(tagName)){
                portsData.setISPSCompliant(data);
            }
            if("BreakbulkFacilities".equals(tagName)){
                portsData.setBreakbulkFacilities(data);
            }
            if("ContainerFacilities".equals(tagName)){
                portsData.setContainerFacilities(data);
            }
            if("DryBulkFacilities".equals(tagName)){
                portsData.setDryBulkFacilities(data);
            }
            if("DryDockFacilities".equals(tagName)){
                portsData.setDryDockFacilities(data);
            }
            if("GasFacilities".equals(tagName)){
                portsData.setGasFacilities(data);
            }
            if("LiquidFacilities".equals(tagName)){
                portsData.setLiquidFacilities(data);
            }
            if("PassengerFacilities".equals(tagName)){
                portsData.setPassengerFacilities(data);
            }
            if("MultipurposeFacilities".equals(tagName)){
                portsData.setMultipurposeFacilities(data);
            }
            if("RoRoFacilities".equals(tagName)){
                portsData.setRoRoFacilities(data);
            }
            if("TimeZone".equals(tagName)){
                portsData.setTimeZone(data);
            }
            if("LastUpdateDate".equals(tagName)){
                portsData.setLastUpdateDate(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }
}
