package edu.unlam.paradigmas.adapter;

public class ArchivoOgg implements Reproducible {

	private String filename;

	public ArchivoOgg(String filename) {
		super();
		this.filename = filename;
	}
	
	public void reproducir() {
		System.out.println("Reproduciendo: " + this.filename);
	}
	
}
