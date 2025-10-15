package com.psizaia.app.services;

import com.psizaia.app.domains.Patient;
import com.psizaia.app.dtos.PatientCreateRequest;
import com.psizaia.app.dtos.PatientResponse;
import com.psizaia.app.repositories.PatientRepository;
import com.psizaia.app.mappers.PatientMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.psizaia.app.exceptions.ConflictException;

@Service
public class PatientService {

	private final PatientRepository patientRepository;

	public PatientService(final PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Transactional
	public PatientResponse create(final PatientCreateRequest request) {
		patientRepository.findByIdentificationCpf(request.identification().cpf()).ifPresent(existingPatient -> {
			throw new ConflictException("CPF já cadastrado");
		});
		final Patient entity = PatientMapper.toEntity(request);
		final Patient saved = patientRepository.save(entity);
		return PatientMapper.toResponse(saved);
	}
}

