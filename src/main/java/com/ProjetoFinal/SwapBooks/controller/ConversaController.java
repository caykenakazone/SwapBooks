package com.ProjetoFinal.SwapBooks.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ConversaController {


    @GetMapping("/chat")
    public String home(){
        return "chat";
    }

    // @GetMapping("/conversa")
    // public String relatorio(Model model){
    //     List<Conversa> lista = convRepo.findAll();
    //    model.addAttribute("conversa",convRepo.findAll());
    //    return "conversa";
    // }
    @GetMapping("/conversa")
    public String relatorio(){
       return "conversa";
    }


}