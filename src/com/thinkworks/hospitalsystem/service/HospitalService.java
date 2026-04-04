package com.thinkworks.hospitalsystem.service;

import com.thinkworks.hospitalsystem.dto.Appointment;
import com.thinkworks.hospitalsystem.dto.Doctor;
import com.thinkworks.hospitalsystem.dto.Patient;

public class HospitalService {
    public static final String HOSPITAL_NAME="YOU'LL DIEEEE";

    public void printPatientDetails(Patient patient){
        System.out.println("Patient Details");
        System.out.println("ID : "+patient.getPatientId());
        System.out.println("Name : "+patient.getPatientName());
        System.out.println("Age : "+patient.getPatientAge());
        System.out.println("Disease : "+patient.getDisease());
        System.out.println("Gender : "+patient.getGender());
    }

    public void printDoctorDetails(Doctor doctor){
        System.out.println("Doctor Details");
        System.out.println("ID : "+doctor.getDoctorId());
        System.out.println("Name : "+doctor.getDoctorName());
        System.out.println("Specialization : "+doctor.getSpecialization());
        System.out.println("Fee : "+doctor.getConsultationFee());
    }

    public void printAppointmentDetails(Appointment appointment){
        System.out.println("Appointment Details");
        System.out.println("Patient Name : "+appointment.getPatient().getPatientName());
        System.out.println("Doctor Name : "+appointment.getDoctor().getDoctorName());
        System.out.println("Date : "+appointment.getAppointmentDate());
    }

    public double calculateTotalFee(Appointment[] appointments){
        double calculateTotalFee = 0;
        for(Appointment appointment:appointments){
            calculateTotalFee+=appointment.getDoctor().getConsultationFee();

        }
        return calculateTotalFee;
    }


}
