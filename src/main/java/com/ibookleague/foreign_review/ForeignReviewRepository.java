package com.ibookleague.foreign_review;


import com.ibookleague.foreign_review.domain.ForeignReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignReviewRepository extends JpaRepository<ForeignReview, Integer> {
}
