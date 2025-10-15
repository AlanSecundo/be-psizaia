package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Billing {

	@Column
	private String paymentMethod;

	@Column
	private String receiptDocument;

	@Column
	private Integer dueDay;

	@Column
	private String sessionPrice;

	@Column
	private Integer sessionsPerMonth;

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getReceiptDocument() {
		return receiptDocument;
	}

	public void setReceiptDocument(String receiptDocument) {
		this.receiptDocument = receiptDocument;
	}

	public Integer getDueDay() {
		return dueDay;
	}

	public void setDueDay(Integer dueDay) {
		this.dueDay = dueDay;
	}

	public String getSessionPrice() {
		return sessionPrice;
	}

	public void setSessionPrice(String sessionPrice) {
		this.sessionPrice = sessionPrice;
	}

	public Integer getSessionsPerMonth() {
		return sessionsPerMonth;
	}

	public void setSessionsPerMonth(Integer sessionsPerMonth) {
		this.sessionsPerMonth = sessionsPerMonth;
	}
}


