package daniel;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Conter extends Thread {
	private JDialog janela;
	private JLabel jlabel1 = new JLabel();
	private JLabel jlabel2 = new JLabel();
	int cont1, cont2;
	
	public Conter(JFrame frame) {
		cont1 = 0;
		cont2 = 0;
		janela = new JDialog(frame);
		initialize();
	}
	
	public void initialize() {

				janela.setSize(200,75);
				janela.setLocation(janela.getParent().getLocation());
				janela.setLocation(janela.getParent().getLocation().x+25,janela.getParent().getLocation().y+25);
				janela.setUndecorated(true);
				janela.setAlwaysOnTop(true);

				jlabel1.setText("Inimigos derrotados: " + cont1);
				jlabel1.setBounds(0,0,200,25);
				jlabel2.setText("Inimigos na cidade: " + cont2);
				jlabel2.setBounds(0,50,200,25);
				
				janela.getContentPane().add(jlabel1);
				janela.getContentPane().add(jlabel2);
				janela.setVisible(true);
				janela.setEnabled(false);
	}
	
	public void atualizaContador(int c1,int c2) {
		cont1 = c1;
		cont2 = c2;
		jlabel1.setText("Inimigos derrotados: " + cont1);
		jlabel1.setBounds(0,0,200,25);
		jlabel2.setText("Inimigos na cidade: " + cont2);
		jlabel2.setBounds(0,50,200,25);
	}
	
}
