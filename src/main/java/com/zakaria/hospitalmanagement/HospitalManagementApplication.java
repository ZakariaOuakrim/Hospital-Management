package com.zakaria.hospitalmanagement;

import com.zakaria.hospitalmanagement.entities.Patient;
import com.zakaria.hospitalmanagement.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalManagementApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient( null,"Zakaria", new Date(), true, 10));
        patientRepository.save(new Patient( null,"Hassan", new Date(), false, 20));
        patientRepository.save(new Patient( null,"Ali", new Date(), true, 30));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p -> System.out.println(p.toString()));
    }
}
