package graficos;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame {
	public Janela()
	{
		
	}
	public void construirJanela() {
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		super.setIconImage(icone.getImage());
		super.setBounds(500,30,1280,960);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(null, 
		            "Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }
		    }
		});

	}

}
