package edu.unlam.paradigmas;

public class Tanque {

	int x, y;
	private ModoTanque modo = new ModoMovil();
	
	public void cambiarModo() {
		this.modo = this.modo.cambiarModo();
		System.out.println("Estoy en " + modo.getClass().getName());
	}
	
	public void disparar(int distancia) {
		this.modo.disparar(distancia);
	}
	
	public void moverse(int dx, int dy) {
		this.modo.moverse(this, dx, dy);
	}
	
}
