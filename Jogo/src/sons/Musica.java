package sons;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
	private File caminho; 
	private Clip clip;
	
	public void TocaMusica(String local) {
		
		try {
			this.caminho = new File(local);
			
			 
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);

				
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	
	public void stop() {
		clip.stop();
	}


	public File getCaminho() {
		return caminho;
	}

	public void setCaminho(File caminho) {
		this.caminho = caminho;
	}
	
	
	/* Comando para chamar musica:
	 * 
	 * 		musica.TocaMusica("caminho");
	 * 
	 */
	

}

