package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Insurance {

	@Column
	private Boolean hasInsurance;

	@Column
	private String insurancePlan;

	@Column
	private String insuranceCardNumber;

	public Boolean getHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(Boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public String getInsuranceCardNumber() {
		return insuranceCardNumber;
	}

	public void setInsuranceCardNumber(String insuranceCardNumber) {
		this.insuranceCardNumber = insuranceCardNumber;
	}
}


