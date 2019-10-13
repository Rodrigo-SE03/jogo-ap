package menus;
import javax.swing.*;
public class Creditos extends Menu_inicial {
	JFrame tela = new JFrame("Creditos");
	JLabel rod = new JLabel(new ImageIcon("src/imagens/rod.png"));
	JLabel pp = new JLabel(new ImageIcon("src/imagens/pp.png"));
	JLabel rian = new JLabel(new ImageIcon("src/imagens/rian.png"));
	JLabel mig = new JLabel(new ImageIcon("src/imagens/mig.png"));
	JLabel dan = new JLabel(new ImageIcon("src/imagens/dan.png"));
	JLabel fundo = new JLabel(new ImageIcon("src/imagens/pac_mano.gif"));
	
	public void mostraCreditos() {
		tela.add(rod);
		tela.add(dan);
		tela.add(mig);
		tela.add(rian);
		tela.add(pp);
		tela.add(fundo);
		tela.setSize(790,525);
		dan.setBounds(500,340,264,41);
		mig.setBounds(500,280,264,41);
		rian.setBounds(500,150,264,41);
		pp.setBounds(424,90,340,41);
		rod.setBounds(500,30,264,41);
		tela.setVisible(true);
	}
	
}
