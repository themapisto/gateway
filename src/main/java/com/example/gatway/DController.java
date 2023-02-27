package com.example.gatway;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/services")
@Slf4j
public class DController {


//    @GetMapping
//    public String service(){
//        return "Hello";
//    }
//


    @GetMapping(value = "/info")
    public String services() {

        return "Hello";
    }


}
