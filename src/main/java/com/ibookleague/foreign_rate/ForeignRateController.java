package com.ibookleague.foreign_rate;


import com.ibookleague.foreignbook.ForeignBookService;
import com.ibookleague.foreignbook.domain.ForeignBook;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class ForeignRateController {

    private final ForeignBookService foreignBookService;
    private final ForeignRateService foreignRateService;

    @PostMapping("/ibookleague/foreignbook/rate/create/{id}")
    public String createRate(Model model, @PathVariable("id") Integer id, HttpServletRequest request) {
        ForeignBook foreignBook = this.foreignBookService.getBook(id);
        int rateCode = Integer.parseInt(request.getParameter("rate"));
        this.foreignRateService.create(foreignBook, rateCode);
        return String.format("redirect:/ibookleague/foreignbook/detail/%s", id);
    }

}
