package com.example.BakrService.controller;


import com.example.BakrService.model.Review;
import com.example.BakrService.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/")
    public ResponseEntity<Review> addReview(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.saveReview(review));
    }

    @GetMapping("/")
    public  List<Review> getAllReviews() {
        return reviewService.getAllReview();
    }

//    @GetMapping("/{productId}")
//    public ResponseEntity<List<Review>> getReviews(@PathVariable String productId) {
//        return ResponseEntity.ok(reviewService.getReviewsByProduct(productId));
//    }
}

