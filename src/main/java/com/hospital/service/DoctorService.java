package com.hospital.service;

import com.hospital.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        return Arrays.asList(
                new Doctor(1, "Dr. Sharma", "Cardiology"),
                new Doctor(2, "Dr. Rao", "Neurology")
        );
    }
}
