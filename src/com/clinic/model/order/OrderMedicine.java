package com.clinic.model.order;

public class OrderMedicine extends OrderItem{

    private String dose;
    private String duration;
    
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
