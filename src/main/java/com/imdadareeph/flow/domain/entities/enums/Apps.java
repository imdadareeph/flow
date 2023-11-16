package com.imdadareeph.flow.domain.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public enum Apps {
	// OR_SERVICE OF_SERVICE ON_SERVICE ON_SERVICE AF_SERVICE AR_SERVICE UN_SERVICE
	API_AUTH("API_AUTH"),
	// OR_SERVICE OF_SERVICE ON_SERVICE ON_SERVICE AF_SERVICE AR_SERVICE UN_SERVICE
	//-----------------------------------------------------------------------------
	API_GO("API_GO"),
	API_GQ("API_GQ"),
	API_CP("API_CP"),
	API_RP("API_RP"),
	API_CT("API_CT"),
	API_UO("API_UO"),
	//-----------------------------------------------------------------------------

	API_FR("API_FR"),
	API_N("API_N"),



	// OR_SERVICE OF_SERVICE ON_SERVICE ON_SERVICE AF_SERVICE AR_SERVICE UN_SERVICE
	API_CONUMER("API_CONUMER"),
	// OR_SERVICE OF_SERVICE ON_SERVICE ON_SERVICE AF_SERVICE AR_SERVICE UN_SERVICE
	API_TIMER("API_TIMER");

	@Getter
	private String value;
}
