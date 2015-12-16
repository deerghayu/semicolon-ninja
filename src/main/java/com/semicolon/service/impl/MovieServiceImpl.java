package com.semicolon.service.impl;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semicolon.domain.Movie;
import com.semicolon.repository.MovieRepository;
import com.semicolon.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Movie getMovieById(Long id) {
		return movieRepository.findOne(id);
	}

	@Override
	public List<Movie> geAllMovies() {
		return (List<Movie>) movieRepository.findAll();
	}

}
