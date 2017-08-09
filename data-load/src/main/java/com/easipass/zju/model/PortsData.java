package com.easipass.zju.model;

/**
 * Created by ssw on 17-7-31.
 */
public class PortsData {
    private String PortID;                  //type:int  tag:unique
    private String WorldPortNumber;
    private String PortName;
    private String FullPortStyle;
    private String GlobalPortID;
    private String WSPort;                  //type:short
    private String UNLOCODE;
    private String AlternativeName;
    private String Country;
    private String CountryCode;
    private String CountryCodeLRF;
    private String LatitudeDecimal;         //type:decimal
    private String LatitudeDegrees;         //type:short
    private String LatitudeIndicator;
    private String LatitudeMinutes;         //type:short
    private String LongitudeDecimal;        //type:decimal
    private String LongitudeDegrees;        //type:short
    private String LongitudeIndicator;
    private String LongitudeMinutes;        //type:short
    private String MasterPOID;
    private String MaxBeam;                 //type:float
    private String MaxDWT;                  //type:int
    private String MaxLOA;                  //type:float
    private String MaxOffshoreBCM;          //type:float
    private String MaxOffshoreDraught;      //type:float
    private String MaxOffshoreDWT;          //type:float
    private String MaxOffshoreLOA;          //type:float
    private String MaximumDraft;            //type:float
    private String Status;
    private String CSICompliant;            //type:boolean
    private String ISPSCompliant;           //type:boolean
    private String BreakbulkFacilities;     //type:boolean
    private String ContainerFacilities;     //type:boolean
    private String DryBulkFacilities;       //type:boolean
    private String DryDockFacilities;       //type:boolean
    private String GasFacilities;           //type:boolean
    private String LiquidFacilities;        //type:boolean
    private String PassengerFacilities;     //type:boolean
    private String MultipurposeFacilities;  //type:boolean
    private String RoRoFacilities;          //type:boolean
    private String TimeZone;
    private String LastUpdateDate;          //type:dateTime     eg:2014-07-10T06:27:22.687+01:00

    @Override
    public String toString(){
        String s = this.getPortID()+"\t"+this.getWorldPortNumber()+"\t"+this.getPortName()+"\t"+this.getFullPortStyle()+"\t"+
                this.getGlobalPortID()+"\t"+this.getWSPort()+"\t"+this.getUNLOCODE()+"\t"+this.getAlternativeName()+"\t"+
                this.getCountry()+"\t"+this.getCountryCode()+"\t"+this.getCountryCodeLRF()+"\t"+this.getLatitudeDecimal()+"\t"+
                this.getLatitudeDegrees()+"\t"+this.getLatitudeIndicator()+"\t"+this.getLatitudeMinutes()+"\t"+
                this.getLongitudeDecimal()+"\t"+this.getLongitudeDegrees()+"\t"+this.getLongitudeIndicator()+"\t"+
                this.getLongitudeMinutes()+"\t"+this.getMasterPOID()+"\t"+this.getMaxBeam()+"\t"+this.getMaxDWT()+"\t"+
                this.getMaxLOA()+"\t"+this.getMaxOffshoreBCM()+"\t"+this.getMaxOffshoreDraught()+"\t"+this.getMaxOffshoreDWT()+"\t"+
                this.getMaxOffshoreLOA()+"\t"+this.getMaximumDraft()+"\t"+this.getStatus()+"\t"+this.getCSICompliant()+"\t"+
                this.getISPSCompliant()+"\t"+this.getBreakbulkFacilities()+"\t"+this.getContainerFacilities()+"\t"+
                this.getDryBulkFacilities()+"\t"+this.getDryDockFacilities()+"\t"+this.getGasFacilities()+"\t"+
                this.getLiquidFacilities()+"\t"+this.getPassengerFacilities()+"\t"+this.getMultipurposeFacilities()+"\t"+
                this.getRoRoFacilities()+"\t"+this.getTimeZone()+"\t"+this.getLastUpdateDate();
        return s;
    }
    public String getPortID() {
        return PortID;
    }

    public void setPortID(String portID) {
        PortID = portID;
    }

    public String getWorldPortNumber() {
        return WorldPortNumber;
    }

    public void setWorldPortNumber(String worldPortNumber) {
        WorldPortNumber = worldPortNumber;
    }

    public String getPortName() {
        return PortName;
    }

    public void setPortName(String portName) {
        PortName = portName;
    }

    public String getFullPortStyle() {
        return FullPortStyle;
    }

    public void setFullPortStyle(String fullPortStyle) {
        FullPortStyle = fullPortStyle;
    }

    public String getGlobalPortID() {
        return GlobalPortID;
    }

    public void setGlobalPortID(String globalPortID) {
        GlobalPortID = globalPortID;
    }

    public String getWSPort() {
        return WSPort;
    }

    public void setWSPort(String WSPort) {
        this.WSPort = WSPort;
    }

    public String getUNLOCODE() {
        return UNLOCODE;
    }

    public void setUNLOCODE(String UNLOCODE) {
        this.UNLOCODE = UNLOCODE;
    }

    public String getAlternativeName() {
        return AlternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        AlternativeName = alternativeName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryCodeLRF() {
        return CountryCodeLRF;
    }

    public void setCountryCodeLRF(String countryCodeLRF) {
        CountryCodeLRF = countryCodeLRF;
    }

    public String getLatitudeDecimal() {
        return LatitudeDecimal;
    }

    public void setLatitudeDecimal(String latitudeDecimal) {
        LatitudeDecimal = latitudeDecimal;
    }

    public String getLatitudeDegrees() {
        return LatitudeDegrees;
    }

    public void setLatitudeDegrees(String latitudeDegrees) {
        LatitudeDegrees = latitudeDegrees;
    }

    public String getLatitudeIndicator() {
        return LatitudeIndicator;
    }

    public void setLatitudeIndicator(String latitudeIndicator) {
        LatitudeIndicator = latitudeIndicator;
    }

    public String getLatitudeMinutes() {
        return LatitudeMinutes;
    }

    public void setLatitudeMinutes(String latitudeMinutes) {
        LatitudeMinutes = latitudeMinutes;
    }

    public String getLongitudeDecimal() {
        return LongitudeDecimal;
    }

    public void setLongitudeDecimal(String longitudeDecimal) {
        LongitudeDecimal = longitudeDecimal;
    }

    public String getLongitudeDegrees() {
        return LongitudeDegrees;
    }

    public void setLongitudeDegrees(String longitudeDegrees) {
        LongitudeDegrees = longitudeDegrees;
    }

    public String getLongitudeIndicator() {
        return LongitudeIndicator;
    }

    public void setLongitudeIndicator(String longitudeIndicator) {
        LongitudeIndicator = longitudeIndicator;
    }

    public String getLongitudeMinutes() {
        return LongitudeMinutes;
    }

    public void setLongitudeMinutes(String longitudeMinutes) {
        LongitudeMinutes = longitudeMinutes;
    }

    public String getMasterPOID() {
        return MasterPOID;
    }

    public void setMasterPOID(String masterPOID) {
        MasterPOID = masterPOID;
    }

    public String getMaxBeam() {
        return MaxBeam;
    }

    public void setMaxBeam(String maxBeam) {
        MaxBeam = maxBeam;
    }

    public String getMaxDWT() {
        return MaxDWT;
    }

    public void setMaxDWT(String maxDWT) {
        MaxDWT = maxDWT;
    }

    public String getMaxLOA() {
        return MaxLOA;
    }

    public void setMaxLOA(String maxLOA) {
        MaxLOA = maxLOA;
    }

    public String getMaxOffshoreBCM() {
        return MaxOffshoreBCM;
    }

    public void setMaxOffshoreBCM(String maxOffshoreBCM) {
        MaxOffshoreBCM = maxOffshoreBCM;
    }

    public String getMaxOffshoreDraught() {
        return MaxOffshoreDraught;
    }

    public void setMaxOffshoreDraught(String maxOffshoreDraught) {
        MaxOffshoreDraught = maxOffshoreDraught;
    }

    public String getMaxOffshoreDWT() {
        return MaxOffshoreDWT;
    }

    public void setMaxOffshoreDWT(String maxOffshoreDWT) {
        MaxOffshoreDWT = maxOffshoreDWT;
    }

    public String getMaxOffshoreLOA() {
        return MaxOffshoreLOA;
    }

    public void setMaxOffshoreLOA(String maxOffshoreLOA) {
        MaxOffshoreLOA = maxOffshoreLOA;
    }

    public String getMaximumDraft() {
        return MaximumDraft;
    }

    public void setMaximumDraft(String maximumDraft) {
        MaximumDraft = maximumDraft;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getCSICompliant() {
        return CSICompliant;
    }

    public void setCSICompliant(String CSICompliant) {
        this.CSICompliant = CSICompliant;
    }

    public String getISPSCompliant() {
        return ISPSCompliant;
    }

    public void setISPSCompliant(String ISPSCompliant) {
        this.ISPSCompliant = ISPSCompliant;
    }

    public String getBreakbulkFacilities() {
        return BreakbulkFacilities;
    }

    public void setBreakbulkFacilities(String breakbulkFacilities) {
        BreakbulkFacilities = breakbulkFacilities;
    }

    public String getContainerFacilities() {
        return ContainerFacilities;
    }

    public void setContainerFacilities(String containerFacilities) {
        ContainerFacilities = containerFacilities;
    }

    public String getDryBulkFacilities() {
        return DryBulkFacilities;
    }

    public void setDryBulkFacilities(String dryBulkFacilities) {
        DryBulkFacilities = dryBulkFacilities;
    }

    public String getDryDockFacilities() {
        return DryDockFacilities;
    }

    public void setDryDockFacilities(String dryDockFacilities) {
        DryDockFacilities = dryDockFacilities;
    }

    public String getGasFacilities() {
        return GasFacilities;
    }

    public void setGasFacilities(String gasFacilities) {
        GasFacilities = gasFacilities;
    }

    public String getLiquidFacilities() {
        return LiquidFacilities;
    }

    public void setLiquidFacilities(String liquidFacilities) {
        LiquidFacilities = liquidFacilities;
    }

    public String getPassengerFacilities() {
        return PassengerFacilities;
    }

    public void setPassengerFacilities(String passengerFacilities) {
        PassengerFacilities = passengerFacilities;
    }

    public String getMultipurposeFacilities() {
        return MultipurposeFacilities;
    }

    public void setMultipurposeFacilities(String multipurposeFacilities) {
        MultipurposeFacilities = multipurposeFacilities;
    }

    public String getRoRoFacilities() {
        return RoRoFacilities;
    }

    public void setRoRoFacilities(String roRoFacilities) {
        RoRoFacilities = roRoFacilities;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public String getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        LastUpdateDate = lastUpdateDate;
    }
}
