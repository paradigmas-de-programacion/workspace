package edu.unlam.paradigmas;

public class ModoMovil extends ModoTanque {

	@Override
	public void disparar(int distancia) {
		if (distancia <= 10) {
			System.out.println("boom!");
		}
		
	}

	@Override
	public void moverse(Tanque quien, int dx, int dy) {
		System.out.println("me puedo mover");
		quien.x += dx;
		quien.y += dy;
		
	}

	@Override
	public ModoTanque cambiarModo() {
		return new ModoAsedio();
	}

}
