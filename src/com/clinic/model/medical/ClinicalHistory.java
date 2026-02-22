package com.clinic.model.medical;

import java.time.LocalDate;
import java.util.Map;

public class ClinicalHistory {
    // Key: patient document
    // SubKey: date of attention
    private Map<String, Map<LocalDate, ClinicalRecord>> records;

	public Map<String, Map<LocalDate, ClinicalRecord>> getRecords() {
		return records;
	}
	public void setRecords(Map<String, Map<LocalDate, ClinicalRecord>> records) {
		this.records = records;
	}

}
