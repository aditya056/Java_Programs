import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="PlaySoundApplet.class" width=1000 height=500 >
</applet>

*/
public class PlaySoundApplet extends Applet implements ActionListener {
   Button play,stop ;
   AudioClip audioClip;
   
   public void init() {
      play = new Button(" Play in Loop ");
      add(play);
      play.addActionListener(this);
     stop= new Button(" Stop ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getCodeBase(), "as.wav");
   }
   public void actionPerformed(ActionEvent ae) {
      Button source = (Button)ae.getSource();
      if (source.getLabel() == " Play in Loop ") {
         audioClip.play();}
        if (source.getLabel() == " Stop ") {
         audioClip.stop();
      }
   }
}