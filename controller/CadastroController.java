package Testes.Aula12.Login.controller;

import Testes.Aula12.Login.view.TelaCadastro;

import javax.swing.*;

public class CadastroController {
    private final AutenticacaoController authController;
    private final TelaCadastro view;

    public CadastroController(TelaCadastro view) {
        this.view = view;
        this.authController = new AutenticacaoController();
        configurarListeners();
    }

    private void configurarListeners() {
        view.getBtnCadastrar().addActionListener(e -> cadastrarUsuario());
        view.getBtnVoltar().addActionListener(e -> voltarParaLogin());
    }

    private void cadastrarUsuario() {
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = new String(view.getTxtSenha().getPassword());

        if (nome.isEmpty() || usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(view,
                    "Preencha todos os campos!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (authController.cadastrarUsuario(usuario, senha, nome)) {
            JOptionPane.showMessageDialog(view,
                    "Cadastro realizado com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            voltarParaLogin();
        } else {
            JOptionPane.showMessageDialog(view,
                    "Usuário já existe!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void voltarParaLogin() {
        view.dispose();
        view.getTelaAnterior().setVisible(true);
    }
}
