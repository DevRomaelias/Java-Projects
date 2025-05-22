package Testes.Aula12.Login;

import Testes.Aula12.Login.controller.LoginController;
import Testes.Aula12.Login.view.TelaLogin;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin loginView = new TelaLogin();
            LoginController loginController = new LoginController(loginView);
            loginView.setVisible(true);
        });
    }
}
