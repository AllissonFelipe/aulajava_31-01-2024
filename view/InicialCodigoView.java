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

public class InicialCodigoView extends JFrame {
        
    private final JButton botaoOpcoes;
    private final JButton botaoSair;
    private final JLabel label;

    public InicialCodigoView() {
        super("Bem-Vindo!");
        setLayout(new FlowLayout());

        label = new JLabel("Bem-Vindo a Padoka!");
        add(label);

        botaoOpcoes = new JButton("Opções");
        add(botaoOpcoes);
        botaoSair = new JButton("Sair.");
        add(botaoSair);

        BotaoHandlerOpcoes handler = new BotaoHandlerOpcoes();
        botaoOpcoes.addActionListener(handler);
        BotaoHandlerSair handlerSair = new BotaoHandlerSair();
        botaoSair.addActionListener(handlerSair);
    } 

    private class BotaoHandlerOpcoes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(InicialCodigoView.this, String.format("Indo ao Menu.", event.getActionCommand()));
            String botaoMenu = event.getActionCommand();
            if (botaoMenu.equals("Opções")) {
                setVisible(false);
            } 
            RespostaInicialController.menuInicial("1");
        }
    }
    private class BotaoHandlerSair implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(InicialCodigoView.this, String.format("Saindo...", event.getActionCommand()));
            RespostaInicialController.menuInicial("2");
        }
    }
}
