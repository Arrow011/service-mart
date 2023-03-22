package com.project.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallback(){
        return "Order service is currently down!! Please try after some time.";
    }

    @GetMapping("/productServiceFallBack")
    public String productServiceFallback(){
        return "Product service is currently down!! Please try after some time.";
    }

    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallback(){
        return "Payment service is currently down!! Please try after some time.";
    }
}
