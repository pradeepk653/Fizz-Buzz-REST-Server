package com.fizz.buzz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @GetMapping("/fizz-buzz")
    public ResponseEntity<?> fizzBuzz(@RequestParam("")){

        return null;
    }

}
