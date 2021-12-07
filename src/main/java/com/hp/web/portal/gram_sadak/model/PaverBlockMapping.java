package com.hp.web.portal.gram_sadak.model;

public class PaverBlockMapping {

	private String srNo;
	private String identificationOfMark;
	private String concretePaverBlock;
	private String dateOfTesting;
	private String planAreaInSqCm;
	private String waterAbsorption;

	private String maxLoadInMTFirst;
	private String maxLoadInMTSecond;
	private String maxLoadInMTThird;

	private String compressiveStrengthKgCmFirst;
	private String compressiveStrengthKgCmSecond;
	private String compressiveStrengthKgCmThird;

	private String specified;

	public PaverBlockMapping() {
	}

	public PaverBlockMapping(String srNo) {
		super();
		this.srNo = srNo;
	}

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public String getIdentificationOfMark() {
		return identificationOfMark;
	}

	public void setIdentificationOfMark(String identificationOfMark) {
		this.identificationOfMark = identificationOfMark;
	}

	public String getConcretePaverBlock() {
		return concretePaverBlock;
	}

	public void setConcretePaverBlock(String concretePaverBlock) {
		this.concretePaverBlock = concretePaverBlock;
	}

	public String getDateOfTesting() {
		return dateOfTesting;
	}

	public void setDateOfTesting(String dateOfTesting) {
		this.dateOfTesting = dateOfTesting;
	}

	public String getPlanAreaInSqCm() {
		return planAreaInSqCm;
	}

	public void setPlanAreaInSqCm(String planAreaInSqCm) {
		this.planAreaInSqCm = planAreaInSqCm;
	}

	public String getWaterAbsorption() {
		return waterAbsorption;
	}

	public void setWaterAbsorption(String waterAbsorption) {
		this.waterAbsorption = waterAbsorption;
	}

	public String getMaxLoadInMTFirst() {
		return maxLoadInMTFirst;
	}

	public void setMaxLoadInMTFirst(String maxLoadInMTFirst) {
		this.maxLoadInMTFirst = maxLoadInMTFirst;
	}

	public String getMaxLoadInMTSecond() {
		return maxLoadInMTSecond;
	}

	public void setMaxLoadInMTSecond(String maxLoadInMTSecond) {
		this.maxLoadInMTSecond = maxLoadInMTSecond;
	}

	public String getMaxLoadInMTThird() {
		return maxLoadInMTThird;
	}

	public void setMaxLoadInMTThird(String maxLoadInMTThird) {
		this.maxLoadInMTThird = maxLoadInMTThird;
	}

	public String getCompressiveStrengthKgCmFirst() {
		return compressiveStrengthKgCmFirst;
	}

	public void setCompressiveStrengthKgCmFirst(String compressiveStrengthKgCmFirst) {
		this.compressiveStrengthKgCmFirst = compressiveStrengthKgCmFirst;
	}

	public String getCompressiveStrengthKgCmSecond() {
		return compressiveStrengthKgCmSecond;
	}

	public void setCompressiveStrengthKgCmSecond(String compressiveStrengthKgCmSecond) {
		this.compressiveStrengthKgCmSecond = compressiveStrengthKgCmSecond;
	}

	public String getCompressiveStrengthKgCmThird() {
		return compressiveStrengthKgCmThird;
	}

	public void setCompressiveStrengthKgCmThird(String compressiveStrengthKgCmThird) {
		this.compressiveStrengthKgCmThird = compressiveStrengthKgCmThird;
	}

	public String getSpecified() {
		return specified;
	}

	public void setSpecified(String specified) {
		this.specified = specified;
	}
}
