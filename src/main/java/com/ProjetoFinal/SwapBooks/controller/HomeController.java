package com.ProjetoFinal.SwapBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
    @GetMapping("match")
    public String match(){
        return "match";
    }
}