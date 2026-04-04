package com.thinkworks.hospitalsystem.runner;

import com.thinkworks.hospitalsystem.dto.Appointment;
import com.thinkworks.hospitalsystem.dto.Doctor;
import com.thinkworks.hospitalsystem.dto.Patient;
import com.thinkworks.hospitalsystem.service.HospitalService;


public class MainRunner {
    public static void main(String[] args) {
        Patient patient1=new Patient(74,"Sadie",23,"Female","Comman Cold");
        Patient patient2=new Patient(653,"Gaten",24,"Male","Corona virus");
        Patient patient3=new Patient(534,"Noah",26,"Male","Phone Addiction");

        Doctor doctor1 =new Doctor(3432,"Milli","Gynecologist",364.98D);
        Doctor doctor2=new Doctor(734,"Mike","General",834.54D);

        Appointment appointment1=new Appointment(64328,patient1, doctor1,"5-06-2019");
        Appointment appointment2=new Appointment(4435,patient3,doctor2,"6-06-2019");
        Appointment appointment3=new Appointment(7253,patient2,doctor1,"8-06-2019");
        Appointment[] appointments={appointment1,appointment2,appointment3};

        HospitalService hospitalService=new HospitalService();

        hospitalService.printPatientDetails(patient1);
        System.out.println("  ");
        hospitalService.printDoctorDetails(doctor1);
        System.out.println("  ");
        hospitalService.printAppointmentDetails(appointment1);
        System.out.println("  ");

        System.out.println("total amount  : "+hospitalService.calculateTotalFee(appointments));

    }
}
