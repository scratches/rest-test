package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class RestTestController {

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
