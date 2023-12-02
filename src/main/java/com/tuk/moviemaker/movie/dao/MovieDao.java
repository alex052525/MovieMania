package com.tuk.moviemaker.movie.dao;

import com.tuk.moviemaker.movie.entity.Movie;
import javax.persistence.EntityManager;

public class MovieDao {
    private EntityManager em;

    public MovieDao(EntityManager em) {
        this.em = em;
    }

    public Movie findById(Long id) {
        return em.find(Movie.class, id);
    }

    public void save(Movie movie) {
        em.getTransaction().begin();
        em.persist(movie);
        em.getTransaction().commit();
    }
}
