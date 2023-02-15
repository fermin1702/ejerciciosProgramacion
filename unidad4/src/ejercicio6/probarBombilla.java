package ejercicio6;

public class probarBombilla {

	public static void main(String[] args) {

		/*
		 * Declara dos objetos de tipo Bombilla, para las estancias salón y cocina.
		 */
		Bombilla bombilla1 = new Bombilla("salón");
		Bombilla bombilla2 = new Bombilla("cocina");

		/*
		 * Enciende las dos luces.
		 */
		bombilla1.enciende();
		bombilla2.enciende();

		/*
		 * Muestra el estado actual de las luces.
		 */
		bombilla1.mostrar();
		bombilla2.mostrar();

		/*
		 * Se produce un apagón general.
		 */
		Bombilla.desactivaGeneral();

		/*
		 * Muestra el estado actual de las luces.
		 */
		bombilla1.mostrar();
		bombilla2.mostrar();

		/*
		 * Apaga la luz de la estancia salón.
		 */
		bombilla1.apaga();

		/*
		 * Vuelve la luz general.
		 */
		Bombilla.activaGeneral();

		/*
		 * Muestra el estado actual de las luces.
		 */
		bombilla1.mostrar();
		bombilla2.mostrar();

	}
}
