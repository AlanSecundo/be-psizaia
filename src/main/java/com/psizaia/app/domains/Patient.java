package com.psizaia.app.domains;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "patients")
@Data
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
}

