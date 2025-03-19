package com.zakaria.hospitalmanagement;

import com.zakaria.hospitalmanagement.entities.Doctor;
import com.zakaria.hospitalmanagement.entities.Patient;
import com.zakaria.hospitalmanagement.repositories.DoctorRepository;
import com.zakaria.hospitalmanagement.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalManagementApplication  {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalManagementApplication.class, args);
    }

   /* to use add: implements CommandLineRunner

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient( null,"Zakaria", new Date(), true, 10,null));
        patientRepository.save(new Patient( null,"Hassan", new Date(), false, 20,null));
        patientRepository.save(new Patient( null,"Ali", new Date(), true, 30,null));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p -> System.out.println(p.toString()));
        System.out.println("----------------------");
        List<Patient> patientsWithAInThereName= patientRepository.findByNameContains("z");
        patientsWithAInThereName.forEach(p -> System.out.println(p.toString()));
        System.out.println("**********************");
        List<Patient> patientsWithAInThereName2= patientRepository.search("%z%");
        patientsWithAInThereName2.forEach(p -> System.out.println(p.toString()));
        System.out.println("######################");
        List<Patient> patientsWithAInThereName3= patientRepository.findByScoreGreaterThan(10);
        patientsWithAInThereName3.forEach(p -> System.out.println(p.toString()));

    }*/
    @Bean
    CommandLineRunner start(PatientRepository patientRepository, DoctorRepository doctorRepository) {
        return args -> {
            Stream.of("Zakaria", "Hassan", "Ali").forEach(name -> {
                Patient patient = new Patient();
                patient.setName(name);
                patient.setBirthDate(new Date());
                patient.setSick(false);
                patient.setScore((int) (Math.random() * 100));
                patientRepository.save(patient);
            });
            Stream.of("Mohammed","Younes","Omar").forEach(name -> {
                Doctor doctor = new Doctor();
                doctor.setName(name);
                doctor.setSpeciality(Math.random()>0.5?"Dentist":"Ophtalmologist");
                doctorRepository.save(doctor);
            });
        };
    }
}
