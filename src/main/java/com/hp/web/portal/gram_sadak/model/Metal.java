package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class Metal extends TestResultSheet{

	private List<MetalMapping> metalMappingList;

	public List<MetalMapping> getMetalMappingList() {
		return metalMappingList;
	}

	public void setMetalMappingList(List<MetalMapping> metalMappingList) {
		this.metalMappingList = metalMappingList;
	}
}
