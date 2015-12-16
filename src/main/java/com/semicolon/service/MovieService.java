package com.semicolon.service;

import java.util.List;

import com.semicolon.domain.Movie;

public interface MovieService {

	public Movie addMovie(Movie movie);

	public Movie getMovieById(Long id);

	public List<Movie> geAllMovies();
}
