package view;

import controller.*;
import javax.swing.*;
import java.awt.*;

public class MenuGraficoView {
    public static void menuGraficoView() {
        MenuCodigoView janela = new MenuCodigoView();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 200);
        janela.setVisible(true);
    }
}
