package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OriginNotes {

	@Column
	private String origin;

	@Column(columnDefinition = "text")
	private String internalNotes;
}


