package pp.lenguaje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class HashCodeEqualsTests {

	// https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html#equals(java.lang.Object)

	// Indicates whether some other object is "equal to" this one.

	@Test
	public void rulesEquals() {
		Punto uno = new Punto(0, 0);
		Punto dos = new Punto(0, 0);
		Punto tres = new Punto(1, 1);
		Punto cuatro = new Punto(0, 0);

		// It is reflexive: for any non-null reference value x, x.equals(x) should
		// return true.
		assertTrue(uno.equals(uno));

		// It is symmetric: for any non-null reference values x and y, x.equals(y)
		// should return true if and only if y.equals(x) returns true.
		assertTrue(uno.equals(dos));
		assertTrue(dos.equals(uno));

		assertFalse(uno.equals(tres));

		// It is transitive: for any non-null reference values x, y, and z, if
		// x.equals(y) returns true and y.equals(z) returns true, then x.equals(z)
		// should return true.
		assertTrue(uno.equals(dos));
		assertTrue(dos.equals(cuatro));
		assertTrue(uno.equals(cuatro));

		// It is consistent: for any non-null reference values x and y, multiple
		// invocations of x.equals(y) consistently return true or consistently return
		// false, provided no information used in equals comparisons on the objects is
		// modified.
		for (int i = 0; i < 1_000_000; i++) {
			assertTrue(uno.equals(dos));
			uno.mover(-0.01, 0.01);

			assertFalse(uno.equals(tres));
		}

		// For any non-null reference value x, x.equals(null) should return false.
		assertFalse(uno.equals(null));
	}
	
	
	// Returns a hash code value for the object. This method is supported for the
	// benefit of hash tables such as those provided by HashMap.

	@Test
	public void rulesHashCode() {
		Punto uno = new Punto(1, 1);
		Punto dos = new Punto(1, 1);
		Punto tres = new Punto(-3.557471992718208E15, -3.557471992718208E15);

		// Whenever it is invoked on the same object more than once during an execution
		// of a Java application, the hashCode method must consistently return the same
		// integer, provided no information used in equals comparisons on the object is
		// modified. This integer need not remain consistent from one execution of an
		// application to another execution of the same application.
		int hc = uno.hashCode();

		for (int i = 0; i < 1_000_000; i++) {
			assertEquals(hc, uno.hashCode());
			uno.mover(-0.01, 0.01);
		}

		// If two objects are equal according to the equals(Object) method, then calling
		// the hashCode method on each of the two objects must produce the same integer
		// result.
		assertEquals(uno, dos);
		assertEquals(uno.hashCode(), dos.hashCode());

		// It is not required that if two objects are unequal according to the
		// equals(java.lang.Object) method, then calling the hashCode method on each of
		// the two objects must produce distinct integer results. However, the
		// programmer should be aware that producing distinct integer results for
		// unequal objects may improve the performance of hash tables.
		assertNotEquals(uno, tres);
		assertEquals(uno.hashCode(), tres.hashCode());
	}

}
