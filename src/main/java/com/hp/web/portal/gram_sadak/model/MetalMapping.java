package com.hp.web.portal.gram_sadak.model;

public class MetalMapping {

    private String srNo;
    private String material;

    private String sleveSizeAnalysis;
    private String actualPercentagePassingAnalysis;
    private String specifiedPercentageAnalysis;

    private String crushingValueLimit;
    private String waterAbsorptionLimit;
    private String impactValue;

    public MetalMapping() {
    }

    public MetalMapping(String srNo) {
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

    public String getSleveSizeAnalysis() {
        return sleveSizeAnalysis;
    }

    public void setSleveSizeAnalysis(String sleveSizeAnalysis) {
        this.sleveSizeAnalysis = sleveSizeAnalysis;
    }

    public String getActualPercentagePassingAnalysis() {
        return actualPercentagePassingAnalysis;
    }

    public void setActualPercentagePassingAnalysis(String actualPercentagePassingAnalysis) {
        this.actualPercentagePassingAnalysis = actualPercentagePassingAnalysis;
    }

    public String getSpecifiedPercentageAnalysis() {
        return specifiedPercentageAnalysis;
    }

    public void setSpecifiedPercentageAnalysis(String specifiedPercentageAnalysis) {
        this.specifiedPercentageAnalysis = specifiedPercentageAnalysis;
    }

    public String getCrushingValueLimit() {
        return crushingValueLimit;
    }

    public void setCrushingValueLimit(String crushingValueLimit) {
        this.crushingValueLimit = crushingValueLimit;
    }

    public String getWaterAbsorptionLimit() {
        return waterAbsorptionLimit;
    }

    public void setWaterAbsorptionLimit(String waterAbsorptionLimit) {
        this.waterAbsorptionLimit = waterAbsorptionLimit;
    }

    public String getImpactValue() {
        return impactValue;
    }

    public void setImpactValue(String impactValue) {
        this.impactValue = impactValue;
    }
}
