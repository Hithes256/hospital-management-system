package com.hospital.service;

import com.hospital.model.Patient;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    private final PatientService service = new PatientService();

    @Test
    void testGetAllPatients() {
        List<Patient> patients = service.getAllPatients();

        assertNotNull(patients);
        assertEquals(2, patients.size());
        assertEquals("Ramesh", patients.get(0).getName());
    }
}
