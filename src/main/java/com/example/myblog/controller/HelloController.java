package com.example.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "helloworld";
    }

    @GetMapping("/greetings")
    public String greetings() {
        return "greetings";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/privacy")
    public String privacy(){
        return "articles/privacy";
    }

    @GetMapping("/articles")
    public String index() {
        return "articles/index";
    }

    @GetMapping("/terms")
    public String terms() {
        return "articles/terms";
    }
}
