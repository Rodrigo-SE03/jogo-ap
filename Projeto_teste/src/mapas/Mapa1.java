package mapas;

import javax.swing.*;
public class Mapa1 extends Mapa {
	
	
	private static final long serialVersionUID = 1L;
	JFrame mapa = new JFrame("Mapa");
	JButton b1 = new JButton("Castelo");
	JButton b2 = new JButton("Alameda dos três ponteiros");
	JButton b3 = new JButton("Catedral");
	JButton b4 = new JButton("Torre arcana");
	JButton b5 = new JButton("Praça");
	JButton b6 = new JButton("Casa nobre");
	
	
	
	
	public void mostraMapa() {
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		mapa.setIconImage(icone.getImage());
		mapa.setBounds(300,50,1280,761);
		mapa.add(b4);
		mapa.add(b1);
		mapa.add(b2);
		mapa.add(b3);
		mapa.add(b5);
		mapa.add(b6);
		b6.setBounds(843,315,100,31);
		b5.setBounds(540,360,70,31);
		b2.setBounds(370,400,200,31);
		b3.setBounds(625,320,85,31);
		b1.setBounds(730,320,80,31);
		b4.setBounds(500,260,110,31);
		mapa.add(new JLabel(new ImageIcon("src/imagens/cidade.jpg")));
		mapa.setVisible(true);
		mapa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mapa.addWindowListener(new java.awt.event.WindowAdapter() {
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
