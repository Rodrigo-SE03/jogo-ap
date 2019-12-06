package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bibliotecas.Biblioteca;

public class Geral { // Classe base para criação dos textos

	private Escolhas choice = new Escolhas();
	private boolean flag = true;
	private boolean go = false;

	public boolean isGo() {
		return go;
	}

	public void setGo(boolean go) {
		this.go = go;
	}

	public Escolhas getChoice() { // Getter para poder setar o action listener das escolhas
		return choice;
	}

	public boolean isFlag() {
		return flag;
	}

	public void escolhas_0(Texto t1, Biblioteca vet) { // Metodo que gera texto sem nenhuma interface de escolha

		// vet: Vetor de textos
		// t1: classe de criação de Textos que contem o JFrame

		t1.atualizaTexto(vet.getTx(0), vet.getLinhas(0)); // Atualiza a pagina para a posiçao 0 do vetor de texto

		t1.getContinuar().addActionListener(new ActionListener() {// ActionListener para o botão continuar
			int cont = 0; // Contador para verificar a posição do vetor de texto

			public void actionPerformed(ActionEvent actionEvent) {

				if (flag) {
					flag = false;

					if (cont < (vet.getTx().length - 1)) { // Verifica se ainda há vetores de texto
						cont++;
						t1.atualizaTexto(vet.getTx(cont), vet.getLinhas(cont));

					} else {
						t1.getContinuar().removeActionListener(this);
						cont = 0;
						go = true;
					}
					new Thread() {
						public void run() {
							try {
								sleep(500);
								flag = true;
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}.start();
				}
			}
		});

	}

	public void escolhas_2(Texto t1, Biblioteca vet) { // 2 opções de escolha no final

		t1.atualizaTexto(vet.getTx(0), vet.getLinhas(0));
		System.out.println(vet.getTx(0));

		t1.getContinuar().addActionListener(new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent actionEvent) {
				if (flag) {
					flag = false;

					if (cont < (vet.getTx().length - 1)) {
						cont++;
						t1.atualizaTexto(vet.getTx(cont), vet.getLinhas(cont));

					} else {

						cont = 0;
						t1.zerar();
						t1.getContinuar().removeActionListener(this);
						choice.doEscolhas_2(t1.getTexto(), vet.getChoice(), vet.getOp1(), vet.getOp2());

					}

					new Thread() {
						public void run() {
							try {
								sleep(500);
								flag = true;
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}.start();

				}
			}

		});

	}

	public void escolhas_3(Texto t1, Biblioteca vet) { // 3 opções de escolha no final

		t1.atualizaTexto(vet.getTx(0), vet.getLinhas(0));

		t1.getContinuar().addActionListener(new ActionListener() {
			int cont = 0;

			public void actionPerformed(ActionEvent actionEvent) {
				if (flag) {
					flag = false;

					if (cont < (vet.getTx().length - 1)) {
						cont++;
						t1.atualizaTexto(vet.getTx(cont), vet.getLinhas(cont));
					} else {
						t1.zerar();
						choice.doEscolhas_3(t1.getTexto(), vet.getChoice(), vet.getOp1(), vet.getOp2(), vet.getOp3());
						cont = 0;
						t1.getContinuar().removeActionListener(this);
					}
					new Thread() {
						public void run() {
							try {
								sleep(500);
								flag = true;
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}.start();
				}

			}
		});
	}
}
