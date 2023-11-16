package com.imdadareeph.flow.domain.service;

import com.imdadareeph.flow.domain.entities.Flow;

import java.util.List;

public interface FlowService {
	Flow saveFlow(Flow flow);
	List<Flow> fetchAllFlows();
}
