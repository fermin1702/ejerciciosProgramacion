package ejercicio4;

public class Empleado extends Trabajador {
	private double sueldo;
	private double impuesto;

	public Empleado(String nombre, int nSS, double sueldo) {
		super(nombre, nSS);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

}
