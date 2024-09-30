package com.soyhenry.ej15.service;

import com.soyhenry.ej15.entity.Artist;
import com.soyhenry.ej15.mapper.ArtistMapper;
import com.soyhenry.ej15.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ArtistMapper artistMapper;

    public List<Artist> getAll() {
       return artistRepository.findAll();
    }

    public Artist addArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    public void updateArtist(Long id, Artist newArtist) {
        Optional<Artist> existingArtistOpt = getArtistById(id);
        if (existingArtistOpt.isPresent()) {
            Artist existingArtist = existingArtistOpt.get();
            artistMapper.updateArtistFromDto(newArtist, existingArtist);
            artistRepository.save(newArtist);
        }

    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
