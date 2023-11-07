package com.ibookleague.rate;


import com.ibookleague.book.Book;
import com.ibookleague.book.BookService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ibookleague/book/rate")
@RequiredArgsConstructor
@Controller
public class RateController {

    private final BookService bookService;
    private final RateService rateService;

    @PostMapping("/create/{id}")
    public String createRate(Model model, @PathVariable("id") Integer id, HttpServletRequest request)
    {
        Book book = this.bookService.getBook(id);
        int rateCode = Integer.parseInt(request.getParameter("rate"));
        this.rateService.create(book, rateCode);
        return String.format("redirect:/ibookleague/book/detail/%s", id);
    }

}
