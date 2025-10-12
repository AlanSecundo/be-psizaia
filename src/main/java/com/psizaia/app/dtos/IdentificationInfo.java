package com.psizaia.app.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record IdentificationInfo(
		String fullName,
		String socialName,
		@JsonFormat(pattern = "dd/MM/yyyy") LocalDate birthDate,
		String gender,
		String maritalStatus,
		String cpf,
		Boolean over18
) {}


