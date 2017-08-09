package com.easipass.zju.model;

/**
 * Created by ssw on 17-7-31.
 */
public class tblPortTerminal {
    private String Terminal_ID;             //type:int  tag:unique
    private String Port_ID;                 //type:int
    private String Legacy_Terminal_ID;      //type:int
    private String Terminal_Name;
    private String Terminal_Operator;
    private String Facility_Type;
    private String Latitude_Degrees;        //type:short
    private String Latitude_Minutes;        //type:decimal
    private String Latitude_Indicator;
    private String Longitude_Degrees;       //type:short
    private String Longitude_Minutes;       //type:decimal
    private String Longitude_Indicator;
    private String Dec_Latitude;            //type:decimal
    private String Dec_Longitude;           //type:decimal
    private String GlobalPortID;
    private String GlobalTerminalID;

    @Override
    public String toString(){
        String s = this.getTerminal_ID()+"\t"+this.getPort_ID()+"\t"+this.getLegacy_Terminal_ID()+"\t"+
                this.getTerminal_Name()+"\t"+this.getTerminal_Operator()+"\t"+this.getFacility_Type()+"\t"+
                this.getLatitude_Degrees()+"\t"+this.getLatitude_Minutes()+"\t"+this.getLatitude_Indicator()+"\t"+
                this.getLongitude_Degrees()+"\t"+this.getLongitude_Minutes()+"\t"+this.getLongitude_Indicator()+"\t"+
                this.getDec_Latitude()+"\t"+this.getDec_Longitude()+"\t"+this.getGlobalPortID()+"\t"+this.getGlobalTerminalID();
        return s;
    }

    public String getTerminal_ID() {
        return Terminal_ID;
    }

    public void setTerminal_ID(String terminal_ID) {
        Terminal_ID = terminal_ID;
    }

    public String getPort_ID() {
        return Port_ID;
    }

    public void setPort_ID(String port_ID) {
        Port_ID = port_ID;
    }

    public String getLegacy_Terminal_ID() {
        return Legacy_Terminal_ID;
    }

    public void setLegacy_Terminal_ID(String legacy_Terminal_ID) {
        Legacy_Terminal_ID = legacy_Terminal_ID;
    }

    public String getTerminal_Name() {
        return Terminal_Name;
    }

    public void setTerminal_Name(String terminal_Name) {
        Terminal_Name = terminal_Name;
    }

    public String getTerminal_Operator() {
        return Terminal_Operator;
    }

    public void setTerminal_Operator(String terminal_Operator) {
        Terminal_Operator = terminal_Operator;
    }

    public String getFacility_Type() {
        return Facility_Type;
    }

    public void setFacility_Type(String facility_Type) {
        Facility_Type = facility_Type;
    }

    public String getLatitude_Degrees() {
        return Latitude_Degrees;
    }

    public void setLatitude_Degrees(String latitude_Degrees) {
        Latitude_Degrees = latitude_Degrees;
    }

    public String getLatitude_Minutes() {
        return Latitude_Minutes;
    }

    public void setLatitude_Minutes(String latitude_Minutes) {
        Latitude_Minutes = latitude_Minutes;
    }

    public String getLatitude_Indicator() {
        return Latitude_Indicator;
    }

    public void setLatitude_Indicator(String latitude_Indicator) {
        Latitude_Indicator = latitude_Indicator;
    }

    public String getLongitude_Degrees() {
        return Longitude_Degrees;
    }

    public void setLongitude_Degrees(String longitude_Degrees) {
        Longitude_Degrees = longitude_Degrees;
    }

    public String getLongitude_Minutes() {
        return Longitude_Minutes;
    }

    public void setLongitude_Minutes(String longitude_Minutes) {
        Longitude_Minutes = longitude_Minutes;
    }

    public String getLongitude_Indicator() {
        return Longitude_Indicator;
    }

    public void setLongitude_Indicator(String longitude_Indicator) {
        Longitude_Indicator = longitude_Indicator;
    }

    public String getDec_Latitude() {
        return Dec_Latitude;
    }

    public void setDec_Latitude(String dec_Latitude) {
        Dec_Latitude = dec_Latitude;
    }

    public String getDec_Longitude() {
        return Dec_Longitude;
    }

    public void setDec_Longitude(String dec_Longitude) {
        Dec_Longitude = dec_Longitude;
    }

    public String getGlobalPortID() {
        return GlobalPortID;
    }

    public void setGlobalPortID(String globalPortID) {
        GlobalPortID = globalPortID;
    }

    public String getGlobalTerminalID() {
        return GlobalTerminalID;
    }

    public void setGlobalTerminalID(String globalTerminalID) {
        GlobalTerminalID = globalTerminalID;
    }
}
