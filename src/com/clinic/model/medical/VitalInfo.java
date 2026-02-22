package com.clinic.model.medical;

public class VitalInfo {
    private String pressure;
    private String temperature;
    private String pulse;
    private String oxygenLevel;
    
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getPulse() {
		return pulse;
	}
	public void setPulse(String pulse) {
		this.pulse = pulse;
	}
	public String getOxygenLevel() {
		return oxygenLevel;
	}
	public void setOxygenLevel(String oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}
}
