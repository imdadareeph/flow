package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Hmethod {
	GET("GET"),
	POST("POST"),
	PATCH("PATCH"),
	DELETE("DELETE"),
	NA("NA"),
	PUT("PUT");

	@Getter
	private String value;
}
