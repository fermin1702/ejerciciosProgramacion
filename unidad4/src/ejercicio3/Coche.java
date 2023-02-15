package ejercicio3;

import java.util.Date;

public class Coche {

	private String marca;
	private String modelo;
	private String color;
	private boolean isPinturaMetalizada;
	private String matricula;
	private Date añoFabricacion;

	public Coche(String matricula) {
		super();
		this.matricula = matricula;
	}

	public Coche(String marca, String modelo, String color, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPinturaMetalizada() {
		return isPinturaMetalizada;
	}

	public void setPinturaMetalizada(boolean isPinturaMetalizada) {
		this.isPinturaMetalizada = isPinturaMetalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(Date añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String imprimeCoche() {
		return "Tiene un coche marca:..." + marca + "....modelo: ...." + modelo + ".....  de color: ..." + color + ".";
	}

}
