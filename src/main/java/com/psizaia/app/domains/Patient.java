package com.psizaia.app.domains;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "patients")
public class Patient {

	@Id
	@UuidGenerator
	@GeneratedValue
	private UUID id;

	@Embedded
	private Identification identification;

	@Embedded
	private Contact contact;

	@Embedded
	private EmergencyContact emergencyContact;

	@Embedded
	private Clinical clinical;

	@Embedded
	private Billing billing;

	@Embedded
	private Insurance insurance;

	@Embedded
	private OriginNotes originNotes;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Identification getIdentification() {
		return identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public EmergencyContact getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public Clinical getClinical() {
		return clinical;
	}

	public void setClinical(Clinical clinical) {
		this.clinical = clinical;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public OriginNotes getOriginNotes() {
		return originNotes;
	}

	public void setOriginNotes(OriginNotes originNotes) {
		this.originNotes = originNotes;
	}
}

