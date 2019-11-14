package sons;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JButton;

@SuppressWarnings("deprecation")
public class Som {
	JButton plei= new JButton ("");
	private URL url;
	private AudioClip audio;

	public void run(String nome) {
		this.url = Som.class.getResource(nome+".wav");
		this.audio = Applet.newAudioClip(url);
		this.audio.play();
	}
	
	public void stop(String nome) {
		this.audio.stop();
	}
	
	/*public static void main(String[] args)
	{Som a1=new Som();
	a1.run("");
	}*/
}
