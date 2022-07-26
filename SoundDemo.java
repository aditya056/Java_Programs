import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
/*
<applet code="SoundDemo.class" width=1000 height=500 >
</applet>

*/
public class SoundDemo extends Applet
{
	/*public void init()
	{
		AudioClip clip = getAudioClip( getDocumentBase(), "as.wav" );
		clip.play();
	}*/

	public void paint( Graphics g )
	{
		AudioClip clip = getAudioClip( getDocumentBase(), "as.wav" );
		clip.play();
		g.drawString( "Now Playing Clip", 10, 10 );
	}
}