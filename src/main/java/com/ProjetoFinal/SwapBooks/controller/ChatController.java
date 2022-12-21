package com.ProjetoFinal.SwapBooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/chat")
    public String home(){
        return "chat";
    }
    @GetMapping("/conversa")
    public String conversa(){
        return "conversa";
    }
    


}