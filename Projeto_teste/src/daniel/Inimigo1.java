package daniel;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Inimigo1 {
	// atributos
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisible;
	private static int velocidade = 2;


	// construtor
	public Inimigo1(int x, int y) {
		this.x = x;
		this.y = y;
		isVisible = true;
	}

	// carregar imagem
	public void load() {
		ImageIcon referencia = new ImageIcon("src/imagens/17.png");
		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}

	// atualizar x
	public boolean uptade() {
		this.x = x - velocidade;
	
		if(this.x< 0) {
			isVisible=false;
			return true;

		}else return false;

	}


	// para colisões
	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

	// gets e sets
	public static int getVelocidade() {
		return velocidade;
	}

	public static void setVelocidade(int velocidade) {
		Inimigo1.velocidade = velocidade;
	}

	public Image getImagem() {
		return imagem;
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

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

}