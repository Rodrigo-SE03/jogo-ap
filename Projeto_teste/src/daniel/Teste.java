package daniel;

import javax.swing.JFrame;

public class Teste {

	private JFrame frame;

	// construtor
	public Teste() {
		Fase f1;
		frame = new JFrame();
		// titulo
		frame.setTitle("Jogo 2d");
		// tamanho
		frame.setSize(1280, 1280);
		// sair
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// localização no meio
		frame.setLocationRelativeTo(null);
		// não mexer na resolução
		frame.setResizable(false);
		// chamar fase
		frame.add(f1 = new Fase(frame));
		Conter contador = new Conter(frame);
	
		
		new Thread() {
			public void run() {
				while (true) {
					contador.atualizaContador(f1.getCont(),f1.getCont2());
				}
			}
		}.start();
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Teste();
//		/* Set the Nimbus look and feel */
//		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
//		// (optional) ">
//		/*
//		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
//		 * look and feel. For details see
//		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}

//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
		// </editor-fold>

		/* Create and display the form */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new Contador().setVisible(true);
//			}
//		});
	}
}