package Testes.Aula12.Login.view;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {
    private JButton btnOK;
    private JButton btnCadastrar;
    private JPasswordField txtSenha;
    private JTextField txtUsuario;

    public TelaLogin() {
        configuraTela();

    }

    public void configuraTela(){
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Dados do Usuário:");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTitulo.setBounds(20, 15, 150, 20);
        add(lblTitulo);

        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(20, 45, 60, 20);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(85, 45, 180, 20);
        add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(20, 75, 60, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(85, 75, 180, 20);
        add(txtSenha);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(75, 110, 100, 25);
        add(btnCadastrar);

        btnOK = new JButton("OK");
        btnOK.setBounds(180, 110, 85, 25);
        add(btnOK);

        setVisible(true);
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public void setBtnOK(JButton btnOK) {
        this.btnOK = btnOK;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public void setBtnCadastrar(JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }
}
