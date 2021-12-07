package com.hp.web.portal.gram_sadak.model;

public class ExtractionMapping {

    private String srNo;
    private String material;

    private String nameOfTest;
    private String actualBlinderContentPercentage;
    private String specifiedBlinderContentPercentage;

    public ExtractionMapping() {
    }

    public ExtractionMapping(String srNo) {
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

    public String getActualBlinderContentPercentage() {
        return actualBlinderContentPercentage;
    }

    public void setActualBlinderContentPercentage(String actualBlinderContentPercentage) {
        this.actualBlinderContentPercentage = actualBlinderContentPercentage;
    }

    public String getSpecifiedBlinderContentPercentage() {
        return specifiedBlinderContentPercentage;
    }

    public void setSpecifiedBlinderContentPercentage(String specifiedBlinderContentPercentage) {
        this.specifiedBlinderContentPercentage = specifiedBlinderContentPercentage;
    }
}
