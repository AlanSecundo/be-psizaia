package com.psizaia.app.dtos;

public record BillingInfo(
		String paymentMethod,
		String receiptDocument,
		Integer dueDay,
		String sessionPrice,
		Integer sessionsPerMonth
) {}


