package cenas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Texto;
import menus.Menu_inicial;
public class Inicio {
	
	Texto t1;
	String[] tx = new String[5];
	int[] linhas = new int[5];
	
	public Inicio() {
		t1 = new Texto("<html>O dia amanheceu. Você acorda e se"
				+ "<br/>levanta de sua cama"
				+ "</html>",1);//teste da classe Texto
		tx[0] = "<html>O dia amanheceu. Você acorda e se</html>";
		linhas[0] = 1;
		tx[1] = "<html>levanta de sua cama</html>";
		linhas[1]= 1;
	continuar(t1,tx[0],linhas[0],5,0);
	}
	
	
	
	
	public void continuar(Texto t,String txt, int x, int max,int cont) {
		
		int c;
		c = cont + 1;
		
		t.getContinuar().addActionListener( new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				t.getTexto().dispose();
            	if(cont<max) {
            		continuar(new Texto(txt,x),tx[c],linhas[c],max,c);
            	}
            	else;
            } });
    }
	
}
