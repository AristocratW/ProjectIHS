package com.easipass.zju.model;

/**
 * Created by ssw on 17-7-31.
 */
public class CombinedPositionsData {
    private String LRIMOShipNo;
    private String ShipName;
    private String ShipType;
    private String MovementDateTime;
    private String MovementID;              //type:long
    private String CallSign;
    private String MMSI;                    //type:int
    private String Destination;
    private String DestinationTidied;
    private String ETA;
    private String Speed;
    private String Heading;                 //type:double
    private String Latitude;
    private String Longitude;
    private String Length;
    private String Draught;
    private String Beam;
    private String TEU;                     //type:int
    private String MoveStatus;
    private String AdditionalInfo;

    @Override
    public String toString(){
        String s = this.getLRIMOShipNo()+"\t"+this.getShipName()+"\t"+this.getShipType()+"\t"+this.getMovementDateTime()+"\t"+
                this.getMovementID()+"\t"+this.getCallSign()+"\t"+this.getMMSI()+"\t"+this.getDestination()+"\t"+
                this.getDestinationTidied()+"\t"+this.getETA()+"\t"+this.getSpeed()+"\t"+this.getHeading()+"\t"+
                this.getLatitude()+"\t"+this.getLongitude()+"\t"+this.getLength()+"\t"+this.getDraught()+"\t"+this.getBeam()+"\t"+
                this.getTEU()+"\t"+this.getMoveStatus()+"\t"+this.getAdditionalInfo();
        return s;
    }

    public String getLRIMOShipNo() {
        return LRIMOShipNo;
    }

    public void setLRIMOShipNo(String LRIMOShipNo) {
        this.LRIMOShipNo = LRIMOShipNo;
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

    public String getMovementDateTime() {
        return MovementDateTime;
    }

    public void setMovementDateTime(String movementDateTime) {
        MovementDateTime = movementDateTime;
    }

    public String getMovementID() {
        return MovementID;
    }

    public void setMovementID(String movementID) {
        MovementID = movementID;
    }

    public String getCallSign() {
        return CallSign;
    }

    public void setCallSign(String callSign) {
        CallSign = callSign;
    }

    public String getMMSI() {
        return MMSI;
    }

    public void setMMSI(String MMSI) {
        this.MMSI = MMSI;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDestinationTidied() {
        return DestinationTidied;
    }

    public void setDestinationTidied(String destinationTidied) {
        DestinationTidied = destinationTidied;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public String getDraught() {
        return Draught;
    }

    public void setDraught(String draught) {
        Draught = draught;
    }

    public String getBeam() {
        return Beam;
    }

    public void setBeam(String beam) {
        Beam = beam;
    }

    public String getTEU() {
        return TEU;
    }

    public void setTEU(String TEU) {
        this.TEU = TEU;
    }

    public String getMoveStatus() {
        return MoveStatus;
    }

    public void setMoveStatus(String moveStatus) {
        MoveStatus = moveStatus;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        AdditionalInfo = additionalInfo;
    }
}
