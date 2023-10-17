package com.myhospital.doctorservices.model;

//import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class Doctor {

    private long id;

    @Setter
    private long nmcNumber;

    @Setter
    private String name;

    @Setter
    private String email;

    @Setter
    private String phoneNumber;

    @Setter
    private String speciality;

    @Setter
    private double fees;

    public Doctor(long nmcNumber, String name, String email, String phoneNumber, String speciality, double fees) {
        this.nmcNumber = nmcNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.fees = fees;
    }
}
