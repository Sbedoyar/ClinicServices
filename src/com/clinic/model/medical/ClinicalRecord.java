package com.clinic.model.medical;

import java.time.LocalDate;

public class ClinicalRecord {
    private LocalDate date;
    private String doctorDocument;
    private String motive;
    private String symptomatology;
    private String diagnosis;
    
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDoctorDocument() {
		return doctorDocument;
	}
	public void setDoctorDocument(String doctorDocument) {
		this.doctorDocument = doctorDocument;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	public String getSymptomatology() {
		return symptomatology;
	}
	public void setSymptomatology(String symptomatology) {
		this.symptomatology = symptomatology;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
