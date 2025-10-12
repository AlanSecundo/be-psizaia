package com.psizaia.app.dtos;

public record ClinicalInfo(
		String initialComplaint,
		String currentMedications,
		String currentPhysicianName,
		String currentPhysicianSpecialty,
		String currentPhysicianPhone
) {}


