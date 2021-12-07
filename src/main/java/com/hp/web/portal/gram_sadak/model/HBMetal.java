package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class HBMetal extends TestResultSheet{

	private List<HBMetalMapping> hbMetalMappingList;

	public List<HBMetalMapping> getHbMetalMappingList() {
		return hbMetalMappingList;
	}

	public void setHbMetalMappingList(List<HBMetalMapping> hbMetalMappingList) {
		this.hbMetalMappingList = hbMetalMappingList;
	}
}
