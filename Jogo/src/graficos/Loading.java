package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Loading extends Thread {

	private JLabel fundo;
	private JFrame frame;
	private ImageIcon[] icone = new ImageIcon[10];
	private boolean carregando = true;

	public Loading() {
		this.frame = new JFrame();
		this.frame.setIconImage(new ImageIcon("src/imagens/Icone.png").getImage());
		this.frame.setAlwaysOnTop(true);
		this.frame.setUndecorated(true);
		this.frame.setSize(500, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(0);

		fundo = new JLabel();
		fundo.setSize(500, 500);
		fundo.setLocation(0, 0);
		this.frame.getContentPane().add(fundo);
		for (int i1 = 0; i1 < 10; i1++) {
			icone[i1] = new ImageIcon("src/imagens/Loading" + (i1 + 1) + ".png");
			icone[i1].setImage(icone[i1].getImage().getScaledInstance(500, 500, 100));
		}

	}

	public void run() {
		int i = 0;

		this.frame.setVisible(true);
		while (carregando) {
			fundo.setIcon(icone[i]);
			try {
				sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			if (i == 10)
				i = 0;

		}
		frame.dispose();

	}

	public void setCarregando(boolean carregando) {
		this.carregando = carregando;
		System.out.println(carregando);
	}

	public static void main(String[] args) {
		new Loading().run();
	}

}
