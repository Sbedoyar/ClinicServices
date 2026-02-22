package com.clinic.model.order;

import com.clinic.model.enums.SpecialistType;

public class OrderSupportDiagnosis extends OrderItem {
    private int quantity;
    private boolean requiresSpecialist;
    private SpecialistType specialistType;

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
