package com.psizaia.app.exceptions;

public class PatientNotFoundException extends RuntimeException {
	public PatientNotFoundException(final String message) {
		super(message);
	}
}

