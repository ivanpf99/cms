package com.elorrieta.cms.modelo;

public class Perro {

	private int id;
	private int numero;
	private String nombre;
	private String raza;

	public Perro() {
		super();
		this.id = 0;
		this.numero = 0;
		this.nombre = "";
		this.raza = "";

	}

	public Perro(int id, int numero, String nombre, String raza) {
		this();
		this.id = id;
		this.numero = numero;
		this.nombre = nombre;
		this.raza = raza;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		return "Perro [id=" + id + ", numero=" + numero + ", nombre=" + nombre + ", raza=" + raza + "]";
	}

}
