package com.example.Zadanie2StringApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/showDetails")
    public Details showDetails(@RequestParam String word) {
        return null;
    }
}
