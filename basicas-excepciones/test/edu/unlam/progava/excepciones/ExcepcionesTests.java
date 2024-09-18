package edu.unlam.progava.excepciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExcepcionesTests {

	@Test
	public void lanzamientoDeExcepcion() {
		assertThrows(ArithmeticException.class, () -> {
			int divisionPorCero = 5 / 0;
		});
	}

	@Test
	public void atrapamosLaExcepcion() {
		try {
			int divisionPorCero = 5 / 0;

			fail("No debería llegar a este punto");
		} catch (ArithmeticException exception) {
			exception.printStackTrace();
		}
		System.out.println("Sigue ejecutandose");
	}

	@Test
	public void manejadorDeArchivos() {
		File file = new File(""); // archivo inexistente
		// try-with-resource
		try (Scanner input = new Scanner(file)) {
			fail("No debería llegar a este punto");
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} /*finally {
			if (input != null) {
				input.close();
			}
		}*/

	}

	@Test
	public void excepcionPropia() {
		// Inner class
		class MiExcepcion extends Exception {
			private static final long serialVersionUID = -495059613251522648L;

			public MiExcepcion(String mensaje) {
				super(mensaje);
			}
		}

		assertThrows(MiExcepcion.class, () -> {
			throw new MiExcepcion("Ejemplo de explicación de error");
		});
	}

	@Test
	public void excepcionPropiaEnvolviendoExcepcionOriginal() {
		// Inner class
		class MiExcepcion extends Exception {
			private static final long serialVersionUID = -6146170257956329871L;

			public MiExcepcion(Exception excepcion) {
				super(excepcion);
			}
		}

		assertThrows(MiExcepcion.class, () -> {
			try {
				int divisionPorCero = 5 / 0;

				fail("No debería llegar a este punto");
			} catch (ArithmeticException excepcion) {
				// Envoltura
				throw new MiExcepcion(excepcion);
			}
		});
	}
}
