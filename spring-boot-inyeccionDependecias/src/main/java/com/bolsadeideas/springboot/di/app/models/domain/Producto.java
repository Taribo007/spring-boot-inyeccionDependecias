package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {

	private String nombre;
	private Double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
