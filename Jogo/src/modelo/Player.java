package modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Player {
	//atributos
	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	private List <Ataque> ataques;
	private boolean isVisivel;
	
	//construtor
	public Player ()
	{this.x=10;
	this.y=800;	
	isVisivel=true;
	ataques= new ArrayList<Ataque>();
	}
	//carregar imagem
	public void load()
	{ImageIcon referencia= new ImageIcon(getClass().getResource("TESTE.jpeg"));
			
	imagem = referencia.getImage();
	
	altura=imagem.getHeight(null);
	largura=imagem.getWidth(null);
	}
	//atualizar x e y
	public void atualizar()
	{x+=dx;
	y+=dy;
	}
	//ataques sair da posi��o do player
	public void ataqueSimples() {
		this.ataques.add(new Ataque(x+largura,y+(altura/2)));
	}
	
    //p/ checar colis�es
	public Rectangle getBounds() {
		return new Rectangle (x,y,largura,altura);
	}
	
	//controlar o personagem (rever conceito)
	public void keyPressed(KeyEvent tecla)
	{int codigo= tecla.getKeyCode();
	
	//ataque
	if (codigo==KeyEvent.VK_A)
	{
		ataqueSimples();
	}
	
	//cima (ao contrario n�o sei pq)
	if (codigo==KeyEvent.VK_UP)
	{
		dy=-3;
		
	}
	//baixo
	if (codigo==KeyEvent.VK_DOWN)
	{
		dy=3;
	}
	//esquerdo
	if (codigo==KeyEvent.VK_LEFT)
	{
		dx=-3;
	}
	//direita
	if (codigo==KeyEvent.VK_RIGHT)
	{
		dx=3;
	}
	
	}
	
	public void keyRealeased(KeyEvent tecla)
	{int codigo= tecla.getKeyCode();
	
	//cima
	if (codigo==KeyEvent.VK_UP)
	{
		dy=0;
		
	}
	//baixo
	if (codigo==KeyEvent.VK_DOWN)
	{
		dy=0;
	}
	//esquerdo
	if (codigo==KeyEvent.VK_LEFT)
	{
		dx=0;
	}
	//direita
	if (codigo==KeyEvent.VK_RIGHT)
	{
		dx=0;
	}
	
	}
    //gets e sets uteis
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public List<Ataque> getAtaques() {
		return ataques;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}
	
	
	
	

}