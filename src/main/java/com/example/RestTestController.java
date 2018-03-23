package com.example;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component("hello")
class RestTestController implements Function<String, String> {

	@Override
	public String apply(String name) {
		return "Hello " + name + "!";
	}

}
