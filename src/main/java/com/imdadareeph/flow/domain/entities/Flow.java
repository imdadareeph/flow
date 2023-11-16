package com.imdadareeph.flow.domain.entities;

import com.imdadareeph.flow.domain.entities.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flow {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLOW_ID")
	private Long flowid;

	@Column(name = "E_TIME")
	private String etime;

	@Column(name = "O_ID")
	private String oid;

	@Column(name = "C_ID")
	private String cid;

	@Column(name = "T_ID")
	private String tid;

	@Enumerated(EnumType.STRING)
	@Column(name = "S_NAME")
	private Sname sname;

	@Enumerated(EnumType.STRING)
	@Column(name = "E_TYPE")
	private Etype etype;

	@Enumerated(EnumType.STRING)
	@Column(name = "E_STATUS")
	private Estatus estatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "APPS")
	private Apps apps;

	@Column(name = "P_TIME")
	private String ptime;

	@Enumerated(EnumType.STRING)
	@Column(name = "L_LEVEL")
	private Llevel llevel;

	@Enumerated(EnumType.STRING)
	@Column(name = "L_TYPE")
	private Ltype ltype;

	@Enumerated(EnumType.STRING)
	@Column(name = "H_METHOD")
	private Hmethod hmethod;

	@Column(name = "OUTPUT")
	private String output;

	@Column(name = "SEQ")
	private Long seq;
}
