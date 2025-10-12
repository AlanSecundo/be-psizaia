package com.psizaia.app.repositories;

import com.psizaia.app.domains.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {

	Optional<Patient> findByIdentificationCpf(String cpf);
}

