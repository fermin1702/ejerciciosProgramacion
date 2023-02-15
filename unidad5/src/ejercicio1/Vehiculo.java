package ejercicio1;

public class Vehiculo {

	protected String matricula;
	protected String color;
	protected int numeroRuedas;
	protected int cilindrada;
	protected int potencia;

	public Vehiculo(String matricula, String color, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.potencia = potencia;
	}

	public Vehiculo(String matricula, String color, int numeroRuedas, int cilindrada, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numeroRuedas = numeroRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", numeroRuedas=" + numeroRuedas
				+ ", cilindrada=" + cilindrada + ", potencia=" + potencia + "]";
	}

}
