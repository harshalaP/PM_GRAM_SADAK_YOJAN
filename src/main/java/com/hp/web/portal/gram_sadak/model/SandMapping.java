package com.hp.web.portal.gram_sadak.model;

public class SandMapping {

    private String srNo;
    private String material;

    private String siltAndClayContent;
    private String fitnessAnalysis;

    public SandMapping() {
    }

    public SandMapping(String srNo) {
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

    public String getSiltAndClayContent() {
        return siltAndClayContent;
    }

    public void setSiltAndClayContent(String siltAndClayContent) {
        this.siltAndClayContent = siltAndClayContent;
    }

    public String getFitnessAnalysis() {
        return fitnessAnalysis;
    }

    public void setFitnessAnalysis(String fitnessAnalysis) {
        this.fitnessAnalysis = fitnessAnalysis;
    }
}
