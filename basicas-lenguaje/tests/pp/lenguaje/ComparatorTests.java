package pp.lenguaje;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ComparatorTests {

	@Test
	public void comparadorPorEjeX() {
		Punto uno = new Punto(0, 0);
		Punto dos = new Punto(1, -1);

		PuntosPorEjeX comparador = new PuntosPorEjeX();

		assertTrue(comparador.compare(uno, dos) < 0);
		assertTrue(comparador.compare(dos, uno) > 0);

	}

	@Test
	public void comparadorPorEjeY() {
		Punto uno = new Punto(0, 0);
		Punto dos = new Punto(1, -1);

		PuntosPorEjeY comparador = new PuntosPorEjeY();

		assertTrue(comparador.compare(uno, dos) > 0);
		assertTrue(comparador.compare(dos, uno) < 0);
	}

	@Test
	public void diversosComparadores() {

		List<Punto> puntos = new LinkedList<Punto>();

		puntos.add(new Punto(1, 1));
		puntos.add(new Punto(1, 2));
		puntos.add(new Punto(2, 3));
		puntos.add(new Punto(3, 1));
		puntos.add(new Punto(-5, -5));

		// utiliza el comparador por X
		// puntos.sort(new PuntosPorEjeX());

		// utiliza el comparador por Y
		// puntos.sort(new PuntosPorEjeY());

		// utiliza el comparador natural
		puntos.sort(null);

		// podriamos comprobar posicion a posicion
		// para poder probar, simplemente lo mostramos por pantalla
		System.out.println(puntos);
	}
}
