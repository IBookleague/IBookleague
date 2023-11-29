package com.ibookleague.rate;

import com.ibookleague.book.domain.Book;
import com.ibookleague.rate.domain.Rate;
import com.ibookleague.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RateService {

    private final RateRepository rateRepository;


    public void create(Book book, Integer rating, User user)
    {
        Rate rate = new Rate();
        rate.setRate(rating);
        rate.setBook(book);
        rate.setUser(user);
        rate.setCreateDate(LocalDateTime.now());
        this.rateRepository.save(rate);
    }

    public boolean hasUserRatedBook(User user, Book book)
    {
        Optional<Rate> existingRate = rateRepository.findByUserAndBook(user, book);

        return existingRate.isPresent();
    }

}
