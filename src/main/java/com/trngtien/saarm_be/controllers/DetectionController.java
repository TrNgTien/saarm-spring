package com.trngtien.saarm_be.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detections")
public class DetectionController {
    public DetectionController(){

    }

    @PostMapping("")
    public int getWaterMeter () {
        return 5;
    }
}
