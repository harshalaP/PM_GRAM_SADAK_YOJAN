package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class Extraction extends TestResultSheet{

	private List<ExtractionMapping> extractionMappingList;

	public List<ExtractionMapping> getExtractionMappingList() {
		return extractionMappingList;
	}

	public void setExtractionMappingList(List<ExtractionMapping> extractionMappingList) {
		this.extractionMappingList = extractionMappingList;
	}
}
