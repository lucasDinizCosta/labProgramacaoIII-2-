package aula02exm01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Janela extends JFrame{
    private final JLabel etiqueta;              //Só será instanciado uma vez
    private final JLabel etiqueta2;              //Só será instanciado uma vez

    public Janela() throws HeadlessException {  //Exceção se acionar o programa em um aparelho sem tela
        super("Exemplo janela");    //Chamando o construtor da super classe, passando o titulo da janela
        setLayout(new FlowLayout());                                         //Atribuindo um layout
        Icon iconeUFJF = new ImageIcon("Resources/UFJF.jpg");
        etiqueta = new JLabel("Universidade Federal de Juiz de Fora!");      //Criando uma etiqueta para inserir na janela
        etiqueta.setIcon(iconeUFJF);
        etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta2 = new JLabel("Departamento de Ciência da Computação");     //Criando uma etiqueta para inserir na janela
        add(etiqueta);                                       //adicionando na janela
        add(etiqueta2);                                      //adicionando na janela
    }
}
