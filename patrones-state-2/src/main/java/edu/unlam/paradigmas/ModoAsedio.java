package edu.unlam.paradigmas;

public class ModoAsedio extends ModoTanque {

	@Override
	public void disparar(int distancia) {
		if (distancia <= 20) {
			System.out.println("booooooom!!!");
		}
	}

	@Override
	public void moverse(Tanque quien, int dx, int dy) {
		System.out.println("OH NO... NO me puedo mover");
	}

	@Override
	public ModoTanque cambiarModo() {
		return new ModoMovil();
	}

}
