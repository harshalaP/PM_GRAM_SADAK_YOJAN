package com.hp.web.portal.gram_sadak.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hp.web.portal.gram_sadak.service.IFormService;

@Controller
public class FormController {
	
	@Autowired
	private IFormService formService;
	
	@GetMapping("/")
	public String index(Model model) {
		return formService.index(model);
	}
	
	@GetMapping("/concreteCubesResultSheet")
	public String concreteCubesResultSheet(Model model) {
		return formService.testResultConcreteCubes(model);
	}

    @GetMapping("/bricksTestResultSheet")
    public String testResultBricks(Model model) {
        return formService.testResultBricks(model);
    }

	@GetMapping("/paverBlockTestResultSheet")
	public String testResultConcretePaverBlock(Model model) {
		return formService.testResultConcretePaverBlock(model);
	}


	@GetMapping("/crushedMetalTestResultSheet")
	public String testResultCrushedMetal(Model model) {
		return formService.testResultCrushedMetal(model);
	}

	@GetMapping("/extractionTestResultSheet")
	public String testResultExtraction(Model model) {
		return formService.testResultExtraction(model);
	}


	@GetMapping("/hbMetalTestResultSheet")
	public String testResultHBMetal(Model model) {
		return formService.testResultHBMetal(model);
	}

	@GetMapping("/metalTestResultSheet")
	public String testResultMetal(Model model) {return formService.testResultMetal(model);}


	@GetMapping("/murumTestResultSheet")
	public String testResultMurum(Model model) {
		return formService.testResultMurum(model);
	}

	@GetMapping("/penetretionTestResultSheet")
	public String testResultPenetretion(Model model) {
		return formService.testResultPenetretion(model);
	}


	@GetMapping("/rubbleTestResultSheet")
	public String testResultRubble(Model model) {
		return formService.testResultRubble(model);
	}

	@GetMapping("/sandTestResultSheet")
	public String testResultSand(Model model) {
		return formService.testResultSand(model);
	}


	@GetMapping("/tilesTestResultSheet")
	public String testResultTiles(Model model) {
		return formService.testResultTiles(model);
	}

}
