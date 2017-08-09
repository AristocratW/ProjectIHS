package com.easipass.zju.xmlParse;

import com.easipass.zju.model.tblPortBerth;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public class TblPortBerthResolver extends Resolver{
    private List<tblPortBerth> list;
    private tblPortBerth tbl;
    private String tagName;


    @Override
    public List<tblPortBerth> getList() {
        return list;
    }

    public void setList(List<tblPortBerth> list) {
        this.list = list;
    }

    public tblPortBerth getTblPortBerth() {
        return tbl;
    }

    public void setTblPortBerth(tblPortBerth tbl) {
        this.tbl = tbl;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }


    @Override
    public void startDocument() throws SAXException {
        list = new ArrayList<tblPortBerth>();
    }

    @Override
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException{
        if(qName.equals("tblPortBerth")){
            tbl = new tblPortBerth();
        }
        this.tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equals("tblPortBerth")){
            this.list.add(this.tbl);
        }
        this.tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        if(tbl != null){
            String data = new String(ch,start,length);
            if("Berth_ID".equals(tagName)){
                tbl.setBerth_ID(data);
            }
            if("Port_ID".equals(tagName)){
                tbl.setPort_ID(data);
            }
            if("Terminal_ID".equals(tagName)){
                tbl.setTerminal_ID(data);
            }
            if("Legacy_Berth_ID".equals(tagName)){
                tbl.setLegacy_Berth_ID(data);
            }
            if("Berth_Name".equals(tagName)){
                tbl.setBerth_Name(data);
            }
            if("Berth_No".equals(tagName)){
                tbl.setBerth_No(data);
            }
            if("Berth_Operator".equals(tagName)){
                tbl.setBerth_Operator(data);
            }
            if("Berth_Type".equals(tagName)){
                tbl.setBerth_Type(data);
            }
            if("Berth_Status".equals(tagName)){
                tbl.setBerth_Status(data);
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
            if("Berth_Length_Flat_Side".equals(tagName)){
                tbl.setBerth_Length_Flat_Side(data);
            }
            if("Berth_Length_Incl_Dolphins".equals(tagName)){
                tbl.setBerth_Length_Incl_Dolphins(data);
            }
            if("Berth_Length_Continuous".equals(tagName)){
                tbl.setBerth_Length_Continuous(data);
            }
            if("Depth_Alongside_LW".equals(tagName)){
                tbl.setDepth_Alongside_LW(data);
            }
            if("Draught_HW_Max".equals(tagName)){
                tbl.setDraught_HW_Max(data);
            }
            if("Draught_LW_Max".equals(tagName)){
                tbl.setDraught_LW_Max(data);
            }
            if("Berth_UKC_Min".equals(tagName)){
                tbl.setBerth_UKC_Min(data);
            }
            if("Tidal_Range_Spring".equals(tagName)){
                tbl.setTidal_Range_Spring(data);
            }
            if("Tidal_Range_Neap".equals(tagName)){
                tbl.setTidal_Range_Neap(data);
            }
            if("Night_Berthing".equals(tagName)){
                tbl.setNight_Berthing(data);
            }
            if("Night_Berthing_Note".equals(tagName)){
                tbl.setNight_Berthing_Note(data);
            }
            if("Night_Unberthing".equals(tagName)){
                tbl.setNight_Unberthing(data);
            }
            if("Ship_LOA_Max".equals(tagName)){
                tbl.setShip_LOA_Max(data);
            }
            if("Ship_LOA_Min".equals(tagName)){
                tbl.setShip_LOA_Min(data);
            }
            if("Ship_LOA_Note".equals(tagName)){
                tbl.setShip_LOA_Note(data);
            }
            if("Ship_Dwt_Max".equals(tagName)){
                tbl.setShip_Dwt_Max(data);
            }
            if("Ship_Dwt_Min".equals(tagName)){
                tbl.setShip_Dwt_Min(data);
            }
            if("Ship_DWT_Note".equals(tagName)){
                tbl.setShip_DWT_Note(data);
            }
            if("Ship_Disp_Max".equals(tagName)){
                tbl.setShip_Disp_Max(data);
            }
            if("Ship_Disp_Min".equals(tagName)){
                tbl.setShip_Disp_Min(data);
            }
            if("Ship_Disp_Note".equals(tagName)){
                tbl.setShip_Disp_Note(data);
            }
            if("Gas_Capacity_Min".equals(tagName)){
                tbl.setGas_Capacity_Min(data);
            }
            if("Gas_Capacity_Max".equals(tagName)){
                tbl.setGas_Capacity_Max(data);
            }
            if("Gas_Capacity_Note".equals(tagName)){
                tbl.setGas_Capacity_Note(data);
            }
            if("Ship_Beam_Max".equals(tagName)){
                tbl.setShip_Beam_Max(data);
            }
            if("Ship_Beam_Note".equals(tagName)){
                tbl.setShip_Beam_Note(data);
            }
            if("Berth_Disp_Max".equals(tagName)){
                tbl.setBerth_Disp_Max(data);
            }
            if("Berth_Disp_Note".equals(tagName)){
                tbl.setBerth_Disp_Note(data);
            }
            if("GT_Max".equals(tagName)){
                tbl.setGT_Max(data);
            }
            if("TEU".equals(tagName)){
                tbl.setTEU(data);
            }
            if("Waterline_Height_HW_Max".equals(tagName)){
                tbl.setWaterline_Height_HW_Max(data);
            }
            if("Total_PBL_Min".equals(tagName)){
                tbl.setTotal_PBL_Min(data);
            }
            if("Manifold_BCM_Max".equals(tagName)){
                tbl.setManifold_BCM_Max(data);
            }
            if("Manifold_BCM_Min".equals(tagName)){
                tbl.setManifold_BCM_Min(data);
            }
            if("Manifold_SCM_Max".equals(tagName)){
                tbl.setManifold_SCM_Max(data);
            }
            if("Manifold_SCM_Min".equals(tagName)){
                tbl.setManifold_SCM_Min(data);
            }
            if("Manifold_Height_Max".equals(tagName)){
                tbl.setManifold_Height_Max(data);
            }
            if("Manifold_Height_Min".equals(tagName)){
                tbl.setManifold_Height_Min(data);
            }
            if("Derrick_SWL_Min".equals(tagName)){
                tbl.setDerrick_SWL_Min(data);
            }
            if("WL_Masthead_Height_Max".equals(tagName)){
                tbl.setWL_Masthead_Height_Max(data);
            }
            if("Manifold_PBL_Min_Fwd".equals(tagName)){
                tbl.setManifold_PBL_Min_Fwd(data);
            }
            if("Manifold_PBL_Min_Aft".equals(tagName)){
                tbl.setManifold_PBL_Min_Aft(data);
            }
            if("Manifold_Used".equals(tagName)){
                tbl.setManifold_Used(data);
            }
            if("Ro_Ro".equals(tagName)){
                tbl.setRo_Ro(data);
            }
            if("Passenger".equals(tagName)){
                tbl.setPassenger(data);
            }
            if("Dry_Bulk".equals(tagName)){
                tbl.setDry_Bulk(data);
            }
            if("Ramp_Width".equals(tagName)){
                tbl.setRamp_Width(data);
            }
            if("Ramp_SWL".equals(tagName)){
                tbl.setRamp_SWL(data);
            }
            if("Breakbulk".equals(tagName)){
                tbl.setBreakbulk(data);
            }
            if("Multipurpose".equals(tagName)){
                tbl.setMultipurpose(data);
            }
            if("Naval".equals(tagName)){
                tbl.setNaval(data);
            }
            if("Coastal".equals(tagName)){
                tbl.setCoastal(data);
            }
            if("Timber_Products".equals(tagName)){
                tbl.setTimber_Products(data);
            }
            if("Fishing".equals(tagName)){
                tbl.setFishing(data);
            }
            if("Container".equals(tagName)){
                tbl.setContainer(data);
            }
            if("Transhipment".equals(tagName)){
                tbl.setTranshipment(data);
            }
            if("Offshore".equals(tagName)){
                tbl.setOffshore(data);
            }
            if("Shiplift_LASH".equals(tagName)){
                tbl.setShiplift_LASH(data);
            }
            if("Project_Heavy".equals(tagName)){
                tbl.setProject_Heavy(data);
            }
            if("Steel_Products".equals(tagName)){
                tbl.setSteel_Products(data);
            }
            if("Bunkers".equals(tagName)){
                tbl.setBunkers(data);
            }
            if("Twin_Span".equals(tagName)){
                tbl.setTwin_Span(data);
            }
            if("Cranes".equals(tagName)){
                tbl.setCranes(data);
            }
            if("Cranes_No".equals(tagName)){
                tbl.setCranes_No(data);
            }
            if("Cranes_SWL_Max".equals(tagName)){
                tbl.setCranes_SWL_Max(data);
            }
            if("Cranes_Outreach".equals(tagName)){
                tbl.setCranes_Outreach(data);
            }
            if("Cranes_Use".equals(tagName)){
                tbl.setCranes_Use(data);
            }
            if("Grabs_No".equals(tagName)){
                tbl.setGrabs_No(data);
            }
            if("Grabs_SWL_Max".equals(tagName)){
                tbl.setGrabs_SWL_Max(data);
            }
            if("Grabs_Rate_Max".equals(tagName)){
                tbl.setGrabs_Rate_Max(data);
            }
            if("Vacuator".equals(tagName)){
                tbl.setVacuator(data);
            }
            if("Vacuator_Outreach".equals(tagName)){
                tbl.setVacuator_Outreach(data);
            }
            if("Vacuator_Rate_Max".equals(tagName)){
                tbl.setVacuator_Rate_Max(data);
            }
            if("Load_Nozzles".equals(tagName)){
                tbl.setLoad_Nozzles(data);
            }
            if("Load_Nozzles_Outreach".equals(tagName)){
                tbl.setLoad_Nozzles_Outreach(data);
            }
            if("Load_Nozzles_Rate_Max".equals(tagName)){
                tbl.setLoad_Nozzles_Rate_Max(data);
            }
            if("All_Weather_Berth".equals(tagName)){
                tbl.setAll_Weather_Berth(data);
            }
            if("Cold_Ironing".equals(tagName)){
                tbl.setCold_Ironing(data);
            }
            if("Side_Alongside".equals(tagName)){
                tbl.setSide_Alongside(data);
            }
            if("Bunkers_HFO".equals(tagName)){
                tbl.setBunkers_HFO(data);
            }
            if("Delivery_HFO".equals(tagName)){
                tbl.setDelivery_HFO(data);
            }
            if("Gangway_Used".equals(tagName)){
                tbl.setGangway_Used(data);
            }
            if("Bunkers_DO_GO".equals(tagName)){
                tbl.setBunkers_DO_GO(data);
            }
            if("Delivery_DO_GO".equals(tagName)){
                tbl.setDelivery_DO_GO(data);
            }
            if("Moorings_Fwd".equals(tagName)){
                tbl.setMoorings_Fwd(data);
            }
            if("Moorings_Aft".equals(tagName)){
                tbl.setMoorings_Aft(data);
            }
            if("Bunkers_LNG".equals(tagName)){
                tbl.setBunkers_LNG(data);
            }
            if("Delivery_LNG".equals(tagName)){
                tbl.setDelivery_LNG(data);
            }
            if("Fresh_Water".equals(tagName)){
                tbl.setFresh_Water(data);
            }
            if("Delivery_FW".equals(tagName)){
                tbl.setDelivery_FW(data);
            }
            if("COW".equals(tagName)){
                tbl.setCOW(data);
            }
            if("GlobalPortID".equals(tagName)){
                tbl.setGlobalPortID(data);
            }
            if("GlobalTerminalID".equals(tagName)){
                tbl.setGlobalTerminalID(data);
            }
            if("GlobalBerthID".equals(tagName)){
                tbl.setGlobalBerthID(data);
            }
        }
    }

    @Override
    public void endDocument() throws SAXException{

    }
}
