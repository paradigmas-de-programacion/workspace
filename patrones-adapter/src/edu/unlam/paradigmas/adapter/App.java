package edu.unlam.paradigmas.adapter;

import edu.unlam.paradigmas.adapter.no_tocar.MP3File;

public class App {

	public static void main(String[] args) {
		
		Reproducible[] lista = {
				new ArchivoOgg("Stairway To Heaven.ogg"),
				new ArchivoMP3Adapter(new MP3File("Bohemian Rhapsody.mp3")),
				new ArchivoOgg("Let It Be.ogg")
		};
		
		ReproductorDeMusica stereo = new ReproductorDeMusica();
		stereo.reproducirLista(lista);
	}
}
