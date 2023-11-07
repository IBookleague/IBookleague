package com.ibookleague.login;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
@RequestMapping("/ibookleague/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/signup")
    public String signup(Model model) {
        // UserCreateForm 객체를 모델에 추가
        model.addAttribute("userCreateForm", new UserCreateForm());
        return "signup_form";
    }


    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        if (!userCreateForm.getPassword1().equals(userCreateForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordInCorrect",
                    "2개의 패스워드가 일치하지 않습니다.");
            return "signup_form";
        }

        try
        {
            userService.create(userCreateForm.getEmail(), userCreateForm.getUsername(), userCreateForm.getPassword1());
        } catch(DataIntegrityViolationException e)
        {
            e.printStackTrace();
            bindingResult.reject("signupFailed", "이미 등록된 사용자입니다.");
            return "signup_form";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            bindingResult.reject("signupFailed", e.getMessage());
            return "signup_form";
        }

        return "redirect:/ibookleague";
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(name = "error", required = false) String error, Model model) {
        if ("true".equals(error)) {
            model.addAttribute("param_error", true);
        }
        return "login";
    }
    @GetMapping("/signup_success")
    public String signup_success(@RequestParam(name = "error", required = false) String error, Model model) {
        return "login_success";
    }


}
