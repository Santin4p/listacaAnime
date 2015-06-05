package Modelo;

public class Anime {
	private String nombre;
	private String sinopsis;
	private String capitulos;
	private String genero;
	private boolean estado=false;

	//---
	public Anime(String nombre, String sinopsis, String capitulos) {
		super();
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
