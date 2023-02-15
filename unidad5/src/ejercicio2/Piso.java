package ejercicio2;

public class Piso extends Vivienda {

	private double comunidad;
	private boolean exterior;

	public Piso(int numeroHabitaciones, double metrosCuadrados, double precio, String ciudad, String zona,
			double comunidad, boolean exterior) {
		super(numeroHabitaciones, metrosCuadrados, precio, ciudad, zona);
		// TODO Auto-generated constructor stub
		this.comunidad = comunidad;
		this.exterior = exterior;
	}

	public static double comision(double precioVivienda, double metrosCuadrados) {
		if (metrosCuadrados <= 100) {
			double comision = precioVivienda * 0.03;
			return comision;
		} else {
			double comision = precioVivienda * 0.035;
			return comision;
		}
	}
}
