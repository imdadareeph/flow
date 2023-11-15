package com.imdadareeph.flow.controller;

import com.imdadareeph.flow.domain.dto.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/")
public class FlowController {

	@GetMapping("/")
	public List<Id> getAll() {
		Arrays.asList("IA", "RB");
		ArrayList<Id> idList = new ArrayList<>();
		ArrayList<Service> serviceList = new ArrayList<>();
		ArrayList<Event> eventList = new ArrayList<>();
		ArrayList<Api> apiList = new ArrayList<>();

		apiList.add(Api.builder()
				.apiName("GET_TKN")
				.url("http://test.tkn.com")
				.httpStatus("200")
				.level("INFO")
				.logType(LogType.builder()
					.request("req")
					.response("res")
					.build())
				.status("Success")
			.build());

		EventDetails eventDetails = EventDetails.builder()
			.startState("started")
			.eventName("CHAT_INITIATED")
			.api(apiList)
			.endState("completed")
			.build();

		eventList.add(Event.builder()
				.eventDetails(eventDetails)
			.build());

		serviceList.add(Service.builder()
				.name("CHAT-SERVICE")
				.status("Success")
				.events(eventList)
			.build());

		idList.add(Id.builder().environment("dev")
				.processingTime("1500ms")
				.value(UUID.randomUUID().toString())
				.service(serviceList)

			.build());
		return idList;
	}
}
