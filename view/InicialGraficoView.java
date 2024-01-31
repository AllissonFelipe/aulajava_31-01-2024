package view;
import controller.*;
import java.awt.*;
import javax.swing.*;

public class InicialGraficoView {

    public static void inicialGraficoView() {
        InicialCodigoView janela = new InicialCodigoView();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(275, 110);
        janela.setVisible(true);
    }
}
