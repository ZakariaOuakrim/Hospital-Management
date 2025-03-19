package com.zakaria.hospitalmanagement.service;

import com.zakaria.hospitalmanagement.entities.Appointment;
import com.zakaria.hospitalmanagement.entities.Consultation;
import com.zakaria.hospitalmanagement.entities.Doctor;
import com.zakaria.hospitalmanagement.entities.Patient;
import com.zakaria.hospitalmanagement.repositories.AppointmentRepository;
import com.zakaria.hospitalmanagement.repositories.ConsultationRepository;
import com.zakaria.hospitalmanagement.repositories.DoctorRepository;
import com.zakaria.hospitalmanagement.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private ConsultationRepository consultationRepository;
    private DoctorRepository doctorRepository;
    private AppointmentRepository appointmentRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository, DoctorRepository doctorRepository, AppointmentRepository appointmentRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Patient savePatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Doctor saveDoctor(Doctor d) {
        return doctorRepository.save(d);
    }

    @Override
    public Appointment saveAppointment(Appointment a) {
        return appointmentRepository.save(a);
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return consultationRepository.save(c);
    }
}
