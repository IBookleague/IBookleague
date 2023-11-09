package com.ibookleague.foreign_review;


import com.ibookleague.book.Book;
import com.ibookleague.foreign_rate.ForeignRateRepository;
import com.ibookleague.foreignbook.ForeignBook;
import com.ibookleague.foreignbook.ForeignBookRepository;
import com.ibookleague.review.Review;
import com.ibookleague.review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@RequiredArgsConstructor
@Service
public class ForeignReviewService {

    private final ForeignReviewRepository foreignReviewRepository;


    public void create(ForeignBook foreignBook, String content)
    {
        ForeignReview foreignReview = new ForeignReview();
        foreignReview.setContent(content);
        foreignReview.setCreateDate(LocalDateTime.now());
        foreignReview.setForeignBook(foreignBook);
        this.foreignReviewRepository.save(foreignReview);
    }
}
