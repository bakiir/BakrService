package com.example.BakrService.service;


import com.example.BakrService.model.Review;
import com.example.BakrService.repo.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getAllReview(){
        return reviewRepository.findAll();
    }

//    public List<Review> getReviewsByProduct(String productId) {
//        return reviewRepository.findByProductId(productId);
//    }
}
