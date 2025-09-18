package br.com.camilaferreiranas.productfeedbackapi.domain.repository;

import br.com.camilaferreiranas.productfeedbackapi.domain.model.Review;

import java.util.List;

public interface ReviewRepository {

    void save(Review review);
    List<Review> findAll();
}
