package ejercicio1;

public class TestVehiculo {

	public static void main(String[] args) {

		Coche coche1 = new Coche("4567BTD", "ROJO", 4, 6, 300, 2);
		Coche coche2 = new Coche("9687TDH", "AZUL", 100, 5);

		Moto moto1 = new Moto("9875JHG", "VERDE", 2, 2, 150, 2);
		Moto moto2 = new Moto("0987LKJ", "BLANCO", 200, 1);

		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());

	}
}
