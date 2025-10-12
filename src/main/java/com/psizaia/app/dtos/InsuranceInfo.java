package com.psizaia.app.dtos;

public record InsuranceInfo(
		Boolean hasInsurance,
		String insurancePlan,
		String insuranceCardNumber
) {}


