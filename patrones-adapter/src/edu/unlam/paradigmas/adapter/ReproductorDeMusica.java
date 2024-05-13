package edu.unlam.paradigmas.adapter;

public class ReproductorDeMusica {

	public void reproducir(Reproducible cancion) {
		cancion.reproducir();
	}
	
	public void reproducirLista(Reproducible[] lista) {
		for (Reproducible cancion: lista) {
			reproducir(cancion);
		}
	}
	
}
