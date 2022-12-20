package com.ProjetoFinal.SwapBooks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    private long id_livro,qtd_pags;
    private String nome, autor, descricao,genero,estado;
}
