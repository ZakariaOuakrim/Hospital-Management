package com.zakaria.hospitalmanagement.service;

import com.zakaria.hospitalmanagement.entities.Appointment;
import com.zakaria.hospitalmanagement.entities.Consultation;
import com.zakaria.hospitalmanagement.entities.Doctor;
import com.zakaria.hospitalmanagement.entities.Patient;

public interface IHospitalService {

    Patient savePatient(Patient p);

    Doctor saveDoctor(Doctor d);

    Appointment saveAppointment(Appointment a);

    Consultation saveConsultation(Consultation c);
}
