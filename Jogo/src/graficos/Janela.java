package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;

	public Janela() {

	}

	public void construirJanela() {
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		super.setIconImage(icone.getImage());
		super.setSize(1280, 960);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.setLayout(null);
		super.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(null,
						"Tem certeza que deseja sair do jogo (todo seu progresso será perdido)?", "Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

	}

}
