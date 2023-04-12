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

@RestController
@RequestMapping(value = "/photos/")
public class PhotoController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PhotoService photoService;

    @PostMapping("/upload")
    public String upload(@RequestParam("title") String title,
                         @RequestParam("image") MultipartFile image) throws IOException {

        String id = photoService.upload(title, image);
        return id;
    }

    @GetMapping("/{id}")
    public Photo download(@PathVariable String id) {
        return photoService.download(id);
    }
}
