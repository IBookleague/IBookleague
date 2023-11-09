package com.ibookleague.rate;

import com.ibookleague.book.domain.Book;
import com.ibookleague.rate.domain.Rate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class RateService {

    private final RateRepository rateRepository;


    public void create(Book book, Integer rating)
    {
        Rate rate = new Rate();
        rate.setRate(rating);
        rate.setBook(book);
        rate.setCreateDate(LocalDateTime.now());
        this.rateRepository.save(rate);
    }

}
