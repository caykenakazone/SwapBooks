package com.ProjetoFinal.SwapBooks.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProjetoFinal.SwapBooks.model.Usuario;
import com.ProjetoFinal.SwapBooks.repository.UsuarioRepository;


@Controller
public class UsuarioController {
    @Autowired
    UsuarioRepository repository;
    @GetMapping("cadastraUsuario")
    public String cadastraUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastraUsuario";
    }

    @PostMapping("novo")
    public String gravaDados(Usuario usuario) {
        repository.save(usuario);
        return "home";
    }   
    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("perfil")
    public String perfil() {
        return "perfil";
    }
    
    @GetMapping("editar-usuario")
    public String mostraFormAlteraUser(@RequestParam(value = "id_usuario", required = true) Integer cod, Model model) {
        Usuario usuario = repository.buscaPorId(cod);
        model.addAttribute("Usuario", usuario);
        return "perfil";
    }
    @PostMapping(value="gravaUsuarioModificado")
    public String gravaUsuarioModificado(Usuario usuario) {
        repository.atualiza(usuario);
        return "redirect:/home";
    }
    
}
