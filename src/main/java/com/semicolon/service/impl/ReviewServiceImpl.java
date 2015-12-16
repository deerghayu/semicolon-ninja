package com.semicolon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semicolon.domain.Movie;
import com.semicolon.domain.Review;
import com.semicolon.repository.ReviewRepository;
import com.semicolon.service.MovieService;
import com.semicolon.service.ReviewService;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	MovieService movieService;
	
	@Override
	public Review addReview(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public Review addReviewForMovie(Review review, Long movieId) {
		System.out.println("Review ID:"+review.getId());
		Movie movie = movieService.getMovieById(movieId);
		 review.setMovie(movie);	
		 return reviewRepository.save(review);
	}


}
