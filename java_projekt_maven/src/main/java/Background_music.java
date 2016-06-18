
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class Background_music {
    @SuppressWarnings("restriction")
	
      
        //getClass().getResourceAsStream("/ChillingMusic.wav");
        private void init() throws Exception
        {
        
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResource("/ChillingMusic.wav"));//getClass().getResourceAsStream("/ChillingMusic.wav"));//new File("/ChillingMusic.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
       
        private Background_music() 
	{
            try {
                init();
            } catch (Exception ex) {
                Logger.getLogger(Background_music.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        private static Background_music m1=new Background_music();
        
	
	public static Background_music getInstanceOfMusic()
	{
		return m1;
	}
}
