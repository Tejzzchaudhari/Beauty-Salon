package com.salon.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.salon.repository.AppointmentRepository;  // ✅ Correct Import
import com.salon.model.Appointment;  // ✅ Ensure Appointment model exists

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Allows frontend requests
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepo;  // ✅ Correct field name

    @PostMapping("/appointment")
    public ResponseEntity<String> bookAppointment(@RequestBody Appointment appointment) {
        appointmentRepo.save(appointment);
        return ResponseEntity.ok("Appointment booked successfully for " + appointment.getName());
    }

    @GetMapping("/appointments")
    public List<Appointment> getAppointments() {
        return appointmentRepo.findAll();
    }
}
