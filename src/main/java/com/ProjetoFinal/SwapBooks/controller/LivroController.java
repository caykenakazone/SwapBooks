package com.ProjetoFinal.SwapBooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ProjetoFinal.SwapBooks.model.Livro;
import com.ProjetoFinal.SwapBooks.repository.LivroRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LivroController {
    @Autowired
    LivroRepository repository;
    
    @GetMapping("/meuLivro")
    public String meuLivro() {
        return "meuLivro";
    }
    @GetMapping("cadastrarLivro")
    public String cadastrarLivro(Model model) {
        model.addAttribute("livro", new Livro());
        return "cadastrarLivro";
    }
    @PostMapping("novoLivro")
    public String novoLivro(Livro livro) {
        repository.save(livro);
        return "meuLivro";
    }
    
    @GetMapping("editar-livro")
    public String mostraFormAlteraLivro(@RequestParam(value = "id_livro", required = true) Integer cod, Model model) {
        Livro livro = repository.buscaPorId(cod);
        model.addAttribute("livro", livro);
        return "meuLivro";
    }

    @PostMapping("gravaLivroModificado")
    public String gravaLivroModificado(Livro livro) {
        repository.atualiza(livro);
        return "redirect:/meuLivro";
    }
}
