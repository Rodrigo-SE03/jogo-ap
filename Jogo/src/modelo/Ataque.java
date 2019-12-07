package modelo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import personagens.Jogador;

public class Ataque {
	//atributos
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisible;
	private static final int distancia = 938;
	private static int velocidade = 2;
	private ImageIcon referencia;
	
	//construtor
	public Ataque(int x, int y, ImageIcon referencia) {
		this.x=x;
		this.y=y;
		isVisible=true;
		this.referencia = referencia;
	}
	
	//carregar imagem
	public void load() {

		imagem=referencia.getImage();
		
		this.largura=imagem.getWidth(null);
		this.altura=imagem.getHeight(null);
		}
	
	//atualizar x e y
	public void uptade() {
		this.x=x+velocidade;
		if (this.x>distancia) {
			isVisible = false;
		}
	}
    //colisão com ataque
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura,altura);
	}
    //gets e sets
	public static int getVelocidade() {
		return velocidade;
	}

	public static void setVelocidade(int velocidade) {
		Ataque.velocidade = velocidade;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisible() {
		return isVisible;
	}
	
	

}