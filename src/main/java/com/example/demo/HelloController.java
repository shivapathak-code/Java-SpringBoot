package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello()
    {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("bye")
    public String bye()
    {
        return "<h1>Bye..</h1>";
    }

    @GetMapping("hii")
    public String namste()
    {
        return "<h1>Namaste jii ..</h1>";
    }

    @GetMapping("kaise ho")
    public String good()
    {
        return "<h1>I am very good ..</h1>";
    }
}
