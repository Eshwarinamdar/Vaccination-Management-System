package com.app.dto;

import com.app.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StaffandAppointmentIdDTO {

	private Long id;
	private Long appointmentId;
}
