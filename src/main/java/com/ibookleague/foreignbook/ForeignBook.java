package com.ibookleague.foreignbook;

import com.ibookleague.foreign_rate.ForeignRate;
import com.ibookleague.foreign_review.ForeignReview;
import com.ibookleague.rate.Rate;
import com.ibookleague.review.Review;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class ForeignBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String author;

    @OneToMany(mappedBy = "foreignBook", cascade = CascadeType.REMOVE)
    private List<ForeignRate> rateList;

    @OneToMany(mappedBy = "foreignBook", cascade = CascadeType.REMOVE)
    private List<ForeignReview> reviewList;
}
