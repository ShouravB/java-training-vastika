package com.myhospital.doctorservices.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Doctor", description = "Doctor management API")
@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class DoctorController {

//    @GetMapping()
//    public String index(){
//        log.info("Doctor controller is working");
//        return "Hello from the doctor";
//
//    }
//
//    @GetMapping(value = "/ping")
//    public String ping(){
//        return "Hello from the ping";
//    }

    @Operation(
            summary = "Create a new Doctor",
            description = "Create a new doctor from data taken in request body."
    )
    @PostMapping(value = "/doctor")
    public String createDoctor(){
        return "Created a doctor.";
    }

    @Operation(
            summary = "Get Doctors",
            description = "Get the details of all doctors."
    )
    @GetMapping(value="/doctor")
    public String getDoctors(){
        return  "All doctors are here";
    }

    @Operation(
            summary = "Update Doctor",
            description = "Update the information of existing doctor"
    )
    @PutMapping(value = "/doctor")
    public String updateDoctor(){
        return "Doctor information updated";
    }

    @Operation(
            summary = "Delete Doctor",
            description = "Delete the information of a doctor"
    )
    @DeleteMapping(value = "/doctor")
    public String deleteDoctor(){
        return "Doctor information deleted";
    }
}
