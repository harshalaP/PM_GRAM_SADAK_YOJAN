package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class Murum extends TestResultSheet {

	private List<MurumMapping> murumMappingList;

	public List<MurumMapping> getMurumMappingList() {
		return murumMappingList;
	}

	public void setMurumMappingList(List<MurumMapping> murumMappingList) {
		this.murumMappingList = murumMappingList;
	}
}
