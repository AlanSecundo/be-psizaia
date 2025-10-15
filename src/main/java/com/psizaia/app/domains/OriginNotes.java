package com.psizaia.app.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OriginNotes {

	@Column
	private String origin;

	@Column(columnDefinition = "text")
	private String internalNotes;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getInternalNotes() {
		return internalNotes;
	}

	public void setInternalNotes(String internalNotes) {
		this.internalNotes = internalNotes;
	}
}


