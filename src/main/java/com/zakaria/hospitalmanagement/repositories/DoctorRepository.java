package com.zakaria.hospitalmanagement.repositories;

import com.zakaria.hospitalmanagement.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
