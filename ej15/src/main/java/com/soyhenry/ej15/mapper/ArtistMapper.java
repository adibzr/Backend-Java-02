package com.soyhenry.ej15.mapper;

import com.soyhenry.ej15.entity.Artist;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ArtistMapper {

    void updateArtistFromDto(Artist newArtist, @MappingTarget Artist existingArtist);
}