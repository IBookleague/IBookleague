package com.ibookleague.rate;

import com.ibookleague.book.domain.Book;
import com.ibookleague.rate.domain.Rate;
import com.ibookleague.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RateRepository extends JpaRepository<Rate, Integer> {
    Optional<Rate> findByUserAndBook(User user, Book book);
}
