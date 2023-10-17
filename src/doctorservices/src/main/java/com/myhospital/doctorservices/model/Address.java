package com.myhospital.doctorservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Setter
public class Address {

    @Getter
    private String country;

    @Getter
    private String state;

    @Getter
    private String district;
}
