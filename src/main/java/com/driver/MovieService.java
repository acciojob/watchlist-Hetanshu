package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public String addMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }

    public String addDirector(Director director) {
        return movieRepository.addDirector(director);
    }
//
//    public String addMovieDirectorPair(Movie movie, Director director) {
//
//    }

    public Movie getMovieByName(String name) {
        return movieRepository.getMovieByName(name);
    }

    public Director getDirectorByName(String name) {
        return movieRepository.getDirectorByName(name);
    }
//
//    public ResponseEntity<List<String>> getMoviesByDirectorName(Director director) {
//
//    }

    public List<String> findAllMovies() {
        return movieRepository.fullAllMovies();
    }
//
//    public ResponseEntity<String> deleteDirectorByName(String name) {
//
//    }
//
//    public ResponseEntity<String> deleteAllDirectors() {
//
//    }
}
