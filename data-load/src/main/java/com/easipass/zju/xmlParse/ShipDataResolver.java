package com.easipass.zju.xmlParse;

import com.easipass.zju.model.ShipData;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public class ShipDataResolver extends Resolver{
    private List<ShipData> list;
    private ShipData shipData;
    private String tagName;

    @Override
    public List<ShipData> getList() {
        return list;
    }

    public void setList(List<ShipData> list) {
        this.list = list;
    }

    public ShipData getShipData() {
        return shipData;
    }

    public void setShipData(ShipData shipData) {
        this.shipData = shipData;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void startDocument() throws SAXException{
        list = new ArrayList<ShipData>();
    }


    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("ShipData")){
            shipData = new ShipData();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("ShipData")){
            this.list.add(this.shipData);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(shipData != null){
            String data = new String(ch,start,length);
            if("LRIMOShipNo".equals(tagName)){
                shipData.setLRIMOShipNo(data);
            }
            if("ShipName".equals(tagName)){
                shipData.setShipName(data);
            }
            if("ExName".equals(tagName)){
                shipData.setExName(data);
            }
            if("ShipStatus".equals(tagName)){
                shipData.setShipStatus(data);
            }
            if("ShipStatusCode".equals(tagName)){
                shipData.setShipStatusCode(data);
            }
            if("ShiptypeLevel5".equals(tagName)){
                shipData.setShiptypeLevel5(data);
            }
            if("Deadweight".equals(tagName)){
                shipData.setDeadweight(data);
            }
            if("GrossTonnage".equals(tagName)){
                shipData.setGrossTonnage(data);
            }
            if("DateOfBuild".equals(tagName)){
                shipData.setDateOfBuild(data);
            }
            if("CallSign".equals(tagName)){
                shipData.setCallSign(data);
            }
            if("Operator".equals(tagName)){
                shipData.setOperator(data);
            }
            if("OperatorCompanyCode".equals(tagName)){
                shipData.setOperatorCompanyCode(data);
            }
            if("RegisteredOwner".equals(tagName)){
                shipData.setRegisteredOwner(data);
            }
            if("RegisteredOwnerCode".equals(tagName)){
                shipData.setRegisteredOwnerCode(data);
            }
            if("ShipManager".equals(tagName)){
                shipData.setShipManager(data);
            }
            if("ShipManagerCompanyCode".equals(tagName)){
                shipData.setShipManagerCompanyCode(data);
            }
            if("GroupBeneficialOwner".equals(tagName)){
                shipData.setGroupBeneficialOwner(data);
            }
            if("GroupBeneficialOwnerCompanyCode".equals(tagName)){
                shipData.setGroupBeneficialOwnerCompanyCode(data);
            }
            if("TEU".equals(tagName)){
                shipData.setTEU(data);
            }
            if("TEUCapacity14tHomogenous".equals(tagName)){
                shipData.setTEUCapacity14tHomogenous(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }
}
