package com.elorrieta.cms.modelo;

public class Tanque {

	private String nombre;
	private int tipo;
	private String Armamento;
	private int municion;

	public Tanque() {
		super();
		this.nombre = "";
		this.tipo = 0;
		this.Armamento = "";
		this.municion = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getArmamento() {
		return Armamento;
	}

	public void setArmamento(String armamento) {
		Armamento = armamento;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	@Override
	public String toString() {
		return "Tanque [nombre=" + nombre + ", tipo=" + tipo + ", Armamento=" + Armamento + ", municion=" + municion
				+ "]";
	}

}
