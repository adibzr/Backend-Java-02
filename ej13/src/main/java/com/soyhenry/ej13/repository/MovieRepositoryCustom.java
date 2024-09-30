package com.soyhenry.ej13.repository;

import com.soyhenry.ej13.model.Movie;

import java.util.List;

public interface MovieRepositoryCustom {

    List<Movie> getAllMoviesByYearCriteria(Integer year);

    List<Movie> getAllMoviesByYearAndDurationCriteria(Integer year, Integer duration);
}
