package view;

import controller.*;
import java.util.*;

public class LoginView {
    public static void login() {
        Scanner scnLogin = new Scanner(System.in);
        Scanner scnSenha = new Scanner(System.in);
        String strId, strSenha;

        System.out.println("Digite seu ID: ");
        strId = scnLogin.nextLine();
        System.out.println("Digite sua Senha: ");
        strSenha = scnSenha.nextLine();
        LoginController.loginParaModel(strId, strSenha);

        scnLogin.close();
        scnSenha.close();
    }

    public static void opcoesLogado() {
        Scanner scnUsuarioInput = new Scanner(System.in);
        String strUsuarioInput;

        System.out.println("[1] - Ver nosso Cardapio.\n[2] - Atualizar o seu Cadastro.\n[3] - Sair.");
        strUsuarioInput = scnUsuarioInput.nextLine();
        LoginController.escolhaLogado(strUsuarioInput);

        scnUsuarioInput.close();
    }

    public static void loginDenied(String loginDenied) {
        System.out.println(loginDenied);
        //login();
    }
    
    public static void loginAceito(String loginAceito) {
        System.out.println(loginAceito);
        System.out.println(InterfacePadokaController.loginOpcoes);
        //InicialView.opcoesLogado();
    }
}
