package com.hp.web.portal.gram_sadak.model;

public class ConcreteCubesMapping {

	private String srNo;
	private String identificationOfMark;
	private String concreteMix;
	private String dateOfCastingAsPerCostomerLetter;
	private String dateOfTesting;
	private String ageOfSpecimenInDays;
	private String dimensionOfSpecimeInCm;
	private String crossSectionalAreaInSqCm;
	private String compressensiveStrength;
	private String observed; 
	private String specifiedFor28DaysCuring;
	
	private String observedFirst;
	private String observedSecond;
	private String observedThird;
	
	public ConcreteCubesMapping() {
		}
	
	public ConcreteCubesMapping(String srNo) {
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
	public String getConcreteMix() {
		return concreteMix;
	}
	public void setConcreteMix(String concreteMix) {
		this.concreteMix = concreteMix;
	}
	public String getDateOfCastingAsPerCostomerLetter() {
		return dateOfCastingAsPerCostomerLetter;
	}
	public void setDateOfCastingAsPerCostomerLetter(String dateOfCastingAsPerCostomerLetter) {
		this.dateOfCastingAsPerCostomerLetter = dateOfCastingAsPerCostomerLetter;
	}
	public String getDateOfTesting() {
		return dateOfTesting;
	}
	public void setDateOfTesting(String dateOfTesting) {
		this.dateOfTesting = dateOfTesting;
	}
	public String getAgeOfSpecimenInDays() {
		return ageOfSpecimenInDays;
	}
	public void setAgeOfSpecimenInDays(String ageOfSpecimenInDays) {
		this.ageOfSpecimenInDays = ageOfSpecimenInDays;
	}
	public String getDimensionOfSpecimeInCm() {
		return dimensionOfSpecimeInCm;
	}
	public void setDimensionOfSpecimeInCm(String dimensionOfSpecimeInCm) {
		this.dimensionOfSpecimeInCm = dimensionOfSpecimeInCm;
	}
	public String getCrossSectionalAreaInSqCm() {
		return crossSectionalAreaInSqCm;
	}
	public void setCrossSectionalAreaInSqCm(String crossSectionalAreaInSqCm) {
		this.crossSectionalAreaInSqCm = crossSectionalAreaInSqCm;
	}
	public String getCompressensiveStrength() {
		return compressensiveStrength;
	}
	public void setCompressensiveStrength(String compressensiveStrength) {
		this.compressensiveStrength = compressensiveStrength;
	}
	public String getObserved() {
		return observed;
	}
	public void setObserved(String observed) {
		this.observed = observed;
	}
	public String getSpecifiedFor28DaysCuring() {
		return specifiedFor28DaysCuring;
	}
	public void setSpecifiedFor28DaysCuring(String specifiedFor28DaysCuring) {
		this.specifiedFor28DaysCuring = specifiedFor28DaysCuring;
	}

	public String getObservedFirst() {
		return observedFirst;
	}

	public void setObservedFirst(String observedFirst) {
		this.observedFirst = observedFirst;
	}

	public String getObservedSecond() {
		return observedSecond;
	}

	public void setObservedSecond(String observedSecond) {
		this.observedSecond = observedSecond;
	}

	public String getObservedThird() {
		return observedThird;
	}

	public void setObservedThird(String observedThird) {
		this.observedThird = observedThird;
	} 
	
	
	
}
