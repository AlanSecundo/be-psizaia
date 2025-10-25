package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
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
}


