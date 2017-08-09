package com.easipass.zju.xmlParse;

import com.easipass.zju.model.CombinedPositionsData;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-7-31.
 */
public class CombinedPositionsDataResolver extends Resolver{
    private List<CombinedPositionsData> list;
    private CombinedPositionsData combinedPositionsData;
    private String tagName;

    @Override
    public List<CombinedPositionsData> getList() {
        return list;
    }

    public void setList(List<CombinedPositionsData> list) {
        this.list = list;
    }

    public CombinedPositionsData getCombinedPositionsData() {
        return combinedPositionsData;
    }

    public void setCombinedPositionsData(CombinedPositionsData combinedPositionsData) {
        this.combinedPositionsData = combinedPositionsData;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<CombinedPositionsData>();
    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("CombinedPositionsData")){
            combinedPositionsData = new CombinedPositionsData();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("CombinedPositionsData")){
            this.list.add(this.combinedPositionsData);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(combinedPositionsData != null){
            String data = new String(ch,start,length);
            if("LRIMOShipNo".equals(tagName)){
                combinedPositionsData.setLRIMOShipNo(data);
            }
            if("ShipName".equals(tagName)){
                combinedPositionsData.setShipName(data);
            }
            if("ShipType".equals(tagName)){
                combinedPositionsData.setShipType(data);
            }
            if("MovementDateTime".equals(tagName)){
                combinedPositionsData.setMovementDateTime(data);
            }
            if("MovementID".equals(tagName)){
                combinedPositionsData.setMovementID(data);
            }
            if("CallSign".equals(tagName)){
                combinedPositionsData.setCallSign(data);
            }
            if("MMSI".equals(tagName)){
                combinedPositionsData.setMMSI(data);
            }
            if("Destination".equals(tagName)){
                combinedPositionsData.setDestination(data);
            }
            if("DestinationTidied".equals(tagName)){
                combinedPositionsData.setDestinationTidied(data);
            }
            if("ETA".equals(tagName)){
                combinedPositionsData.setETA(data);
            }
            if("Speed".equals(tagName)){
                combinedPositionsData.setSpeed(data);
            }
            if("Heading".equals(tagName)){
                combinedPositionsData.setHeading(data);
            }
            if("Latitude".equals(tagName)){
                combinedPositionsData.setLatitude(data);
            }
            if("Longitude".equals(tagName)){
                combinedPositionsData.setLongitude(data);
            }
            if("Length".equals(tagName)){
                combinedPositionsData.setLength(data);
            }
            if("Draught".equals(tagName)){
                combinedPositionsData.setDraught(data);
            }
            if("Beam".equals(tagName)){
                combinedPositionsData.setBeam(data);
            }
            if("TEU".equals(tagName)){
                combinedPositionsData.setTEU(data);
            }
            if("MoveStatus".equals(tagName)){
                combinedPositionsData.setMoveStatus(data);
            }
            if("AdditionalInfo".equals(tagName)){
                combinedPositionsData.setAdditionalInfo(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }

}
