package com.clinic.service;

import java.time.LocalDate;
import java.util.List;

import com.clinic.model.enums.Role;
import com.clinic.model.order.Order;
import com.clinic.model.order.OrderItem;
import com.clinic.model.person.Patient;
import com.clinic.model.person.User;

public class OrderService {

    public Order createOrder(Patient patient, User doctor, List<OrderItem> items) {

        // 1. Validar que el doctor no sea null
        if (doctor == null) {
            throw new IllegalArgumentException("El doctor no puede ser null");
        }

        // 2. Validar que el rol sea DOCTOR
        if (doctor.getRole() != Role.DOCTOR) {
            throw new IllegalArgumentException("Solo un doctor puede crear ordenes");
        }

        // 3. Validar paciente
        if (patient == null) {
            throw new IllegalArgumentException("El paciente no puede ser null");
        }

        // 4. Validar que tenga items
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("La orden debe tener al menos un item");
        }

        // 5. Crear la orden si todo está correcto
        Order order = new Order();
        order.setPatient(patient);
        order.setDoctor(doctor);
        order.setDate(LocalDate.now());
        order.setItems(items);

        return order;
    }

}
