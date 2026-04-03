package com.thinkworks.hospitalsystem.dto;

public class Patient {
    private int patientId;
    private String patientName;
    private int patientAge;
    private String gender;

    public Patient(int patientId, String patientName, int patientAge, String gender) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
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
