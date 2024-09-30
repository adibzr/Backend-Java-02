package com.soyhenry.ej15.repository;

import com.soyhenry.ej15.entity.ArtGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtGalleryRepository extends JpaRepository<ArtGallery, Long> {
}
