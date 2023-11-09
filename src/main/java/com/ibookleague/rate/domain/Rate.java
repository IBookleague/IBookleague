package com.ibookleague.rate.domain;

import com.ibookleague.book.domain.Book;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer rate;

    private LocalDateTime createDate;

    @ManyToOne
    private Book book;

}
