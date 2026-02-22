package com.clinic.model.order;

import java.time.LocalDate;
import java.util.List;

import com.clinic.model.person.Patient;
import com.clinic.model.person.User;

public class Order {
    private int id;
    private LocalDate date;
    private Patient patient;
    private User doctor;
    private List<OrderItem> items;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public User getDoctor() {
		return doctor;
	}
	public void setDoctor(User doctor) {
		this.doctor = doctor;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

}
