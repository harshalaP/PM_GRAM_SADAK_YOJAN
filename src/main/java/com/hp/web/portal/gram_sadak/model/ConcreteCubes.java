package com.hp.web.portal.gram_sadak.model;

import java.util.List;

public class ConcreteCubes extends TestResultSheet{

    public List<ConcreteCubesMapping> concreteCubesMappingList;

    public List<ConcreteCubesMapping> getConcreteCubesMappingList() {
        return concreteCubesMappingList;
    }

    public void setConcreteCubesMappingList(List<ConcreteCubesMapping> concreteCubesMappingList) {
        this.concreteCubesMappingList = concreteCubesMappingList;
    }
}
