package com.tratif.layers.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.nonNull;

@RestController
public class HelloLayersController {

	@GetMapping
	public String helloLayers(@RequestParam(value = "name", required = false) String name) {
		if (nonNull(name)) {
			return "Hello in the world of layered JARs, " + name + "!";
		}
		return "Hello Layers! Thank You Spring Boot community!";
	}
}
