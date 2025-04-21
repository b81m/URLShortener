package com.b81m.spring_boot_url_shortener.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","URL shortener - thymeleaf - smth else");
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
