package ejercicio2;

import java.util.*;

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		Scanner sc = new Scanner(System.in);

		System.out.println("Teclea el nombre del animal:");

		animal1.setNombre(sc.nextLine());

		System.out.println("Teclea la edad del animal:");

		animal1.setEdad(sc.nextInt());
		sc.close();

		animal1.nace();
		System.out.print(". Me llamo " + animal1.getNombre() + " y tengo " + animal1.getEdad() + " años");

	}

}
