package com.easipass.zju.xmlParse;

import com.easipass.zju.model.MovementData;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public class MovementDataResolver extends Resolver{
    private List<MovementData> list;
    private MovementData movementData;
    private String tagName;

    @Override
    public List<MovementData> getList() {
        return list;
    }

    public void setList(List<MovementData> list) {
        this.list = list;
    }

    public MovementData getMovementData() {
        return movementData;
    }

    public void setMovementData(MovementData movementData) {
        this.movementData = movementData;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<MovementData>();
    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("MovementData")){
            movementData = new MovementData();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("MovementData")){
            this.list.add(this.movementData);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(movementData != null){
            String data = new String(ch,start,length);
            if("LRNOIMOShipNo".equals(tagName)){
                movementData.setLRNOIMOShipNo(data);
            }
            if("ShipName".equals(tagName)){
                movementData.setShipName(data);
            }
            if("ShipType".equals(tagName)){
                movementData.setShipType(data);
            }
            if("ArrivalDate".equals(tagName)){
                movementData.setArrivalDate(data);
            }
            if("ArrivalDateFull".equals(tagName)){
                movementData.setArrivalDateFull(data);
            }
            if("SailDate".equals(tagName)){
                movementData.setSailDate(data);
            }
            if("SailDateFull".equals(tagName)){
                movementData.setSailDateFull(data);
            }
            if("CallID".equals(tagName)){
                movementData.setCallID(data);
            }
            if("Destination".equals(tagName)){
                movementData.setDestination(data);
            }
            if("ETA".equals(tagName)){
                movementData.setETA(data);
            }
            if("Country".equals(tagName)){
                movementData.setCountry(data);
            }
            if("Port".equals(tagName)){
                movementData.setPort(data);
            }
            if("PortGeoID".equals(tagName)){
                movementData.setPortGeoID(data);
            }
            if("PortID".equals(tagName)){
                movementData.setPortID(data);
            }
            if("HoursinPort".equals(tagName)){
                movementData.setHoursinPort(data);
            }
            if("PortLatitudeDecimal".equals(tagName)){
                movementData.setPortLatitudeDecimal(data);
            }
            if("PortLongitudeDecimal".equals(tagName)){
                movementData.setPortLongitudeDecimal(data);
            }
            if("LastPortofCallArrivalDate".equals(tagName)){
                movementData.setLastPortofCallArrivalDate(data);
            }
            if("LastPortofCallCode".equals(tagName)){
                movementData.setLastPortofCallCode(data);
            }
            if("LastPortofCallCountry".equals(tagName)){
                movementData.setLastPortofCallCountry(data);
            }
            if("LastPortofCallCountryCode".equals(tagName)){
                movementData.setLastPortofCallCountryCode(data);
            }
            if("LastPortofCallName".equals(tagName)){
                movementData.setLastPortofCallName(data);
            }
            if("LastPortofCallSailDate".equals(tagName)){
                movementData.setLastPortofCallSailDate(data);
            }
            if("Movementtype".equals(tagName)){
                movementData.setMovementtype(data);
            }
            if("DateCreated".equals(tagName)){
                movementData.setDateCreated(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }
}
