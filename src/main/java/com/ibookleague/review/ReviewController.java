package com.ibookleague.review;


import com.ibookleague.book.BookService;
import com.ibookleague.book.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class ReviewController {

    private final BookService bookService;
    private final ReviewService reviewService;

    @PostMapping("/ibookleague/review/create/{id}")
    public String createReview(Model model, @PathVariable("id") Integer id, @RequestParam String content)
    {
        Book book = this.bookService.getBook(id);
        this.reviewService.create(book, content);
        return String.format("redirect:/ibookleague/book/detail/%s", id);
    }
}
