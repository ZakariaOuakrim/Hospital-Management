package com.zakaria.hospitalmanagement.repositories;

import com.zakaria.hospitalmanagement.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByNameContains(String name);

    List<Patient> findByScoreGreaterThan(int score);

    @Query("SELECT p from Patient p where p.name like :x")
    List<Patient> search(@Param("x") String mc);
}
