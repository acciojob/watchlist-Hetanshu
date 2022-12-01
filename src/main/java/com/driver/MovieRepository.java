package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieRepository {
    Map<String,Movie> movieMap=new HashMap<>();
    Map<String,Director> directorMap=new HashMap<>();
    public String addMovie(Movie movie) {
        movieMap.put(movie.getName(),movie);
        return "Movie Added Successfully";
    }

    public String addDirector(Director director) {
        directorMap.put(director.getName(),director);
        return "Director Added Successfully";
    }

    public Movie getMovieByName(String name) {
        return movieMap.getOrDefault(name,null);
    }

    public Director getDirectorByName(String name) {
        return directorMap.getOrDefault(name,null);
    }

    public List<String> fullAllMovies() {
        List<String> listOfAllMovies=new ArrayList<>();
        for(String movieName:movieMap.keySet())
            listOfAllMovies.add(movieName);
        return listOfAllMovies;
    }
}
