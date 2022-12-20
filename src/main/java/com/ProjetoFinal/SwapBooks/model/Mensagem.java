package com.ProjetoFinal.SwapBooks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mensagem {
    private String mensagem;
    private long id_user;
}
