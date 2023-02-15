package ejercicio6;

public class Bombilla {

	private boolean interruptorParticular;
	private static boolean interruptorGeneral = true;
	private String estancia;

	public Bombilla(String estancia) {
		this.estancia = estancia;
		interruptorParticular = false;
	}

	public boolean encendida() {
		if (interruptorGeneral && interruptorParticular)
			return true;

		else
			return false;
	}

	public static void activaGeneral() {
		interruptorGeneral = true;
	}

	public static void desactivaGeneral() {
		interruptorGeneral = false;
	}

	public void enciende() {
		interruptorParticular = true;
	}

	public void apaga() {
		interruptorParticular = false;
	}

	public void mostrar() {
		System.out.println("El estado de la bombilla de la estancia " + estancia + " es " + encendida());
	}
}
