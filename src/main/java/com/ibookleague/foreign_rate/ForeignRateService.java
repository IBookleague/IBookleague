package com.ibookleague.foreign_rate;


import com.ibookleague.foreignbook.ForeignBook;
import com.ibookleague.foreignbook.ForeignBookRepository;
import com.ibookleague.rate.Rate;
import com.ibookleague.rate.RateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ForeignRateService {

    private final ForeignRateRepository foreignRateRepository;

    public void create(ForeignBook foreignBook, Integer rating)
    {
        ForeignRate foreignRate = new ForeignRate();
        foreignRate.setRate(rating);
        foreignRate.setForeignBook(foreignBook);
        foreignRate.setCreateDate(LocalDateTime.now());
        this.foreignRateRepository.save(foreignRate);
    }

}
