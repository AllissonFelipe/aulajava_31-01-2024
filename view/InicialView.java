package view;

import controller.*;
import java.util.*;

public class InicialView {
    
    public static void inicial() {
        Scanner scnResp = new Scanner(System.in);
        String resp;

        System.out.println("Bem vindo a padoka!");
        System.out.println("Para ver as nossas opções digite [1] ou digite [2] para sair");
        resp = scnResp.nextLine();
        RespostaInicialController.menuInicial(resp);
        
        scnResp.close();
    }    
    public static void opcoesDoMenu() { 
        Scanner scnOpcoes = new Scanner(System.in);

        System.out.println("[1] - Fazer Login.\n[2] - Cadastro.\n[3] - Ver nosso Cardapio.\n[4] - Sair.");
        String strOpcoes = scnOpcoes.nextLine();
        RespostaInicialController.escolhaMenu(strOpcoes);

        scnOpcoes.close();
    }
    
}
