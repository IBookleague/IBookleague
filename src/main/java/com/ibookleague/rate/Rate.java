package com.ibookleague.rate;

import com.ibookleague.book.Book;
import com.ibookleague.foreignbook.ForeignBook;
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
