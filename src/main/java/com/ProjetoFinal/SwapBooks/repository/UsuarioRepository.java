package com.ProjetoFinal.SwapBooks.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ProjetoFinal.SwapBooks.model.Usuario;

@Repository
public class UsuarioRepository {
    @Autowired
    JdbcTemplate jdbc;

    public void save(Usuario usuario) {
        String sql = "insert into usuario(nome,email,foto,telefone,localizacao) values(?,?,?,?,?);";
        jdbc.update(sql, usuario.getNome(), usuario.getEmail(), usuario.getFoto(), usuario.getTelefone(),
                usuario.getLocalizacao());

    }

    public Usuario buscaPorId(Integer cod) {
        return jdbc.queryForObject(
                "select * from usuario where id_usuario = ?",
                (rs, rowNum) -> {
                    Usuario u = new Usuario();
                    u.setNome(rs.getString("nome"));
                    u.setEmail(rs.getString("email"));
                    u.setFoto(rs.getString("foto"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setLocalizacao(rs.getString("localizacao"));
                    return u;
                }, cod);
    }

    public void atualiza(Usuario usuario) {
        jdbc.update("update usuario set nome=?,email=?,foto=?,telefone=?,localizacao=?",
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getFoto(),
                usuario.getTelefone(),
                usuario.getLocalizacao());
    }

}
