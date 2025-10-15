package com.psizaia.app.dtos;

import jakarta.validation.constraints.NotNull;

public record PatientCreateRequest(
		@NotNull IdentificationInfo identification,
		@NotNull ContactInfo contact,
		EmergencyContactInfo emergencyContact,
		ClinicalInfo clinical,
		BillingInfo billing,
		InsuranceInfo insurance,
		OriginNotesInfo originNotes
) {}

