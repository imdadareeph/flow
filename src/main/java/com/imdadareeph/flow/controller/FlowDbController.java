package com.imdadareeph.flow.controller;

import com.imdadareeph.flow.domain.entities.Flow;
import com.imdadareeph.flow.domain.entities.enums.Ltype;
import com.imdadareeph.flow.domain.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static com.imdadareeph.flow.domain.util.ApplicationUtil.getCurrTime;
import static com.imdadareeph.flow.domain.util.PredicateUtil.*;

@RestController
public class FlowDbController {
	@Autowired
	private FlowService flowService;


	// Save operation
	@PostMapping("/save")
	public Flow saveFlow(
		@RequestBody Flow flow) {
		LocalDateTime.now();
		flow.setEtime(getCurrTime());
		updateProcessingTime(flow);
		updateHttpMethod(flow);
		updateEStatus(flow);
		return flowService.saveFlow(flow);
	}


	// Read operation
	@GetMapping("/allFlows")
	public List<Flow> fetchDepartmentList() {
		return flowService.fetchAllFlows();
	}
}
