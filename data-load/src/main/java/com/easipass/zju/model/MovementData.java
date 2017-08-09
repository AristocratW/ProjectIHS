package com.easipass.zju.model;

/**
 * Created by ssw on 17-7-31.
 */
public class MovementData {
    private String LRNOIMOShipNo;
    private String ShipName;
    private String ShipType;
    private String ArrivalDate;
    private String ArrivalDateFull;                 //type:dateTime
    private String SailDate;
    private String SailDateFull;                    //type:dateTime
    private String CallID;                          //type:int  tag:unique
    private String Destination;
    private String ETA;                             //type:dateTime
    private String Country;
    private String Port;
    private String PortGeoID;                       //type:int
    private String PortID;                          //type:int
    private String HoursinPort;                     //type:int
    private String PortLatitudeDecimal;             //type:decimal
    private String PortLongitudeDecimal;            //type:decimal
    private String LastPortofCallArrivalDate;       //type:dateTime
    private String LastPortofCallCode;              //type:int
    private String LastPortofCallCountry;
    private String LastPortofCallCountryCode;
    private String LastPortofCallName;
    private String LastPortofCallSailDate;          //type:dateTime
    private String Movementtype;
    private String DateCreated;                     //type:dateTime

    @Override
    public String toString(){
        String s = this.getLRNOIMOShipNo()+"\t"+this.getShipName()+"\t"+this.getShipType()+"\t"+this.getArrivalDate()+"\t"+
                this.getArrivalDateFull()+"\t"+this.getSailDate()+"\t"+this.getSailDateFull()+"\t"+this.getCallID()+"\t"+
                this.getDestination()+"\t"+this.getETA()+"\t"+this.getCountry()+"\t"+this.getPort()+"\t"+
                this.getPortGeoID()+"\t"+this.getPortID()+"\t"+this.getHoursinPort()+"\t"+this.getPortLatitudeDecimal()+"\t"+
                this.getPortLongitudeDecimal()+"\t"+this.getLastPortofCallArrivalDate()+"\t"+this.getLastPortofCallCode()+"\t"+
                this.getLastPortofCallCountry()+"\t"+this.getLastPortofCallCountryCode()+"\t"+this.getLastPortofCallName()+"\t"+
                this.getLastPortofCallSailDate()+"\t"+this.getMovementtype()+"\t"+this.getDateCreated();
        return s;
    }
    public String getLRNOIMOShipNo() {
        return LRNOIMOShipNo;
    }

    public void setLRNOIMOShipNo(String LRNOIMOShipNo) {
        this.LRNOIMOShipNo = LRNOIMOShipNo;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String shipName) {
        ShipName = shipName;
    }

    public String getShipType() {
        return ShipType;
    }

    public void setShipType(String shipType) {
        ShipType = shipType;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public String getArrivalDateFull() {
        return ArrivalDateFull;
    }

    public void setArrivalDateFull(String arrivalDateFull) {
        ArrivalDateFull = arrivalDateFull;
    }

    public String getSailDate() {
        return SailDate;
    }

    public void setSailDate(String sailDate) {
        SailDate = sailDate;
    }

    public String getSailDateFull() {
        return SailDateFull;
    }

    public void setSailDateFull(String sailDateFull) {
        SailDateFull = sailDateFull;
    }

    public String getCallID() {
        return CallID;
    }

    public void setCallID(String callID) {
        CallID = callID;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    public String getPortGeoID() {
        return PortGeoID;
    }

    public void setPortGeoID(String portGeoID) {
        PortGeoID = portGeoID;
    }

    public String getPortID() {
        return PortID;
    }

    public void setPortID(String portID) {
        PortID = portID;
    }

    public String getHoursinPort() {
        return HoursinPort;
    }

    public void setHoursinPort(String hoursinPort) {
        HoursinPort = hoursinPort;
    }

    public String getPortLatitudeDecimal() {
        return PortLatitudeDecimal;
    }

    public void setPortLatitudeDecimal(String portLatitudeDecimal) {
        PortLatitudeDecimal = portLatitudeDecimal;
    }

    public String getPortLongitudeDecimal() {
        return PortLongitudeDecimal;
    }

    public void setPortLongitudeDecimal(String portLongitudeDecimal) {
        PortLongitudeDecimal = portLongitudeDecimal;
    }

    public String getLastPortofCallArrivalDate() {
        return LastPortofCallArrivalDate;
    }

    public void setLastPortofCallArrivalDate(String lastPortofCallArrivalDate) {
        LastPortofCallArrivalDate = lastPortofCallArrivalDate;
    }

    public String getLastPortofCallCode() {
        return LastPortofCallCode;
    }

    public void setLastPortofCallCode(String lastPortofCallCode) {
        LastPortofCallCode = lastPortofCallCode;
    }

    public String getLastPortofCallCountry() {
        return LastPortofCallCountry;
    }

    public void setLastPortofCallCountry(String lastPortofCallCountry) {
        LastPortofCallCountry = lastPortofCallCountry;
    }

    public String getLastPortofCallCountryCode() {
        return LastPortofCallCountryCode;
    }

    public void setLastPortofCallCountryCode(String lastPortofCallCountryCode) {
        LastPortofCallCountryCode = lastPortofCallCountryCode;
    }

    public String getLastPortofCallName() {
        return LastPortofCallName;
    }

    public void setLastPortofCallName(String lastPortofCallName) {
        LastPortofCallName = lastPortofCallName;
    }

    public String getLastPortofCallSailDate() {
        return LastPortofCallSailDate;
    }

    public void setLastPortofCallSailDate(String lastPortofCallSailDate) {
        LastPortofCallSailDate = lastPortofCallSailDate;
    }

    public String getMovementtype() {
        return Movementtype;
    }

    public void setMovementtype(String movementtype) {
        Movementtype = movementtype;
    }

    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String dateCreated) {
        DateCreated = dateCreated;
    }
}
