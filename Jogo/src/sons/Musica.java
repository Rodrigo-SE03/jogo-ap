package sons;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
	private boolean continuar;
	
	public void TocaMusica(String local) {
		this.continuar = true;
		try {
			File caminho = new File(local);
			
			if(caminho.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				while(this.isContinuar()) {
					System.out.println("");
				}
				clip.stop();	
			}
			else {
				System.out.println("Musica nao encontrada");
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public boolean isContinuar() {
		return continuar;
	}

	public void setContinuar(boolean continuar) {
		this.continuar = continuar;
	}
	
	/*public static void main(String[] args)
	{Musica a1=new Musica();
	a1.TocaMusica("src/sons/MusicaMenu.wav");
	}*/

}
