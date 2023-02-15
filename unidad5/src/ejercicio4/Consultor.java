package ejercicio4;

public class Consultor extends Trabajador {

	private double horas;
	private double tarifa;

	public Consultor(String nombre, int nSS, double horas, double tarifa) {
		super(nombre, nSS);
		this.horas = horas;
		this.tarifa = tarifa;

	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double calcularPaga(Consultor objetoTrabajador) {
		double paga = objetoTrabajador.getHoras() * objetoTrabajador.getTarifa();
		return paga;
	}

	@Override
	public String toString() {
		return "Consultor [nombre=" + nombre + ", NSS=" + NSS + "]";
	}

}
