package com.dukaan.rest.controller;

import com.dukaan.rest.dao.Photo;
import com.dukaan.rest.service.PhotoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
}
