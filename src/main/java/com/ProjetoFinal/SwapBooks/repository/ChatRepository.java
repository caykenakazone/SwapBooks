package com.ProjetoFinal.SwapBooks.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ProjetoFinal.SwapBooks.model.Mensagem;

@Repository
public class ChatRepository {
    @Autowired
    JdbcTemplate jdbc;

    public void novaMensagem (Mensagem mensagem) {
        String sql = "insert into chat(mensagem, id_user) values(?,?)";
        jdbc.update(sql, mensagem.getMensagem(), mensagem.getId_user());
    }
    
}