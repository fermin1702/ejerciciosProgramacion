package ejercicio5;

public class TestCuenta1 {

	public static void main(String[] args) {

		CuentaBancaria cuenta1 = new CuentaBancaria("Rosario");
		CuentaBancaria cuenta2 = new CuentaBancaria("Carmen", 500);
		CuentaBancaria cuenta3 = new CuentaBancaria("José Luis", 1000);

		mostrarCuentas();
		System.out.println(cuenta1.getTitular() + "\t\t" + cuenta1.getSaldo());
		System.out.println(cuenta2.getTitular() + "\t\t" + cuenta2.getSaldo());
		System.out.println(cuenta3.getTitular() + "\t" + cuenta3.getSaldo());

		cuenta1.realizaIngreso(100);
		cuenta2.realizaReintegro(200);
		cuenta3.realizaIngreso(300);
		cuenta3.realizaReintegro(400);

		System.out.println();

		mostrarCuentas();
		System.out.println(cuenta1.getTitular() + "\t\t" + cuenta1.getSaldo());
		System.out.println(cuenta2.getTitular() + "\t\t" + cuenta2.getSaldo());
		System.out.println(cuenta3.getTitular() + "\t" + cuenta3.getSaldo());

		System.out.println();

		float saldoMedio = (cuenta1.getSaldo() + cuenta2.getSaldo() + cuenta3.getSaldo()) / 3;

		System.out.println("El saldo medio es de : " + saldoMedio);

	}

	public static void mostrarCuentas() {
		System.out.println("DATOS  DE  LAS  CUENTAS");
		System.out.println("-------------------------------------------");
		System.out.println("TITULAR\t\tSALDO");
		System.out.println("-------------------------------------------");
	}

}
