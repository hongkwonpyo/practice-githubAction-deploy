package com.codestates.practicegithubActiondeploy.controller;

import org.springframwork.web.bind.annotation.GetMapping;
import org.springframwork.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello () {
        return "Hello World! Hello BE BootCamp!";
    }
}
