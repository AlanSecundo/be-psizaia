package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Contact {

	@Column
	private String email;

	@Column
	private String phone;

	@Column
	private String address;

	@Column
	private String preferredContactMethod;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPreferredContactMethod() {
		return preferredContactMethod;
	}

	public void setPreferredContactMethod(String preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}
}


