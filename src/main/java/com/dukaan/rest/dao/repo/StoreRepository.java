package com.dukaan.rest.dao.repo;

import com.dukaan.rest.dao.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "store", path = "store")
public interface StoreRepository extends MongoRepository<Store,String> {
    List<Store> findByName(@Param("name") String name);
}
