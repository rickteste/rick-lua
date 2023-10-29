package com.doglab.main;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

	public static boolean sound = true;
	
	private AudioClip clip;
	
	public static final Sound bark = new Sound("/bark.wav");

	// Construtor basicamente ta pegando as musicas.
	private Sound(String name) { 
		
		try {
			clip = Applet.newAudioClip(Sound.class.getResource(name));
		}catch(Throwable e) {}
		
	}
	
	public void play() {
		if(sound) {
			try {
				/* Basicamente oque esse codigo abaixo ta fazendo � criar um m�todo local, que somente poder� ser usado aqui
				 n�o o adicionando permanentemente na classe. Ao criar uma nova Thread() e dar .start() nela, seria necessario
				 um m�todo run(), e como n�s n�o vamos querer o m�todo run na classe Sound, n�s o colocamos na pr�pria classe
				 Thread que a executar� apenas uma vez.
				 */
				new Thread() {
					public void run() {
						//clip.play();
					}
				}.start();
				
			}catch(Throwable e) {}
		}	
	}
	
	public void loop() {
		if(sound) {
			try {
				/* Basicamente oque esse codigo abaixo ta fazendo � criar um m�todo local, que somente poder� ser usado aqui
				 n�o o adicionando permanentemente na classe. Ao criar uma nova Thread() e dar .start() nela, seria necessario
				 um m�todo run(), e como n�s n�o vamos querer o m�todo run na classe Sound, n�s o colocamos na pr�pria classe
				 Thread que a executar� apenas uma vez, nesse caso, como � um loop, ficar� executando eternamente.
				 */
				new Thread() {
					public void run() {
						clip.loop();
					}
				}.start();
				
			}catch(Throwable e) {}
		}
	}
	
	public void stop() {
		if(sound) {
			try {
				/* Basicamente oque esse codigo abaixo ta fazendo � criar um m�todo local, que somente poder� ser usado aqui
				 n�o o adicionando permanentemente na classe. Ao criar uma nova Thread() e dar .start() nela, seria necessario
				 um m�todo run(), e como n�s n�o vamos querer o m�todo run na classe Sound, n�s o colocamos na pr�pria classe
				 Thread que a executar� apenas uma vez.
				 */
				new Thread() {
					public void run() {
						clip.stop();
					}
				}.start();
				
			}catch(Throwable e) {}
		}	
	}
}
