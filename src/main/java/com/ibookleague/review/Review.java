package com.ibookleague.review;

import java.time.LocalDateTime;
import java.util.List;

import com.ibookleague.book.Book;
import com.ibookleague.foreignbook.ForeignBook;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Book book;

}
