package com.ibookleague.rate;

import com.ibookleague.rate.domain.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, Integer> {
}
