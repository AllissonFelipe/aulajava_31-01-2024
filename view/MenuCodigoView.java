package view;

import controller.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class MenuCodigoView extends JFrame {
    private final JButton botaoFazerLogin;
    private final JButton botaoCadastro;
    private final JButton botaoCardapio;
    private final JButton botaoSair;
    private final JLabel label;

    public MenuCodigoView() {
        super("Menu.");
        setLayout(new FlowLayout());

        label = new JLabel("Bem-Vindo ao Menu.");
        add(label);
        botaoFazerLogin = new JButton("Fazer Login.");
        add(botaoFazerLogin);
        botaoCadastro = new JButton("Cadastro.");
        add(botaoCadastro);
        botaoCardapio = new JButton("Cardapio.");
        add(botaoCardapio);
        botaoSair = new JButton("Sair.");
        add(botaoSair);

        BotaoHandler handler = new BotaoHandler();
        botaoFazerLogin.addActionListener(handler);
        botaoCadastro.addActionListener(handler);
        botaoCardapio.addActionListener(handler);
        botaoSair.addActionListener(handler);
    }
    private class BotaoHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String botaoEscolha = event.getActionCommand();
            if (botaoEscolha.equals("Fazer Login.")) {
                JOptionPane.showMessageDialog(MenuCodigoView.this, String.format("Indo à tela de login.", event.getActionCommand()));
                setVisible(false);
                RespostaInicialController.escolhaMenu("1");
            } else if (botaoEscolha.equals("Cadastro.")) {
                JOptionPane.showMessageDialog(MenuCodigoView.this, String.format("Indo à tela de cadastro.", event.getActionCommand()));
                setVisible(false);
                RespostaInicialController.escolhaMenu("2");
            } else if (botaoEscolha.equals("Cardapio.")) {
                JOptionPane.showMessageDialog(MenuCodigoView.this, String.format("Indo ao Cardapio.", event.getActionCommand()));
                setVisible(false);
                RespostaInicialController.escolhaMenu("3");
            }   else if (botaoEscolha.equals("Sair.")) {
                JOptionPane.showMessageDialog(MenuCodigoView.this, String.format("Saindo...", event.getActionCommand()));
                setVisible(false);
                RespostaInicialController.escolhaMenu("4");
            }
        }
    }
}
    

