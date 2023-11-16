package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Etype {
	OR_OPAC("OR_OPAC"),
	OF_PPC("OF_PPC"),
	ON_OFC("ON_OFC"),
	FR_ORC("FR_ORC"),
	AF_APPC("AF_APPC"),
	AR_FFC("AR_FFC");

	@Getter
	private String value;
}
