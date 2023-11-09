package com.ibookleague.book;

import com.ibookleague.book.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@RequestMapping("/ibookleague/book")
@Controller
public class BookController
{

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/list")
    public String list(Model model)
    {
        List<Book> bookList = this.bookService.getList();
        model.addAttribute("bookList", bookList);
        return "book_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Book book = this.bookService.getBook(id);
        model.addAttribute("book", book);
        return "book_detail";
    }

    @GetMapping("/delete/{id}")
    public String questionDelete(Principal principal, @PathVariable("id") Integer id) {
        Book book = this.bookService.getBook(id);
        this.bookService.delete(book);
        return "redirect:/";
    }

}
