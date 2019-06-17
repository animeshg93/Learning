package com.animesh.spring.controller;

import com.animesh.spring.model.Paddle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paddle")
public class PaddleController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paddle create(@RequestBody Paddle paddle) {
        return paddle;
    }
}
