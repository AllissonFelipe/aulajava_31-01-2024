package view;

import controller.*;
import javax.swing.*;

public class LoginGraficoView {
    public static void loginGraficoView() {
        String id;
        String senha;

        id = JOptionPane.showInputDialog("Digite seu ID: ");
        senha = JOptionPane.showInputDialog("Digite sua Senha:");

        LoginController.loginParaModel(id, senha);
    }
    public static void loginDenied() {
        
    }
}
