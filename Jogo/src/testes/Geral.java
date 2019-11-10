package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graficos.Escolhas;
import graficos.Texto;

public class Geral {

			private Escolhas choice = new Escolhas();
			private ActionListener continuar;

			public Escolhas getChoice() {
				return choice;
			}
			
			public void escolhas_0(Texto t1, Biblioteca vet) {
				
				t1.atualizaTexto(vet.getTx(0),vet.getLinhas(0));		
				
				 continuar = new ActionListener() {
					int cont=0;
					public void actionPerformed(ActionEvent actionEvent) {
			            
						if(cont<(vet.getTx().length-1)) {
			            	cont++;
			            	t1.atualizaTexto(vet.getTx(cont),vet.getLinhas(cont));
			            }
			            else {
			            	t1.zerar();
			            	t1.getContinuar().removeActionListener(continuar);
			            }
					}
				};
				
			    t1.getContinuar().addActionListener(continuar);
				
			}
			
			public void escolhas_2(Texto t1, Biblioteca vet) {
				
				t1.zerar();
				t1.atualizaTexto(vet.getTx(0),vet.getLinhas(0));		
				
				continuar = new ActionListener() {
					int cont=0;
					public void actionPerformed(ActionEvent actionEvent) {
						if(cont<(vet.getTx().length-1)) {
			            	cont++;
			            	t1.atualizaTexto(vet.getTx(cont),vet.getLinhas(cont));
			            }
			            else {
			            	t1.zerar();
			            	choice.doEscolhas_2(t1.getTexto(), vet.getChoice(),vet.getOp1(),vet.getOp2());
			            	t1.getContinuar().removeActionListener(continuar);
			            }
					}
				};
				
			    t1.getContinuar().addActionListener(continuar);
				
			}
			
			public void escolhas_3(Texto t1, Biblioteca vet) {
				
				
				t1.atualizaTexto(vet.getTx(0),vet.getLinhas(0));		
				
				 continuar = new ActionListener() {
					int cont=0;
					public void actionPerformed(ActionEvent actionEvent) {
			            
						if(cont<(vet.getTx().length-1)) {
			            	cont++;
			            	t1.atualizaTexto(vet.getTx(cont),vet.getLinhas(cont));
			            }
			            else {
			            	t1.zerar();
			            	choice.doEscolhas_3(t1.getTexto(), vet.getChoice(),vet.getOp1(),vet.getOp2(),vet.getOp3());
			            	t1.getContinuar().removeActionListener(continuar);
			            }
					}
				};
				
			    t1.getContinuar().addActionListener(continuar);
				
			}

}
