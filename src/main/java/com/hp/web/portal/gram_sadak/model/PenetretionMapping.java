package com.hp.web.portal.gram_sadak.model;

public class PenetretionMapping {

    private String srNo;
    private String material;

    private String nameOfTest;
    private String resultObtained;
    private String limits;
    private String remarks;

    public PenetretionMapping() {
    }

    public PenetretionMapping(String srNo) {
        super();
        this.srNo = srNo;
    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNameOfTest() {
        return nameOfTest;
    }

    public void setNameOfTest(String nameOfTest) {
        this.nameOfTest = nameOfTest;
    }

    public String getResultObtained() {
        return resultObtained;
    }

    public void setResultObtained(String resultObtained) {
        this.resultObtained = resultObtained;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
