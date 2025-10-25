package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmergencyContact {

	@Column
	private String emergencyContactName;

	@Column
	private String emergencyContactRelationship;

	@Column
	private String emergencyContactPhone;
}


