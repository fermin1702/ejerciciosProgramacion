package ejercicio5;

import java.util.Scanner;

public class TestCuenta2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 1
		System.out.println("Introduce el nombre: ");
		String nombre1 = new String(in.nextLine());
		CuentaBancaria cuenta1 = new CuentaBancaria(nombre1);
		System.out.println("Introduce el nombre: ");
		String nombre2 = new String(in.nextLine());
		System.out.println("Introduce el saldo: ");
		float saldo2 = in.nextFloat();
		CuentaBancaria cuenta2 = new CuentaBancaria(nombre2, saldo2);

		// 2
		System.out.println(
				"El titular de la cuenta1 es: " + cuenta1.getTitular() + " y tiene de saldo: " + cuenta1.getSaldo());
		System.out.println("El titular de la cuenta2 es: " + cuenta2.getTitular() + " y tiene de saldo en cuenta: "
				+ cuenta2.getSaldo());

		// 3
		System.out.println(" introduzca el saldo a ingresar ");
		float ingreso = in.nextFloat();
		cuenta1.realizaIngreso(ingreso);

		// 4
		boolean validoIngreso = false;
		do {
			System.out.println("Introduce el importe del reintegro:");
			float reintegro = in.nextFloat();

			if (reintegro > cuenta2.getSaldo()) {
				System.out.println(" El saldo debe ser menor o igual del que ya tiene en cuenta" + cuenta2.getSaldo()
						+ " Por favor teclee un importe valido ");
				validoIngreso = false;

			} else {
				cuenta2.realizaReintegro(reintegro);
				validoIngreso = true;

			}
		} while (!validoIngreso);
		in.close();

		// 5
		System.out.println(
				"El titular de la cuenta1 es: " + cuenta1.getTitular() + " y tiene de saldo: " + cuenta1.getSaldo());
		System.out.println("El titular de la cuenta2 es: " + cuenta2.getTitular() + " y tiene de saldo en cuenta: "
				+ cuenta2.getSaldo());
		float valorMedio = (cuenta1.getSaldo() + cuenta2.getSaldo()) / 2;
		System.out.println("El saldo medio es: " + valorMedio);
	}

}
