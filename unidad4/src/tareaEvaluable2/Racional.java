package tareaEvaluable2;

public class Racional {

	/*
	 * 1. Crear una clase “Racional” que contenga en su parte privada un entero
	 * correspondiente al numerador y otro correspondiente al denominador.
	 * 
	 */
	private int numerador;
	private int denominador;

	/*
	 * 2. Crear un constructor sin parámetros, asignando al numerador un cero y al
	 * denominador un 1.
	 * 
	 */
	public Racional() {
		this.numerador = 0;
		this.denominador = 1;
	}

	/*
	 * 3. Crear un constructor parametrizado para asignar numerador y denominador a
	 * través de los parámetros. El denominador no puede ser 0 ni negativo, en cuyo
	 * caso se le asigna a 1 directamente.
	 * 
	 */
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;

		if (denominador <= 0) {
			this.denominador = 1;

		} else {
			this.denominador = denominador;
		}

	}

	/*
	 * 4. Crear métodos setter y getter para los atributos de la clase.
	 * 
	 */
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	/*
	 * 5. Crear un método que nos muestre por pantalla los componentes privados del
	 * objeto de clase racional en forma de quebrado. Por ejemplo: 3 / 4
	 * 
	 */
	@Override
	public String toString() {
		return numerador + " / " + denominador;
	}

	/*
	 * 6. Crear métodos para realizar las operaciones básicas, suma, resta,
	 * multiplicación y división, de dos objetos de tipo racional.
	 * 
	 */
	public static Racional sumaQuebrados(Racional objetoRacional1, Racional objetoRacional2) {

		if (objetoRacional1.getDenominador() == objetoRacional2.getDenominador()) {
			int numerador = objetoRacional1.getNumerador() + objetoRacional2.getNumerador();
			int denominador = objetoRacional1.getDenominador();
			Racional sumaQuebrados = new Racional(numerador, denominador);
			return sumaQuebrados;

		} else {
			int numerador = objetoRacional1.getNumerador() * objetoRacional2.getDenominador()
					+ objetoRacional1.getDenominador() * objetoRacional2.getNumerador();
			int denominador = objetoRacional1.getDenominador() * objetoRacional2.getDenominador();
			Racional sumaQuebrados = new Racional(numerador, denominador);
			return sumaQuebrados;
		}
	}

	public static Racional restaQuebrados(Racional objetoRacional1, Racional objetoRacional2) {

		if (objetoRacional1.getDenominador() == objetoRacional2.getDenominador()) {
			int numerador = objetoRacional1.getNumerador() - objetoRacional2.getNumerador();
			int denominador = objetoRacional1.getDenominador();
			Racional restaQuebrados = new Racional(numerador, denominador);
			return restaQuebrados;

		} else {
			int numerador = objetoRacional1.getNumerador() * objetoRacional2.getDenominador()
					- objetoRacional1.getDenominador() * objetoRacional2.getNumerador();
			int denominador = objetoRacional1.getDenominador() * objetoRacional2.getDenominador();
			Racional restaQuebrados = new Racional(numerador, denominador);
			return restaQuebrados;
		}

	}

	public static Racional multiplicacionQuebrados(Racional objetoRacional1, Racional objetoRacional2) {

		int numerador = objetoRacional1.getNumerador() * objetoRacional2.getNumerador();
		int denominador = objetoRacional1.getDenominador() * objetoRacional2.getDenominador();
		Racional multiplicacionQuebrados = new Racional(numerador, denominador);
		return multiplicacionQuebrados;

	}

	public static Racional divisionQuebrados(Racional objetoRacional1, Racional objetoRacional2) {

		int numerador = objetoRacional1.getNumerador() * objetoRacional2.getDenominador();
		int denominador = objetoRacional1.getDenominador() * objetoRacional2.getNumerador();
		Racional divisionQuebrados = new Racional(numerador, denominador);
		return divisionQuebrados;

	}

	/*
	 * 7. Crear un método para saber si dos números racionales (objetos de la clase
	 * racional) son iguales.
	 * 
	 */
	public static void igualdadQuebrados(Racional objetoRacional1, Racional objetoRacional2) {

		int a = objetoRacional1.getNumerador();
		int b = objetoRacional1.getDenominador();
		int c = objetoRacional2.getNumerador();
		int d = objetoRacional2.getDenominador();

		if ((a * d) == (b * c)) {
			System.out.println("Los Quebrados son iguales");

		} else {
			System.out.println("Los Quebrados NO son iguales");

		}
	}

	/*
	 * 8. Crear un método para simplificar los dos componentes del número racional
	 * que representa el objeto, que se ha de utilizar en los métodos anteriores.
	 * 
	 */

	private static int mcd(int numerador, int denominador) {
		int auxiliar;
		while (denominador != 0) {
			auxiliar = denominador;
			denominador = numerador % denominador;
			numerador = auxiliar;
		}
		return numerador;
	}

	public static Racional simplificarQuebrado(Racional objetoRacional) {
		int divi = mcd(objetoRacional.numerador, objetoRacional.denominador);
		objetoRacional.setNumerador(objetoRacional.numerador / divi);
		objetoRacional.setDenominador(objetoRacional.denominador / divi);
		return objetoRacional;
	}

	/*
	 * 9. Crear un método para comparar dos números racionales (objetos de la clase
	 * racional), llamado “mayor_que”, que devuelva true en el caso que el primero
	 * sea mayor que el segundo y false en caso contrario.
	 * 
	 */
	public static boolean mayor_que(Racional objetoRacional1, Racional objetoRacional2) {

		boolean isMayor = false;
		int a = objetoRacional1.getNumerador();
		int b = objetoRacional1.getDenominador();
		int c = objetoRacional2.getNumerador();
		int d = objetoRacional2.getDenominador();

		if ((a * d) > (b * c)) {
			return isMayor == true;

		} else {
			return isMayor == false;
		}
	}
}
