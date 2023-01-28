package com.example.springappenginedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringAppengineDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringAppengineDemoApplication>(*args)
}

@RestController
@RequestMapping("/api")
class IndexController {
	@GetMapping
	fun get(): String? = "Hello world!"
}