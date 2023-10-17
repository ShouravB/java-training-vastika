package com.myhospital.doctorservices.controller;

import com.myhospital.doctorservices.model.Address;
import com.myhospital.doctorservices.model.Guest;
import com.myhospital.doctorservices.model.Hotel;
import com.myhospital.doctorservices.model.OpeningHours;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HotelController {

    @GetMapping("/hotel")
    public Hotel hotel(){
        Hotel hotel = new Hotel();

        Address address = new Address("Nepal","Bagmati","Kathmandu");

        OpeningHours openingHours = new OpeningHours();


        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(new Guest("taman","neupane"));
        guests.add(new Guest("shourav","bhattarai"));
        guests.add(new Guest("arbind","kejariwal"));
        guests.add(new Guest("barac","obama"));

        hotel.setName("The Annapurna hotel");

        hotel.setNoOfGuests(guests.size());
        hotel.setAddress(address);
        hotel.setGuests(guests);
        hotel.setOpen(true);
        hotel.setOpeningHours(openingHours);
        return  hotel;
    }
}
