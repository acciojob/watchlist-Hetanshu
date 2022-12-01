package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody() Movie movie){
        return new ResponseEntity(movieService.addMovie(movie), HttpStatus.CREATED);
    }

    @PostMapping("/add-director")
    public ResponseEntity<String> addDirector(@RequestBody() Director director){
        return new ResponseEntity(movieService.addDirector(director),HttpStatus.CREATED);
    }

//    @PutMapping("/add-movie-director-pair")
//    public ResponseEntity<String> addMovieDirectorPair(@RequestBody() Movie movie,@RequestBody() Director director){
//        return new ResponseEntity(movieService.addMovieDirectorPair(movie,director),HttpStatus.OK);
//    }

    @GetMapping("/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name){
        return new ResponseEntity(movieService.getMovieByName(name),HttpStatus.FOUND);
    }

    @GetMapping("/get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable("name") String name){
        return new ResponseEntity<>(movieService.getDirectorByName(name),HttpStatus.FOUND);
    }

//    @GetMapping("/get-movies-by-director-name/{director}")
//    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable("director") Director director){
//        return movieService.getMoviesByDirectorName(director);
//    }

    @GetMapping("/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        return new ResponseEntity<>(movieService.findAllMovies(),HttpStatus.FOUND);
    }
//
//    @DeleteMapping("/delete-director-by-name")
//    public ResponseEntity<String> deleteDirectorByName(@RequestParam() String name){
//        return movieService.deleteDirectorByName(name);
//    }
//
//    @DeleteMapping("/delete-all-directors")
//    public ResponseEntity<String> deleteAllDirectors(){
//        return movieService.deleteAllDirectors();
//    }
}
