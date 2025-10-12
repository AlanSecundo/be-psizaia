package com.psizaia.app.controllers;

import com.psizaia.app.dtos.PatientCreateRequest;
import com.psizaia.app.dtos.PatientResponse;
import com.psizaia.app.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

	private final PatientService patientService;

	public PatientController(final PatientService patientService) {
		this.patientService = patientService;
	}

	@PostMapping
	public ResponseEntity<PatientResponse> create(@Valid @RequestBody final PatientCreateRequest request) {
		final PatientResponse created = patientService.create(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}
}

