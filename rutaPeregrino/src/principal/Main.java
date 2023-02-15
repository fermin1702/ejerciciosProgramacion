package principal;

import java.util.Scanner;
import entidades.*;
import utilidades.Validacion;

public class Main {

	public static void main(String[] args) {

		
		System.out.println("INICIO");

		Scanner in = new Scanner(System.in);
		String nombre, nacionalidad;
		boolean valido = false;

		do {
			System.out.println("Introduce un nombre");
			nombre = in.nextLine();

			valido = Validacion.validarNombre(nombre);

			if (!valido)
				System.out.println("ERROR, valor invalido para el nombre. Supera los 3 caracteres.");

		} while (!valido);

		valido = false;

		do {
			System.out.println("Introduce una nacionalidad");
			nacionalidad = in.nextLine();

			valido = Validacion.validarNacionalidad(nacionalidad);

			if (!valido)
				System.out.println(
						"ERROR, valor invalido para la nacionalidad. Supera los 8 caracteres e incluye la letra 'A'.");

		} while (!valido);

		in.close();

		Parada inicial = new Parada("Gijon", 'A');
		Peregrino nuevo = new Peregrino();
		nuevo.setId(1);

		nuevo = Peregrino.registarPeregrino(nombre, nacionalidad, inicial);
		System.out.println(nuevo);
	}
}