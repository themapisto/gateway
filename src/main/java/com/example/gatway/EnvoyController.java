package com.example.gatway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class EnvoyController {


    @GetMapping
    public String services() {
        System.out.println("Envoy filter가 호출했습니다.");
        return "Hello";
    }
}
