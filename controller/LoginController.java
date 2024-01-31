package controller;

import view.*;
import model.*;

public class LoginController {
    
    public static void loginParaModel(String id, String senha) {
        LoginModel.acessarConta(id, senha);
    }
    
    public static void login(String login, String senha) {
        if (login == "" || senha == "") {
            LoginView.loginDenied(InterfacePadokaController.loginDenied);
            LoginView.login();
            
        } else {
            LoginView.loginAceito(InterfacePadokaController.loginAceito);
            LoginView.opcoesLogado();
        }
    }
    
    public static void escolhaLogado(String resp) {
        switch (resp) {
            case "1":
                InterfacePadokaController.respReceitaDisponivel = CardapioModel.exibirCardapio();    
                CardapioView.cardapio(InterfacePadokaController.respReceitaDisponivel);
            break;
            case "2":
                
            break;
            case "3":
                ExibirStatusView.saindo();
            break;
            default:
                ExibirStatusView.respErradaMenuLogado();
                LoginView.opcoesLogado();
            break;
        } 
    }
}
