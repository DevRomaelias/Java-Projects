package Testes.Aula12.Login.controller;

import Testes.Aula12.Login.model.Usuario;
import Testes.Aula12.Login.model.UsuarioDAO;

public class AutenticacaoController {
    private UsuarioDAO usuarioDAO;

    public AutenticacaoController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String username, String senha) {
        return usuarioDAO.autenticar(username, senha);
    }

    public boolean cadastrarUsuario(String username, String senha, String nome) {
        if (usuarioDAO.usuarioExiste(username)) {
            return false;
        }

        Usuario novoUsuario = new Usuario(username, senha, nome);
        return usuarioDAO.cadastrarUsuario(novoUsuario);
    }
}
