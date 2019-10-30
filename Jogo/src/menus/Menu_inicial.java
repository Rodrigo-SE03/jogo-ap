package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import cenas.Inicio;
import graficos.Janela;

public class Menu_inicial extends Janela {

	
	
	private static final long serialVersionUID = 1L;
	
	Janela menu = new Janela();
    JButton iniciar = new JButton(new ImageIcon("src/imagens/botao_iniciar.png"));
    JButton creditos = new JButton(new ImageIcon("src/imagens/Creditos.png"));
    JLabel titulo = new JLabel(new ImageIcon("src/imagens/titulo.png"));
    JLabel fundo = new JLabel(new ImageIcon("src/imagens/menu.png"));

    public Menu_inicial() {

        //Redimensionar e reposicionar!!!
    	
    	this.menu.construirJanela();//metodo q seta as configurações da janela
       

        //Titulo
        this.menu.add(titulo);
        this.titulo.setLayout(null);
        this.titulo.setBounds(0,730,700,200);

        //Creditos
        this.menu.add(creditos);
        this.creditos.setLayout(null);
        this.creditos.setVisible(true);
        this.creditos.setContentAreaFilled(false);
        this.creditos.setBounds(1050,150,208,95);

        //Iniciar
        this.menu.add(iniciar);
        this.iniciar.setLayout(null);
        this.iniciar.setVisible(true);
        this.iniciar.setContentAreaFilled(false);
        this.iniciar.setBounds(1050,10,208,95);
        
        //Fundo
        this.menu.add(fundo);
        this.fundo.setBounds(0,0,1280,960);
        
        
        this.menu.setVisible(true);
        //Ações dos botões
        ativaCreditos();
        ativaIniciar();
    }

    public void ativaCreditos() {

        this.creditos.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Creditos cr = new Creditos(); //Criar créditos
                cr.mostraCreditos();
            } });
    }
    
    public void ativaIniciar() {

        this.iniciar.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Formulario();
                menu.dispose();
            } });
    }

}