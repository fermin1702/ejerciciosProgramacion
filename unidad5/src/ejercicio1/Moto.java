package ejercicio1;

public class Moto extends Vehiculo {

	private int numeroPlazas;

	public Moto(String matricula, String color, int potencia, int numeroPlazas) {
		super(matricula, color, potencia);
		// TODO Auto-generated constructor stub
		this.numeroPlazas = numeroPlazas;
	}

	public Moto(String matricula, String color, int numeroRuedas, int cilindrada, int potencia, int numeroPlazas) {
		super(matricula, color, numeroRuedas, cilindrada, potencia);
		// TODO Auto-generated constructor stub
		this.numeroPlazas = numeroPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return "Moto [numeroPlazas=" + numeroPlazas + ", matricula=" + matricula + ", color=" + color
				+ ", numeroRuedas=" + numeroRuedas + ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}
}
