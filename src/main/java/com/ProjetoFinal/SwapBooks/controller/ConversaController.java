package com.ProjetoFinal.SwapBooks.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ProjetoFinal.SwapBooks.repository.ConversaRepository;

@Controller
public class ConversaController {

    @Autowired
    private ConversaRepository convRepo;

    @GetMapping("/chat")
    public String home(){
        return "chat";
    }
    @GetMapping("/conversa")
    public String relatorio(Model model){
       model.addAttribute("conversa",convRepo.findAll());
       return "conversa";
    }
    


}