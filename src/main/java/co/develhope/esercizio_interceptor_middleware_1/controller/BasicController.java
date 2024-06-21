package co.develhope.esercizio_interceptor_middleware_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping
    public String getCurrentTime () {
        return "Current time: " + LocalDateTime.now();
    }
}
