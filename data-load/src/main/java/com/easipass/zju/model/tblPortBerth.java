package com.easipass.zju.model;

/**
 * Created by ssw on 17-7-31.
 */
public class tblPortBerth {
    private String Berth_ID;                        //type:int  tag:unique
    private String Port_ID;                         //type:int
    private String Terminal_ID;                     //type:int
    private String Legacy_Berth_ID;                 //type:int
    private String Berth_Name;
    private String Berth_No;
    private String Berth_Operator;
    private String Berth_Type;
    private String Berth_Status;
    private String Facility_Type;
    private String Latitude_Degrees;                //type:short
    private String Latitude_Minutes;                //type:decimal
    private String Latitude_Indicator;
    private String Longitude_Degrees;               //type:short
    private String Longitude_Minutes;               //type:decimal
    private String Longitude_Indicator;
    private String Dec_Latitude;                    //type:decimal
    private String Dec_Longitude;                   //type:decimal
    private String Berth_Length_Flat_Side;          //type:int
    private String Berth_Length_Incl_Dolphins;      //type:int
    private String Berth_Length_Continuous;         //type:int
    private String Depth_Alongside_LW;              //type:decimal
    private String Draught_HW_Max;                  //type:decimal
    private String Draught_LW_Max;                  //type:decimal
    private String Berth_UKC_Min;                   //type:decimal
    private String Tidal_Range_Spring;              //type:decimal
    private String Tidal_Range_Neap;                //type:decimal
    private String Night_Berthing;
    private String Night_Berthing_Note;
    private String Night_Unberthing;
    private String Ship_LOA_Max;                    //type:decimal
    private String Ship_LOA_Min;                    //type:decimal
    private String Ship_LOA_Note;
    private String Ship_Dwt_Max;                    //type:int
    private String Ship_Dwt_Min;                    //type:int
    private String Ship_DWT_Note;
    private String Ship_Disp_Max;                   //type:int
    private String Ship_Disp_Min;                   //type:int
    private String Ship_Disp_Note;
    private String Gas_Capacity_Max;               //type:int
    private String Gas_Capacity_Min;               //type:int
    private String Gas_Capacity_Note;
    private String Ship_Beam_Max;                   //type:decimal
    private String Ship_Beam_Note;
    private String Berth_Disp_Max;                  //type:int
    private String Berth_Disp_Note;
    private String GT_Max;                          //type:int
    private String TEU;                             //type:int
    private String Waterline_Height_HW_Max;         //type:int
    private String Total_PBL_Min;                   //type:decimal
    private String Manifold_BCM_Max;                //type:decimal
    private String Manifold_BCM_Min;                //type:decimal
    private String Manifold_SCM_Max;                //type:decimal
    private String Manifold_SCM_Min;                //type:decimal
    private String Manifold_Height_Max;             //type:decimal
    private String Manifold_Height_Min;             //type:decimal
    private String Derrick_SWL_Min;                 //type:int
    private String WL_Masthead_Height_Max;          //type:decimal
    private String Manifold_PBL_Min_Fwd;            //type:decimal
    private String Manifold_PBL_Min_Aft;            //type:decimal
    private String Manifold_Used;
    private String Ro_Ro;
    private String Passenger;
    private String Dry_Bulk;
    private String Ramp_Width;                      //type:decimal
    private String Ramp_SWL;                        //type:decimal
    private String Breakbulk;                       //type:boolean
    private String Multipurpose;                    //type:boolean
    private String Naval;                           //type:boolean
    private String Coastal;                         //type:boolean
    private String Timber_Products;                 //type:boolean
    private String Fishing;                         //type:boolean
    private String Container;                       //type:boolean
    private String Transhipment;                    //type:boolean
    private String Offshore;                        //type:boolean
    private String Shiplift_LASH;                   //type:boolean
    private String Project_Heavy;                   //type:boolean
    private String Steel_Products;                  //type:boolean
    private String Bunkers;                         //type:boolean
    private String Twin_Span;                       //type:boolean
    private String Cranes;
    private String Cranes_No;                       //type:int
    private String Cranes_SWL_Max;                  //type:decimal
    private String Cranes_Outreach;                 //type:decimal
    private String Cranes_Use;
    private String Grabs_No;                        //type:int
    private String Grabs_SWL_Max;                   //type:decimal
    private String Grabs_Rate_Max;                  //type:int
    private String Vacuator;                        //type:boolean
    private String Vacuator_Outreach;               //type:decimal
    private String Vacuator_Rate_Max;               //type:int
    private String Load_Nozzles;                    //type:boolean
    private String Load_Nozzles_Outreach;           //type:decimal
    private String Load_Nozzles_Rate_Max;           //type:int
    private String All_Weather_Berth;               //type:boolean
    private String Cold_Ironing;                    //type:boolean
    private String Side_Alongside;
    private String Bunkers_HFO;
    private String Delivery_HFO;
    private String Gangway_Used;
    private String Bunkers_DO_GO;
    private String Delivery_DO_GO;
    private String Moorings_Fwd;
    private String Moorings_Aft;
    private String Bunkers_LNG;
    private String Delivery_LNG;
    private String Fresh_Water;
    private String Delivery_FW;
    private String COW;                             //type:boolean
    private String GlobalPortID;
    private String GlobalTerminalID;
    private String GlobalBerthID;

    @Override
    public String toString(){
        String s = this.getBerth_ID()+"\t"+this.getPort_ID()+"\t"+this.getTerminal_ID()+"\t"+this.getLegacy_Berth_ID()+"\t"+
                this.getBerth_Name()+"\t"+this.getBerth_No()+"\t"+this.getBerth_Operator()+"\t"+this.getBerth_Type()+"\t"+
                this.getBerth_Status()+"\t"+this.getFacility_Type()+"\t"+this.getLatitude_Degrees()+"\t"+
                this.getLatitude_Minutes()+"\t"+this.getLatitude_Indicator()+"\t"+this.getLongitude_Degrees()+"\t"+
                this.getLongitude_Minutes()+"\t"+this.getLongitude_Indicator()+"\t"+this.getDec_Latitude()+"\t"+
                this.getDec_Longitude()+"\t"+this.getBerth_Length_Flat_Side()+"\t"+this.getBerth_Length_Incl_Dolphins()+"\t"+
                this.getBerth_Length_Continuous()+"\t"+this.getDepth_Alongside_LW()+"\t"+this.getDraught_HW_Max()+"\t"+
                this.getDraught_LW_Max()+"\t"+this.getBerth_UKC_Min()+"\t"+this.getTidal_Range_Spring()+"\t"+
                this.getTidal_Range_Neap()+"\t"+this.getNight_Berthing()+"\t"+this.getNight_Berthing_Note()+"\t"+
                this.getNight_Unberthing()+"\t"+this.getShip_LOA_Max()+"\t"+this.getShip_LOA_Min()+"\t"+
                this.getShip_LOA_Note()+"\t"+this.getShip_Dwt_Max()+"\t"+this.getShip_Dwt_Min()+this.getShip_DWT_Note()+"\t"+
                this.getShip_Disp_Max()+"\t"+this.getShip_Disp_Min()+"\t"+this.getShip_Disp_Note()+"\t"+
                this.getGas_Capacity_Max()+"\t"+this.getGas_Capacity_Min()+"\t"+this.getGas_Capacity_Note()+"\t"+
                this.getShip_Beam_Max()+"\t"+this.getShip_Beam_Note()+"\t"+this.getBerth_Disp_Max()+"\t"+
                this.getBerth_Disp_Note()+"\t"+this.getGT_Max()+"\t"+this.getTEU()+"\t"+this.getWaterline_Height_HW_Max()+"\t"+
                this.getTotal_PBL_Min()+"\t"+this.getManifold_BCM_Max()+"\t"+this.getManifold_BCM_Min()+"\t"+
                this.getManifold_SCM_Max()+"\t"+this.getManifold_SCM_Min()+"\t"+this.getManifold_Height_Max()+"\t"+
                this.getManifold_Height_Min()+"\t"+this.getDerrick_SWL_Min()+"\t"+this.getWL_Masthead_Height_Max()+"\t"+
                this.getManifold_PBL_Min_Fwd()+"\t"+this.getManifold_PBL_Min_Aft()+"\t"+this.getManifold_Used()+"\t"+
                this.getRo_Ro()+"\t"+this.getPassenger()+"\t"+this.getDry_Bulk()+"\t"+this.getRamp_Width()+"\t"+
                this.getRamp_SWL()+"\t"+this.getBreakbulk()+"\t"+this.getMultipurpose()+"\t"+this.getNaval()+"\t"+
                this.getCoastal()+"\t"+this.getTimber_Products()+"\t"+this.getFishing()+"\t"+this.getContainer()+"\t"+
                this.getTranshipment()+"\t"+this.getOffshore()+"\t"+this.getShiplift_LASH()+"\t"+this.getProject_Heavy()+"\t"+
                this.getSteel_Products()+"\t"+this.getBunkers()+"\t"+this.getTwin_Span()+"\t"+this.getCranes()+"\t"+
                this.getCranes_No()+"\t"+this.getCranes_SWL_Max()+"\t"+this.getCranes_Outreach()+"\t"+this.getCranes_Use()+"\t"+
                this.getGrabs_No()+"\t"+this.getGrabs_SWL_Max()+"\t"+this.getGrabs_Rate_Max()+"\t"+this.getVacuator()+"\t"+
                this.getVacuator_Outreach()+"\t"+this.getVacuator_Rate_Max()+"\t"+this.getLoad_Nozzles()+"\t"+
                this.getLoad_Nozzles_Outreach()+"\t"+this.getLoad_Nozzles_Rate_Max()+"\t"+this.getAll_Weather_Berth()+"\t"+
                this.getCold_Ironing()+"\t"+this.getSide_Alongside()+"\t"+this.getBunkers_HFO()+"\t"+this.getDelivery_HFO()+"\t"+
                this.getGangway_Used()+"\t"+this.getBunkers_DO_GO()+"\t"+this.getDelivery_DO_GO()+"\t"+this.getMoorings_Fwd()+"\t"+
                this.getMoorings_Aft()+"\t"+this.getBunkers_LNG()+"\t"+this.getDelivery_LNG()+"\t"+this.getFresh_Water()+"\t"+
                this.getDelivery_FW()+"\t"+this.getCOW()+"\t"+this.getGlobalPortID()+"\t"+this.getGlobalTerminalID()+"\t"+
                this.getLegacy_Berth_ID();
        return s;
    }

    public String getBerth_ID() {
        return Berth_ID;
    }

    public void setBerth_ID(String berth_ID) {
        Berth_ID = berth_ID;
    }

    public String getPort_ID() {
        return Port_ID;
    }

    public void setPort_ID(String port_ID) {
        Port_ID = port_ID;
    }

    public String getTerminal_ID() {
        return Terminal_ID;
    }

    public void setTerminal_ID(String terminal_ID) {
        Terminal_ID = terminal_ID;
    }

    public String getLegacy_Berth_ID() {
        return Legacy_Berth_ID;
    }

    public void setLegacy_Berth_ID(String legacy_Berth_ID) {
        Legacy_Berth_ID = legacy_Berth_ID;
    }

    public String getBerth_Name() {
        return Berth_Name;
    }

    public void setBerth_Name(String berth_Name) {
        Berth_Name = berth_Name;
    }

    public String getBerth_No() {
        return Berth_No;
    }

    public void setBerth_No(String berth_No) {
        Berth_No = berth_No;
    }

    public String getBerth_Operator() {
        return Berth_Operator;
    }

    public void setBerth_Operator(String berth_Operator) {
        Berth_Operator = berth_Operator;
    }

    public String getBerth_Type() {
        return Berth_Type;
    }

    public void setBerth_Type(String berth_Type) {
        Berth_Type = berth_Type;
    }

    public String getBerth_Status() {
        return Berth_Status;
    }

    public void setBerth_Status(String berth_Status) {
        Berth_Status = berth_Status;
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

    public String getBerth_Length_Flat_Side() {
        return Berth_Length_Flat_Side;
    }

    public void setBerth_Length_Flat_Side(String berth_Length_Flat_Side) {
        Berth_Length_Flat_Side = berth_Length_Flat_Side;
    }

    public String getBerth_Length_Incl_Dolphins() {
        return Berth_Length_Incl_Dolphins;
    }

    public void setBerth_Length_Incl_Dolphins(String berth_Length_Incl_Dolphins) {
        Berth_Length_Incl_Dolphins = berth_Length_Incl_Dolphins;
    }

    public String getBerth_Length_Continuous() {
        return Berth_Length_Continuous;
    }

    public void setBerth_Length_Continuous(String berth_Length_Continuous) {
        Berth_Length_Continuous = berth_Length_Continuous;
    }

    public String getDepth_Alongside_LW() {
        return Depth_Alongside_LW;
    }

    public void setDepth_Alongside_LW(String depth_Alongside_LW) {
        Depth_Alongside_LW = depth_Alongside_LW;
    }

    public String getDraught_HW_Max() {
        return Draught_HW_Max;
    }

    public void setDraught_HW_Max(String draught_HW_Max) {
        Draught_HW_Max = draught_HW_Max;
    }

    public String getDraught_LW_Max() {
        return Draught_LW_Max;
    }

    public void setDraught_LW_Max(String draught_LW_Max) {
        Draught_LW_Max = draught_LW_Max;
    }

    public String getBerth_UKC_Min() {
        return Berth_UKC_Min;
    }

    public void setBerth_UKC_Min(String berth_UKC_Min) {
        Berth_UKC_Min = berth_UKC_Min;
    }

    public String getTidal_Range_Spring() {
        return Tidal_Range_Spring;
    }

    public void setTidal_Range_Spring(String tidal_Range_Spring) {
        Tidal_Range_Spring = tidal_Range_Spring;
    }

    public String getTidal_Range_Neap() {
        return Tidal_Range_Neap;
    }

    public void setTidal_Range_Neap(String tidal_Range_Neap) {
        Tidal_Range_Neap = tidal_Range_Neap;
    }

    public String getNight_Berthing() {
        return Night_Berthing;
    }

    public void setNight_Berthing(String night_Berthing) {
        Night_Berthing = night_Berthing;
    }

    public String getNight_Berthing_Note() {
        return Night_Berthing_Note;
    }

    public void setNight_Berthing_Note(String night_Berthing_Note) {
        Night_Berthing_Note = night_Berthing_Note;
    }

    public String getNight_Unberthing() {
        return Night_Unberthing;
    }

    public void setNight_Unberthing(String night_Unberthing) {
        Night_Unberthing = night_Unberthing;
    }

    public String getShip_LOA_Max() {
        return Ship_LOA_Max;
    }

    public void setShip_LOA_Max(String ship_LOA_Max) {
        Ship_LOA_Max = ship_LOA_Max;
    }

    public String getShip_LOA_Min() {
        return Ship_LOA_Min;
    }

    public void setShip_LOA_Min(String ship_LOA_Min) {
        Ship_LOA_Min = ship_LOA_Min;
    }

    public String getShip_LOA_Note() {
        return Ship_LOA_Note;
    }

    public void setShip_LOA_Note(String ship_LOA_Note) {
        Ship_LOA_Note = ship_LOA_Note;
    }

    public String getShip_Dwt_Max() {
        return Ship_Dwt_Max;
    }

    public void setShip_Dwt_Max(String ship_Dwt_Max) {
        Ship_Dwt_Max = ship_Dwt_Max;
    }

    public String getShip_Dwt_Min() {
        return Ship_Dwt_Min;
    }

    public void setShip_Dwt_Min(String ship_Dwt_Min) {
        Ship_Dwt_Min = ship_Dwt_Min;
    }

    public String getShip_DWT_Note() {
        return Ship_DWT_Note;
    }

    public void setShip_DWT_Note(String ship_DWT_Note) {
        Ship_DWT_Note = ship_DWT_Note;
    }

    public String getShip_Disp_Max() {
        return Ship_Disp_Max;
    }

    public void setShip_Disp_Max(String ship_Disp_Max) {
        Ship_Disp_Max = ship_Disp_Max;
    }

    public String getShip_Disp_Min() {
        return Ship_Disp_Min;
    }

    public void setShip_Disp_Min(String ship_Disp_Min) {
        Ship_Disp_Min = ship_Disp_Min;
    }

    public String getShip_Disp_Note() {
        return Ship_Disp_Note;
    }

    public void setShip_Disp_Note(String ship_Disp_Note) {
        Ship_Disp_Note = ship_Disp_Note;
    }

    public String getGas_Capacity_Max() {
        return Gas_Capacity_Max;
    }

    public void setGas_Capacity_Max(String gas_Capacity_Max) {
        Gas_Capacity_Max = gas_Capacity_Max;
    }

    public String getGas_Capacity_Min() {
        return Gas_Capacity_Min;
    }

    public void setGas_Capacity_Min(String gas_Capacity_Min) {
        Gas_Capacity_Min = gas_Capacity_Min;
    }

    public String getGas_Capacity_Note() {
        return Gas_Capacity_Note;
    }

    public void setGas_Capacity_Note(String gas_Capacity_Note) {
        Gas_Capacity_Note = gas_Capacity_Note;
    }

    public String getShip_Beam_Max() {
        return Ship_Beam_Max;
    }

    public void setShip_Beam_Max(String ship_Beam_Max) {
        Ship_Beam_Max = ship_Beam_Max;
    }

    public String getShip_Beam_Note() {
        return Ship_Beam_Note;
    }

    public void setShip_Beam_Note(String ship_Beam_Note) {
        Ship_Beam_Note = ship_Beam_Note;
    }

    public String getBerth_Disp_Max() {
        return Berth_Disp_Max;
    }

    public void setBerth_Disp_Max(String berth_Disp_Max) {
        Berth_Disp_Max = berth_Disp_Max;
    }

    public String getBerth_Disp_Note() {
        return Berth_Disp_Note;
    }

    public void setBerth_Disp_Note(String berth_Disp_Note) {
        Berth_Disp_Note = berth_Disp_Note;
    }

    public String getGT_Max() {
        return GT_Max;
    }

    public void setGT_Max(String GT_Max) {
        this.GT_Max = GT_Max;
    }

    public String getTEU() {
        return TEU;
    }

    public void setTEU(String TEU) {
        this.TEU = TEU;
    }

    public String getWaterline_Height_HW_Max() {
        return Waterline_Height_HW_Max;
    }

    public void setWaterline_Height_HW_Max(String waterline_Height_HW_Max) {
        Waterline_Height_HW_Max = waterline_Height_HW_Max;
    }

    public String getTotal_PBL_Min() {
        return Total_PBL_Min;
    }

    public void setTotal_PBL_Min(String total_PBL_Min) {
        Total_PBL_Min = total_PBL_Min;
    }

    public String getManifold_BCM_Max() {
        return Manifold_BCM_Max;
    }

    public void setManifold_BCM_Max(String manifold_BCM_Max) {
        Manifold_BCM_Max = manifold_BCM_Max;
    }

    public String getManifold_BCM_Min() {
        return Manifold_BCM_Min;
    }

    public void setManifold_BCM_Min(String manifold_BCM_Min) {
        Manifold_BCM_Min = manifold_BCM_Min;
    }

    public String getManifold_SCM_Max() {
        return Manifold_SCM_Max;
    }

    public void setManifold_SCM_Max(String manifold_SCM_Max) {
        Manifold_SCM_Max = manifold_SCM_Max;
    }

    public String getManifold_SCM_Min() {
        return Manifold_SCM_Min;
    }

    public void setManifold_SCM_Min(String manifold_SCM_Min) {
        Manifold_SCM_Min = manifold_SCM_Min;
    }

    public String getManifold_Height_Max() {
        return Manifold_Height_Max;
    }

    public void setManifold_Height_Max(String manifold_Height_Max) {
        Manifold_Height_Max = manifold_Height_Max;
    }

    public String getManifold_Height_Min() {
        return Manifold_Height_Min;
    }

    public void setManifold_Height_Min(String manifold_Height_Min) {
        Manifold_Height_Min = manifold_Height_Min;
    }

    public String getDerrick_SWL_Min() {
        return Derrick_SWL_Min;
    }

    public void setDerrick_SWL_Min(String derrick_SWL_Min) {
        Derrick_SWL_Min = derrick_SWL_Min;
    }

    public String getWL_Masthead_Height_Max() {
        return WL_Masthead_Height_Max;
    }

    public void setWL_Masthead_Height_Max(String WL_Masthead_Height_Max) {
        this.WL_Masthead_Height_Max = WL_Masthead_Height_Max;
    }

    public String getManifold_PBL_Min_Fwd() {
        return Manifold_PBL_Min_Fwd;
    }

    public void setManifold_PBL_Min_Fwd(String manifold_PBL_Min_Fwd) {
        Manifold_PBL_Min_Fwd = manifold_PBL_Min_Fwd;
    }

    public String getManifold_PBL_Min_Aft() {
        return Manifold_PBL_Min_Aft;
    }

    public void setManifold_PBL_Min_Aft(String manifold_PBL_Min_Aft) {
        Manifold_PBL_Min_Aft = manifold_PBL_Min_Aft;
    }

    public String getManifold_Used() {
        return Manifold_Used;
    }

    public void setManifold_Used(String manifold_Used) {
        Manifold_Used = manifold_Used;
    }

    public String getRo_Ro() {
        return Ro_Ro;
    }

    public void setRo_Ro(String ro_Ro) {
        Ro_Ro = ro_Ro;
    }

    public String getPassenger() {
        return Passenger;
    }

    public void setPassenger(String passenger) {
        Passenger = passenger;
    }

    public String getDry_Bulk() {
        return Dry_Bulk;
    }

    public void setDry_Bulk(String dry_Bulk) {
        Dry_Bulk = dry_Bulk;
    }

    public String getRamp_Width() {
        return Ramp_Width;
    }

    public void setRamp_Width(String ramp_Width) {
        Ramp_Width = ramp_Width;
    }

    public String getRamp_SWL() {
        return Ramp_SWL;
    }

    public void setRamp_SWL(String ramp_SWL) {
        Ramp_SWL = ramp_SWL;
    }

    public String getBreakbulk() {
        return Breakbulk;
    }

    public void setBreakbulk(String breakbulk) {
        Breakbulk = breakbulk;
    }

    public String getMultipurpose() {
        return Multipurpose;
    }

    public void setMultipurpose(String multipurpose) {
        Multipurpose = multipurpose;
    }

    public String getNaval() {
        return Naval;
    }

    public void setNaval(String naval) {
        Naval = naval;
    }

    public String getCoastal() {
        return Coastal;
    }

    public void setCoastal(String coastal) {
        Coastal = coastal;
    }

    public String getTimber_Products() {
        return Timber_Products;
    }

    public void setTimber_Products(String timber_Products) {
        Timber_Products = timber_Products;
    }

    public String getFishing() {
        return Fishing;
    }

    public void setFishing(String fishing) {
        Fishing = fishing;
    }

    public String getContainer() {
        return Container;
    }

    public void setContainer(String container) {
        Container = container;
    }

    public String getTranshipment() {
        return Transhipment;
    }

    public void setTranshipment(String transhipment) {
        Transhipment = transhipment;
    }

    public String getOffshore() {
        return Offshore;
    }

    public void setOffshore(String offshore) {
        Offshore = offshore;
    }

    public String getShiplift_LASH() {
        return Shiplift_LASH;
    }

    public void setShiplift_LASH(String shiplift_LASH) {
        Shiplift_LASH = shiplift_LASH;
    }

    public String getProject_Heavy() {
        return Project_Heavy;
    }

    public void setProject_Heavy(String project_Heavy) {
        Project_Heavy = project_Heavy;
    }

    public String getSteel_Products() {
        return Steel_Products;
    }

    public void setSteel_Products(String steel_Products) {
        Steel_Products = steel_Products;
    }

    public String getBunkers() {
        return Bunkers;
    }

    public void setBunkers(String bunkers) {
        Bunkers = bunkers;
    }

    public String getTwin_Span() {
        return Twin_Span;
    }

    public void setTwin_Span(String twin_Span) {
        Twin_Span = twin_Span;
    }

    public String getCranes() {
        return Cranes;
    }

    public void setCranes(String cranes) {
        Cranes = cranes;
    }

    public String getCranes_No() {
        return Cranes_No;
    }

    public void setCranes_No(String cranes_No) {
        Cranes_No = cranes_No;
    }

    public String getCranes_SWL_Max() {
        return Cranes_SWL_Max;
    }

    public void setCranes_SWL_Max(String cranes_SWL_Max) {
        Cranes_SWL_Max = cranes_SWL_Max;
    }

    public String getCranes_Outreach() {
        return Cranes_Outreach;
    }

    public void setCranes_Outreach(String cranes_Outreach) {
        Cranes_Outreach = cranes_Outreach;
    }

    public String getCranes_Use() {
        return Cranes_Use;
    }

    public void setCranes_Use(String cranes_Use) {
        Cranes_Use = cranes_Use;
    }

    public String getGrabs_No() {
        return Grabs_No;
    }

    public void setGrabs_No(String grabs_No) {
        Grabs_No = grabs_No;
    }

    public String getGrabs_SWL_Max() {
        return Grabs_SWL_Max;
    }

    public void setGrabs_SWL_Max(String grabs_SWL_Max) {
        Grabs_SWL_Max = grabs_SWL_Max;
    }

    public String getGrabs_Rate_Max() {
        return Grabs_Rate_Max;
    }

    public void setGrabs_Rate_Max(String grabs_Rate_Max) {
        Grabs_Rate_Max = grabs_Rate_Max;
    }

    public String getVacuator() {
        return Vacuator;
    }

    public void setVacuator(String vacuator) {
        Vacuator = vacuator;
    }

    public String getVacuator_Outreach() {
        return Vacuator_Outreach;
    }

    public void setVacuator_Outreach(String vacuator_Outreach) {
        Vacuator_Outreach = vacuator_Outreach;
    }

    public String getVacuator_Rate_Max() {
        return Vacuator_Rate_Max;
    }

    public void setVacuator_Rate_Max(String vacuator_Rate_Max) {
        Vacuator_Rate_Max = vacuator_Rate_Max;
    }

    public String getLoad_Nozzles() {
        return Load_Nozzles;
    }

    public void setLoad_Nozzles(String load_Nozzles) {
        Load_Nozzles = load_Nozzles;
    }

    public String getLoad_Nozzles_Outreach() {
        return Load_Nozzles_Outreach;
    }

    public void setLoad_Nozzles_Outreach(String load_Nozzles_Outreach) {
        Load_Nozzles_Outreach = load_Nozzles_Outreach;
    }

    public String getLoad_Nozzles_Rate_Max() {
        return Load_Nozzles_Rate_Max;
    }

    public void setLoad_Nozzles_Rate_Max(String load_Nozzles_Rate_Max) {
        Load_Nozzles_Rate_Max = load_Nozzles_Rate_Max;
    }

    public String getAll_Weather_Berth() {
        return All_Weather_Berth;
    }

    public void setAll_Weather_Berth(String all_Weather_Berth) {
        All_Weather_Berth = all_Weather_Berth;
    }

    public String getCold_Ironing() {
        return Cold_Ironing;
    }

    public void setCold_Ironing(String cold_Ironing) {
        Cold_Ironing = cold_Ironing;
    }

    public String getSide_Alongside() {
        return Side_Alongside;
    }

    public void setSide_Alongside(String side_Alongside) {
        Side_Alongside = side_Alongside;
    }

    public String getBunkers_HFO() {
        return Bunkers_HFO;
    }

    public void setBunkers_HFO(String bunkers_HFO) {
        Bunkers_HFO = bunkers_HFO;
    }

    public String getDelivery_HFO() {
        return Delivery_HFO;
    }

    public void setDelivery_HFO(String delivery_HFO) {
        Delivery_HFO = delivery_HFO;
    }

    public String getGangway_Used() {
        return Gangway_Used;
    }

    public void setGangway_Used(String gangway_Used) {
        Gangway_Used = gangway_Used;
    }

    public String getBunkers_DO_GO() {
        return Bunkers_DO_GO;
    }

    public void setBunkers_DO_GO(String bunkers_DO_GO) {
        Bunkers_DO_GO = bunkers_DO_GO;
    }

    public String getDelivery_DO_GO() {
        return Delivery_DO_GO;
    }

    public void setDelivery_DO_GO(String delivery_DO_GO) {
        Delivery_DO_GO = delivery_DO_GO;
    }

    public String getMoorings_Fwd() {
        return Moorings_Fwd;
    }

    public void setMoorings_Fwd(String moorings_Fwd) {
        Moorings_Fwd = moorings_Fwd;
    }

    public String getMoorings_Aft() {
        return Moorings_Aft;
    }

    public void setMoorings_Aft(String moorings_Aft) {
        Moorings_Aft = moorings_Aft;
    }

    public String getBunkers_LNG() {
        return Bunkers_LNG;
    }

    public void setBunkers_LNG(String bunkers_LNG) {
        Bunkers_LNG = bunkers_LNG;
    }

    public String getDelivery_LNG() {
        return Delivery_LNG;
    }

    public void setDelivery_LNG(String delivery_LNG) {
        Delivery_LNG = delivery_LNG;
    }

    public String getFresh_Water() {
        return Fresh_Water;
    }

    public void setFresh_Water(String fresh_Water) {
        Fresh_Water = fresh_Water;
    }

    public String getDelivery_FW() {
        return Delivery_FW;
    }

    public void setDelivery_FW(String delivery_FW) {
        Delivery_FW = delivery_FW;
    }

    public String getCOW() {
        return COW;
    }

    public void setCOW(String COW) {
        this.COW = COW;
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

    public String getGlobalBerthID() {
        return GlobalBerthID;
    }

    public void setGlobalBerthID(String globalBerthID) {
        GlobalBerthID = globalBerthID;
    }
}
