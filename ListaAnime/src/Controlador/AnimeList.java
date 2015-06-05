package Controlador;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import Modelo.Anime;

public class AnimeList{
	
	private ArrayList<Anime> listaAnime;
	final String fichero = "animes.dat";
	private ObjectOutputStream nuevo;
	
	public AnimeList() throws ClassNotFoundException, IOException {
		setAnimes(new ArrayList<Anime>());
		if (new File(fichero).exists()) {
			cargarAnimes();
		}else{
			nuevo=new ObjectOutputStream(new FileOutputStream(fichero));
		}
	}
	
	public void guardarAnime(Anime animeIN) throws FileNotFoundException,IOException {
		getListaAnime().add(animeIN);
		new AccesoFicheros().escribirObjeto(getListaAnime(), fichero);
	}

	public ArrayList<Anime> getListaAnime() {
		return listaAnime;
	}

	public void setAnimes(ArrayList<Anime> listaAnime) {
		this.listaAnime = listaAnime;
	}

	public void cargarAnimes() throws ClassNotFoundException, IOException{
			setAnimes((ArrayList<Anime>) new AccesoFicheros().leerObjeto(fichero));
	}
	public void crearAnime(String nombreIN, String sinopsisIN, String capitulosIN) throws FileNotFoundException, IOException{
		Anime instancia=new Anime(nombreIN, sinopsisIN, capitulosIN);
		guardarAnime(instancia);
	}
}
