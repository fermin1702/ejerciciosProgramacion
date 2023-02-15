package ejercicio1;

public class Coche extends Vehiculo {

	private int numeroPuertas;

	public Coche(String matricula, String color, int potencia, int numeroPuertas) {
		super(matricula, color, potencia);
		// TODO Auto-generated constructor stub
		this.numeroPuertas = numeroPuertas;
	}

	public Coche(String matricula, String color, int numeroRuedas, int cilindrada, int potencia, int numeroPuertas) {
		super(matricula, color, numeroRuedas, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", matricula=" + matricula + ", color=" + color
				+ ", numeroRuedas=" + numeroRuedas + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}

}
