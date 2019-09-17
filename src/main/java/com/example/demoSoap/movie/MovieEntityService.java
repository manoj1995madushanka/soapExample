package com.example.demoSoap.movie;

import java.util.List;

public interface MovieEntityService {

    public MovieEntity getEntityById(long id);
    public MovieEntity getEntityByTitle(String title);
    public List<MovieEntity> getAllEntities();
    public MovieEntity addEntity(MovieEntity entity);
    public boolean updateEntity(MovieEntity entity);
    public boolean deleteEntityById(long id);
}
