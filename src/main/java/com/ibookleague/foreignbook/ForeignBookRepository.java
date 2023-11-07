package com.ibookleague.foreignbook;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignBookRepository extends JpaRepository<ForeignBook, Integer> {
}
