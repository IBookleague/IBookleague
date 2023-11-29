package com.ibookleague.book.domain;

import com.ibookleague.rate.domain.Rate;
import com.ibookleague.review.domain.Review;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private List<Rate> rateList;



    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private List<Review> reviewList;
}
