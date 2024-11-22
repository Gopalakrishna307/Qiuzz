package com.springBoot.demo.mycoolapp.Rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sendMsg(){
        return "Hello Gopalakrishna";
    }
}
