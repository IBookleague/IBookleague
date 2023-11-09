package com.ibookleague.foreignbook;


import com.ibookleague.foreignbook.domain.ForeignBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignBookRepository extends JpaRepository<ForeignBook, Integer> {
}
