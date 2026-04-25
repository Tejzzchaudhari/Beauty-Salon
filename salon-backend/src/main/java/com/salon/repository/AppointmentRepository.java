package com.salon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salon.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @SuppressWarnings({ "unchecked", "null" })
    Appointment save(Appointment appointment);

    @SuppressWarnings("null")
    List<Appointment> findAll();
}
