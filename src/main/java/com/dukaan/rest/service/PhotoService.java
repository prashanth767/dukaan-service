package com.dukaan.rest.service;

import com.dukaan.rest.dao.Photo;
import com.dukaan.rest.dao.repo.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepo;

    public String upload(String title, MultipartFile file) throws IOException {
        Photo photo = new Photo();
        photo.setTitle(title);
        photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = photoRepo.insert(photo);
        return photo.getId();
    }

    public Photo download(String id) {
        return photoRepo.findById(id).get();
    }
}
