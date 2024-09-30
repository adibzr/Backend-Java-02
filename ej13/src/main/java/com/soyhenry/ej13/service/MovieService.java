package com.soyhenry.ej13.service;

import com.soyhenry.ej13.model.Movie;
import com.soyhenry.ej13.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public void addMovie(Movie movie) {
         movieRepository.save(movie);
    }

    public void delMovie(Long id) {
        movieRepository.deleteById(id);
    }

    public void updMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public List<Movie> getAllMoviesByYear(Integer year) {
        return movieRepository.findByYearOfRelease(year);
    }

    public List<Movie> getAllMoviesByYearLessThan(Integer year) {
        return movieRepository.findByYearOfReleaseLessThanEqual(year);
    }

    public List<Movie> getAllMoviesByYearNative(Integer year) {
        return movieRepository.getAllMoviesByYearNative(year);
    }

    public List<Movie> getAllMoviesByYearCriteria(Integer year) {
        return movieRepository.getAllMoviesByYearCriteria(year);
    }

    public List<Movie> getAllMoviesByYearCriteriaAndDuration(Integer year, Integer duration) {
        return movieRepository.getAllMoviesByYearAndDurationCriteria(year, duration);
    }
}
