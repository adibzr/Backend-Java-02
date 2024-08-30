package com.soyhenry.ej11.controller;

import com.soyhenry.ej11.model.Movie;
import com.soyhenry.ej11.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/{idMovie}")
    public Movie getById(@PathVariable("idMovie") long id){
        return movieService.getMovieById(id);
    }

    @GetMapping("/")
    public List<Movie> getAllMovies(){

         return movieService.getAllMovies();

    }

    @GetMapping
    public List<Movie> getAllMoviesWithLink(){

        return movieService.getAllMoviesWithLink();
    }
}
