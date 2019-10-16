package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Texto extends Janela {
	
	private static final long serialVersionUID = 1L;
	
	Janela texto = new Janela();
	JButton continuar = new JButton("Continuar");
	JLabel txt = new JLabel();
	JLabel fundo = new JLabel(new ImageIcon("src/imagens/fundo_dialogo.png"));
	
	public Texto(String text) {
		//criação da janela de texto
		this.texto.construirJanela();
		this.texto.setSize(610,438);
		
		//botão continuar
		this.texto.add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(480,358,100,30);
		//definição do texto da janela
		this.txt.setText(text);
		this.txt.setBounds(50,52,text.length()*10,30);
		this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.texto.add(txt);
		
		//fundo
		this.texto.add(fundo);
		this.fundo.setBounds(0,0,600,400);
		
		this.texto.setVisible(true);
	}
	
	
}
