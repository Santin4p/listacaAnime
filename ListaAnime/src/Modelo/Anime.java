package Modelo;

import java.io.Serializable;

public class Anime implements Serializable {
	
	private String nombre;
	private String sinopsis;
	private String capitulos;

	//---
	public Anime(String nombre, String sinopsis, String capitulos) {
		this.nombre = nombre;
		this.sinopsis = sinopsis;
		this.capitulos = capitulos;
	}
	
	//---
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(String capitulos) {
		this.capitulos = capitulos;
	}
}
