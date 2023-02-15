package ejercicio2;

public class Vivienda {

	protected enum TipoVivienda {
		PISO, DUPLEX, ATICO, CASA, CHALET, ADOSADO, PAREAD
	}

	protected int numeroHabitaciones;
	protected double metrosCuadrados;
	protected double precio;
	protected String ciudad;
	protected String zona;

	public Vivienda() {
	}

	public Vivienda(int numeroHabitaciones, double metrosCuadrados, double precio, String ciudad, String zona) {
		super();
		this.numeroHabitaciones = numeroHabitaciones;
		this.metrosCuadrados = metrosCuadrados;
		this.precio = precio;
		this.ciudad = ciudad;
		this.zona = zona;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", metrosCuadrados=" + metrosCuadrados
				+ ", precio=" + precio + ", ciudad=" + ciudad + ", zona=" + zona + "]";
	}

	public static double comision(double precioVivienda) {
		double comision = precioVivienda * 0.03;
		return comision;
	}

}
