package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmergencyContact {

	@Column
	private String emergencyContactName;

	@Column
	private String emergencyContactRelationship;

	@Column
	private String emergencyContactPhone;

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactRelationship() {
		return emergencyContactRelationship;
	}

	public void setEmergencyContactRelationship(String emergencyContactRelationship) {
		this.emergencyContactRelationship = emergencyContactRelationship;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
}


