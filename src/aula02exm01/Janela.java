package aula02exm01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{

    public Janela() throws HeadlessException {  //Exceção se acionar o programa em um aparelho sem tela
        super("Exemplo janela");    //Chamando o construtor da super classe, passando o titulo da janela
        setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Universidade Federal de Juiz de Fora!");      //Criando uma etiqueta para inserir na janela
        add(etiqueta);                                      //adicionando na janela
        JLabel etiqueta2 = new JLabel("Departamento de Ciência da Computação");     //Criando uma etiqueta para inserir na janela
        add(etiqueta2);                                      //adicionando na janela
    }
}
