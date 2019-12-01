package modelo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


import modelo.Fase;



public class Teste extends JFrame {
	public Fase fase = new Fase();
	//construtor 
	public Teste () {
		//chamar fase
		add (fase);
		ImageIcon icone = new ImageIcon("src/imagens/Icone.png");
		this.setIconImage(icone.getImage());
		Contador cont = new Contador();
		cont.teste = this;
		cont.setLocation(this.getLocation());
		
		//titulo
		setTitle("Defesa de Helaria");
		//tamanho
		setSize(1280,1280);
		//sair
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//localização no meio
		setLocationRelativeTo(null);
		//não mexer na resolução
		this.setResizable(false);
		setVisible(true);
		
	}
	
	public static void main (String[] args)
	{new Teste();
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	           // java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	           // java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	          // java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	           // java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	               // new Contador().setVisible(true);
	            }
	        });
	    }
}
