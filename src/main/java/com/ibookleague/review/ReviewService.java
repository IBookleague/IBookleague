package com.ibookleague.review;


import com.ibookleague.book.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;


    public void create(Book book, String content)
    {
        Review review = new Review();
        review.setContent(content);
        review.setCreateDate(LocalDateTime.now());
        review.setBook(book);
        this.reviewRepository.save(review);
    }
}
