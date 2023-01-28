package com.example.springappenginedemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
@RestController
class HelloAppEngine {
    @GetMapping("/")
    fun hello(): String {
        return "Hello world!"
    }
}