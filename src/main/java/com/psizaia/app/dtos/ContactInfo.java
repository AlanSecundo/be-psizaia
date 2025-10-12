package com.psizaia.app.dtos;

public record ContactInfo(
		String email,
		String phone,
		String address,
		String preferredContactMethod
) {}


