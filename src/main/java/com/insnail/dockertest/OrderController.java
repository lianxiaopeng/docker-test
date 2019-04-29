package com.insnail.dockertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/getOrder")
    public String getOrder(){
        return "hello,world!!!";
    }
}
