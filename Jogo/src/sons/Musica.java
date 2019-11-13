package sons;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
	
	public void TocaMusica(String local) {
		try {
			File caminho = new File(local);
			
			if(caminho.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				
				System.out.println("Digite algo para parar");
				System.in.read();
			}
			else {
				System.out.println("Musica nao encontrada");
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	/*public static void main(String[] args)
	{Musica a1=new Musica();
	a1.TocaMusica("src/sons/MusicaMenu.wav");
	}*/

}
