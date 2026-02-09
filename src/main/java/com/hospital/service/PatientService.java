package com.hospital.service;

import com.hospital.model.Patient;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        return Arrays.asList(
                new Patient(1, "Ramesh", 45, "Diabetes"),
                new Patient(2, "Sita", 30, "Fever")
        );
    }
}
