package com.psizaia.app.configs;

import com.psizaia.app.exceptions.ConflictException;
import com.psizaia.app.exceptions.PatientNotFoundException;
import com.psizaia.app.utils.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;

import java.time.OffsetDateTime;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseEntity<ApiError> handleNotFound(final PatientNotFoundException ex, final ServletWebRequest req) {
		final ApiError body = new ApiError(req.getRequest().getRequestURI(), HttpStatus.NOT_FOUND.value(),
				"Not Found", ex.getMessage(), OffsetDateTime.now(), List.of());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	}

	@ExceptionHandler(ConflictException.class)
	public ResponseEntity<ApiError> handleConflict(final ConflictException ex, final ServletWebRequest req) {
		final ApiError body = new ApiError(req.getRequest().getRequestURI(), HttpStatus.CONFLICT.value(),
				"Conflict", ex.getMessage(), OffsetDateTime.now(), List.of());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
	}
}

