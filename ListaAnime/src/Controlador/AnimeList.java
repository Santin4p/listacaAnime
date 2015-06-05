package Controlador;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Modelo.Anime;

public class AnimeList {
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
	
	public void guardarAnime(Anime anime) throws FileNotFoundException,
			IOException {
		getListaAnime().add(anime);
		new AccesoFicheros().escribirObjeto(getListaAnime(), fichero);
	}

	public ArrayList<Anime> getListaAnime() {
		return listaAnime;
	}

	public void setAnimes(ArrayList<Anime> listaAnime) {
		this.listaAnime = listaAnime;
	}

	public void cargarAnimes() throws ClassNotFoundException, IOException{
		Anime prueba=new Anime("yuyu", "2", "13");
		getListaAnime().add(prueba);
		setAnimes((ArrayList<Anime>) new AccesoFicheros().leerObjeto(fichero));
	}
	
	public void crearAnime(String nombre, String sinopsis, String capitulos) throws FileNotFoundException, IOException{
		Anime instancia=new Anime(nombre, sinopsis, capitulos);
		guardarAnime(instancia);
	}
}
