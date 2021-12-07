package com.hp.web.portal.gram_sadak.model;

public class RubbleMapping {

    private String srNo;
    private String material;
    private String compressiveStrengthKgcm2;
    private String crushingValue;
    private String waterAbsorption;

    public RubbleMapping() {
    }

    public RubbleMapping(String srNo) {
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

    public String getCompressiveStrengthKgcm2() {
        return compressiveStrengthKgcm2;
    }

    public void setCompressiveStrengthKgcm2(String compressiveStrengthKgcm2) {
        this.compressiveStrengthKgcm2 = compressiveStrengthKgcm2;
    }

    public String getCrushingValue() {
        return crushingValue;
    }

    public void setCrushingValue(String crushingValue) {
        this.crushingValue = crushingValue;
    }

    public String getWaterAbsorption() {
        return waterAbsorption;
    }

    public void setWaterAbsorption(String waterAbsorption) {
        this.waterAbsorption = waterAbsorption;
    }
}
