package com.hp.web.portal.gram_sadak.endpoints;

import com.hp.web.portal.gram_sadak.model.*;
import com.hp.web.portal.gram_sadak.service.IPdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PDFController {
	
	@Autowired
	private IPdfService pdfService;

	@RequestMapping(path = "/testResultSheet/pdf/concreteCubesResultSheetPdf")
    public ResponseEntity<?> generateConcreteCubesTestResultSheetPDF(@ModelAttribute ConcreteCubes concreteCubes, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(concreteCubes, request, response,"concreteCubesResultSheetPdf");
    }

	@RequestMapping(path = "/testResultSheet/pdf/bricksTestResultSheetPdf")
	public ResponseEntity<?> generateBricksTestResultSheetPDF(@ModelAttribute Bricks bricks, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(bricks, request, response,"bricksTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/paverBlockTestResultSheetPdf")
	public ResponseEntity<?> generatePaverBlockTestResultSheetPDF(@ModelAttribute PaverBlock paverBlock, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(paverBlock, request, response,"paverBlockTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/crushedMetalTestResultSheetPdf")
	public ResponseEntity<?> generateConcreteCubesTestResultSheetPDF(@ModelAttribute CrushedMetal crushedMetal, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(crushedMetal, request, response,"crushedMetalTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/extractionTestResultSheetPdf")
	public ResponseEntity<?> generateExtractionTestResultSheetPDF(@ModelAttribute Extraction extraction, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(extraction, request, response,"extractionTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/hbMetalTestResultSheetPdf")
	public ResponseEntity<?> generatePaverBlockTestResultSheetPDF(@ModelAttribute HBMetal hbMetal, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(hbMetal, request, response,"hbMetalTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/metalTestResultSheetPdf")
	public ResponseEntity<?> generateMetalTestResultSheetPDF(@ModelAttribute Metal metal, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(metal, request, response,"metalTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/murumTestResultSheetPdf")
	public ResponseEntity<?> generateMurumTestResultSheetPDF(@ModelAttribute Murum murum, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(murum, request, response,"murumTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/penetretionTestResultSheetPdf")
	public ResponseEntity<?> generatePaverBlockTestResultSheetPDF(@ModelAttribute Penetretion penetretion, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(penetretion, request, response,"penetretionTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/rubbleTestResultSheetPdf")
	public ResponseEntity<?> generateConcreteCubesTestResultSheetPDF(@ModelAttribute Rubble rubble, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(rubble, request, response,"rubbleTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/sandTestResultSheetPdf")
	public ResponseEntity<?> generateBricksTestResultSheetPDF(@ModelAttribute Sand sand, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(sand, request, response,"sandTestResultSheetPdf");
	}

	@RequestMapping(path = "/testResultSheet/pdf/tilesTestResultSheetPdf")
	public ResponseEntity<?> generatePaverBlockTestResultSheetPDF(@ModelAttribute Tiles tiles, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return pdfService.generateTestResultSheetPDF(tiles, request, response,"tilesTestResultSheetPdf");
	}
}
