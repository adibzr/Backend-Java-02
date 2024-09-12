package com.soyhenry.ej11.controller.v2;

import com.soyhenry.ej11.model.Movie;
import com.soyhenry.ej11.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/v2/movies")
public class MovieControllerV2 {

    @Autowired
    MovieService movieService;

    @Operation(summary = "Devuelve una película de la base", description = "Debe enviar el id de la película a buscar" , tags = {"Pets - V2"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente"),
            @ApiResponse(responseCode = "500", description = "Se rompió el server"),
            @ApiResponse(responseCode = "404", description = "No se encontró el elemento buscado (película)")
    })
    @GetMapping(value = "/{idMovie}")
    public ResponseEntity<Movie> getById(@Parameter(description = "Este es el id de la película a buscar, debe ser un entero") @PathVariable("idMovie") long id){

        Movie movie = movieService.getMovieById(id);
        if (movie != null){
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Operation(summary = "Devuelve un listado de películas de la base", description = "No requiere parámetros de entrada" , tags = {"Pets - V2"})
    @GetMapping("/")
    public List<Movie> getAllMovies(){

         return movieService.getAllMovies();

    }

    @Operation(summary = "Devuelve un listado de películas de la base con un link a cada uno de los elementos de entrada", description = "No requiere parámetros de entrada" , tags = {"Pets - V2"})
    @GetMapping
    public List<Movie> getAllMoviesWithLink() {

        return movieService.getAllMoviesWithLink();
    }

    @Operation(summary = "Permite ingresar una película de la base", description = "Debe enviar el objeto película completo" , tags = {"Pets - V2"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente"),
            @ApiResponse(responseCode = "201", description = "Se creó la película correctamente!!"),
            @ApiResponse(responseCode = "500", description = "Se rompió el server"),
    })
    @PostMapping("/")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        Boolean result = movieService.addMovie(movie);
        if (result){
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @Operation(summary = "Permite actualizar una película de la base", description = "Debe enviar el objeto película completo" , tags = {"Pets - V2"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente"),
            @ApiResponse(responseCode = "204", description = "Se actualizó la película correctamente!!"),
            @ApiResponse(responseCode = "500", description = "Se rompió el server"),
    })
    @PutMapping("/")
    public ResponseEntity<Movie> updMovie(@RequestBody Movie movie) {
        Boolean result = movieService.updMovie(movie);
        if (result) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @Operation(summary = "Permite actualizar una película de la base", description = "Debe enviar el objeto película completo" , tags = {"Pets - V2"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente"),
            @ApiResponse(responseCode = "204", description = "Se actualizó la película correctamente!!"),
            @ApiResponse(responseCode = "500", description = "Se rompió el server"),
    })
    @PatchMapping("/")
    public ResponseEntity<Movie> updMoviePatch(@RequestBody Movie movie) {
        Boolean result = movieService.updMovie(movie);
        if (result) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @Operation(summary = "Permite eliminar una película de la base", description = "Debe enviar el objeto película completo" , tags = {"Pets - V2"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente"),
            @ApiResponse(responseCode = "204", description = "Se actualizó la película correctamente!!"),
            @ApiResponse(responseCode = "500", description = "Se rompió el server"),
    })
    @DeleteMapping("/")
    public ResponseEntity<Movie> delMovie(@RequestBody Movie movie) {
        Boolean result = movieService.delMovie(movie);
        if (result) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
