package com.clinic.model.billing;

import java.time.LocalDate;

public class Policy {
    private int id;
    private Company company;
    private boolean active;
    private LocalDate vigency;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public LocalDate getVigency() {
        return vigency;
    }
    public void setVigency(LocalDate vigency) {
        this.vigency = vigency;
    }

}
