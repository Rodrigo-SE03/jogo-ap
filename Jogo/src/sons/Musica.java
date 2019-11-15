package sons;

import java.io.File;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
	private boolean continuar;
	private File caminho; 
	
	public void TocaMusica(String local) {
		this.continuar = true;
		
		try {
			this.caminho = new File(local);
			
			 
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				while(this.isContinuar()) {
					System.out.println("");
				}
				clip.stop();	
				
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public boolean isContinuar() {
		return continuar;
	}

	public void setContinuar(boolean continuar) {
		this.continuar = continuar;
	}

	public File getCaminho() {
		return caminho;
	}

	public void setCaminho(File caminho) {
		this.caminho = caminho;
	}
	
	/*public static void main(String[] args)
	{Musica a1=new Musica();
	a1.TocaMusica("src/sons/MusicaMenu.wav");
	}*/

}
