package com.soyhenry.ej15.controller;

import com.soyhenry.ej15.entity.Artist;
import com.soyhenry.ej15.service.ArtistService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/v1/artist")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping(value="/")
    @Operation(summary="Devuelve un listado de Libros paginado", description="No tiene parámetros de entrada", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="200", description = "Se encontraron artistas en bd!"),
            @ApiResponse(responseCode="404", description = "No existen artistas en BD!")
    })
    public ResponseEntity<List<Artist>> getAllArtists(){

        List<Artist> artists = artistService.getAll();

        if (artists.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(artists);

    }

    @PostMapping
    @Operation(summary="Permite agregar un artista", description="Debe enviar el artista en el body", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="201", description = "Se generó el libro"),
    })
    public ResponseEntity<Void> addArtist(@RequestBody Artist artist) {
        Artist createdArtist = artistService.addArtist(artist);
        return ResponseEntity.status(HttpStatus.CREATED) // 201 Created
                //.header("Location", "/artist/" + createdArtist.getId())
                .build();
    }

    @GetMapping("/{id}")
    @Operation(summary="Devuelve un Artista por id", description="Debe enviar el id", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="200", description = "Se encontró el artista buscado"),
            @ApiResponse(responseCode="404", description = "No se encontró el artista")
    })
    public ResponseEntity<Artist> getArtistById(@PathVariable Long id) {
        Optional<Artist> artist = artistService.getArtistById(id);
        if (artist.isPresent()) {
            return ResponseEntity.ok(artist.get()); // 200 OK si el libro existe
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 si no se encuentra
        }
    }

    @Operation(summary="Modificación de un Artista existentee", description="Debe adjuntar el id", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="204", description = "Se modificó el libro"),
            @ApiResponse(responseCode="404", description = "No se encontró el libro")

    })
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateArtist(@PathVariable Long id, @RequestBody Artist artistDetails) {
        Optional<Artist> existingArtist = artistService.getArtistById(id);
        if (existingArtist.isPresent()) {
            artistService.updateArtist(id, artistDetails);
            return ResponseEntity.noContent().build(); // 204 No Content, se actualizó correctamente
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 si no existe el libro
        }
    }

    @Operation(summary="Modificación (pequeña) de un Artista existente", description="Debe enviar el objeto a modificar", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="204", description = "Se modificó el libro"),
            @ApiResponse(responseCode="404", description = "No se encontró el libro")

    })
    @PatchMapping("/patch/{id}")
    public ResponseEntity<Void> updateArtistPath(@PathVariable Long id, @RequestBody Artist artistDetails) {
        Optional<Artist> existingArtist = artistService.getArtistById(id);
        if (existingArtist.isPresent()) {
            artistService.updateArtist(id, artistDetails);
            return ResponseEntity.noContent().build(); // 204 No Content, se actualizó correctamente
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 si no existe el libro
        }
    }

    @Operation(summary="Elimina un libro de la bd", description="Debe enviar el id", tags= {"Artist"})
    @ApiResponses(value= {
            @ApiResponse(responseCode="204", description = "Se eliminó el libro"),
            @ApiResponse(responseCode="404", description = "No se encontró el libro")

    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable Long id) {
        Optional<Artist> existingArtist = artistService.getArtistById(id);
        if (existingArtist.isPresent()) {
            artistService.deleteArtist(id);
            return ResponseEntity.noContent().build(); // 204 No Content, eliminado correctamente
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 si no se encuentra
        }
    }




}
