package aula02exm01;

import javax.swing.JFrame;

public class Aula02Exm01 {

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setSize(640, 480);       //Tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define a operação de saída ao clicar no X do programa
        janela.setLocationRelativeTo(null);     //Centraliza a janela no meio da tela
        janela.setVisible(true);        //Torna a janela visível
    }

}
