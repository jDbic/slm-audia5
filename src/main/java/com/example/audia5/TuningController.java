package com.example.audia5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TuningController {

    public int ps = 190;
    public String color = "green";

    @GetMapping("/morepowerbaby")
    public String morePowerBaby(int a) {
        return "Dein Fahrzeug hat " + (a + ps);
    }

    @GetMapping("/color")
    public String changeColor(int a) {
        return "Dein Fahrzeug hat " + (a + ps);
    }
}
