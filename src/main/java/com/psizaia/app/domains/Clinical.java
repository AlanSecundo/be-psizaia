package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Clinical {

	@Column(columnDefinition = "text")
	private String initialComplaint;

	@Column(columnDefinition = "text")
	private String currentMedications;

	@Column
	private String currentPhysicianName;

	@Column
	private String currentPhysicianSpecialty;

	@Column
	private String currentPhysicianPhone;
}


