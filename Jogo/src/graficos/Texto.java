package graficos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Texto extends Janela {
	
	private static final long serialVersionUID = 1L;
	
	private Janela texto = new Janela();
	private JButton continuar = new JButton(new ImageIcon("src/imagens/continuar.png"));
	private JLabel txt = new JLabel();
	private JLabel fundo = new JLabel(new ImageIcon("src/imagens/fundo_dialogo.png"));
	
	
	
	public JButton getContinuar() {
		return continuar;
	}
	
	public Janela getTexto() {
		return texto;
	}



	//os parâmetros são o texto que será inserido na caixa e o número de quebras de linha (<br/>) presentes no texto
	public Texto(String text,int pulalinha) {
		//criação da janela de texto
		this.texto.construirJanela();
		this.texto.setSize(610,438);
		this.texto.setLocationRelativeTo(null);
		
		//botão continuar
		this.texto.add(continuar);
		this.continuar.setLayout(null);
		this.continuar.setVisible(true);
		this.continuar.setBounds(430,338,150,50);
		this.continuar.setContentAreaFilled(false);
		
		
		
		//definição do texto da janela
		this.txt.setText(text);
		this.txt.setBounds(50,52,text.length()*10,30*(1+pulalinha));
		this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
		this.txt.setForeground(Color.black);
		this.texto.add(txt);
		
		//fundo
		this.texto.add(fundo);
		this.fundo.setBounds(0,0,600,400);
		this.texto.setVisible(true);
	}
	
	public void atualizaTexto(String tex,int pulalinha) {
		
		//botão continuar
				this.texto.add(continuar);
				this.continuar.setLayout(null);
				this.continuar.setVisible(true);
				this.continuar.setBounds(430,338,150,50);
				this.continuar.setContentAreaFilled(false);

				//definição do texto da janela
				this.txt.setText(tex);
				this.txt.setBounds(50,52,tex.length()*10,30*(1+pulalinha));
				this.txt.setFont(new Font("Georgia",Font.BOLD, 25));
				this.txt.setForeground(Color.black);
				this.texto.add(txt);
				
				//fundo
				this.texto.add(fundo);
				this.fundo.setBounds(0,0,600,400);
				
				this.texto.setVisible(true);
	}
	
	
}
