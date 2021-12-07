package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class Sand extends TestResultSheet {

	private List<SandMapping> sandMappingList;

	public List<SandMapping> getSandMappingList() {
		return sandMappingList;
	}

	public void setSandMappingList(List<SandMapping> sandMappingList) {
		this.sandMappingList = sandMappingList;
	}
}
