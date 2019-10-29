package cenas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Menu_inicial;
public class Inicio {
	
	Texto t1;
	
	public Inicio() {
		t1 = new Texto("<html>O dia amanheceu. Você acorda e se"
				+ "<br/>levanta de sua cama"
				+ "</html>",1);//teste da classe Texto
	continuar();
	}
	
	public void continuar() {

        t1.getContinuar().addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu_inicial();
            } });
    }
	
}
