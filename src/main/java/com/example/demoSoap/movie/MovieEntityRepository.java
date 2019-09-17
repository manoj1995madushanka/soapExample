package com.example.demoSoap.movie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieEntityRepository extends CrudRepository<MovieEntity, Long> {

    public MovieEntity findByTitle(String title);
}
