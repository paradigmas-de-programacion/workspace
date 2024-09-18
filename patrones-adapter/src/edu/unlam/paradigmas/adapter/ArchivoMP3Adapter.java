package edu.unlam.paradigmas.adapter;

import edu.unlam.paradigmas.adapter.no_tocar.MP3File;

public class ArchivoMP3Adapter implements Reproducible {

	private MP3File mp3;

	public ArchivoMP3Adapter(MP3File mp3) {
		super();
		this.mp3 = mp3;
	}
	
	@Override
	public void reproducir() {
		this.mp3.play(100);
	}
	
}
