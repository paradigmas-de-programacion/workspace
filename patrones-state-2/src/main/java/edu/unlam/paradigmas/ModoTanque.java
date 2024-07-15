package edu.unlam.paradigmas;

public abstract class ModoTanque {

	public abstract ModoTanque cambiarModo();
	public abstract void disparar(int distancia);
	public abstract void moverse(Tanque quien, int dx, int dy);
	
}
