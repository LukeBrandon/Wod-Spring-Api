package dev.lukeb.wodspringapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    private static final String TAG = "SampleController";

    @RequestMapping(value = "/resume")
    public ResponseEntity<String> helloSpring() {
        return new ResponseEntity<>( "Hello from Spring", HttpStatus.OK);
    }
}
