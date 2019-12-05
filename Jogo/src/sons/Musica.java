package sons;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Musica {
	private File caminho; 
	private Clip clip;
	private boolean isPlaying=false;
	
	public void TocaMusica(String local) {
		
		try {
			this.caminho = new File(local);
			
			 
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminho);
				clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				isPlaying = true;
				
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	
	public void stop() {
		try {
			clip.stop();
			isPlaying = false;
		}catch(Exception NullPointerException) {
		}
	}


	public File getCaminho() {
		return caminho;
	}

	public void setCaminho(File caminho) {
		this.caminho = caminho;
	}
	
	public float getVolume() {
	    FloatControl gainControl = (FloatControl) this.getClip().getControl(FloatControl.Type.MASTER_GAIN);        
	    return (float) Math.pow(10f, gainControl.getValue() / 20f);
	}

	public void setVolume(float volume) {
	    try{
		if (volume < 0f || volume > 1f)
	        throw new IllegalArgumentException("Volume not valid: " + volume);
	    FloatControl gainControl = (FloatControl) this.getClip().getControl(FloatControl.Type.MASTER_GAIN);        
	    gainControl.setValue(20f * (float) Math.log10(volume));
	    }catch(Exception NullPointerException) {
		}
	}
	
	
	
	public void reduzVolume(float volume,int tempo) {
		new Thread() {
			public void run() {
				if(isPlaying) {
		try {
			while(getVolume()>volume && isPlaying) {
				//System.out.println(getVolume());
				Thread.currentThread();
				Thread.sleep(tempo);
				setVolume(getVolume()-0.01f);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		}.start();
	}
	
	
	public void aumentaVolume(float volume,int tempo) {
		new Thread() {
			public void run() {
				if(isPlaying) {
		try {
			while(getVolume()<volume && isPlaying) {
				//System.out.println(getVolume());
				Thread.currentThread();
				Thread.sleep(tempo);
				setVolume(getVolume()+0.01f);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		}.start();
	}
	
	
	public void verifica() {
		new Thread() {
			
			
			public void run() {
				int time=0;
				while (isPlaying && time<=10) {
					try {
						if(getVolume() <0.05f) {
							clip.stop();
							setPlaying(false);
						}
						Thread.sleep(1000);
						time++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}


	

	public Clip getClip() {
		return clip;
	}


	public void setClip(Clip clip) {
		this.clip = clip;
	}


	public boolean isPlaying() {
		return isPlaying;
	}


	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	
	
	
	/* Comando para chamar musica:
	 * 
	 * 		musica.TocaMusica("caminho");
	 * 
	 */
	

}

