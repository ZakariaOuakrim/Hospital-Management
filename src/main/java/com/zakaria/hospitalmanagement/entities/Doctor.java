package com.zakaria.hospitalmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String speciality;
    private String email;
    @OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY)
    private Collection<Appointment> appointments;
}
