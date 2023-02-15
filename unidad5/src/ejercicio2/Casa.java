package ejercicio2;

public class Casa extends Vivienda {

	private double parcela;
	private boolean piscina;

	public Casa(int numeroHabitaciones, double metrosCuadrados, double precio, String ciudad, String zona,
			double parcela, boolean piscina) {
		super(numeroHabitaciones, metrosCuadrados, precio, ciudad, zona);
		// TODO Auto-generated constructor stub
		this.parcela = parcela;
		this.piscina = piscina;
	}

	@Override
	public String toString() {
		return "Casa [parcela=" + parcela + ", piscina=" + piscina + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio + ", ciudad=" + ciudad + ", zona="
				+ zona + "]";
	}
}
