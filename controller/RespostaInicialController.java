package controller;
import model.*;
import view.*;

public class RespostaInicialController {
    
    public static void menuInicial(String resp) {
        switch (resp) {
            case "1":
                MenuGraficoView.menuGraficoView();
            break;
            case "2":
                ExibirStatusView.saindo();  
            break;
            default:
                ExibirStatusView.respErradaInicial();
                InicialView.inicial();
            break;
        }
    }
    
    public static void escolhaMenu(String resp) {
        switch (resp) {
            case "1":
                LoginGraficoView.loginGraficoView();
            break;
            case "2":
                CadastroView.cadastro();
            break;
            case "3":
                InterfacePadokaController.respReceitaDisponivel = CardapioModel.exibirCardapio();
                CardapioView.cardapio(InterfacePadokaController.respReceitaDisponivel);
            break;
            case "4":
                ExibirStatusView.saindo();
            break;
            default:
                ExibirStatusView.respErradaDoMenu();
                InicialView.opcoesDoMenu();
            break;
        }
    }
}
