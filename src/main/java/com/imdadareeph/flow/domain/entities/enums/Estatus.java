package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Estatus {
	STARTED("STARTED"),
	PENDING("PENDING"),
	COMPLETED("COMPLETED");

	@Getter
	private String value;
}
