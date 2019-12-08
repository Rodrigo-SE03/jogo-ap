package menus;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Creditos extends JDialog {

	private static final long serialVersionUID = 1L;
	JLabel rod = new JLabel(new ImageIcon("src/imagens/rod.png"));
	JLabel pp = new JLabel(new ImageIcon("src/imagens/pp.png"));
	JLabel rian = new JLabel(new ImageIcon("src/imagens/rian.png"));
	JLabel mig = new JLabel(new ImageIcon("src/imagens/mig.png"));
	JLabel dan = new JLabel(new ImageIcon("src/imagens/dan.png"));
	JLabel fundo = new JLabel(new ImageIcon("src/imagens/pac_mano.gif"));
	public Creditos() {
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		this.setIconImage(icone.getImage());
		this.add(rod);
		this.add(dan);
		this.add(mig);
		this.add(rian);
		this.add(pp);
		this.add(fundo);
		this.setSize(790, 525);
		dan.setBounds(500, 340, 264, 41);
		mig.setBounds(500, 280, 264, 41);
		rian.setBounds(500, 150, 264, 41);
		pp.setBounds(424, 90, 340, 41);
		rod.setBounds(500, 30, 264, 41);
		this.setModal(true);
		this.setLocationRelativeTo(null);
	}
	public void mostraCreditos() {
		
		this.setVisible(true);
	}
	

}
