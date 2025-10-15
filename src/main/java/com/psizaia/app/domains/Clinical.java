package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
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

	public String getInitialComplaint() {
		return initialComplaint;
	}

	public void setInitialComplaint(String initialComplaint) {
		this.initialComplaint = initialComplaint;
	}

	public String getCurrentMedications() {
		return currentMedications;
	}

	public void setCurrentMedications(String currentMedications) {
		this.currentMedications = currentMedications;
	}

	public String getCurrentPhysicianName() {
		return currentPhysicianName;
	}

	public void setCurrentPhysicianName(String currentPhysicianName) {
		this.currentPhysicianName = currentPhysicianName;
	}

	public String getCurrentPhysicianSpecialty() {
		return currentPhysicianSpecialty;
	}

	public void setCurrentPhysicianSpecialty(String currentPhysicianSpecialty) {
		this.currentPhysicianSpecialty = currentPhysicianSpecialty;
	}

	public String getCurrentPhysicianPhone() {
		return currentPhysicianPhone;
	}

	public void setCurrentPhysicianPhone(String currentPhysicianPhone) {
		this.currentPhysicianPhone = currentPhysicianPhone;
	}
}


