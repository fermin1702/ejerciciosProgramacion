package entidades;

import java.time.LocalDate;


public class Carnet {

	private Long idPeregrino;
	private int nvips = 0;
	private double distancia = 0.0;
	private LocalDate fechaexp;
	private Parada paradaInicial;

	public Long getIdPeregrino() {
		return idPeregrino;
	}

	public void setIdPeregrino(Long idPeregrino) {
		this.idPeregrino = idPeregrino;
	}

	public int getNvips() {
		return nvips;
	}

	public void setNvips(int nvips) {
		this.nvips = nvips;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public LocalDate getFechaexp() {
		return fechaexp;
	}

	public void setFechaexp(LocalDate fechaexp) {
		this.fechaexp = fechaexp;
	}

	public Parada getParadaInicial() {
		return paradaInicial;
	}

	public void setParadaInicial(Parada paradaInicial) {
		this.paradaInicial = paradaInicial;
	}

	public Carnet() {

	}
	/**
	 * 
	 * @author usu23v
	 *
	 */
	public Carnet(Long idPeregrino) {
		super();
		this.idPeregrino = idPeregrino;
	}

	@Override
	public String toString() {
		return ", distancia=" + distancia + ", fechaexp=" + fechaexp + ", paradaInicial=" + paradaInicial + "]";
	}

}