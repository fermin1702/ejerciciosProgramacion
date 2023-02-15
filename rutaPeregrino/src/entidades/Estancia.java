package entidades;

import java.time.LocalDate;

public class Estancia {

	private Long id;
	private LocalDate fecha;
	private boolean vip = false;
	private Estancia estancia;
	private Peregrino peregrino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public Estancia getEstancia() {
		return estancia;
	}

	public void setEstancia(Estancia estancia) {
		this.estancia = estancia;
	}

	public Peregrino getPeregrino() {
		return peregrino;
	}

	public void setPeregrino(Peregrino peregrino) {
		this.peregrino = peregrino;
	}

	public Estancia() {

	}

	public Estancia(Long id, LocalDate fecha, boolean vip) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.vip = vip;
	}
}