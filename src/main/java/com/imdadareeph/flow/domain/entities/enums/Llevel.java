package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Llevel {
	INFO("INFO"),
	ERROR("ERROR"),
	WARN("WARN");

	@Getter
	private String value;
}
