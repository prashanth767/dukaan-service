package com.dukaan.rest.dao.repo;

import com.dukaan.rest.dao.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> { }