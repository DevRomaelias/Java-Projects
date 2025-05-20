package Testes.Aula12.Login.controller;

import Testes.Aula12.Login.view.TelaCadastro;
import Testes.Aula12.Login.view.TelaLogin;

import javax.swing.*;

public class LoginController {
    private final AutenticacaoController authController;
    private final TelaLogin view;

    public LoginController(TelaLogin view) {
        this.view = view;
        this.authController = new AutenticacaoController();
        inicializarController();
    }

    private void inicializarController() {
        // Configura os listeners apenas após a view estar totalmente inicializada
        SwingUtilities.invokeLater(this::configurarListeners);
    }

    private void configurarListeners() {
        view.getBtnOK().addActionListener(e -> autenticarUsuario());
        view.getBtnCadastrar().addActionListener(e -> abrirTelaCadastro());
    }

    private void autenticarUsuario() {
        String user = view.getTxtUsuario().getText();
        String senha = new String(view.getTxtSenha().getPassword());

        if (authController.autenticar(user, senha)) {
            JOptionPane.showMessageDialog(view, "Login efetuado!");
        } else {
            JOptionPane.showMessageDialog(view,
                    "Usuário ou senha incorretos!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirTelaCadastro() {
        TelaCadastro telaCadastro = new TelaCadastro(view);
        CadastroController cadastroController = new CadastroController(telaCadastro);
        telaCadastro.setVisible(true);
        view.setVisible(false);
    }
}
