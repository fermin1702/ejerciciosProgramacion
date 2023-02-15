package entidades;

import java.util.ArrayList;

public class Parada {

	private Long id;
	private String nombre;
	private Character region;
	private ArrayList<Peregrino> peregrinos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Character getRegion() {
		return region;
	}

	public void setRegion(Character region) {
		this.region = region;
	}

	public ArrayList<Peregrino> getPeregrinos() {
		return peregrinos;
	}

	public void setPeregrinos(ArrayList<Peregrino> peregrinos) {
		this.peregrinos = peregrinos;
	}

	public Parada() {

	}

	public Parada(String nombre, Character region) {
		super();
		this.nombre = nombre;
		this.region = region;
	}

	@Override
	public String toString() {
		return id + ". nombre=" + nombre + ", region=" + region;
	}

}