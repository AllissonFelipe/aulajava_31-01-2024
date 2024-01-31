package controller;

import model.*;
import view.*;

public class CadastroController {
    
    public static void cadastroParaModel(String idCadastro, String senhaCadastro) {
        CadastroModel.cadastro(idCadastro, senhaCadastro);
        cadastroSucesso();
    }

    public static void cadastroSucesso() {
        ExibirStatusView.cadastroSucesso();
        CadastroView.cadastroOpcoes();
    }

    public static void cadastroOpcoes(String resp) {
        switch (resp) {
            case "1":
                LoginView.opcoesLogado();
            break;
            case "2":
                ExibirStatusView.saindo();
            break;
            default:
                ExibirStatusView.respErradaMenuLogado();
                LoginView.opcoesLogado();
            break;
        }
    }

    public static void updateCadastroController(String senha) {
        
    }
}
