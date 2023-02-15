package ejercicio4;

public class Trabajador {

	protected String nombre;
	protected String puesto;
	protected String direccion;
	protected int telefono;
	protected int NSS;

	public Trabajador(String nombre, int nSS) {
		super();
		this.nombre = nombre;
		NSS = nSS;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", NSS=" + NSS + "]";

	}
}
