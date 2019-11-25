package sons;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
//	private boolean continuar;
	private File caminho; 
	private Clip clip;
	
	public void TocaMusica(String local) {
//		this.continuar = true;
		
		try {
			this.caminho = new File(local);
			
			 
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
//				while(this.isContinuar()) {
//					System.out.println("");
//				}
//				clip.stop();	
				
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	
	public void stop() {
		clip.stop();
	}
//	public boolean isContinuar() {
//		return continuar;
//	}
//
//	public void setContinuar(boolean continuar) {
//		this.continuar = continuar;
//	}

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
