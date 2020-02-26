package com.learning.microservices.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @GetMapping(value = "/getStatus")
    public String getStatus(){

        return "Success";

    }

    @GetMapping(value = "/hello/{name}")
    public String welcome(@PathVariable String name){

        return "Hello" + name;

    }

}
