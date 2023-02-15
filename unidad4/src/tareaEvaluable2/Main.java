package tareaEvaluable2;

public class Main {

	public static void main(String[] args) {

		// Test Constructor SIN parámetros
		Racional fraccion1 = new Racional();

		// Test Constructor CON parámetros
		Racional fraccion2 = new Racional(10, 25);

		// Test Constructor CON parámetros y denominador negativo
		Racional fraccion3 = new Racional(16, -32);

		// Mostrar por pantalla los 3 quebrados
		System.out.println("Fraccion 1: " + fraccion1);
		System.out.println("Fraccion 2: " + fraccion2);
		System.out.println("Fraccion 3: " + fraccion3);
		System.out.println("");

		// Creamos 2 fracciones para hacer las pruebas de los metodos
		Racional fraccion4 = new Racional(16, 32);
		Racional fraccion5 = new Racional(16, 10);

		/*
		 * Llamar al metodo para SUMAR dos fracciones CON denominador comun y mostrar su
		 * resultado
		 */
		System.out.println("Suma CON Denominador común: " + Racional.sumaQuebrados(fraccion4, fraccion4));
		System.out.println("");

		/*
		 * Llamar al metodo para SUMAR dos fracciones SIN denominador común y mostrar su
		 * resultado
		 */
		System.out.println("Suma SIN Denominador común: " + Racional.sumaQuebrados(fraccion4, fraccion5));
		System.out.println("");

		/*
		 * Llamar al metodo para RESTAR dos fracciones CON denominador comun y mostrar
		 * su resultado
		 */
		System.out.println("Resta CON Denominador común: " + Racional.restaQuebrados(fraccion4, fraccion4));
		System.out.println("");

		/*
		 * Llamar al metodo para RESTAR dos fracciones SIN denominador común y mostrar
		 * su resultado
		 */
		System.out.println("Resta SIN Denominador común: " + Racional.restaQuebrados(fraccion4, fraccion5));
		System.out.println("");

		/*
		 * Llamar al metodo para MULTIPLICAR dos fracciones CON denominador comun y
		 * mostrar su resultado
		 */
		System.out.println(
				"Multiplicacion CON Denominador común: " + Racional.multiplicacionQuebrados(fraccion4, fraccion4));
		System.out.println("");

		/*
		 * Llamar al metodo para MULTIPLICAR dos fracciones SIN denominador común y
		 * mostrar su resultado
		 */
		System.out.println(
				"Multiplicacion SIN Denominador común: " + Racional.multiplicacionQuebrados(fraccion4, fraccion5));
		System.out.println("");

		/*
		 * Llamar al metodo para DIVIDIR dos fracciones CON denominador comun y mostrar
		 * su resultado
		 */
		System.out.println("Division CON Denominador común: " + Racional.divisionQuebrados(fraccion4, fraccion4));
		System.out.println("");

		/*
		 * Llamar al metodo para DIVIDIR dos fracciones SIN denominador común y mostrar
		 * su resultado
		 */
		System.out.println("Division SIN Denominador común: " + Racional.divisionQuebrados(fraccion4, fraccion5));
		System.out.println("");

		/*
		 * Llamar al metodo para saber la IGUALDAD Y mostrar su resultado
		 */
		Racional.igualdadQuebrados(fraccion4, fraccion4);
		System.out.println("");

		/*
		 * Llamar al metodo para saber la IGUALDAD Y mostrar su resultado
		 */
		Racional.igualdadQuebrados(fraccion4, fraccion5);
		System.out.println("");

		/*
		 * Llamar al metodo para SIMPLIFICAR Y mostrar su resultado
		 */
		System.out.println(Racional.simplificarQuebrado(fraccion4));
		System.out.println("");

		System.out.println(Racional.simplificarQuebrado(fraccion5));
		System.out.println("");

		/*
		 * Llamar al metodo "mayor_que" Y mostrar su resultado
		 */
		System.out.println(Racional.mayor_que(fraccion4, fraccion5));
		System.out.println("");
		System.out.println(Racional.mayor_que(fraccion5, fraccion4));

	}

}
