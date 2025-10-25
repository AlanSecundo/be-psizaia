package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Contact {

	@Column
	private String email;

	@Column
	private String phone;

	@Column
	private String address;

	@Column
	private String preferredContactMethod;
}


