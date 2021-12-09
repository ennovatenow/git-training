package io.paycorp.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class ServiceStatus {
	
	@Id
	private String id;
	private String code;
	private String status;
	private LocalDate creationDate;
	private LocalDateTime creationTimestamp;
}
