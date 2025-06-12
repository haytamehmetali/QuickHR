package com.quickhr.enums.company;

public enum ECompanyState {
    PENDING("Beklemede"),
    IN_REVIEW("İncelemede"),
    ACCEPTED("Kabul Edildi"),
    DELETED("Silindi"),
    DENIED("Reddedildi");
    
    private final String description;
    
    ECompanyState(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
