package com.spring.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    public Optional<Movie> findByImdbId(String imdbId);
}
