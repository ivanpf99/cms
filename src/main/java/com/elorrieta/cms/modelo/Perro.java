package com.elorrieta.cms.modelo;

public class Perro {

	private int id;
	private String nombre;
	private String raza;
	private String historia;
	private String vacunas;

	public Perro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.raza = "";
		this.historia = "";
		this.vacunas = "";

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", historia=" + historia + ", vacunas="
				+ vacunas + "]";
	}

}
