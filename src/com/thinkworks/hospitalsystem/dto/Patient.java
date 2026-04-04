package com.thinkworks.hospitalsystem.dto;

public class Patient {
    private int patientId;
    private String patientName;
    private int patientAge;
    private String gender;
    private String disease;

    public Patient(int patientId, String patientName, int patientAge, String gender , String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
        this.disease=disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
