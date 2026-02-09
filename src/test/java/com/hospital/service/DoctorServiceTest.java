package com.hospital.service;

import com.hospital.model.Doctor;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoctorServiceTest {

    private final DoctorService service = new DoctorService();

    @Test
    void testGetAllDoctors() {
        List<Doctor> doctors = service.getAllDoctors();

        assertNotNull(doctors);
        assertEquals(2, doctors.size());
        assertEquals("Dr. Sharma", doctors.get(0).getName());
    }
}
