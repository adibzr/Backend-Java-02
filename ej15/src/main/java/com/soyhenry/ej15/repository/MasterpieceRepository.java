package com.soyhenry.ej15.repository;

import com.soyhenry.ej15.entity.Masterpiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterpieceRepository extends JpaRepository<Masterpiece,Long> {
}
