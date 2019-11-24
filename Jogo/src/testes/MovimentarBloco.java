package testes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
  
public class MovimentarBloco  extends JFrame
implements MouseListener, MouseMotionListener {
  
	private static final long serialVersionUID = 1L;
	private JButton botao = new JButton(new ImageIcon("src/imagens/continuar.png"));;
	private JLabel txt = new JLabel();
    private int x, y;
    
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
  
    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
  
    @Override
    public void mouseDragged(MouseEvent e) {
    	
    	int x1, y1;
    	x1 = e.getX() - x;
    	y1 = e.getY() - y;
    	if((botao.getBounds().x + x1)>= 500 || (botao.getBounds().x + x1)<= 250 ) x1 = 0;
    	if((botao.getBounds().y + y1)>= 500 || (botao.getBounds().y + y1)<= 250 ) y1 = 0;
        botao.setLocation(botao.getBounds().x + x1, botao.getBounds().y + y1);  
    
    }
   
    
    public static void main(String args[])
    {
        new MovimentarBloco().start();    
    }
    
    public void start()
    {
    	
    	
        this.botao.addMouseListener( this );        // listens for own mouse and
        this.botao.addMouseMotionListener( this );  // mouse-motion events
          
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();//Adquire o tamanho da tela
        this.setSize(size );
        this.setLayout(null);
        
        this.add(botao);
        this.botao.setBounds(250,250,150,50);
        this.botao.setLayout(null);
 		this.botao.setVisible(true);
 		this.botao.setContentAreaFilled(false);
 		
 		this.add(txt);
 		this.txt.setText("Arraste o bot�o (Cuidado com as paredes)");
 		this.txt.setLayout(null);
 		this.txt.setVisible(true);
 		this.txt.setBounds(250,100,400,250);
          
        this.setUndecorated(true);//Some com a parte de cima da janela que tem os botao de fechar
        this.setVisible( true );
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
}