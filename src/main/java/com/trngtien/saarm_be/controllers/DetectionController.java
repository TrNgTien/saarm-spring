package com.trngtien.saarm_be.controllers;

import com.trngtien.saarm_be.services.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detections")
public class DetectionController {
    private final DetectionService detectionService;

    @Autowired
    public DetectionController(DetectionService detectionService){
        this.detectionService = detectionService;
    }

    @PostMapping("")
    public int getWaterMeter () throws Exception {
        return this.detectionService.getWaterMeter();
    }
}
