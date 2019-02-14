//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;
import javax.swing.JOptionPane;
import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;


public class ShinyObjects {
	public static void main(String[] args) {
		// 2. Ask the user how many shiny objects they want
		String manyObjects = JOptionPane.showInputDialog("How many Shiny Objects do you want?");
		if (!manyObjects.isEmpty()) {
			
		}
		try
		{
			int i = Integer.parseInt(manyObjects);
			for (int z = 1; z <= i ; z++) {
				playMisterZee();
			}
		} catch (NumberFormatException e) {
			System.out.println("Not a Number");
		}
		// 3. Play the sound that many times

	}

	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
