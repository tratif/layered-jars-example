package com.tratif.layers.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLayersController {

	@GetMapping
	public String helloLayers() {
		return "Hello Layers!";
	}
}
