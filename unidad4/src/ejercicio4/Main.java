package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Hora objetoHora1 = new Hora(23, 59, 03);
		Hora objetoHora2 = new Hora(04, 5, 06);
		Hora objetoHora3 = new Hora(01, 03, 04);
		Hora objetoHora4 = new Hora(01, 03, 04);
		Hora objetoHora5 = new Hora(01, 03, 04);

		System.out.println("La hora 1 es: " + objetoHora1.verhora());
		System.out.println("La hora 2 es: " + objetoHora2.verhora());
		System.out.println("La hora 3 es: " + objetoHora3.verhora());
		System.out.println("La hora 4 es: " + objetoHora4.verhora());
		System.out.println("La hora 5 es: " + objetoHora5.verhora());

		objetoHora1.suma(objetoHora1, objetoHora2);

		System.out.println("La hora 1 mas la hora 2 es: " + objetoHora1.verhora());

		if (objetoHora1.mayor_que(objetoHora1, objetoHora2) == true) {
			System.out.println("La hora 1 es mas grande que la hora 2");
		} else {
			System.out.println("La hora 1 es mas pequeña que la hora 2");
		}

		if (objetoHora3.esIgual(objetoHora3, objetoHora4) == true) {
			System.out.println("La hora 3 es igual a la hora 4");
		} else {
			System.out.println("La hora 3 no es igual a la hora 4");
		}

		objetoHora5.crearCopia(objetoHora1, objetoHora5);

		System.out.println("La hora 5 ahora vale igual que la hora 1: " + objetoHora5.verhora());
	}

}
