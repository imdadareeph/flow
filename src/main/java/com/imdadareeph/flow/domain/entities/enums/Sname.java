package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Sname {
	OR_SERVICE("OR_SERVICE"),
	OF_SERVICE("OF_SERVICE"),
	ON_SERVICE("ON_SERVICE"),
	FR_SERVICE("ON_SERVICE"),
	AF_SERVICE("AF_SERVICE"),
	AR_SERVICE("AR_SERVICE"),
	UN_SERVICE("UN_SERVICE");

	@Getter
	private String value;
}
