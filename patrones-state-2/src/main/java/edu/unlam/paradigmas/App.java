package edu.unlam.paradigmas;

public class App {

	public static void main(String[] args) {
		Tanque t = new Tanque();
		t.disparar(8);
		t.moverse(10, 10);
		t.cambiarModo();
		t.disparar(15);
		t.moverse(10, 10);
		
		t.cambiarModo();
		t.moverse(10, 10);
	}
	
}
