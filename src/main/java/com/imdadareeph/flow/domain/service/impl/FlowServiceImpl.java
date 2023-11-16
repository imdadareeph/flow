package com.imdadareeph.flow.domain.service.impl;

import com.imdadareeph.flow.domain.entities.Flow;
import com.imdadareeph.flow.domain.repository.FlowRepository;
import com.imdadareeph.flow.domain.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowServiceImpl implements FlowService {

	@Autowired
	private FlowRepository flowRepository;

	@Override
	public Flow saveFlow(Flow flow) {
		return flowRepository.save(flow);
	}

	@Override
	public List<Flow> fetchAllFlows() {
		return (List<Flow>)flowRepository.findAll();
	}
}
