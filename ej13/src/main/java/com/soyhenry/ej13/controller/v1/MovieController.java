package com.soyhenry.ej13.controller.v1;

import com.soyhenry.ej13.model.Movie;
import com.soyhenry.ej13.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/")
    @Operation(summary = "Devuelve el listado de todas las películas de la base de datos", description = "no se requiere ningún argumento de entrada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente!"),
            @ApiResponse(responseCode = "404", description = "No existe ninguna pelicula en la base")
    })
    public @ResponseBody List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping(value = "/{idMovie}")
    @Operation(summary = "Devuelve una película en particular", description = "Debe enviar el id de la pelicula a buscar")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente!"),
            @ApiResponse(responseCode = "404", description = "No existe ninguna pelicula en la base")
    })
    public @ResponseBody Optional<Movie> getMovieById(@Parameter(description = "Id de la película a buscar") @PathVariable("idMovie") Long id){
        return movieService.getMovieById(id);
    }

    @Operation(summary = "Alta de una película en la base", description = "Debe enviar la película a insertar")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente!"),
            @ApiResponse(responseCode = "404", description = "No existe ninguna pelicula en la base")
    })
    @PostMapping(value = "/", produces = "application/json")
    public @ResponseBody void addMovie(Movie movie){
        movieService.addMovie(movie);
    }

    @DeleteMapping(path = "/{idMovie}")
    @Operation(summary = "Borra una película en la base", description = "Debe enviar el id de la película a borrar")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente!"),
            @ApiResponse(responseCode = "404", description = "No existe ninguna pelicula en la base")
    })
    public @ResponseBody void delMovie(@Parameter(description = "Id de la película  a borrar") @PathVariable("idMovie") Long id){
        movieService.delMovie(id);
    }

    @PutMapping(path = "/")
    @Operation(summary = "Modifica una película en la base", description = "Debe enviar la película a modificar")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Funcionó todo correctamente!"),
            @ApiResponse(responseCode = "404", description = "No existe ninguna pelicula en la base")
    })
    public @ResponseBody void updMovie(Movie movie){
        movieService.updMovie(movie);
    }

    //Derived Query
    @GetMapping(value = "/year/{year}")
    @Operation(summary = "Devuelve un listado de peliculas por año - Derived Query", description = "Debe enviar el año a buscar", tags = {"Derived Query"})
    public @ResponseBody List<Movie> getAllMoviesByYear(@Parameter(description = "Año de la pelicula") @PathVariable("year") Integer year){
        return movieService.getAllMoviesByYear(year);
    }

    @GetMapping(value = "/yearlessthan/{year}")
    @Operation(summary = "Devuelve un listado de peliculas menores a un año - Derived Query", description = "Debe enviar el año a buscar", tags = {"Derived Query"})
    public @ResponseBody List<Movie> getAllMoviesByYearLessThan(@Parameter(description = "Año de la pelicula") @PathVariable("year") Integer year){
        return movieService.getAllMoviesByYearLessThan(year);
    }

    //Native Query
    @GetMapping(value = "/yearnative/{year}")
    @Operation(summary = "Devuelve un listado de peliculas por año - Native Query", description = "Debe enviar el año a buscar", tags = {"Native Query"})
    public @ResponseBody List<Movie> getAllMoviesByYearNative(@Parameter(description = "Año de la pelicula") @PathVariable("year") Integer year){
        return movieService.getAllMoviesByYearNative(year);
    }

    //Criteria
    @GetMapping(value = "yearcriteria/{year}")
    @Operation(summary = "Devuelve un listado de peliculas por año - Criteria", description = "Debe enviar el año a buscar", tags = {"Criteria"})
    public @ResponseBody List<Movie> getAlMoviesByYearCriteria(@Parameter(description = "Año de la pelicula") @PathVariable("year") Integer year){
        return movieService.getAllMoviesByYearCriteria(year);
    }

    @GetMapping(value = "yearandduration")
    @Operation(summary = "Devuelve un listado de peliculas por año y duración - Criteria", description = "Debe enviar el año a buscar y la duración en minutos", tags = {"Criteria"})
    public @ResponseBody List<Movie> getAlMoviesByYearAndDurationCriteria(@Parameter(description = "Año de la pelicula") @RequestParam("year") Integer year, @Parameter(description = "Duración de la pelicula") @RequestParam("duration") Integer duration){
        return movieService.getAllMoviesByYearCriteriaAndDuration(year, duration);
    }

}
