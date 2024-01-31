package controller;
import java.util.ArrayList;

import model.*;
import view.*;

public class InterfacePadokaController {
    // aqui voce pode declarar todas as variaveis de interface do sistema padoka.
    public static String respReceitaDisponivel = "---Receitas Disponiveis---\n";
    public static String respReceitaIndisponivel = "";
    public static ArrayList<String> receitasDisponiveis = new ArrayList();

    public static String respErradaInicial = "Essa opção nao é válida. Por Favor tente novamente.";
    public static String respErradaDoMenu = "Essa opção nao é válida. Por Favor tente novamente.";
    public static String respErradaMenuLogado = "Essa opção nao é válida. Por Favor tente novamente";
    public static String respSaindoDoPrograma = "Saindo... Espero que volte em breve.";
    
    public static String loginAceito = "Login Aceito. Seja bem-vindo";
    public static String loginOpcoes = "Qual opção você deseja escolher?";
    public static String loginDenied = "Login invalido. Por Favor tente novamente.";
    
    public static String cadastroSucesso = "Você foi cadastrado com sucesso.";
    public static String cadastroOpcoes = "Digite [1] para continuar.\nDigite [2] para sair.";
    
}
