package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Insurance {

	@Column
	private Boolean hasInsurance;

	@Column
	private String insurancePlan;

	@Column
	private String insuranceCardNumber;
}


