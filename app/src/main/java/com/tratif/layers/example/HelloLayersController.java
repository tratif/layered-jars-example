package com.tratif.layers.example;

import com.tratif.layers.example.api.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.nonNull;

@RestController
public class HelloLayersController {

	@GetMapping
	public MessageDto helloLayers(@RequestParam(value = "name", required = false) String name) {
		if (nonNull(name)) {
			return new MessageDto("Hello in the world of layered JARs, " + name + "!");
		}
		return new MessageDto("Hello Layers! Thank You Spring Boot community!");
	}
}
