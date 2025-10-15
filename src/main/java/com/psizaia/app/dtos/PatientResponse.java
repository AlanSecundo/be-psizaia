package com.psizaia.app.dtos;

import java.util.UUID;

public record PatientResponse(
		UUID id,
		IdentificationInfo identification,
		ContactInfo contact,
		EmergencyContactInfo emergencyContact,
		ClinicalInfo clinical,
		BillingInfo billing,
		InsuranceInfo insurance,
		OriginNotesInfo originNotes
) {}

