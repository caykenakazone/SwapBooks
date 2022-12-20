package com.ProjetoFinal.SwapBooks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private long id_user;
    private String  nome, email,foto,telefone,localizacao;  
}
