package com.hp.web.portal.gram_sadak.model;

public class MurumMapping {

    private String srNo;
    private String nameOfTest;

    private String liquidLimit;
    private String plasticLimit;

    public MurumMapping() {
    }

    public MurumMapping(String srNo) {
        super();
        this.srNo = srNo;
    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public String getNameOfTest() {
        return nameOfTest;
    }

    public void setNameOfTest(String nameOfTest) {
        this.nameOfTest = nameOfTest;
    }

    public String getLiquidLimit() {
        return liquidLimit;
    }

    public void setLiquidLimit(String liquidLimit) {
        this.liquidLimit = liquidLimit;
    }

    public String getPlasticLimit() {
        return plasticLimit;
    }

    public void setPlasticLimit(String plasticLimit) {
        this.plasticLimit = plasticLimit;
    }
}
