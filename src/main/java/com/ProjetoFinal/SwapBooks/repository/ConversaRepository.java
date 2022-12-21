package com.ProjetoFinal.SwapBooks.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ProjetoFinal.SwapBooks.model.Conversa;


@Repository
public class ConversaRepository {
    @Autowired
    JdbcTemplate jdbc;

   
    
}