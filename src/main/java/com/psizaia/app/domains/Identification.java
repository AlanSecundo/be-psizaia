package com.psizaia.app.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSocialName() {
		return socialName;
	}

	public void setSocialName(String socialName) {
		this.socialName = socialName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getOver18() {
		return over18;
	}

	public void setOver18(Boolean over18) {
		this.over18 = over18;
	}
}


