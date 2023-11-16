package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Ltype {
	E_CONSUME_L("E_CONSUME_L"),
	E_REQ_L("E_REQ_L"),
	E_REQ_T_L("E_REQ_T_L"),
	E_E_TIME_L("E_E_TIME_L"),
	E_EXCEPTION_L("E_EXCEPTION_L"),
	E_EXCEPTION_T_L("E_EXCEPTION_T_L"),
	EXT_REQ("EXT_REQ"),
	EXT_RES("EXT_RES"),
	INT_REQ("INT_REQ"),
	INT_RES("INT_RES");

	@Getter
	private String value;
}
