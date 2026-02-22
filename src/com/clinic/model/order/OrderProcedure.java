package com.clinic.model.order;

import com.clinic.model.enums.SpecialistType;

public class OrderProcedure {
    private int quantity;
    private String frequency;
    private boolean requiresSpecialist;
    private SpecialistType specialistType;

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public boolean isRequiresSpecialist() {
		return requiresSpecialist;
	}
	public void setRequiresSpecialist(boolean requiresSpecialist) {
		this.requiresSpecialist = requiresSpecialist;
	}
	public SpecialistType getSpecialistType() {
		return specialistType;
	}
	public void setSpecialistType(SpecialistType specialistType) {
		this.specialistType = specialistType;
	}

}
