package view;

import java.util.*;
import controller.*;

public class CadastroView {
     
    public static void cadastro() {
        Scanner scnId = new Scanner(System.in);
        Scanner scnSenha = new Scanner(System.in);
        String strId, strSenha;

        System.out.println("Digite seu ID para cadastro: ");
        strId = scnId.nextLine();
        System.out.println("Digite sua senha de cadastro: ");
        strSenha = scnSenha.nextLine();
        CadastroController.cadastroParaModel(strId, strSenha);

        scnId.close();
        scnSenha.close();
    }

    public static void cadastroOpcoes() {
        Scanner scnResp = new Scanner(System.in);
        String strResp;
        
        System.out.println(InterfacePadokaController.cadastroOpcoes);
        strResp = scnResp.nextLine();
        CadastroController.cadastroOpcoes(strResp);
        
        scnResp.close();
    }

    public static void updateCadastroView() {
        
    }
}
