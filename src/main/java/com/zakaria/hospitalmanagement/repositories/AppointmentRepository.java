package com.zakaria.hospitalmanagement.repositories;

import com.zakaria.hospitalmanagement.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
