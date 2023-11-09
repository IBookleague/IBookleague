package com.ibookleague.foreignbook;


import com.ibookleague.foreignbook.domain.ForeignBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@RequestMapping("/ibookleague/foreignbook")
@Controller
public class ForeignBookController
{

    private final ForeignBookService foreignBookService;

    public ForeignBookController(ForeignBookService foreignBookService) {
        this.foreignBookService = foreignBookService;
    }


    @GetMapping("/list")
    public String list(Model model)
    {
        List<ForeignBook> foreignBookList = this.foreignBookService.getList();
        model.addAttribute("foreignBookList", foreignBookList);
        return "foreign_book_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        ForeignBook foreignBook = this.foreignBookService.getBook(id);
        model.addAttribute("foreignBook", foreignBook);
        return "foreign_book_detail";
    }

    @GetMapping("/delete/{id}")
    public String questionDelete(Principal principal, @PathVariable("id") Integer id) {
        ForeignBook foreignBook = this.foreignBookService.getBook(id);
        this.foreignBookService.delete(foreignBook);
        return "redirect:/ibookleague/foreignbook/list";
    }

}
