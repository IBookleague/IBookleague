package com.ibookleague.foreign_review;

import com.ibookleague.book.Book;
import com.ibookleague.foreignbook.ForeignBook;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ForeignReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private ForeignBook foreignBook;

}
