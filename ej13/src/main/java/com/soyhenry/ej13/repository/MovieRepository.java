package com.soyhenry.ej13.repository;

import com.soyhenry.ej13.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long>, MovieRepositoryCustom {

    //Derived Query
    List<Movie> findByYearOfRelease (Integer year);
    List<Movie> findByYearOfReleaseLessThanEqual(Integer year);

    //Native Query
    @Query(nativeQuery = true, value = "SELECT id, duration_in_minutes, name, summary, year_of_release FROM movie WHERE year_of_release = :year")
    List<Movie> getAllMoviesByYearNative(Integer year);
}
