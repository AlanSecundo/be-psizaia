package com.psizaia.app.repositories;

import com.psizaia.app.domains.Psychologist;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsychologistRepository extends JpaRepository<Psychologist, UUID> {
    Optional<Psychologist> findByCpf(String cpf);
    Optional<Psychologist> findByCrp(String crp);
}


