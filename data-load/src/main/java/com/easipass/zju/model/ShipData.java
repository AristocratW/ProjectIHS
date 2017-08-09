package com.easipass.zju.model;

import scala.util.parsing.combinator.testing.Str;

/**
 * Created by ssw on 17-7-31.
 */
public class ShipData {
    private String LRIMOShipNo;                     //ps:船舶IMO编号
    private String ShipName;                        //ps:英文船名
    private String ExName;
    private String ShipStatus;
    private String ShipStatusCode;
    private String ShiptypeLevel5;
    private String Deadweight;                      //type:int
    private String GrossTonnage;                    //type:int
    private String DateOfBuild;
    private String CallSign;                        //ps:船舶呼号
    private String Operator;
    private String OperatorCompanyCode;
    private String RegisteredOwner;
    private String RegisteredOwnerCode;
    private String ShipManager;
    private String ShipManagerCompanyCode;
    private String GroupBeneficialOwner;
    private String GroupBeneficialOwnerCompanyCode;
    private String TEU;                             //type:int
    private String TEUCapacity14tHomogenous;        //type:int

    @Override
    public String toString(){
        String s = this.getLRIMOShipNo()+"\t"+this.getShipName()+"\t"+this.getExName()+"\t"+this.getShipStatus()+"\t"+
                this.getShipStatusCode()+"\t"+this.getShiptypeLevel5()+"\t"+this.getDeadweight()+"\t"+
                this.getGrossTonnage()+"\t"+this.getDateOfBuild()+"\t"+this.getCallSign()+"\t"+this.getOperator()+"\t"+
                this.getOperatorCompanyCode()+"\t"+this.getRegisteredOwner()+"\t"+this.getRegisteredOwnerCode()+"\t"+
                this.getShipManager()+"\t"+this.getShipManagerCompanyCode()+"\t"+this.getGroupBeneficialOwner()+"\t"+
                this.getGroupBeneficialOwnerCompanyCode()+"\t"+this.getTEU()+"\t"+this.getTEUCapacity14tHomogenous();
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

    public String getExName() {
        return ExName;
    }

    public void setExName(String exName) {
        ExName = exName;
    }

    public String getShipStatus() {
        return ShipStatus;
    }

    public void setShipStatus(String shipStatus) {
        ShipStatus = shipStatus;
    }

    public String getShipStatusCode() {
        return ShipStatusCode;
    }

    public void setShipStatusCode(String shipStatusCode) {
        ShipStatusCode = shipStatusCode;
    }

    public String getShiptypeLevel5() {
        return ShiptypeLevel5;
    }

    public void setShiptypeLevel5(String shiptypeLevel5) {
        ShiptypeLevel5 = shiptypeLevel5;
    }

    public String getDeadweight() {
        return Deadweight;
    }

    public void setDeadweight(String deadweight) {
        Deadweight = deadweight;
    }

    public String getGrossTonnage() {
        return GrossTonnage;
    }

    public void setGrossTonnage(String grossTonnage) {
        GrossTonnage = grossTonnage;
    }

    public String getDateOfBuild() {
        return DateOfBuild;
    }

    public void setDateOfBuild(String dateOfBuild) {
        DateOfBuild = dateOfBuild;
    }

    public String getCallSign() {
        return CallSign;
    }

    public void setCallSign(String callSign) {
        CallSign = callSign;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getOperatorCompanyCode() {
        return OperatorCompanyCode;
    }

    public void setOperatorCompanyCode(String operatorCompanyCode) {
        OperatorCompanyCode = operatorCompanyCode;
    }

    public String getRegisteredOwner() {
        return RegisteredOwner;
    }

    public void setRegisteredOwner(String registeredOwner) {
        RegisteredOwner = registeredOwner;
    }

    public String getRegisteredOwnerCode() {
        return RegisteredOwnerCode;
    }

    public void setRegisteredOwnerCode(String registeredOwnerCode) {
        RegisteredOwnerCode = registeredOwnerCode;
    }

    public String getShipManager() {
        return ShipManager;
    }

    public void setShipManager(String shipManager) {
        ShipManager = shipManager;
    }

    public String getShipManagerCompanyCode() {
        return ShipManagerCompanyCode;
    }

    public void setShipManagerCompanyCode(String shipManagerCompanyCode) {
        ShipManagerCompanyCode = shipManagerCompanyCode;
    }

    public String getGroupBeneficialOwner() {
        return GroupBeneficialOwner;
    }

    public void setGroupBeneficialOwner(String groupBeneficialOwner) {
        GroupBeneficialOwner = groupBeneficialOwner;
    }

    public String getGroupBeneficialOwnerCompanyCode() {
        return GroupBeneficialOwnerCompanyCode;
    }

    public void setGroupBeneficialOwnerCompanyCode(String groupBeneficialOwnerCompanyCode) {
        GroupBeneficialOwnerCompanyCode = groupBeneficialOwnerCompanyCode;
    }

    public String getTEU() {
        return TEU;
    }

    public void setTEU(String TEU) {
        this.TEU = TEU;
    }

    public String getTEUCapacity14tHomogenous() {
        return TEUCapacity14tHomogenous;
    }

    public void setTEUCapacity14tHomogenous(String TEUCapacity14tHomogenous) {
        this.TEUCapacity14tHomogenous = TEUCapacity14tHomogenous;
    }
}
