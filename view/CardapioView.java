package view;

import controller.*;
import java.util.*;

public class CardapioView {
    public static void cardapio(String resp) {
        Scanner scnInputResp = new Scanner(System.in);
        String strInputResp;
        
        System.out.println(resp); // mostrando o cardapio.
        
        System.out.println("Digite o número da escolha que você deseja escolher: ");
        strInputResp = scnInputResp.nextLine();

        // fazer a ligação com a resposta do usuario para a controller.
    }
}
