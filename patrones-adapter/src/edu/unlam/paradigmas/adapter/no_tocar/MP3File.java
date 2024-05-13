package edu.unlam.paradigmas.adapter.no_tocar;

public class MP3File {

	private String filename;

	public MP3File(String filename) {
		super();
		this.filename = filename;
	}
	
	public void play(int quality) {
		// do some stuff with quality param
		System.out.println("Playing: " + this.filename);
	}
	
}
