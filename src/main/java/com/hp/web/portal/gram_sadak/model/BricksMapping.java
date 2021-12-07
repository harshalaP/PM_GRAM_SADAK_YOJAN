package com.hp.web.portal.gram_sadak.model;

public class BricksMapping {

	private String srNo;
	private String materialAndClassOfBricks;
	private String waterAbsorption;
	private String compressiveStrength;
	private String remarks;

	public BricksMapping() {
		}

	public BricksMapping(String srNo) {
		super();
		this.srNo = srNo;
	}

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public String getMaterialAndClassOfBricks() {
		return materialAndClassOfBricks;
	}

	public void setMaterialAndClassOfBricks(String materialAndClassOfBricks) {
		this.materialAndClassOfBricks = materialAndClassOfBricks;
	}

	public String getWaterAbsorption() {
		return waterAbsorption;
	}

	public void setWaterAbsorption(String waterAbsorption) {
		this.waterAbsorption = waterAbsorption;
	}

	public String getCompressiveStrength() {
		return compressiveStrength;
	}

	public void setCompressiveStrength(String compressiveStrength) {
		this.compressiveStrength = compressiveStrength;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
