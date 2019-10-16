package graficos;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Texto extends Janela {
	
	private static final long serialVersionUID = 1L;
	
	Janela texto = new Janela();
	JButton continuar = new JButton("Continuar");
	JLabel txt = new JLabel();
	
	public Texto(String text) {
		//criação da janela de texto
		this.texto.construirJanela();
		this.texto.setSize(600,400);
		this.texto.add(continuar);
		this.continuar.setBounds(460,320,100,30);
		this.texto.setVisible(true);
		
		//definição do texto da janela
		this.txt.setText(text);
		this.txt.setBounds(20,20,text.length()*10,30);
		this.texto.add(txt);
	}
	
	
}
