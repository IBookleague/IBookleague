package com.ibookleague.foreignbook;


import com.ibookleague.book.exception.DataFoundException;
import com.ibookleague.foreignbook.domain.ForeignBook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ForeignBookService {

    private final ForeignBookRepository foreignBookRepository;

    public List<ForeignBook> getList()
    {
        return this.foreignBookRepository.findAll();
    }

    public ForeignBook getBook(Integer id)
    {
        Optional<ForeignBook> foreignBook = this.foreignBookRepository.findById(id);
        if (foreignBook.isPresent())
        {
            return foreignBook.get();
        }
        else
        {
            throw new DataFoundException("Book not found");
        }
    }

    public void delete(ForeignBook foreignBook) {
        this.foreignBookRepository.delete(foreignBook);
    }
}
