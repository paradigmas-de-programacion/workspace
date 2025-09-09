package pp.lenguaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ComparableTests {

	// https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html

	@Test
	public void rules() {
		Punto uno = new Punto(0, 0);
		Punto dos = new Punto(0, 0);
		Punto tres = new Punto(1, 1);

		assertTrue(uno.compareTo(dos) == 0);
		assertTrue(uno.compareTo(tres) < 0);
		assertTrue(tres.compareTo(uno) > 0);

	}
}
