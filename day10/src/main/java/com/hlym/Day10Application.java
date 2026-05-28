package com.hlym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan//开启servlet
@SpringBootApplication
public class Day10Application {

    public static void main(String[] args) {
        SpringApplication.run(Day10Application.class, args);
    }

}
