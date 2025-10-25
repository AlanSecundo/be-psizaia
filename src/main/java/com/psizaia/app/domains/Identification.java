package com.psizaia.app.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.time.LocalDate;
import lombok.Data;

@Embeddable
@Data
public class Identification {

	@Column(nullable = false)
	private String fullName;

	@Column
	private String socialName;

	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;

	@Column
	private String gender;

	@Column
	private String maritalStatus;

	@Column(unique = true)
	private String cpf;

	@Column
	private Boolean over18;
}


