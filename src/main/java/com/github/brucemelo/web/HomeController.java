package com.github.brucemelo.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HomeController {

    @Get
    public String home() {
        return "Micronaut - Java With Micronaut Data JDBC";
    }

}
