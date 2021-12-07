package com.hp.web.portal.gram_sadak.service;

import java.util.ArrayList;
import java.util.List;

import com.hp.web.portal.gram_sadak.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hp.web.portal.gram_sadak.repository.JobRepository;
import com.hp.web.portal.gram_sadak.repository.TransactionRepository;

@Service
public class FormService implements IFormService {
	
	Logger LOG = LogManager.getLogger(FormService.class);
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public String index(Model model) {
		return "index";
	}
		
	@Override
	public String testResultConcreteCubes(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		ConcreteCubes concreteCubes = new ConcreteCubes();
		concreteCubes.setTransactionId(transactionId);
		concreteCubes.setJobId(jobId);

		List<ConcreteCubesMapping> concreteCubesMappingList = new ArrayList<>();

		concreteCubesMappingList.add(new ConcreteCubesMapping("1"));
		concreteCubesMappingList.add(new ConcreteCubesMapping("2"));
		concreteCubesMappingList.add(new ConcreteCubesMapping("3"));

		concreteCubes.setConcreteCubesMappingList(concreteCubesMappingList);

		model.addAttribute("testResultSheet", concreteCubes);

		return "concreteCubesResultSheet";
	}

	@Override
	public String testResultBricks(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Bricks bricks = new Bricks();
		bricks.setTransactionId(transactionId);
		bricks.setJobId(jobId);

		List<BricksMapping> bricksMappingList = new ArrayList<>();
		bricksMappingList.add( new BricksMapping(("1")));

		bricks.setBricksMappingList(bricksMappingList);

		model.addAttribute("testResultSheet", bricks);

		return "bricksTestResultSheet";
	}

	@Override
	public String testResultConcretePaverBlock(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		PaverBlock paverBlock = new PaverBlock();
		paverBlock.setTransactionId(transactionId);
		paverBlock.setJobId(jobId);

		List<PaverBlockMapping> paverBlockMappingList = new ArrayList<>();
		paverBlockMappingList.add( new PaverBlockMapping(("1")));

		paverBlock.setPaverBlockMappingList(paverBlockMappingList);

		model.addAttribute("testResultSheet", paverBlock);

		return "paverBlockTestResultSheet";
	}

	@Override
	public String testResultCrushedMetal(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		CrushedMetal crushedMetal = new CrushedMetal();
		crushedMetal.setTransactionId(transactionId);
		crushedMetal.setJobId(jobId);

		List<CrushedMetalMapping> crushedMetalMappingList = new ArrayList<>();
		crushedMetalMappingList.add( new CrushedMetalMapping(("1")));

		crushedMetal.setCrushedMetalMappingList(crushedMetalMappingList);

		model.addAttribute("testResultSheet", crushedMetal);

		return "crushedMetalTestResultSheet";
	}

	@Override
	public String testResultExtraction(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Extraction extraction = new Extraction();
		extraction.setTransactionId(transactionId);
		extraction.setJobId(jobId);

		List<ExtractionMapping> extractionMappingList = new ArrayList<>();
		extractionMappingList.add( new ExtractionMapping(("1")));

		extraction.setExtractionMappingList(extractionMappingList);

		model.addAttribute("testResultSheet", extraction);

		return "extractionTestResultSheet";
	}

	@Override
	public String testResultHBMetal(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		HBMetal hbMetal = new HBMetal();
		hbMetal.setTransactionId(transactionId);
		hbMetal.setJobId(jobId);

		List<HBMetalMapping> hbMetalMappingList = new ArrayList<>();
		hbMetalMappingList.add( new HBMetalMapping(("1")));

		hbMetal.setHbMetalMappingList(hbMetalMappingList);

		model.addAttribute("testResultSheet", hbMetal);

		return "hbMetalTestResultSheet";
	}

	@Override
	public String testResultMetal(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Metal metal = new Metal();
		metal.setTransactionId(transactionId);
		metal.setJobId(jobId);

		List<MetalMapping> metalMappingList = new ArrayList<>();
		metalMappingList.add( new MetalMapping(("1")));

		metal.setMetalMappingList(metalMappingList);

		model.addAttribute("testResultSheet", metal);

		return "metalTestResultSheet";
	}

	@Override
	public String testResultMurum(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Murum murum = new Murum();
		murum.setTransactionId(transactionId);
		murum.setJobId(jobId);

		List<MurumMapping> murumMappingList = new ArrayList<>();
		murumMappingList.add( new MurumMapping(("1")));

		murum.setMurumMappingList(murumMappingList);

		model.addAttribute("testResultSheet", murum);

		return "murumTestResultSheet";
	}

	@Override
	public String testResultPenetretion(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Penetretion penetretion = new Penetretion();
		penetretion.setTransactionId(transactionId);
		penetretion.setJobId(jobId);

		List<PenetretionMapping> penetretionMappingList = new ArrayList<>();
		penetretionMappingList.add( new PenetretionMapping(("1")));

		penetretion.setPenetretionMappingList(penetretionMappingList);

		model.addAttribute("testResultSheet", penetretion);

		return "penetretionTestResultSheet";
	}

	@Override
	public String testResultRubble(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Rubble rubble = new Rubble();
		rubble.setTransactionId(transactionId);
		rubble.setJobId(jobId);

		List<RubbleMapping> rubbleMappingList = new ArrayList<>();
		rubbleMappingList.add( new RubbleMapping(("1")));

		rubble.setRubbleMappingList(rubbleMappingList);

		model.addAttribute("testResultSheet", rubble);

		return "rubbleTestResultSheet";
	}

	@Override
	public String testResultSand(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Sand sand = new Sand();
		sand.setTransactionId(transactionId);
		sand.setJobId(jobId);

		List<SandMapping> sandMappingList = new ArrayList<>();
		sandMappingList.add( new SandMapping(("1")));

		sand.setSandMappingList(sandMappingList);

		model.addAttribute("testResultSheet", sand);

		return "sandTestResultSheet";
	}

	@Override
	public String testResultTiles(Model model) {
		Integer jobId = jobRepository.getNewJobId();
		Integer transactionId = transactionRepository.getNewTransactionId();

		Tiles tiles = new Tiles();
		tiles.setTransactionId(transactionId);
		tiles.setJobId(jobId);

		List<TilesMapping> tilesMappingList = new ArrayList<>();
		tilesMappingList.add( new TilesMapping(("1")));

		tiles.setTilesMappingList(tilesMappingList);

		model.addAttribute("testResultSheet", tiles);

		return "tilesTestResultSheet";
	}
}
