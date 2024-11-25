package dev.cleber;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setTitle("Teste do meu primeiro programa!!!");
        janela.setSize(600, 320);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel cabecalho = new JLabel();
        cabecalho.setText("Cadastre-se");
        cabecalho.setBounds(260, 10, 500, 20);

        /*label e campo nome*/
        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(20, 25, 200, 20);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(20, 50, 200, 20);

        /*label e campo email*/
        JLabel labelEmail = new JLabel();
        labelEmail.setText("Email");
        labelEmail.setBounds(20, 75, 200, 20);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(20, 100, 200, 20);

        /*label e campo senha*/
        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(20, 125, 200, 20);

        JTextField campoSenha = new JTextField();
        campoSenha.setBounds(20, 150, 200, 20);


        /*botao enviar*/
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setText("Enviar");
        botaoEnviar.setBackground(Color.decode("#c9ebea"));
        botaoEnviar.setBounds(470, 240, 100, 20);
        botaoEnviar.addActionListener(event -> {

            String nomeDigitado = campoNome.getText();
            String emailDigitado = campoEmail.getText();
            String senhaDigitada = campoSenha.getText();

            JOptionPane.showMessageDialog(janela, "E ai Jão. " + nomeDigitado + " " + emailDigitado + " " + senhaDigitada);


        });

        janela.setLayout(null);

        /*adcionando os componentes da tela*/
        janela.getContentPane().add(cabecalho);

        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(campoNome);

        janela.getContentPane().add(labelEmail);
        janela.getContentPane().add(campoEmail);

        janela.getContentPane().add(labelSenha);
        janela.getContentPane().add(campoSenha);

        janela.getContentPane().add(botaoEnviar);

        janela.setVisible(true);
    }
}
