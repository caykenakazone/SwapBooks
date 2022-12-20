package com.ProjetoFinal.SwapBooks.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ProjetoFinal.SwapBooks.model.Livro;

@Repository
public class LivroRepository {
    @Autowired
    JdbcTemplate jdbc;
    
    public void save(Livro livro) {
        String sql = "insert into livro(nome,autor,descricao,qtd_pags,estado,genero) values(?,?,?,?,?,?)";
        jdbc.update(sql, livro.getNome(), livro.getAutor(), livro.getDescricao(), livro.getQtd_pags(),
                livro.getEstado(), livro.getGenero());
    }
    
    public Livro buscaPorId(Integer cod) {
        return jdbc.queryForObject(
                "select * from livro where id_livro = ?",
                (rs, rowNum) -> {
                    Livro l = new Livro();
                    l.setNome(rs.getString("nome"));
                    l.setAutor(rs.getString("autor"));
                    l.setDescricao(rs.getString("descricao"));
                    l.setQtd_pags(rs.getLong("qtd_pags"));
                    l.setGenero(rs.getString("genero"));
                    l.setEstado(rs.getString("estado"));
                    return l;
                }, cod);
    }
    
    public void atualiza(Livro livro) {
        jdbc.update("update livro set nome=?,autor=?,descricao=?,qtd_pags=?,genero=?,estado=?",
            livro.getNome(),
            livro.getAutor(),
            livro.getDescricao(),
            livro.getQtd_pags(),
            livro.getGenero(),
            livro.getEstado());
    }
}
