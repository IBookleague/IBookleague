package com.ibookleague.foreign_rate;

import com.ibookleague.foreign_rate.domain.ForeignRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignRateRepository extends JpaRepository<ForeignRate, Integer> {
}
