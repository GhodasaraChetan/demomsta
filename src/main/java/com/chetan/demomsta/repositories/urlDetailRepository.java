package com.chetan.demomsta.repositories;

import com.chetan.demomsta.domain.urlDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface urlDetailRepository extends MongoRepository<urlDetail, String> {
}
