package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peregrino {

	private long id;
	private String nombre;
	private String nacionalidad;
	private Carnet carnet;
	private ArrayList<Estancia> estancias = new ArrayList<Estancia>();
	private ArrayList<Parada> paradas = new ArrayList<Parada>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}

	public ArrayList<Estancia> getEstancias() {
		return estancias;
	}

	public void setEstancias(ArrayList<Estancia> estancias) {
		this.estancias = estancias;
	}

	public ArrayList<Parada> getParadas() {
		return paradas;
	}

	public void setParadas(ArrayList<Parada> paradas) {
		this.paradas = paradas;
	}

	public Peregrino() {

	}

	public Peregrino(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public static Peregrino registarPeregrino(String nombre, String nacionalidad, Parada inicial) {

		Peregrino ret = new Peregrino();
		ret.setNombre(nombre);
		ret.setNacionalidad(nacionalidad);

		Carnet nuevo = new Carnet();
		nuevo.setFechaexp(LocalDate.now());
		nuevo.setParadaInicial(inicial);

		ret.setCarnet(nuevo);
		ret.getParadas().add(inicial);

		return ret;
	}

	@Override
	public String toString() {
		return id + ". nombre=" + nombre + "(" + nacionalidad + ")" + ", carnet=" + carnet + ", estancias=" + estancias
				+ ", paradas=" + paradas + "]";
	}

}