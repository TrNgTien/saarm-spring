package com.trngtien.saarm_be.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    public AuthController(){

    }


    @PostMapping("/sign-up")
    @ResponseBody
    public String signUp(@RequestBody String data) {
        return "data" + data;
    }
}
