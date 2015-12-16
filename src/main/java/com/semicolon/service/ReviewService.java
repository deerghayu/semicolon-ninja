package com.semicolon.service;

import java.util.List;

import com.semicolon.domain.Member;
import com.semicolon.domain.Review;

public interface ReviewService {

	public Review addReview(Review review);
	
	public Review addReviewForMovie(Review review, Long movieId);
}
