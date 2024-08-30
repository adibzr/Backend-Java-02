package com.soyhenry.ej11.service;

import com.soyhenry.ej11.controller.MovieController;
import com.soyhenry.ej11.model.Movie;
import com.soyhenry.ej11.repository.MovieDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Service
public class MovieService {

    private static final Logger log = LoggerFactory.getLogger(MovieService.class);
    @Autowired
    MovieDao movieDao;

    public Movie getMovieById(Long id){
       return movieDao.getById(id);
    }

    public List<Movie> getAllMovies() {

        log.info("Negocio Get all movies");
        return movieDao.getAll();
    }

    public List<Movie> getAllMoviesWithLink() {

        List<Movie> movieList = getAllMovies();

        for (Movie movie : movieList){
            String movieId = movie.getId().toString();
            Link sLink = linkTo(MovieController.class).slash(movieId).withSelfRel();
            movie.add(sLink);
        }

        return movieList;
    }
}
