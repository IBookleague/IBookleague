package com.ibookleague.foreign_review;


import com.ibookleague.book.Book;
import com.ibookleague.book.BookService;
import com.ibookleague.foreignbook.ForeignBook;
import com.ibookleague.foreignbook.ForeignBookService;
import com.ibookleague.review.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/ibookleague/foreignreview")
@RequiredArgsConstructor
@Controller
public class ForeignReviewController {

    private final ForeignBookService foreignBookService;
    private final ForeignReviewService foreignReviewService;

    @PostMapping("/create/{id}")
    public String createReview(Model model, @PathVariable("id") Integer id, @RequestParam String content)
    {
        ForeignBook foreignbook = this.foreignBookService.getBook(id);
        this.foreignReviewService.create(foreignbook, content);
        return String.format("redirect:/ibookleague/foreignbook/detail/%s", id);
    }
}
