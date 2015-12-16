package com.semicolon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.semicolon.domain.Movie;

	@Repository
	public interface MovieRepository extends  CrudRepository<Movie,Long> 
	{
		
 	}

