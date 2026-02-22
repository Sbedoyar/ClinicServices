package com.clinic;

import java.util.ArrayList;
import java.util.List;

import com.clinic.model.enums.Role;
import com.clinic.model.order.Order;
import com.clinic.model.order.OrderItem;
import com.clinic.model.order.OrderMedicine;
import com.clinic.model.person.Patient;
import com.clinic.model.person.User;
import com.clinic.service.OrderService;

public class Main {
    public static void main(String[] args) {
    // 1️⃣ Crear paciente
    Patient patient = new Patient();
    patient.setName("Carlos Perez");
    patient.setDocument("123");

    // 2️⃣ Crear doctor
    User doctor = new User();
    doctor.setName("Dr. Lopez");
    doctor.setRole(Role.DOCTOR);

    // 3️⃣ Crear lista de items
    List<OrderItem> items = new ArrayList<>();

    OrderMedicine medicine = new OrderMedicine();
    medicine.setDose("1 cada 8 horas");
    items.add(medicine);

    // 4️⃣ Crear el servicio
    OrderService service = new OrderService();

    // 5️⃣ Intentar crear la orden
    try {
        Order order = service.createOrder(patient, doctor, items);
        System.out.println("===== ORDEN =====");
        System.out.println("Paciente: " + order.getPatient().getName());
        System.out.println("Documento: " + order.getPatient().getDocument());
        System.out.println("Doctor: " + order.getDoctor().getName());
        System.out.println("Fecha: " + order.getDate());

        System.out.println("Items:");
        for (OrderItem item : order.getItems()) {
            System.out.println("- Tipo: " + item.getClass().getSimpleName());
    }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}
