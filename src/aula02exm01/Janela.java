package aula02exm01;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Janela extends JFrame{

    public Janela() throws HeadlessException {  //Exceção se acionar o programa em um aparelho sem tela
        super("Exemplo janela");    //Chamando o construtor da super classe, passando o titulo da janela
    }
}
