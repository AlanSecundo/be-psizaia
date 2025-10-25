package com.psizaia.app.dtos;

import com.psizaia.app.domains.OnboardingStatus;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String keycloakUserId,
        OnboardingStatus onboardingStatus,
        String crp,
        String cpf
) {}


