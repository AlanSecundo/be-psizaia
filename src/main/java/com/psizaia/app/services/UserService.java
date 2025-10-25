package com.psizaia.app.services;

import com.psizaia.app.domains.Psychologist;
import com.psizaia.app.domains.User;
import com.psizaia.app.dtos.UserCreateRequest;
import com.psizaia.app.dtos.UserResponse;
import com.psizaia.app.repositories.PsychologistRepository;
import com.psizaia.app.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final KeycloakService keycloakService;
    private final UserRepository userRepository;
    private final PsychologistRepository psychologistRepository;

    public UserService(
            final KeycloakService keycloakService,
            final UserRepository userRepository,
            final PsychologistRepository psychologistRepository
    ) {
        this.keycloakService = keycloakService;
        this.userRepository = userRepository;
        this.psychologistRepository = psychologistRepository;
    }

    @Transactional
    public UserResponse create(final UserCreateRequest request) {
        final String keycloakUserId = keycloakService.createUser(
                request.fullName(),
                request.email(),
                request.password()
        );

        final User user = new User();
        user.setKeycloakUserId(keycloakUserId);
        final User savedUser = userRepository.save(user);

        final Psychologist psychologist = new Psychologist();
        psychologist.setUser(savedUser);
        psychologist.setCrp(request.crp());
        psychologist.setCpf(request.cpf());
        final Psychologist savedPsychologist = psychologistRepository.save(psychologist);

        return new UserResponse(
                savedUser.getId(),
                savedUser.getKeycloakUserId(),
                savedUser.getOnboardingStatus(),
                savedPsychologist.getCrp(),
                savedPsychologist.getCpf()
        );
    }
}


