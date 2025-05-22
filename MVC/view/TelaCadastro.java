package Testes.Aula12.Login.view;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
    private JFrame telaAnterior;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JTextField txtNome;
    private JButton btnCadastrar;
    private JButton btnVoltar;


    public TelaCadastro(JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;
        configuraTela();
    }

    private void configuraTela(){
        setTitle("Cadastro de Usuário");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        add(new JLabel("Nome Completo:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("Usuário:"));
        txtUsuario = new JTextField();
        add(txtUsuario);

        add(new JLabel("Senha:"));
        txtSenha = new JPasswordField();
        add(txtSenha);

        // Botão Cadastrar
        btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);

        // Botão Voltar
        btnVoltar = new JButton("Voltar");
        add(btnVoltar);
    }

    public JFrame getTelaAnterior() {
        return telaAnterior;
    }

    public void setTelaAnterior(JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public void setBtnCadastrar(JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }

    public void setBtnVoltar(JButton btnVoltar) {
        this.btnVoltar = btnVoltar;
    }
}
