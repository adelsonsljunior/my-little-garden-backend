package com.api.mylittlegarden.mylittlegarden.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {
    @GetMapping("/lab/hello")
    public String hello() {
        return "Hello World! This is My Little Garden.";
    }

    @GetMapping("/lab/params/{x}")
    public int helloWorld(@PathVariable(value = "x", required = false) int x) {
        return x;
    }

    @GetMapping("/lab/queryparams")
    public String queryParams(@RequestParam(name = "nome", required = false) String x) {

        if (x == null) {
            return "'nome' value is null.";
        }

        return x;
    }
}
