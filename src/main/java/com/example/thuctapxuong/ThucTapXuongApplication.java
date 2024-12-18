package com.example.thuctapxuong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class ThucTapXuongApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+7"));
        SpringApplication.run(ThucTapXuongApplication.class, args);
    }

}
