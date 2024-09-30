package com.soyhenry.ej13.repository;

import com.soyhenry.ej13.model.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryCustomImpl implements MovieRepositoryCustom{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Movie> getAllMoviesByYearCriteria(Integer year) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Movie> query = criteriaBuilder.createQuery(Movie.class);
        Root<Movie> root = query.from(Movie.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("yearOfRelease"),year));
        query.select(root).where(predicates.toArray(predicates.toArray(new Predicate[predicates.size()])));

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Movie> getAllMoviesByYearAndDurationCriteria(Integer year, Integer duration) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Movie> query = criteriaBuilder.createQuery(Movie.class);
        Root<Movie> root = query.from(Movie.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("yearOfRelease"),year));
        predicates.add(criteriaBuilder.equal(root.get("durationInMinutes"),duration));
        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        return entityManager.createQuery(query).getResultList();
    }
}
